package org.example;

import java.util.Objects;

public class Współrzedne {
   private int x;
   private int y;

    public Współrzedne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Współrzedne that = (Współrzedne) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
//        return "(" + x +','+ y + ')';
        return  String.format("(%d, %d)",x, y);

    }

    public static void main(String[] args) {
        Współrzedne w1 = new Współrzedne(16,54);
        Współrzedne w2 = new Współrzedne(16,54);
        System.out.println(w1.equals(w2));
        System.out.println(w1.equals(w1));
        System.out.println(w1 == w2);
        System.out.println(w1);
        System.out.println(w1.toString());
    }
}
