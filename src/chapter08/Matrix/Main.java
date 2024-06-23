/**
* Simple progema to simulate a math matrix
* Author: Philippe Matias
*/


public class Main
{
    public static void main(String[] args)
    {
        var mx = new Matrix(3, 3);
        mx.setRow(1, 1, 2, 3);
        mx.setRow(2, 4, 5, 6);
        mx.setRow(3, 7, 8, 9);
        System.out.println(mx);

        var m1 = new Matrix(3, 3);
        m1.setRow(1, 1, 1, 1);
        m1.setRow(2, 1, 1, 1);
        m1.setRow(3, 1, 1, 1);

        mx.sum(m1);
        System.out.println(mx);
    }
}
