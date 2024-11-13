class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale s1=new Scaffale("230");
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro l1=new Libro("Divina Commedia","D.Alighieri",22.50f,600,"Mondadori");
        Libro l2=new Libro("Diario di una schiappa","Jeff Kinney",18.50f,100,"Mondadori");
        Libro l3=new Libro("Manuale di Brawl Stars","Supercell",18.50f,600,"Mondadori");
        Libro l4=new Libro("Diario di Antonio","Jeff Kinney",10f,100,"Mondadori");
        Libro l5=new Libro("Le avventure di Francioso","C.Francioso",15.50f,500,"Mondadori");
        s1.aggiungi(l1);
        s1.aggiungi(l2);
        s1.aggiungi(l3);
        s1.aggiungi(l4);
        s1.aggiungi(l5);
        //Visualizzare il contenuto dello scaffale
        System.out.println (s1.elencaLibri());
    }
}