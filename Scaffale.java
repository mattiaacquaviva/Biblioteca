class Scaffale{
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;
    
    Scaffale(String id){
        this.id = id;
        libri = new Libro[N];
        nLibri = 0;
    }
    
    public boolean aggiungi(Libro l){
        if (nLibri<N){
            libri[nLibri] = l;
            l.setCollocazione(this);
            nLibri++;
            return true;
        }
        return false;
    }
    
    public String getId(){
        return id;
    }
    
    public String elencaLibri(){
        System.out.println("Scaffale: " + id);
        String gino=new String();
        for(int i=0;i<10 && libri[i] != null;i++){
            gino+=libri[i].toString()+"\n";
        }
        return gino;
    }
}