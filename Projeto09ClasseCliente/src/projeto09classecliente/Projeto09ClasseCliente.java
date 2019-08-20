/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author aluno
 */
public class Projeto09ClasseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Um OBJETO  c1 do tipo da classe Cliente,
        //sendo instanciado por meio do operador NEW
        //que chama o método construtor Cliente()
        Cliente c1 = new Cliente("1222","Yuri", "8877-05", "Lins", "SP");
        c1.setRG("5555");
        System.out.println(c1.getRG());
        System.out.println(c1.getNome());
        System.out.println(c1.getCPF());
        System.out.println(c1.getCidade());
        System.out.println(c1.getEstado());
    }
    
}
