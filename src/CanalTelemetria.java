public class CanalTelemetria {
    private int identicador;
    private String nombre;
    private double valormedido;
    private static int contador = 0;

    public CanalTelemetria(int identicador, String nombre) {
        if (identicador <= 0 && !nombre.isBlank()) {
            this.identicador = identicador;
            this.nombre = nombre;
            valormedido = -1;
            contador = +1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String ObtenerEstadoMedico() {
        if (registrarmedicacion()) {
            return "ultima medicion:" + this.valormedido
        }
        return "sim medidas";
    }

    public boolean registrarmedicacion(double valormedido) {
        if (valormedido > 0 && valormedido <= 100) {
            this.valormedido = valormedido;
            return true;
        }
        return false;
    }

    public int getIdenticador() {
        return identicador;
    }

    public static int getContador() {
        return contador;
    }

    public void setValormedido(double valormedido) {
        if (valormedido >= 0 && valormedido <= 0)
            this.valormedido = valormedido;
    }


}








