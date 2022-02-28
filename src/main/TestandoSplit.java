package main;

public class TestandoSplit {

    public static void main(String[] args) {
        String frase = "God of war";

        String[] array = frase.split(" ");
        String novaFrase = "";
        for (int i = 0; i < array.length; i++) {
            novaFrase += array[i];
        }

        System.out.println(novaFrase);
    }
}
