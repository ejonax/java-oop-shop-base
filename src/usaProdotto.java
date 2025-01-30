public class usaProdotto {
     public static void main(String[] args) {

         Prodotto shampoo=new Prodotto();
         System.out.println("Il codice random dato al prodotto è "+ shampoo.codice);

         shampoo.prezzo=5;
         System.out.println("Il prezzo base dato è "+shampoo.prezzo);

         shampoo.nome="shampoo";
         System.out.println("Il nome dato è "+shampoo.nome);

         shampoo.iva=3;
         System.out.println("L'iva data è "+shampoo.iva);

         //shampoo.prezzoCompresivo(shampoo.prezzo, shampoo.iva);
         System.out.println("Il prezzo compresivo è " + (shampoo.prezzoCompresivo(shampoo.prezzo,shampoo.iva)));

         System.out.println("Il nome esteso è " + (shampoo.nomeEsteso()));

     }
}
