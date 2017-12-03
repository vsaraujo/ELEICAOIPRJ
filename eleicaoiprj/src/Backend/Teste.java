/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vitor e Debora
 */
public class Teste {
    
    
    
    public static void main (String[] args){
        
        
        System.out.println("###Iniciando Eleicao ####");
        
        System.out.println("###Criando Candidato1 ####");
        
        Candidato can1 = new Candidato();
        can1.setNome("Candidato 1");
        can1.setSobrenome("Sobrenome");
        
        System.out.println("###Criando Candidato2 ####");
                
        Candidato can2 = new Candidato();
        can2.setNome("Candidato 2");
        can2.setSobrenome("Sobrenome");
        
        System.out.println("###Criando Gerenciamento ####");
        
        GerenciarEleicao eleicao = new GerenciarEleicao();
        eleicao.addCandidatos(can1);
        eleicao.addCandidatos(can2);
        eleicao.setDataeleicao(new Date());
        eleicao.setTipodeeleicao(TipoEleicao.DIACONOS);
        eleicao.setQntdevagas(2);
        
        System.out.println("###Obtendo Computador de Votos ####");
        
        ComputarVotos compvotos = eleicao.getMapvotos();
        
        System.out.println("###Obtendo Lista de candidatos ####");

        ArrayList<Candidato> candidatos = eleicao.getCandidatos();
        
        System.out.println("###Criando voto1 ####");

        Voto vot1 = new Voto();
        vot1.setCandidato(candidatos.get(0));
        vot1.setCandidato(candidatos.get(1));
        
        System.out.println("###Criando voto2 ####");

        Voto vot2 = new Voto();
        vot2.setCandidato(candidatos.get(0));
        
        System.out.println("###Criando voto3 ####");

        Voto vot3 = new Voto();
        vot3.setCandidato(candidatos.get(0));
        vot3.setCandidato(candidatos.get(1));
                
        compvotos.addVoto(vot1);
        compvotos.addVoto(vot2);
        compvotos.addVoto(vot3);
        
        eleicao.printComputarVotos();
        
        
    }
}
