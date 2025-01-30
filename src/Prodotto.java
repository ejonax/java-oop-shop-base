public class Prodotto {
   public int codice;
   public String nome;
   public String descrizione;
   public float prezzo;
   public float iva;

    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        this.nome=nome;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.iva=iva;
    }

    public int setCodice(){
       return codice = (int)(Math.random() * 101);
    }

    public float getPrezzoBase(){
        return this.prezzo;
    }

    public String getProdottoName(){
        return this.nome;
    }

    public String getProdottoDescription(){
        return this.descrizione;
    }

    public float getIvaBase(){
      return this.iva;
    }

    public float prezzoComprensivo(float prezzoInput, float ivaInput){
       return prezzo=prezzoInput + (prezzoInput * (ivaInput/100));
    }

    public String nomeEsteso(){
      return nome=" "+ codice + "-" + nome;
    }
}
