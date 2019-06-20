package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Anexo {
    private int idanexo;
    private int idtarefa;
    private int idusuario;
    private String nome;
    private String descricao;
    private String tipo;
    private Tarefa tarefaByIdtarefa;
    private Usuario usuarioByIdusuario;

    @Id
    @Column(name = "idanexo")
    public int getIdanexo() {
        return idanexo;
    }

    public void setIdanexo(int idanexo) {
        this.idanexo = idanexo;
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
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "tipo")
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
        Anexo anexo = (Anexo) o;
        return idanexo == anexo.idanexo &&
                idtarefa == anexo.idtarefa &&
                idusuario == anexo.idusuario &&
                Objects.equals(nome, anexo.nome) &&
                Objects.equals(descricao, anexo.descricao) &&
                Objects.equals(tipo, anexo.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idanexo, idtarefa, idusuario, nome, descricao, tipo);
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
