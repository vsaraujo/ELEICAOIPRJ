/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Vitor e Debora
 */
public class Candidato {
    
    private String nome;
    private String sobrenome;
    private String camfoto;
    private static Integer idcandidato = 0 ;
    
    public Candidato(){
        
        idcandidato++;
        
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCamfoto() {
        return camfoto;
    }

    public Integer getIdcandidato() {
        return idcandidato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCamfoto(String camfoto) {
        this.camfoto = camfoto;
    }
}
