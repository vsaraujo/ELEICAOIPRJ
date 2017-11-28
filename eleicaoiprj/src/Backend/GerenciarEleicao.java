/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vitor e Debora
 */
public class GerenciarEleicao {
    
    private Integer idGerenciar;
    private ArrayList<Candidato> candidatos;
    private Integer qntdevagas;
    private Date dataeleicao;
    private TipoEleicao tipodeeleicao;
    private static GerenciarEleicao instance;


    private GerenciarEleicao(){        
    }    
    
    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void addCandidatos(Candidato candidato) {
        this.candidatos.add(candidato);
    }
    
    public void remCandidatos(Candidato candidato) {
        candidatos.remove(candidato);
    }
    
    public Integer getQntdevagas() {
        return qntdevagas;
    }

    public void setQntdevagas(Integer qntdevagas) {
        this.qntdevagas = qntdevagas;
    }

    public Date getDataeleicao() {
        return dataeleicao;
    }

    public void setDataeleicao(Date dataeleicao) {
        this.dataeleicao = dataeleicao;
    }

    public TipoEleicao getTipodeeleicao() {
        return tipodeeleicao;
    }

    public void setTipodeeleicao(TipoEleicao tipodeeleicao) {
        this.tipodeeleicao = tipodeeleicao;
    }
    public static synchronized GerenciarEleicao getInstance(){
        if(instance == null)
             instance = new GerenciarEleicao();
        
        return instance;
    }
}
