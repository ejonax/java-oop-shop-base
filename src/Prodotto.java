public class Prodotto {
   public int codice;
   public String nome;
   public String descrizione;
   public int prezzo;
   public int iva;

    public Prodotto() {
     codice = (int)(Math.random() * 101);
    }

    public void prezzoBase(int prezzoInput){
       prezzo = prezzoInput;
   }
  
   public void nome(String nome){
    this.nome=nome;
}

   public int prezzoCompresivo(int prezzoInput, int ivaInput){
     return prezzo=prezzoInput + ivaInput;
   }

   public String nomeEsteso(){
    return nome=" "+ codice + "-" + nome;
   }
}
