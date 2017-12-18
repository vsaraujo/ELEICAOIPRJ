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
public class Voto {
    
    private static Integer idvoto = 0;
    private ArrayList<Candidato> candidatos;
    private ArrayList<Integer> cand_selecionados;
    private final Date horavoto;
    private Integer votosembranco;
    private Boolean votonulo;
    
    public Voto(){
        
        horavoto = new Date();
        horavoto.getTime();
        idvoto++;
        candidatos = GerenciarEleicao.getInstancia().getCandidatos();
        votosembranco = GerenciarEleicao.getInstancia().getQntdevagas();
        iniciarVetorCandSelecionados(candidatos.size());
        votonulo = false;
    }

    public Boolean getVotonulo() {
        return votonulo;
    }

    public static Integer getIdvoto() {
        return idvoto;
    }

    public ArrayList<Integer> selec_selecionados() {
        return cand_selecionados;
    }

    public void setCandidato(Candidato candidato) {
        
        if(!votonulo){
            System.out.println("###Voto: Selecionando candidato:"+candidato.getNome());
            cand_selecionados
            votosembranco--;
        }
        
    }

    public void setVotonulo(Boolean votonulo) {
        this.votonulo = votonulo;
        
        if(votonulo){
            System.out.println("###Voto branco zerado");
            votosembranco = 0;
        }
    }

    public Integer getVotosembranco() {
        return votosembranco;
    }
    public void remCandidato(Candidato candidato) {
        cand_selecionados.remove(candidato);
    }
    
    public Date getHoravoto() {
        return horavoto;
    }

    private void iniciarVetorCandSelecionados(Integer tam) {
        
        cand_selecionados = new ArrayList<Integer>();
        
        for(int i=0 ; i<tam;i++){
            
            cand_selecionados.set(i, -1);
            
        }        
    }    
}
