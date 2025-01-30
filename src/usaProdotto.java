public class usaProdotto {
     public static void main(String[] args) {

        /******* start prodotto shampoo *******/
        Prodotto prod1=new Prodotto("shampoo", "cappelli secchi", 5 ,22);

        prod1.codice=prod1.setCodice();
        System.out.println("Il codice random dato al prodotto " +prod1.getProdottoName() + " è "+ prod1.codice);


        System.out.println("Il prezzo base del prodotto è " + prod1.getPrezzoBase());
        System.out.println("L'iva base del prodotto è " + prod1.getIvaBase());

        System.out.println("Il prezzo comprensivo del prodotto è " + (prod1.prezzoComprensivo(prod1.prezzo,prod1.iva)));

        System.out.println("Il nome esteso del prodotto è " + (prod1.nomeEsteso()) + " e ha come descrizione '" + prod1.getProdottoDescription() + "'");
        /******* end prodotto shampoo *******/

        /******* start prodotto libro *******/
        Prodotto prod2=new Prodotto("libro","scenza",25,22 );

        prod2.codice=prod2.setCodice();
        System.out.println("Il codice random dato al prodotto " +prod2.getProdottoName() + " è "+ prod2.codice);
 
 
        System.out.println("Il prezzo base del prodotto è " + prod2.getPrezzoBase());
        System.out.println("L'iva base del prodotto è " + prod2.getIvaBase());
 
        System.out.println("Il prezzo comprensivo del prodotto è " + (prod2.prezzoComprensivo(prod2.prezzo,prod2.iva)));
 
        System.out.println("Il nome esteso del prodotto è " + (prod2.nomeEsteso()) + " e ha come descrizione '" + prod2.getProdottoDescription() + "'");
        /******* end prodotto libro *******/
     }
}
