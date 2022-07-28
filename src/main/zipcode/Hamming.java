package main.zipcode;

public class Hamming {

    String[] first;
    String[] second;

    public Hamming(String s, String s1) {
        first = s.split("");
        second = s1.split("");
        if (first.length != second.length) {
            throw new java.lang.IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {

        int count = 0;
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) count++;
        }
        return count;
    }
}