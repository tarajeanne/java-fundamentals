package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        if (a || b) {
            System.out.println("a or b is true AGAIN, but this time we only checked one");
        }
        if (b & a) {
            System.out.println("This won't print, RIP. But we evaluated both just to be sure.");
        }
        if(b && a) {
            System.out.println("This won't print either, but at least we didn't check both");
        }
        if (a ^ b) {
            System.out.println("An exclusive or. How conservative");
        }
        if (!b) {
            System.out.println("This one isn't very nice to b.");
        }

        // write your code below

    }

}

