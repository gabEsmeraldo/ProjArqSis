public class Logger {
    private static Logger instancia = null;
  /* por default não imprime o log */
    private boolean ativo = false;

    public Logger() {}

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public static synchronized Logger obterInstancia(){
        if(instancia == null){
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String s) {
        if (this.ativo) System.out.println("LOG :: " + s);
    }
}
