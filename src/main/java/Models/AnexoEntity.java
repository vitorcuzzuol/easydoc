package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "anexo", schema = "easydoc", catalog = "")
public class AnexoEntity {
    private int idanexo;
    private int idtarefa;
    private int idusuario;
    private String nome;
    private String descricao;
    private String tipo;

    @Id
    @Column(name = "IDANEXO")
    public int getIdanexo() {
        return idanexo;
    }

    public void setIdanexo(int idanexo) {
        this.idanexo = idanexo;
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
    @Column(name = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "DESCRICAO")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "TIPO")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnexoEntity that = (AnexoEntity) o;
        return idanexo == that.idanexo &&
                idtarefa == that.idtarefa &&
                idusuario == that.idusuario &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idanexo, idtarefa, idusuario, nome, descricao, tipo);
    }
}
