package com.redesocial.gerenciador.GerenciadorPosts;

import com.redesocial.modelo.Comentario.Comentario;
import com.redesocial.modelo.Post.Post;

import java.util.List;

public class GerenciadorPosts {
    private List<Post> posts;
    private int proximoId = 1;

    public GerenciadorPosts() {
    }
    public void criarPost(Post post){
        post.setId(proximoId);
        posts.add(post);
        proximoId++;
    }
    public Post buscarPorId(int id){
        for(Post post : posts){
            if(post.getId() == id){
                return post;
            }
        }
        return null;
    }
    public List<Post> listarPorUsuario(int idUsuario){
        return null;
    }
    public void curtir(int idPost, int idUsuario){
        Post post = buscarPorId(idPost);
    }
    public void descurtir(int idPost, int idUsuario){
        Post post = buscarPorId(idPost);
    }
    public void comentar(Comentario comentario) {
        if (comentario != null) {
        }
    }
        public boolean deletar(int id){
        if(id >= 0 && id < posts.size()){
            posts.remove(id);
            return true;
        }else{
            return false;
        }
    }
    public void validarPost(Post post){
        if(post != null){
            if(post.getId() == null){
                post.setId(proximoId);
                posts.add(post);
                proximoId++;
            }
        }
    }
}
