/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoquiz;

import controller.CPerfil;
import controller.CPergunta;
import controller.CQuiz;
import controller.CUsuario;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Perfil;
import model.Usuario;
import services.ServicosFactory;
import services.UsuarioServicos;
import util.Validador;
import view.Menu;

/**
 *
 * @author 182120038
 */
public class ProjetoQuiz {

    public static CPerfil cadPerfil = new CPerfil();
    public static CPergunta cadPergunta = new CPergunta();
    public static CQuiz cadQuiz = new CQuiz();
    public static CUsuario cadUsuario = new CUsuario();
    public static Scanner leia = new Scanner(System.in);

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        int num = 99;
        try {
            num = leiaNum.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Tente Novamente!\n" + e.getMessage());
            leiaNum.nextLine();
        }
        return num;
    }//fim leiaNumInt

    public static float leiaNumFloat() {
        Scanner leiaNum = new Scanner(System.in);
        float num = 99;
        try {
            num = leiaNum.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Tente Novamente!\n" + e.getMessage());
            leiaNum.nextLine();
        }
        return num;
    }//fim leiaNumFloat

    public static void menuP() {
        System.out.println("..: Quiz :..");
        System.out.println("1 - Gerenciar Usuario");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }// fim menuP

    public static void subMenu(int op) {
        String tpCad = null;
        switch (op) {
            case 1:
                tpCad = "Usuario";
                break;
        }
        System.out.println(".: Gerenciar " + tpCad + " :.");
        System.out.println("1 - Cadastrar " + tpCad);
        System.out.println("2 - Editar " + tpCad);
        System.out.println("3 - Listar " + tpCad + "s");
        System.out.println("4 - Deletar " + tpCad);
        System.out.println("0 - Voltar ");
        System.out.print("Escolha uma opcao: ");
    }//fim subMenu

    public static void cadastrarUsuario() {
        int idUsuario;
        String nome;
        String cpf;
        String numCadastro;
        String telefone;
        String endereco;
        Perfil idPerfil = null;
        UsuarioServicos usuarioS = ServicosFactory.getUsuarioServicos();

        System.out.println("--> Cadastro Usuario <--");
        System.out.print("Informe o CPF: ");
        boolean cpfis;
        int opCPF;
        do {
            cpf = leia.nextLine();
            cpfis = Validador.isCPF(cpf);
            if (!cpfis) {
                System.out.println("CPF Invalido!");
                System.out.println("Deseja tentar novamente? 1 - Sim || 2 - Nao");
                System.out.print("Digite aqui: ");
                opCPF = leiaNumInt();

                if (opCPF == 1) {
                    System.out.print("Informe novamente o CPF: ");
                } else if (opCPF == 2) {
                    System.out.println("Cadastro encerrado pelo usuario!");
                    return;
                }
            }

        } while (!cpfis);

        if (usuarioS.buscarUsuarioByCPF(cpf).getCpf() != null) {
            System.out.println("Usuario ja cadastrado!");
        } else {
            System.out.print("Informe o seu nome: ");
            nome = leia.nextLine().toUpperCase();
            System.out.print("Informe o seu numero de cadastro: ");
            numCadastro = leia.nextLine();
            System.out.print("Informe o seu telefone: ");
            telefone = leia.nextLine();
            System.out.print("Informe o seu endereco: ");
            endereco = leia.nextLine().toUpperCase();
            idUsuario = cadUsuario.geraID();

            Usuario usu = new Usuario(idUsuario, nome, cpf, numCadastro, telefone, endereco, idPerfil);
            usuarioS.cadUsuario(usu);
            System.out.println("PROCESSANDO ...");
            System.out.println("...\n...\n...");
            System.out.println("Usuario cadastrado com sucesso!");
        }

    }//fim cadastrarUsuario

    public static void deletarUsuario() {
        System.out.println("-X- Deletar Usuario -X-");
        System.out.print("Informe o CPF: ");
        String cpf = leia.next();
        UsuarioServicos usuarioS = ServicosFactory.getUsuarioServicos();

        if (Validador.isCPF(cpf)) {
            Usuario usu = usuarioS.buscarUsuarioByCPF(cpf);
            //Usuario usu = cadUsuario.getUsuarioCPF(cpf);
            if (usu != null) {
                usuarioS.deletarUsuario(cpf);
                //cadUsuario.removeUsuarios(usu);
                System.out.println("PROCESSANDO ...");
                System.out.println("...\n...\n...");
                System.out.println("Usuario deletado com sucesso!");
            } else {
                System.out.println("Usuario nao consta na base de dados!");
            }
        } else {
            System.out.println("CPF invalido!");
        }
    }//fim deletarUsuario

    public static void listarUsuario() {
        UsuarioServicos usuarioS = ServicosFactory.getUsuarioServicos();

        if (usuarioS.getUsuarios().isEmpty()) {
            System.out.println("Não existe usuario cadastrado!");
        } else {
            for (Usuario usu : usuarioS.getUsuarios()) {
                System.out.println("----X----");
                System.out.println("Nome:\t\t" + usu.getNome());
                System.out.println("CPF:\t\t" + usu.getCpf());
                System.out.println("Num.Cadastro:\t" + usu.getNumCadastro());
                System.out.println("Endereco:\t" + usu.getEndereco());
                System.out.println("Telefone:\t" + usu.getTelefone());
            }
        }

    }//fim listarUsuario

    private static void editarUsuario() {
        UsuarioServicos usuarioS = ServicosFactory.getUsuarioServicos();
        System.out.println("--> Editar Usuario <--");
        System.out.print("Informe o CPF: ");
        String cpf = leia.nextLine();
        if (Validador.isCPF(cpf)) {
            Usuario usu = usuarioS.buscarUsuarioByCPF(cpf);
            if (usu != null) {
                System.out.println("1 - Nome:\t\t" + usu.getNome());
                System.out.println("2 - Endereco:\t" + usu.getEndereco());
                System.out.println("3 - Telefone:\t" + usu.getTelefone());
                System.out.println("4 - Todas as opcoes acima");
                System.out.print("Qual das opcoes deseja alterar? 1 || 2 || 3 || 4\n Digite aqui: ");
                int opEditar = leiaNumInt();
                switch (opEditar) {
                    case 1:
                        System.out.print("Informe o nome: ");
                        usu.setNome(leia.nextLine());
                        break;
                    case 2:
                        System.out.print("Informe o endereco: ");
                        usu.setEndereco(leia.nextLine());
                        break;
                    case 3:
                        System.out.print("Informe o telefone: ");
                        usu.setTelefone(leia.nextLine());
                        break;
                    case 4:
                        System.out.println("Informe todos os campos abaixo ->");
                        System.out.print("Informe o nome: ");
                        usu.setNome(leia.nextLine());
                        System.out.print("Informe o endereco: ");
                        usu.setEndereco(leia.nextLine());
                        System.out.print("Informe o telefone: ");
                        usu.setTelefone(leia.nextLine());
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }
                usuarioS.atualizarUsuario(usu);
                System.out.println("Usuario:\n" + usu.toString());
            } else {
                System.out.println("Usuario não cadastrado!");
            }
        } else {
            System.out.println("CPF invalido!");
        }
    }//fim editarUsuario

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu jfMenu = new Menu();
        jfMenu.setVisible(true);
        /*
        cadUsuario.mockUsuarios();
        cadPerfil.mockPerfis();
        cadPergunta.mockPerguntas();
        cadQuiz.mockQuizes();

        int opM;

        do {
            menuP();
            opM = leiaNumInt();
            switch (opM) {
                case 1:
                    int opSM;
                    do {
                        subMenu(opM);
                        opSM = leiaNumInt();
                        switch (opSM) {
                            case 1:
                                System.out.println("-- Cadastrar --");
                                if (opM == 1) {
                                    cadastrarUsuario();
                                }
                                break;
                            case 2:
                                System.out.println("-- Editar --");
                                if (opM == 1) {
                                    editarUsuario();
                                }
                                break;
                            case 3:
                                System.out.println("-- Listar --");
                                if (opM == 1) {
                                    listarUsuario();
                                }
                                break;
                            case 4:
                                System.out.println("-- Deletar --");
                                if (opM == 1) {
                                    deletarUsuario();
                                }
                                break;
                            case 0:
                                System.out.println(" <> Menu Principal <>");
                                break;
                            default:
                                System.out.println("-- Opcao Invalida, Tente Novamente! --");
                                break;
                        }
                    } while (opSM != 0);
                    break;
                case 0:
                    System.out.println("-- Fim do programa --");
                    System.out.println(" Volte Sempre! ;D ");
                    break;
                default:
                    System.out.println("--> Opcao Invalida, Tente Novamente! <--");
                    break;
            }
        } while (opM != 0);
        */
    }//fim da main
}
