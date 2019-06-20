package Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Historicogrupo {
    private int idhistgrupo;
    private int idgrupo;
    private int idusuario;
    private int idlider;
    private String nome;
    private String descricao;
    private Date dataDeInicio;
    private String situacao;
    private Date dataSituacao;
    private int quantidadeDeModificacao;
    private Grupo grupoByIdgrupo;
    private Usuario usuarioByIdusuario;
    private Lider liderByIdlider;

    @Id
    @Column(name = "idhistgrupo")
    public int getIdhistgrupo() {
        return idhistgrupo;
    }

    public void setIdhistgrupo(int idhistgrupo) {
        this.idhistgrupo = idhistgrupo;
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
    @Column(name = "idusuario")
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @Column(name = "idlider")
    public int getIdlider() {
        return idlider;
    }

    public void setIdlider(int idlider) {
        this.idlider = idlider;
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
    @Column(name = "situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Basic
    @Column(name = "data_situacao")
    public Date getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(Date dataSituacao) {
        this.dataSituacao = dataSituacao;
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
        Historicogrupo that = (Historicogrupo) o;
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

    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo", nullable = false,
            insertable = false, updatable = false)
    public Grupo getGrupoByIdgrupo() {
        return grupoByIdgrupo;
    }

    public void setGrupoByIdgrupo(Grupo grupoByIdgrupo) {
        this.grupoByIdgrupo = grupoByIdgrupo;
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
    @JoinColumn(name = "idlider", referencedColumnName = "idlider", nullable = false,
            insertable = false, updatable = false)
    public Lider getLiderByIdlider() {
        return liderByIdlider;
    }

    public void setLiderByIdlider(Lider liderByIdlider) {
        this.liderByIdlider = liderByIdlider;
    }
}
