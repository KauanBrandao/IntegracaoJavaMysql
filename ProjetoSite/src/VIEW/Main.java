package VIEW;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("-------- JOVEM PCD --------");
            System.out.println("[1]. Cadastros");
            System.out.println("[2]. Edições");
            System.out.println("[3]. Sair");
            System.out.print("Escolha uma opção: ");
            char escolha = sc.next().charAt(0);

            switch (escolha) {
                case '1':
                    boolean sairCadastro = false;

                    while (!sairCadastro) {
                        System.out.println("-------- CADASTROS --------");
                        System.out.println("[1]. Cadastro de Usuário");
                        System.out.println("[2]. Cadastro de Empresa");
                        System.out.println("[3]. Cadastro de Candidatura");
                        System.out.println("[4]. Cadastro de Vaga");
                        System.out.println("[5]. Cadastro de Feedback");
                        System.out.println("[0]. Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");
                        char escolhaCadastro = sc.next().charAt(0);

                        switch (escolhaCadastro) {
                            case '1':
                                Cadastro cadastroUsuario = new Cadastro();
                                cadastroUsuario.cadastrarUsuario();
                                break;
                            case '2':
                                Cadastro cadastroEmpresa = new Cadastro();
                                cadastroEmpresa.cadastrarEmpresa();
                                break;
                            case '3':
                                Cadastro cadastroCandidatura = new Cadastro();
                                cadastroCandidatura.cadastrarCandidatura();
                                break;
                            case '4':
                                Cadastro cadastroVaga = new Cadastro();
                                cadastroVaga.cadastrarVaga();
                                break;
                            case '5':
                                Cadastro cadastroFeedback = new Cadastro();
                                cadastroFeedback.cadastrarFeedback();
                                break;
                            case '0':
                                sairCadastro = true;  // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("Escolha uma opção válida!");
                                break;
                        }
                    }
                    break;

                case '2':
                    // Aqui você pode colocar a lógica para o submenu de "Edições" se desejar.
                    break;

                case '3':
                    sair = true;  // Sair do sistema
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }
        System.out.println("Sistema encerrado.");
    }
}
