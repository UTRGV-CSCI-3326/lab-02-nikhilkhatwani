public class MixMatch {
    public static void main(String[] args) {
        String varString = "Hello World!";
        char varChar = 'A';
        short varShort = 10;
        int varInt = 10000;
        long varLong = 100000000;
        float varFloat = 10.5f;
        double varDouble = 10.732;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores a collection of characters.");
        System.out.println(varChar + " <- char, stores a single character.");
        System.out.println(varShort + " <- short, stores any whole number from -32,768 to 32,767.");
        System.out.println(varInt + " <- int, stores any whole number from -2,147,483,648 to 2,147,483,647.");
        System.out.println(varLong + " <- long, stores any whole number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        System.out.println(varFloat + " <- float, stores any real number and can store between 6-7 decimal numbers.");
        System.out.println(varDouble + " <- double, stores any real number and can store between 15-16 decimal numbers.");
        System.out.println(varBoolean + " <- boolean, stores either a true or false value");

        System.out.println("\n" + varString + " This is Nikhil. I have $" + varShort + " and $" + varLong + " in debt!");
    }
}