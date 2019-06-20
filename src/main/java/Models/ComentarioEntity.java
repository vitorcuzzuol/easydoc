package Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "comentario", schema = "easydoc", catalog = "")
public class ComentarioEntity {
    private int idcomentario;
    private int idtarefa;
    private int idusuario;
    private String comentario;
    private Timestamp dataDeInicio;
    private Timestamp ultimaModificacao;

    @Id
    @Column(name = "IDCOMENTARIO")
    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    @Basic
    @Column(name = "IDTAREFA")
    public int getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(int idtarefa) {
        this.idtarefa = idtarefa;
    }

    @Basic
    @Column(name = "IDUSUARIO")
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @Column(name = "COMENTARIO")
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Basic
    @Column(name = "DATA_DE_INICIO")
    public Timestamp getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Timestamp dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Basic
    @Column(name = "ULTIMA_MODIFICACAO")
    public Timestamp getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(Timestamp ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComentarioEntity that = (ComentarioEntity) o;
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
}
