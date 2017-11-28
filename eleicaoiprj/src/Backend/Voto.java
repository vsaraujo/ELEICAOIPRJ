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
    private ArrayList<Candidato> cand_selecionados;
    private final Date horavoto;
    
    public Voto(){
        
        horavoto = new Date();
        horavoto.getTime();
        idvoto++;
        
    }

    public static Integer getIdvoto() {
        return idvoto;
    }

    public ArrayList<Candidato> selec_selecionados() {
        return cand_selecionados;
    }

    public void setCandidato(Candidato candidato) {
        cand_selecionados.add(candidato);
    }
    public void remCandidato(Candidato candidato) {
        cand_selecionados.remove(candidato);
    }
    
    public Date getHoravoto() {
        return horavoto;
    }
    
}
