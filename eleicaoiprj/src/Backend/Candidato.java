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
    private Integer idcandidato;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCamfoto(String camfoto) {
        this.camfoto = camfoto;
    }

    public void setIdcandidato(Integer idcandidato) {
        this.idcandidato = idcandidato;
    }
    
}
