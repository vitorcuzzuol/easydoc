package Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Comentario {
    private int idcomentario;
    private int idtarefa;
    private int idusuario;
    private String comentario;
    private Date dataDeInicio;
    private Date ultimaModificacao;
    private Tarefa tarefaByIdtarefa;
    private Usuario usuarioByIdusuario;

    @Id
    @Column(name = "idcomentario")
    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    @Basic
    @Column(name = "idtarefa")
    public int getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(int idtarefa) {
        this.idtarefa = idtarefa;
    }

    @Basic
    @Column(name = "idusuario")
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @Column(name = "comentario")
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Basic
    @Column(name = "data_de_inicio")
    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Basic
    @Column(name = "ultima_modificacao")
    public Date getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(Date ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return idcomentario == that.idcomentario &&
                idtarefa == that.idtarefa &&
                idusuario == that.idusuario &&
                Objects.equals(comentario, that.comentario) &&
                Objects.equals(dataDeInicio, that.dataDeInicio) &&
                Objects.equals(ultimaModificacao, that.ultimaModificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcomentario, idtarefa, idusuario, comentario, dataDeInicio, ultimaModificacao);
    }

    @ManyToOne
    @JoinColumn(name = "idtarefa", referencedColumnName = "idtarefa", nullable = false,
            insertable = false, updatable = false)
    public Tarefa getTarefaByIdtarefa() {
        return tarefaByIdtarefa;
    }

    public void setTarefaByIdtarefa(Tarefa tarefaByIdtarefa) {
        this.tarefaByIdtarefa = tarefaByIdtarefa;
    }

    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = false,
            insertable = false, updatable = false)
    public Usuario getUsuarioByIdusuario() {
        return usuarioByIdusuario;
    }

    public void setUsuarioByIdusuario(Usuario usuarioByIdusuario) {
        this.usuarioByIdusuario = usuarioByIdusuario;
    }
}
