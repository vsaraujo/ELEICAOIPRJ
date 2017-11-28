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
    
    private static Integer idvoto = 0;
    private HashMap<Voto,Integer> mapavotos = new HashMap<Voto,Integer>();

    public HashMap<Voto, Integer> getMapavotos() {
        return mapavotos;
    }

    public void addVoto(Voto voto) {
        mapavotos.put(voto,idvoto);
    }
    
}
