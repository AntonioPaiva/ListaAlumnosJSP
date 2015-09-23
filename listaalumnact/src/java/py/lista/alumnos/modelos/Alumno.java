package py.lista.alumnos.modelos;

public class Alumno {

    private int id;
    private String cedulaI;
    private String nombre;
    private String apellido;
    private String edad;
    private String carrera;

    public Alumno() {
    }

    
    
    public Alumno(int id, String cedulaI, String nombre, String apellido, String edad, String carrera) {
        this.id = id;
        this.cedulaI = cedulaI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
    }

    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCedulaI() {
        return cedulaI;
    }

    public void setCedulaI(String cedulaI) {
        this.cedulaI = cedulaI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno[ " + "id = " + id + ", cedula = " + cedulaI + ", nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad + ", carrera = " + carrera + ']';
    }
}
