/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author Renato Felix
 */
public class Correio {

    public void NotificarPoemail(Agendamento agendamento) {

        String emailFormatado = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();

        //Uso da classe Email
        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();

        return "Olá " + nomeCliente + "Vamos dar um tapa no visual??? Seu agendamento para "
                + servico + " Esta marcado para o dia " + dataAgendamento
                + " ás " + horaAgendamento + "O preço para você sai bem baratinho e fica em R$ " + valor + "Até mais, abraços";
    }

}
