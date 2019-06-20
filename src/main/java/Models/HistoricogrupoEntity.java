package Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "historicogrupo", schema = "easydoc", catalog = "")
public class HistoricogrupoEntity {
    private int idhistgrupo;
    private int idgrupo;
    private int idusuario;
    private int idlider;
    private String nome;
    private String descricao;
    private Timestamp dataDeInicio;
    private String situacao;
    private Timestamp dataSituacao;
    private int quantidadeDeModificacao;

    @Id
    @Column(name = "IDHISTGRUPO")
    public int getIdhistgrupo() {
        return idhistgrupo;
    }

    public void setIdhistgrupo(int idhistgrupo) {
        this.idhistgrupo = idhistgrupo;
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
    @Column(name = "IDUSUARIO")
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @Column(name = "IDLIDER")
    public int getIdlider() {
        return idlider;
    }

    public void setIdlider(int idlider) {
        this.idlider = idlider;
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
    @Column(name = "DATA_DE_INICIO")
    public Timestamp getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Timestamp dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Basic
    @Column(name = "SITUACAO")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Basic
    @Column(name = "DATA_SITUACAO")
    public Timestamp getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(Timestamp dataSituacao) {
        this.dataSituacao = dataSituacao;
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
        HistoricogrupoEntity that = (HistoricogrupoEntity) o;
        return idhistgrupo == that.idhistgrupo &&
                idgrupo == that.idgrupo &&
                idusuario == that.idusuario &&
                idlider == that.idlider &&
                quantidadeDeModificacao == that.quantidadeDeModificacao &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(dataDeInicio, that.dataDeInicio) &&
                Objects.equals(situacao, that.situacao) &&
                Objects.equals(dataSituacao, that.dataSituacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idhistgrupo, idgrupo, idusuario, idlider, nome, descricao, dataDeInicio, situacao, dataSituacao, quantidadeDeModificacao);
    }
}
