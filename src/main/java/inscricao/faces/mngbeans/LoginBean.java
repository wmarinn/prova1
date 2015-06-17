/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import utfpr.faces.support.PageBean;

/**
 *
 * @author user
 */

@ManagedBean
@ApplicationScoped
@Named(value = "loginBean")
public class LoginBean extends PageBean{

    /**
     * Creates a new instance of LoginBean
     */
    private String login;
    private String senha;
    private boolean admin;
    
    private static final ArrayList<Usuario> userList = new ArrayList<>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public ArrayList <Usuario> getUserList(){
        return userList;
    }
        
    
    public LoginBean() {
        admin = false;
    }
    
    public void pressBotao() throws IOException{
        if(!this.login.equals(this.senha)){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Acesso Negado"));
        }
        else{
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            userList.add(new Usuario(this.login, this.senha, this.admin));
            if(this.admin == false){ 
                context.redirect(context.getRequestContextPath() + "/cadastro.xhtml");
            }
            else{
                context.redirect(context.getRequestContextPath() + "/admin.xhtml");
            }
        }
    }
    
}
