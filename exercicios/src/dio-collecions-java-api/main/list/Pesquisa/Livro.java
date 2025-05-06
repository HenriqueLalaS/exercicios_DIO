package main.list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "    Titulo: "+titulo+"    autor: "+autor+"    ano publicação: "+anoPublicacao+"\n";
    }
}
