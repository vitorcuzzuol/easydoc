package Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Usuario {
    private int idusuario;
    private String nome;
    private String email;
    private String senha;
    private Collection<Anexo> anexosByIdusuario;
    private Collection<Comentario> comentariosByIdusuario;
    private Collection<Grupo> gruposByIdusuario;
    private Collection<Historicogrupo> historicogruposByIdusuario;
    private Collection<Historicotarefa> historicotarefasByIdusuario;
    private Collection<Lider> lidersByIdusuario;

    @Id
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idusuario == usuario.idusuario &&
                Objects.equals(nome, usuario.nome) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario, nome, email, senha);
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Anexo> getAnexosByIdusuario() {
        return anexosByIdusuario;
    }

    public void setAnexosByIdusuario(Collection<Anexo> anexosByIdusuario) {
        this.anexosByIdusuario = anexosByIdusuario;
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Comentario> getComentariosByIdusuario() {
        return comentariosByIdusuario;
    }

    public void setComentariosByIdusuario(Collection<Comentario> comentariosByIdusuario) {
        this.comentariosByIdusuario = comentariosByIdusuario;
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Grupo> getGruposByIdusuario() {
        return gruposByIdusuario;
    }

    public void setGruposByIdusuario(Collection<Grupo> gruposByIdusuario) {
        this.gruposByIdusuario = gruposByIdusuario;
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Historicogrupo> getHistoricogruposByIdusuario() {
        return historicogruposByIdusuario;
    }

    public void setHistoricogruposByIdusuario(Collection<Historicogrupo> historicogruposByIdusuario) {
        this.historicogruposByIdusuario = historicogruposByIdusuario;
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Historicotarefa> getHistoricotarefasByIdusuario() {
        return historicotarefasByIdusuario;
    }

    public void setHistoricotarefasByIdusuario(Collection<Historicotarefa> historicotarefasByIdusuario) {
        this.historicotarefasByIdusuario = historicotarefasByIdusuario;
    }

    @OneToMany(mappedBy = "usuarioByIdusuario")
    public Collection<Lider> getLidersByIdusuario() {
        return lidersByIdusuario;
    }

    public void setLidersByIdusuario(Collection<Lider> lidersByIdusuario) {
        this.lidersByIdusuario = lidersByIdusuario;
    }
}
