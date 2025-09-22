package Materia;

import Interfaces.CRUD;
import java.util.ArrayList;

public class Materias implements CRUD {

    private ArrayList<String> materias;

    public Materias() {
        materias = new ArrayList<>();
    }

    public boolean add(String nombre) {
        if(!materias.contains(nombre))
            return materias.add(nombre);
        return false;
    }
    

     @Override
     public int size() {
         return materias.size();

     }

     @Override
     public boolean delete(int position) {
        if(position >=0 && position < materias.size()){
            materias.remove(position);
            return true;
        }
        return false;
     }

     @Override
     public String get(int position) {
        if (position >=0 && position < materias.size()){
           return materias.get(position);
        }
        return null;
     }

     @Override
     public ArrayList<String> getAll() {
        return new ArrayList<>(materias);
        
     }
}
