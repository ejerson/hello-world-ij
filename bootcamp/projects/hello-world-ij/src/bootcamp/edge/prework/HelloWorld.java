package bootcamp.edge.prework;

public class HelloWorld {

    public static void main(String[] args) {

//        if (args.length > 0) {
//            salute(args[0]);
//        } else {
//            salute("World");
//        }

        salute((args.length > 0) ? args[0] : "World");


    }

    private static void salute(String target) {
        System.out.print("Hello " + target + "!");
    }

}
