/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Renato Felix
 */
public class Main {
    
    public static void main(String[] args) {
        
        Servico servico = new Servico(1,"Barba",20); 
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
            
        Cliente cliente = new Cliente(1, "Renato", "Rua Teste", "12321700");
        
	  System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(2, "barbeiro", "1234", "2");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "06/10/2023 09:20", "Observacao");

        System.out.println(agendamento.getCliente().getNome());
            
    }
    
}
