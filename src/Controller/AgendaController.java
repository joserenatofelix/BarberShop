/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Renato Felix
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){        
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir esta lista de View
        helper.preencherTabela(agendamentos);
    }
    
     public void atualizaCliente(){  
         //Buscar Clientes no Banco de Dados
         ClienteDAO clienteDAO = new ClienteDAO();
         ArrayList<Cliente> clientes = clienteDAO.selectAll();
         
         //Exibir Clientes no ComboBox cliente
         helper.preencherClientes(clientes);
    }
     
     public void atualizaServico(){
         
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preecherServicos(servicos);
     }
     
     public void atualizaValor(){
         Servico servico = helper.obterServico();
         helper.setarValor(servico.getValor());
     }
     
     public void agendar(){
         //Buscar Objeto Agendamento da Tela
         // Salva Objeto no banco de dados
     }
     
}
