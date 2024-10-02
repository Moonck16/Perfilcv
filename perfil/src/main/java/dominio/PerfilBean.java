package dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class PerfilBean {
    private Perfil perfil;

    public PerfilBean() {
        String[] lenguajes = {"Java", "Python", "C++"};
        String[] basesDeDatos = {"MySQL", "PostgreSQL"};
        String[] proyectos = {"Sistema de Gestión", "Página Web", "App Móvil"};
        perfil = new Perfil("Dakota Johnston", "Ingeniería de Software", "foto.jpg", lenguajes, basesDeDatos, proyectos, 9.0);
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
