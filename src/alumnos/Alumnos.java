package alumnos;

import java.util.ArrayList;

import Interfaces.CRUD;

public class Alumnos implements CRUD {

    private ArrayList<String> alumnos = new ArrayList<>();

    public Alumnos() {

    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void add(String nombre) {
        if (!nombre.trim().isEmpty()) {
            alumnos.add(nombre.trim());
        } else {
            System.out.println("Error. Introduce un nombre correcto.");
        }
    }

    @Override
    public int size() {
        return alumnos.size();
    }

    @Override
    public boolean delete(int position) {

        if (position >= 0 && position < alumnos.size()) {
            alumnos.remove(position);
            return true;
        }

        return false;
    }

    @Override
    public String get(int position) {
        if (position >= 0 && position < alumnos.size()) {
            return alumnos.get(position);
        }
        return null;
    }

    @Override
    public ArrayList<String> getAll() {
        return new ArrayList<>(alumnos);
    }
}