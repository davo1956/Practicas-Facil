import javax.management.ObjectName;

public class Robot {

    //Asignamos las variables correspondientes a los atributos.

    /* Nombre del Robot. */
    private String nombre;
    /* Nombre del modelo del Robot. */
    private String modelo;
    /* Numero de Serie al que pertenece el robot. */
    private double numeroSerie;
    /* Nivel de carga de la bateria del Robot. */
    private byte bateria;
    /* Nos dice si el robot esta cargado o no lo esta. */
    private boolean power;

    /**
     * Define el estado inicial de nuestro robot.
     * @param nombre del robot.
     * @param modelo del robot.
     * @param numero de serie del robot.
     * @param Nivel de carga del robot.
     * @param Estado inicial del robot.
     */
    public Robot(String nombre,
                 Srtring modelo,
                 double numeroSerie,
                 byte bateria,
                 boolean power) {
        this.nombre = nombre;
    this.modelo = modelo;
    this. numeroSerie = numeroSerie;
    this.bateria = bateria;
                 }
    /**
     * Regresa el nombre del robot.
     * @return el nombre del robot.
     */
    public String getRobot() {
        return nombre;
    }

    /**
     * Define el nombre del robot 
     * @param nombre el nuevo nombre del robot.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el modelo del robot.
     * @return el modelo del robot.
     */
    public String getModelo() {
        return modelo;
    }

    /**Define el modelo del robot.
     * @param nombre el modelo del robot
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**Regresa el numero de serie del robot.
     * @return numero de serie del robot.
     */
    public double getNumeroSerie() {
        return numeroSerie;
    }

    /**Define el numero de serie del robot
     * @param el numero de serie del robot.
     */
    public void setNumeroSerie(double numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**Regresa la garga de la bateria del robot.
     * @return la carga de la bateria del robot.
     */
    public byte getBateria(){
        return bateria;
    }

    /**Define la carga de la bateria del robot.
     * @param la carga total de la bateria del robot.
     */
    public void setBateria(byte bateria){
        this.bateria = bateria;
    }

    /**Regresa un booleano si el robot tiene bateria
     * @return si tiene bateria el robot.
     */
    public boolean getPower(){
        return power;
    }
    
    /**Define si el robot tiene bateria
     * @param si el robot tiene o no bateria
     */
    public void setPower(boolean power){
        this.power = power;
    }





} 
