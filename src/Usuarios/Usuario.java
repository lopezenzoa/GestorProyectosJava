package Usuarios;

import java.util.Objects;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String titulo;

    public Usuario(String nombre, String apellido, String email, String titulo) {
        this.id = (int) (Math.random() * 100 + 1);
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(email, usuario.email) && Objects.equals(titulo, usuario.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, email, titulo);
    }

    @Override
    public String toString() {
        return "Usuarios.Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
