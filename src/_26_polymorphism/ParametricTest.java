package _26_polymorphism;

public class ParametricTest {

    public static void main(String[] args) {

        ParametricDemo parametricDemo = new ParametricDemo();
        parametricDemo.add("Robot Ron");
        parametricDemo.add(1500);
        parametricDemo.add(100.011);
        parametricDemo.add(10.56f);

        System.out.println(parametricDemo.get(0));
        System.out.println(parametricDemo.get(1));
        System.out.println(parametricDemo.get(2));
        System.out.println(parametricDemo.get(3));

        /*
         * Output:
         * mobilhanem
         * 1500
         * 100.011
         * 10.56
         */







    }
}
