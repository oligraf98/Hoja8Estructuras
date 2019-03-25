public class Paciente<T> implements Comparable<T> {

    private String nombre;
    private String sintoma;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
