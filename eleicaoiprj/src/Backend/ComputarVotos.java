/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.HashMap;

/**
 *
 * @author Vitor e Debora
 */
public class ComputarVotos {
    
    private static Integer idvoto;
    private final HashMap<Integer,Voto> mapavotos;
    
    public ComputarVotos(){
        
        mapavotos = new HashMap<Integer,Voto>();
        idvoto = 0;
        
    }
    public HashMap<Integer, Voto> getMapavotos() {
        return mapavotos;
    }

    public void addVoto(Voto voto) {
        
        mapavotos.put(idvoto,voto);
        idvoto++;
    }
}
