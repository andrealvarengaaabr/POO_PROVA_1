/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_prova_1;

/**
 *
 * @author André P. Alvarenga
 */
public class TesteSistema {

      public static void main(String[] args) {
            Departamento departamentoCompras = new Departamento("Compras");
            Departamento departamentoVendas = new Departamento("Vendas");
            Cargo cargoComprador = new Cargo("Comprador");
         Cargo cargoVendedor = new Cargo("Vendedor");
         Funcionario funcionario1 = new Funcionario(
                 "Andre",
                  "111.111.111-11",
                  departamentoCompras,
                  cargoComprador,
                 2500.00
                       );
                  Funcionario funcionario2 = new Funcionario(
                    "Andrezinho",
                        "222.222.222-22",
                  departamentoVendas,
                      cargoVendedor,
                  3000.00
               );
        Funcionario funcionario3 = new Funcionario();
             System.out.println(funcionario1.toString());
           System.out.println();
          System.out.println(funcionario2.toString());
          System.out.println();
           System.out.println(funcionario3.toString());
           System.out.println();
           funcionario3.alterarDados(
                 "Anndreesss",
                 "333.333.333-33",
                 departamentoCompras,
                 cargoComprador,
                  2800.00
            );
           System.out.println("----- FUNCIONÁRIO 3 APÓS ALTERAÇÃO -----");
          System.out.println(funcionario3.toString());
           System.out.println();
         funcionario1.aplicarReajuste(15.0);
          System.out.printlsn("----- FUNCIONÁRIO 1 APÓS REAJUSTE DE 15% -----");
         System.out.println(funcionario1.toString());
            System.out.println();
        funcionario3.demitir();
          System.out.println("========== TODOS OS FUNCIONÁRIOS ==========");
          System.out.println();
          System.out.println(funcionario1.toString());
          System.out.println();
          System.out.println(funcionario2.toString());
           System.out.println();
           System.out.println(funcionario3.toString());
      }
            }
