package Dao;

import Models.Usuario;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import java.util.List;

public class UsuarioDao {

    private final Session session;
    private final Usuario usuario;

    public UsuarioDao(Usuario usuario) {
        this.usuario = usuario;
        this.session = HibernateUtil.getSession();
    }

    public Session getSession() {
        return session;
    }

    protected void save(Usuario usuario) {
        try {
            getSession().getTransaction().begin();
            getSession().save(usuario);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    protected void update(Usuario usuario) {
        try {
            getSession().getTransaction().begin();
            getSession().update(usuario);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    protected void delete(Usuario usuario) {
        try {
            getSession().getTransaction().begin();
            getSession().delete(usuario);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    public List findAll() throws Exception {
        return getSession().createCriteria(Usuario.class).list();
    }

    public Usuario findByName(String nome) {
        return (Usuario) getSession().createCriteria(Usuario.class)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public Usuario findById(long id) {
        return (Usuario) getSession().createCriteria(Usuario.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    private void close() {
        if (getSession() != null && getSession().isOpen()) {
            getSession().close();
        }
    }
}