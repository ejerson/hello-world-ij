package bootcamp.edge.prework;

public class HelloWorld {

    public static void main(String[] args) {

//        if (args.length > 0) {
//            salute(args[0]);
//        } else {
//            salute("World");
//        }


//        salute((args.length > 0) ? args[0] : "World");

        salute(salutation(args));

    }

    private static String salutation(String[] args) {
        return "Hello, " + ((args.length > 0) ? args[0] : "World");
    }

    private static void salute(String salutation) {

        System.out.println(salutation);
//        System.out.print("Hello " + target + "!");
    }

}
