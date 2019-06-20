package Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Grupo {
    private int idgrupo;
    private int idusuario;
    private int idlider;
    private String nome;
    private String descricao;
    private Date dataDeInicio;
    private Date ultimaModificacao;
    private int quantidadeDeModificacao;
    private Usuario usuarioByIdusuario;
    private Lider liderByIdlider;
    private Collection<Historicogrupo> historicogruposByIdgrupo;
    private Collection<Historicotarefa> historicotarefasByIdgrupo;

    @Id
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
        Grupo grupo = (Grupo) o;
        return idgrupo == grupo.idgrupo &&
                idusuario == grupo.idusuario &&
                idlider == grupo.idlider &&
                quantidadeDeModificacao == grupo.quantidadeDeModificacao &&
                Objects.equals(nome, grupo.nome) &&
                Objects.equals(descricao, grupo.descricao) &&
                Objects.equals(dataDeInicio, grupo.dataDeInicio) &&
                Objects.equals(ultimaModificacao, grupo.ultimaModificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idgrupo, idusuario, idlider, nome, descricao, dataDeInicio, ultimaModificacao, quantidadeDeModificacao);
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

    @OneToMany(mappedBy = "grupoByIdgrupo")
    public Collection<Historicogrupo> getHistoricogruposByIdgrupo() {
        return historicogruposByIdgrupo;
    }

    public void setHistoricogruposByIdgrupo(Collection<Historicogrupo> historicogruposByIdgrupo) {
        this.historicogruposByIdgrupo = historicogruposByIdgrupo;
    }

    @OneToMany(mappedBy = "grupoByIdgrupo")
    public Collection<Historicotarefa> getHistoricotarefasByIdgrupo() {
        return historicotarefasByIdgrupo;
    }

    public void setHistoricotarefasByIdgrupo(Collection<Historicotarefa> historicotarefasByIdgrupo) {
        this.historicotarefasByIdgrupo = historicotarefasByIdgrupo;
    }
}
