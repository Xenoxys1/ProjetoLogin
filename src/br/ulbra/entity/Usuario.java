package br.ulbra.entity;

public class Usuario {
    private int pkIdUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    
    public Usuario(){
        
    }

    public int getPkIdUsu() {
        return pkIdUsu;
    }

    public void setPkIdUsu(int pkIdUsu) {
        this.pkIdUsu = pkIdUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

}
