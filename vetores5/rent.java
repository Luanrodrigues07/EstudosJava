package vetores5;

public class rent {
    private String nome;
    private String email;

    public rent (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public String setNome(){
        return this.nome;
    }
    public String getemail(){
        return email;
    }
    public String setemail(){
        return this.email;
    }

    public String toString(){
        return nome + "; " + email;
    }
}
    

