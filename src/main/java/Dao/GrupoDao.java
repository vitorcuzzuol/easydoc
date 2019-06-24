package Dao;

import Models.Grupo;
import Models.Tarefa;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class GrupoDao {


    private final Session session;
    private final Grupo grupo;



    public GrupoDao(Grupo grupo) {
        this.grupo = grupo;
        this.session = HibernateUtil.getSession();
    }

    public Session getSession() {
        return session;
    }

    protected void save(Grupo grupo) {
        try {
            getSession().getTransaction().begin();
            getSession().save(grupo);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    protected void update(Grupo grupo) {
        try {
            getSession().getTransaction().begin();
            getSession().update(grupo);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    public List<Tarefa> tarefaList (int idgrupo){
        List<Tarefa> tarefas;

            getSession().getTransaction().begin();
            tarefas = getSession().createQuery(
                    "select tarefa " +
                    "from Tarefa tarefa " +
                    "where tarefa.idgrupo = ?1",
                    Tarefa.class)
                    .setParameter(1,idgrupo)
                    .getResultList();
            return tarefas;
    }
    protected void delete(Grupo grupo) {
        try {
            getSession().getTransaction().begin();
            getSession().delete(grupo);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
            t.printStackTrace();
        } finally {
            close();
        }
    }

    public List findAll() throws Exception {
        return getSession().createCriteria(Grupo.class).list();
    }

    public Grupo findByName(String nome) {
        return (Grupo) getSession().createCriteria(Grupo.class)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public Grupo findById(int id) {
        return (Grupo) getSession().createCriteria(Grupo.class)
                .add(Restrictions.eq("idgrupo", id)).uniqueResult();
    }

    private void close() {
        if (getSession() != null && getSession().isOpen()) {
            getSession().close();
        }
    }
}
