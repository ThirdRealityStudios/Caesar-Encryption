public class Main {
    public static void main(String[] args) {

        Main m = new Main();

        int input = 'A'; // = 65

        int key = '!'; // = 33

        // outcome should be 98 ( 'b' ) then.

        System.out.println((int) m.cryptCaesar((char) input,(char) key));
    }

    public char crypt(char input, char key) {

        return cryptCaesar(input, key);
    }

    public char decrypt(char input, char key) {

        return decryptCaesar(input, key);
    }

    public char cryptCaesar(char input, char key) {
        int match = input + key;

        // Prevent overflow issues
        char mod = (char) Math.floorMod(match, Character.MAX_VALUE);

        return mod;
    }

    public char decryptCaesar(char input, char key) {
        int match = input - key;

        boolean overflow = key > input;

        return overflow ? (char) (Character.MAX_VALUE + match) : (char) match;
    }
}
