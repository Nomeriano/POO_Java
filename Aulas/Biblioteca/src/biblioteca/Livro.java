package biblioteca;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totalPag, pagAtual;
    private boolean aberto;
    private Pessoa pessoa;

    public Livro(String titulo, String autor, int totalPag, Pessoa pessoa) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pessoa = pessoa;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro está aberto! \n");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folear(int i) {
        if(this.isAberto() == true){
            this.setPagAtual(i);
        }else{
            System.out.println("O livro está fechdo! ");
        }
    }

    @Override
    public void avancarPagina() {
        if(this.isAberto() == true){
            this.setPagAtual(this.getPagAtual() + 1 );
        }else{
            System.out.println("O livro está fechdo! ");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.isAberto() == true){
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            System.out.println("O livro está fechdo! ");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String detalhes() {
        return "Livro: " + "\nTitulo = " + titulo + "\nAutor = " + autor + "\nTotal Páginas = " + totalPag + 
                "\nPágina Atual = " + pagAtual + "\nAberto = " + aberto + "\nPessoa=" + pessoa.getNome() + '}';
    }
    
    
}
