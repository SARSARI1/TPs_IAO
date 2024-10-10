package Exercice3_Corr;


public class Main {



        public static void main(String[] args) {
            YoungTableauManager manager = new YoungTableauManager(3, 3);

            // Insert elements
            manager.insert(1);
            manager.insert(2);
            manager.insert(3);
            manager.insert(4);
            manager.insert(5);
            manager.insert(6);

            System.out.println("Table after insertion:");
            manager.printTable();

            // Extract minimum element
            int min = manager.extractMin();
            System.out.println("Extracted Min: " + min);

            System.out.println("Table after extracting the min:");
            manager.printTable();
        }


}
