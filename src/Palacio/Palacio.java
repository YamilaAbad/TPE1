package Palacio;

import Mesa.Mesa;

import java.util.ArrayList;

public class Palacio {
    private ArrayList<Mesa> mesas;

    public Palacio(){
        mesas = new ArrayList<Mesa>();

    }

    public void addMesa(Mesa m){
        mesas.add(m);
    }
}
