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
        
        String nome = "Renato";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Renato", "Rua Teste", "12321700");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "22/03/2023 09:20");
        System.out.println(agendamento.getCliente().getNome());
            
    }
    
}
