package br.com.dio.desafio.dominio;

public class Aula {
    
    private String titulo;
    private String descricao;
    private String nomeInstrutor;
    private int duracao;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNomeInstrutor() {
        return nomeInstrutor;
    }
    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    } 
   
}
