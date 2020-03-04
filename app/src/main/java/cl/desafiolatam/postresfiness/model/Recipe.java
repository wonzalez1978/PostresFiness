package cl.desafiolatam.postresfiness.model;

public class Recipe {

    private int id;

    private String nombre;
    private String descripcion;
    private String ingrediente;
    private String preparacion;

    // Recurso de la imagen. Corresponde al ID del drawable asignado
    private int imagen;

    public Recipe(int id, String nombre, String descripcion, String ingrediente, String preparacion, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingrediente = ingrediente;
        this.preparacion = preparacion;
        this.imagen = imagen;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}

