package com.redesocial.modelo;

import com.redesocial.modelo.Post.Post;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

// Criação da classe usuário e instanciação dos atributos.
public class Usuario {
    private Integer id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private List<Usuario> amigos;
    private List<Post> posts;
//Construtor completo sem(id)
    public Usuario(String nome, String username, String email, String senha, LocalDateTime dataCadastro, List<Usuario> amigos, List<Post> posts) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

    public Usuario(int proximoId, String nome, String username, String email, String senha) {
    }

    //Métodos Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    //toString() para exibição formatada

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", amigos=" + amigos +
                ", posts=" + posts +
                '}';
    }
    //equals() e hashCode() baseados no id

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //@param adicionarAmigo adiciona um amigo(a)
    public void adicionarAmigo(Usuario amigo){
        this.amigos.add(amigo);
    }
    public void removerAmigo(Usuario amigo){
        this.amigos.remove(amigo);
    }
    public void adicionarPost(Post post){
        posts.add(post);
    }
}
