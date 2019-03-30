public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String sintoma;
    private String codigo;

    public Paciente() {
        nombre = "";
        sintoma = "";
        codigo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", sintoma='" + sintoma + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Paciente p) {
        return this.codigo.compareTo(p.getCodigo());
    }
}
