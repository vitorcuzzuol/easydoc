package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lider", schema = "easydoc", catalog = "")
public class LiderEntity {
    private int idlider;
    private int idusuario;

    @Id
    @Column(name = "IDLIDER")
    public int getIdlider() {
        return idlider;
    }

    public void setIdlider(int idlider) {
        this.idlider = idlider;
    }

    @Basic
    @Column(name = "IDUSUARIO")
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
        LiderEntity that = (LiderEntity) o;
        return idlider == that.idlider &&
                idusuario == that.idusuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlider, idusuario);
    }
}
