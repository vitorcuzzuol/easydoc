package Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tarefa", schema = "easydoc", catalog = "")
public class TarefaEntity {
    private int idtarefa;
    private int idusuario;
    private int idgrupo;
    private String nome;
    private String descricao;
    private Timestamp prazo;
    private Timestamp dataDeInicio;
    private Timestamp ultimaModificacao;
    private int quantidadeDeModificacao;

    @Id
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
    @Column(name = "IDGRUPO")
    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
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
    @Column(name = "PRAZO")
    public Timestamp getPrazo() {
        return prazo;
    }

    public void setPrazo(Timestamp prazo) {
        this.prazo = prazo;
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

    @Basic
    @Column(name = "QUANTIDADE_DE_MODIFICACAO")
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
        TarefaEntity that = (TarefaEntity) o;
        return idtarefa == that.idtarefa &&
                idusuario == that.idusuario &&
                idgrupo == that.idgrupo &&
                quantidadeDeModificacao == that.quantidadeDeModificacao &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(prazo, that.prazo) &&
                Objects.equals(dataDeInicio, that.dataDeInicio) &&
                Objects.equals(ultimaModificacao, that.ultimaModificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtarefa, idusuario, idgrupo, nome, descricao, prazo, dataDeInicio, ultimaModificacao, quantidadeDeModificacao);
    }
}
