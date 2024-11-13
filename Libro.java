public class Libro{
    //Definizione attributi
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    private Scaffale collocazione;
    //Definizione costruttore
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.npag = npag;
        this.editore = editore;
    }
    
    public void setCollocazione(Scaffale collocazione){
        this.collocazione=collocazione;
    }
    //Definizione metodi 
    //Definire metodo toString()
    public String toString(){
        return String.format("titolo:%s\n autore:%s\n prezzo:%.2f\n npag:%d\n editore:%s\n collocazione: %s",titolo,autore,prezzo,npag,editore,collocazione.getId());
    }
}