package Beans;

import Dao.UsuarioDao;
import Models.Usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean (name = "UsuarioBean")
@ViewScoped
public class UsuarioBean {

    private UsuarioDao dao;
    private Usuario usuario = new Usuario();

    public UsuarioBean() {
        this.dao = new UsuarioDao(usuario);
    }

    public Usuario getUsuario() {
        usuario = dao.findByName("usuario1");
        return usuario;
    }
}
