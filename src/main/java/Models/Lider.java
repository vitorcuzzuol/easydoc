package Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Lider {
    private int idlider;
    private int idusuario;
    private Collection<Grupo> gruposByIdlider;
    private Collection<Historicogrupo> historicogruposByIdlider;
    private Usuario usuarioByIdusuario;

    @Id
    @Column(name = "idlider")
    public int getIdlider() {
        return idlider;
    }

    public void setIdlider(int idlider) {
        this.idlider = idlider;
    }

    @Basic
    @Column(name = "idusuario")
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lider lider = (Lider) o;
        return idlider == lider.idlider &&
                idusuario == lider.idusuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlider, idusuario);
    }

    @OneToMany(mappedBy = "liderByIdlider")
    public Collection<Grupo> getGruposByIdlider() {
        return gruposByIdlider;
    }

    public void setGruposByIdlider(Collection<Grupo> gruposByIdlider) {
        this.gruposByIdlider = gruposByIdlider;
    }

    @OneToMany(mappedBy = "liderByIdlider")
    public Collection<Historicogrupo> getHistoricogruposByIdlider() {
        return historicogruposByIdlider;
    }

    public void setHistoricogruposByIdlider(Collection<Historicogrupo> historicogruposByIdlider) {
        this.historicogruposByIdlider = historicogruposByIdlider;
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
