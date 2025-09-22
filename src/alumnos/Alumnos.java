package alumnos;

public class Alumnos {
long id;
String nombre;

public Alumnos(){
    this(0, "");


}

public Alumnos(int id, String nombre){
    this.id = id;
    this.nombre =nombre;
}

@Override
public String toString() {
    return String.format("ID: &d","Nombre: %s", this.id, this.nombre);
}
    
}


