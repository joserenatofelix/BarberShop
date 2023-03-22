/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;


/**
 *
 * @author Renato Felix
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
   //Pegar um  Usuario da View
        Usuario usuario = helper.obterModelo();
        
       
       //Pesquisa Usuario no Banco
       ////Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco direcionar para menu principal
       //Senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos"
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}