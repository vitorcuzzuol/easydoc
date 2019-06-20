package Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tarefa {
    private int idtarefa;
    private int idusuario;
    private int idgrupo;
    private String nome;
    private String descricao;
    private Date prazo;
    private Date dataDeInicio;
    private Date ultimaModificacao;
    private int quantidadeDeModificacao;
    private Collection<Anexo> anexosByIdtarefa;
    private Collection<Comentario> comentariosByIdtarefa;
    private Collection<Historicotarefa> historicotarefasByIdtarefa;
    private Tarefa tarefaByIdusuario;
    private Collection<Tarefa> tarefasByIdtarefa;

    @Id
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
    @Column(name = "prazo")
    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
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
        Tarefa tarefa = (Tarefa) o;
        return idtarefa == tarefa.idtarefa &&
                idusuario == tarefa.idusuario &&
                idgrupo == tarefa.idgrupo &&
                quantidadeDeModificacao == tarefa.quantidadeDeModificacao &&
                Objects.equals(nome, tarefa.nome) &&
                Objects.equals(descricao, tarefa.descricao) &&
                Objects.equals(prazo, tarefa.prazo) &&
                Objects.equals(dataDeInicio, tarefa.dataDeInicio) &&
                Objects.equals(ultimaModificacao, tarefa.ultimaModificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtarefa, idusuario, idgrupo, nome, descricao, prazo, dataDeInicio, ultimaModificacao, quantidadeDeModificacao);
    }

    @OneToMany(mappedBy = "tarefaByIdtarefa")
    public Collection<Anexo> getAnexosByIdtarefa() {
        return anexosByIdtarefa;
    }

    public void setAnexosByIdtarefa(Collection<Anexo> anexosByIdtarefa) {
        this.anexosByIdtarefa = anexosByIdtarefa;
    }

    @OneToMany(mappedBy = "tarefaByIdtarefa")
    public Collection<Comentario> getComentariosByIdtarefa() {
        return comentariosByIdtarefa;
    }

    public void setComentariosByIdtarefa(Collection<Comentario> comentariosByIdtarefa) {
        this.comentariosByIdtarefa = comentariosByIdtarefa;
    }

    @OneToMany(mappedBy = "tarefaByIdtarefa")
    public Collection<Historicotarefa> getHistoricotarefasByIdtarefa() {
        return historicotarefasByIdtarefa;
    }

    public void setHistoricotarefasByIdtarefa(Collection<Historicotarefa> historicotarefasByIdtarefa) {
        this.historicotarefasByIdtarefa = historicotarefasByIdtarefa;
    }

    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idtarefa", nullable = false,
            insertable = false, updatable = false)
    public Tarefa getTarefaByIdusuario() {
        return tarefaByIdusuario;
    }

    public void setTarefaByIdusuario(Tarefa tarefaByIdusuario) {
        this.tarefaByIdusuario = tarefaByIdusuario;
    }

    @OneToMany(mappedBy = "tarefaByIdusuario")
    public Collection<Tarefa> getTarefasByIdtarefa() {
        return tarefasByIdtarefa;
    }

    public void setTarefasByIdtarefa(Collection<Tarefa> tarefasByIdtarefa) {
        this.tarefasByIdtarefa = tarefasByIdtarefa;
    }
}
