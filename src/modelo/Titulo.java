package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int tiempoDeDuracionEnMinutos;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private double evaluacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void muestraFichaTecnica(){
        System.out.println("***FICHA TÉCNICA");
        System.out.println("Nombre del Titulo: " + nombre);
        System.out.println("Fecha de Lanzamiento " + fechaDeLanzamiento);
        System.out.println("Tiempo de duracion: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }
}
