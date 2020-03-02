package cl.desafiolatam.postresfiness;

public class Recipe {
    private String nombre;
    private String ingrediente;
    private String preparacion;
    private String imagen;
    private String id;

    @Override
    public String toString() {
        return "Recipe{" +
                "nombre='" + nombre + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

