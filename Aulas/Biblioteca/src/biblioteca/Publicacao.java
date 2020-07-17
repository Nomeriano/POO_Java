package biblioteca;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folear(int i);
    public abstract void avancarPagina();
    public abstract void voltarPagina(); 
}
