package model;

/**
 *
 * @author TIAGO
 */
import java.util.Date;

public class Usuario {
    
    private  int usuarioId;
    private String nome;
    private Date dataNascimento;
    private String email;
    
    public  int getUsuarioId(){
        return usuarioId;
    }
    public void setUsuarioId(int usuarioid) {
        this.usuarioId = usuarioid;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
