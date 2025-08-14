package in.kgcoding.Test;

import in.kgcoding.Oops.Test;

public class Tests implements Squre{
    public static void main(String[] args) {
        Tests t1 = new Tests();
        t1.FindSquare(2);
        System.out.println(t1);
    }


    @Override
    public String toString() {
        return "Tests{" + "sq=" + sq + '}';
    }

    int sq;
    @Override
    public void FindSquare(int a) {
        sq=a*a;
    }

}
