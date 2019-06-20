package Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Historicotarefa {
    private int idhisttarefa;
    private int idtarefa;
    private int idusuario;
    private int idgrupo;
    private String nome;
    private String descricao;
    private Date dataDeInicio;
    private int usuarioModificacao;
    private Date ultimaModificacao;
    private int quantidadeDeModificacao;
    private Tarefa tarefaByIdtarefa;
    private Usuario usuarioByIdusuario;
    private Grupo grupoByIdgrupo;

    @Id
    @Column(name = "idhisttarefa")
    public int getIdhisttarefa() {
        return idhisttarefa;
    }

    public void setIdhisttarefa(int idhisttarefa) {
        this.idhisttarefa = idhisttarefa;
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
    @Column(name = "idgrupo")
    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
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
    @Column(name = "data_de_inicio")
    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Basic
    @Column(name = "usuario_modificacao")
    public int getUsuarioModificacao() {
        return usuarioModificacao;
    }

    public void setUsuarioModificacao(int usuarioModificacao) {
        this.usuarioModificacao = usuarioModificacao;
    }

    @Basic
    @Column(name = "ultima_modificacao")
    public Date getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(Date ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    @Basic
    @Column(name = "quantidade_de_modificacao")
    public int getQuantidadeDeModificacao() {
        return quantidadeDeModificacao;
    }

    public void setQuantidadeDeModificacao(int quantidadeDeModificacao) {
        this.quantidadeDeModificacao = quantidadeDeModificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historicotarefa that = (Historicotarefa) o;
        return idhisttarefa == that.idhisttarefa &&
                idtarefa == that.idtarefa &&
                idusuario == that.idusuario &&
                idgrupo == that.idgrupo &&
                usuarioModificacao == that.usuarioModificacao &&
                quantidadeDeModificacao == that.quantidadeDeModificacao &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(dataDeInicio, that.dataDeInicio) &&
                Objects.equals(ultimaModificacao, that.ultimaModificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idhisttarefa, idtarefa, idusuario, idgrupo, nome, descricao, dataDeInicio, usuarioModificacao, ultimaModificacao, quantidadeDeModificacao);
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

    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo", nullable = false,
            insertable = false, updatable = false)
    public Grupo getGrupoByIdgrupo() {
        return grupoByIdgrupo;
    }

    public void setGrupoByIdgrupo(Grupo grupoByIdgrupo) {
        this.grupoByIdgrupo = grupoByIdgrupo;
    }
}
