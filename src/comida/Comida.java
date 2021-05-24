package comida;

public class Comida {
    private String nombre;
    private String tipo;
    private String modoPreparacion;
    private double precio;
    private int tiempoPreparacion;
    private double calorias;

    public Comida(String nombre, String tipo, String modoPreparacion, double precio, int tiempoPreparacion, double calorias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public double getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Nombre del plato: " + nombre + "," + " precio unitario: $" + precio + "\n";
    }
}
