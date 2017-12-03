/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author Vitor e Debora
 */
public class GerenciarEleicao {
    
    private static Integer idGerenciar = 0;
    private ArrayList<Candidato> candidatos;
    private Integer qntdevagas;
    private Date dataeleicao;
    private TipoEleicao tipodeeleicao;
    private ComputarVotos mapvotos;
    
    public GerenciarEleicao(){        
        
        idGerenciar++;
        candidatos = new ArrayList<Candidato>();
        qntdevagas = 0;
        dataeleicao = new Date();
        tipodeeleicao = TipoEleicao.DIACONOS;
        mapvotos = new ComputarVotos();
        
    }    

    public void setIdGerenciar(Integer idGerenciar) {
        this.idGerenciar = idGerenciar;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public void setMapvotos(ComputarVotos mapvotos) {
        this.mapvotos = mapvotos;
    }

    public Integer getIdGerenciar() {
        return idGerenciar;
    }

    public ComputarVotos getMapvotos() {
        return mapvotos;
    }
    
    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void addCandidatos(Candidato candidato) {
        System.out.println("### Incluindo candidato na lista: ####"+candidato.getNome()+" "+candidato.getSobrenome());
        
        this.candidatos.add(candidato);
    }
    
    public void remCandidatos(Candidato candidato) {
        candidatos.remove(candidato);
    }
    
    public Integer getQntdevagas() {
        return qntdevagas;
    }

    public void setQntdevagas(Integer qntdevagas) {
        
        System.out.println("###Quantidade de vagas:"+qntdevagas.toString());
        
        this.qntdevagas = qntdevagas;
    }

    public Date getDataeleicao() {
        return dataeleicao;
    }

    public void setDataeleicao(Date dataeleicao) {
        System.out.println("###Data da eleicao:"+dataeleicao.getTime());
        
        this.dataeleicao = dataeleicao;
    }

    public TipoEleicao getTipodeeleicao() {
        return tipodeeleicao;
    }

    public void setTipodeeleicao(TipoEleicao tipodeeleicao) {
        
        System.out.println("###Tipo de Eleicao:"+tipodeeleicao.name());
        
        this.tipodeeleicao = tipodeeleicao;
    }    
    public void printComputarVotos(){
        
        HashMap<Integer, Voto> lista = mapvotos.getMapavotos();
        
        for(HashMap.Entry<Integer, Voto> ind : lista.entrySet()){
            
            System.out.println("#### Voto ind:"+ind.getKey());
            Voto voto = ind.getValue();
            
            for(Candidato can : voto.getCand_selecionados()){
                System.out.println("Candidato: "+can.getNome());
            }
        
        }
        
    }

    private void foreach(HashMap<Voto, Integer> mapavotos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
