package dominio;

public class Perfil {
    private String nombre;
    private String carrera;
    private String foto; // nombre de la imagen
    private String[] lenguajesDeProgramacion;
    private String[] baseDeDatos;
    private String[] proyectosRealizados;
    private double promedio;

    // Constructor
    public Perfil(String nombre, String carrera, String foto, String[] lenguajesDeProgramacion, String[] baseDeDatos, String[] proyectosRealizados, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.foto = foto;
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
        this.baseDeDatos = baseDeDatos;
        this.proyectosRealizados = proyectosRealizados;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String[] getLenguajesDeProgramacion() {
        return lenguajesDeProgramacion;
    }

    public void setLenguajesDeProgramacion(String[] lenguajesDeProgramacion) {
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
    }

    public String[] getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String[] baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public String[] getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(String[] proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
