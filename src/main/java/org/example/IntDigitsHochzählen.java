package org.example;

public class IntDigitsHochzählen {
    public static void main(String[] args) {
        System.out.println("Ergebnis: " + digitsHochzählenZeugs(1));
        System.out.println("Ergebnis: " + digitsHochzählenZeugs(0));
        System.out.println("Ergebnis: " + digitsHochzählenZeugs(12345));
        System.out.println("Ergebnis: " + digitsHochzählenZeugs(999));
    }

    public static int digitsHochzählenZeugs(int n){
        System.out.println(n);
        String s = String.valueOf(n);
        char[] array = s.toCharArray();

        String result = "";

        for(int i = 0; i < array.length; i++){

            int c = array[i] - '0';
            int d = Character.getNumericValue(array[i]);
            int e = Integer.parseInt(String.valueOf(array[i]));
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("e: " + e);

            c++;
            d++;
            e++;

            result += c;
        }

        return Integer.parseInt(result);
    }

}
