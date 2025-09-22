package Interfaces;

import java.util.ArrayList;

public interface CRUD {
  public boolean add(String nombre);

  public int size();

  public boolean delete(int position);

  public String get(int position);

  public ArrayList<String> getAll();
}
