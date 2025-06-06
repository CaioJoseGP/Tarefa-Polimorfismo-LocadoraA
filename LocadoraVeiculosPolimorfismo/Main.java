import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner scan = new Scanner(System.in);
        HashMap<String, Carro> mapaCarros = new HashMap<>();
        HashMap<String, Cliente> mapaClientes = new HashMap<>();
        HashMap<Carro, Emprestimo> mapaEmprestimos = new HashMap<>();

        do {
            System.out.println("============= MENU ============="
                + "\nEscolha uma das opções (1 ao 5):"
                + "\n1. Cadastrar novo veículo."
                + "\n2. Cadastrar cliente."
                + "\n3. Realizar empréstimo."
                + "\n4. Finalizar empréstimos."
                + "\n5. Sair..."
                + "\n================================\n");

            op = scan.nextInt();
            scan.nextLine();

            ArrayList<String> parametrosString = new ArrayList<>();
            ArrayList<Double> parametrosDouble = new ArrayList<>();

            switch(op) {
                case 1:
                    int tipoCarro;
                    Carro carro;

                    while(true) {
                        System.out.println("\nDigite a opção de carro desejado:"
                            + "\n1. Popular."
                            + "\n2. SUV."
                            + "\n3. Luxo.\n");

                        tipoCarro = scan.nextInt();
                        scan.nextLine();

                        if(tipoCarro == 1 || tipoCarro == 2 || tipoCarro == 3) {
                            break;

                        } else {
                            System.out.println("\nTente novamente.");
                        }
                    }

                    System.out.println("\nDigite a marca do veículo: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite o modelo do veículo: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite a placa do veículo: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite o ano do veículo: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite o valor da locação: ");
                    parametrosDouble.add(scan.nextDouble());
                    scan.nextLine();

                    System.out.println("\nDigite o valor da multa: ");
                    parametrosDouble.add(scan.nextDouble());
                    scan.nextLine();

                    if(tipoCarro == 1) {
                        System.out.println("\nVeículo tem ar-condicionado? (false para Não e true para Sim) ");
                        boolean temAr = scan.nextBoolean();

                        carro = new CarroPopular(parametrosString.get(0), 
                                parametrosString.get(1), 
                                parametrosString.get(2), 
                                parametrosString.get(3), 
                                parametrosDouble.get(0), 
                                parametrosDouble.get(1), 
                                temAr);

                        mapaCarros.put(carro.getPlaca(), carro);

                    } else if(tipoCarro == 2) {
                        System.out.println("\nQual o tamanho do porta-malas em metros? (Ex.: 2.3): ");
                        parametrosDouble.add(scan.nextDouble());
                        scan.nextLine();

                        System.out.println("\nQual o tipo de tração? ");
                        parametrosString.add(scan.nextLine());

                        System.out.println("\nQual o combustível utilizado? ");
                        parametrosString.add(scan.nextLine());

                        carro = new CarroSUV(parametrosString.get(0), 
                                parametrosString.get(1), 
                                parametrosString.get(2), 
                                parametrosString.get(3), 
                                parametrosDouble.get(0), 
                                parametrosDouble.get(1),
                                parametrosDouble.get(2),
                                parametrosString.get(4), 
                                parametrosString.get(5));

                        mapaCarros.put(carro.getPlaca(), carro);

                    } else if(tipoCarro == 3) {
                        System.out.println("\nInsira a quantidade de Air-Bags: ");
                        int qntdAirBags = scan.nextInt();
                        scan.nextLine();

                        System.out.println("\nInsira o tamanho do porta-malas em metros (Ex.: 2.3): ");
                        parametrosDouble.add(scan.nextDouble());
                        scan.nextLine();

                        System.out.println("\nVeículo tem GPS? (false para Não e true para Sim) ");
                        boolean temGPS = scan.nextBoolean();

                        carro = new CarroLuxo(parametrosString.get(0), 
                                parametrosString.get(1), 
                                parametrosString.get(2), 
                                parametrosString.get(3), 
                                parametrosDouble.get(0), 
                                parametrosDouble.get(1),
                                qntdAirBags, 
                                parametrosDouble.get(2), 
                                temGPS);

                        mapaCarros.put(carro.getPlaca(), carro);
                    }

                    System.out.println("\n---------- Cadastrando... ----------\n");
                    break;
            
                case 2:
                    int tipoPessoa;

                    while(true) {
                        System.out.println("\nDigite o tipo de Cliente:"
                            + "\n1. Pessoa Física."
                            + "\n2. Pessoa Jurídica.\n");

                        tipoPessoa = scan.nextInt();
                        scan.nextLine();

                        if(tipoPessoa == 1 || tipoPessoa == 2) {
                            break;

                        } else {
                            System.out.println("\nTente novamente.");
                        }
                    }

                    System.out.println("\nDigite o nome do cliente: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite o endereço do cliente: ");
                    parametrosString.add(scan.nextLine());

                    System.out.println("\nDigite o telefone do cliente: ");
                    parametrosString.add(scan.nextLine());

                    if(tipoPessoa == 1) {
                        System.out.println("\nInsira o CPF do cliente: ");
                        parametrosString.add(scan.nextLine());

                        PessoaFisica cliente = new PessoaFisica(parametrosString.get(0), 
                                parametrosString.get(1), 
                                parametrosString.get(2), 
                                parametrosString.get(3));

                        mapaClientes.put(cliente.getCpf(), cliente);

                    } else if(tipoPessoa == 2) {
                        System.out.println("\nQual o nome do representante? ");
                        parametrosString.add(scan.nextLine());

                        System.out.println("\nInsira o CNPJ da empresa: ");
                        parametrosString.add(scan.nextLine());

                        PessoaJuridica cliente = new PessoaJuridica(parametrosString.get(0), 
                                parametrosString.get(1), 
                                parametrosString.get(2), 
                                parametrosString.get(3), 
                                parametrosString.get(4));

                        mapaClientes.put(cliente.getCnpj(), cliente);
                    }

                    System.out.println("\n---------- Cadastrando... ----------\n");
                    break;

                case 3:
                    if(!mapaCarros.isEmpty() && !mapaClientes.isEmpty()) {
                        String identificadorCliente = "";
                        String placa = "";

                        System.out.println("\nDigite o identificador (CPF ou CNPJ) do cliente: ");
                        identificadorCliente = scan.nextLine();

                        if(mapaClientes.get(identificadorCliente) == null) {
                            System.out.println("\nIdentificador não encontrado.");
                            break;
                        }

                        System.out.println("\nDigite a placa do carro: ");
                        placa = scan.nextLine();

                        if(mapaCarros.get(placa) == null) {
                            System.out.println("\nPlaca não encontrada.");
                            break;
                        }

                        if(mapaClientes.get(identificadorCliente) instanceof PessoaFisica && mapaClientes.get(identificadorCliente).getTotalEmprestimos() > 0) {
                            System.out.println("\nCliente não pode mais realizar empréstimos. ");
                            break;

                        } else if(!mapaCarros.get(placa).isDisponivel()) {
                            System.out.println("\nVeículo escolhido não disponível. ");
                            break;

                        } else {
                            Emprestimo emprestimo = new Emprestimo(mapaClientes.get(identificadorCliente), mapaCarros.get(placa));
                            mapaEmprestimos.put(mapaCarros.get(placa), emprestimo);
                            System.out.println("\n---------- Realizando empréstimo... ----------\n");
                            break;
                        }
                    }

                    System.out.println("\n---------- Erro: cadastro de cliente ou veículo vazio ----------\n");
                    break;

                case 4:
                    if(!mapaEmprestimos.isEmpty()) {
                        String placa = "";

                        System.out.println("\nDigite a placa do carro para devolução: ");
                        placa = scan.nextLine();

                        if(mapaCarros.get(placa) == null) {
                            System.out.println("\nPlaca não encontrada.");
                            break;
                        }

                        if(mapaCarros.get(placa).isDisponivel()) {
                            System.out.println("\nVeículo escolhido não alocado. ");
                            break;

                        } else {
                            mapaEmprestimos.get(mapaCarros.get(placa)).realizarDevolucao();
                            mapaEmprestimos.remove(mapaCarros.get(placa));
                            System.out.println("\n---------- Finalizando empréstimo... ----------\n");
                            break;
                        }
                    }

                    System.out.println("\n---------- Erro: emprestimos vazios ----------\n");
                    break;

                case 5:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }

        } while(op != 5);

        scan.close();
    }
}