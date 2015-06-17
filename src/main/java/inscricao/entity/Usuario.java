/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class Usuario implements Serializable{
    
    private String nome;
    private String senha;
    private boolean admin;
    private Date datahora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }
    
    
    public Usuario(String nome, String senha, boolean admin){
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
        this.datahora = new Date();
    }
    
    
}
