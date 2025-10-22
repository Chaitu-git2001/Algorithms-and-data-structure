public class CopyArrayIterativeRecursive {

    // Iterative method
    static int[] copyArrayIterative(int[] source) {
        int[] dest = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        return dest;
    }

    // Recursive method
    static void copyArrayRecursive(int[] source, int[] dest, int index) {
        if (index == source.length) {
            return; // base case: all elements copied
        }
        dest[index] = source[index];
        copyArrayRecursive(source, dest, index + 1); // recursive call
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};

        // Iterative copy
        int[] destIter = copyArrayIterative(source);
        System.out.print("Iterative Copy: [");
        for (int i = 0; i < destIter.length; i++) {
            System.out.print(destIter[i]);
            if (i < destIter.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Recursive copy
        int[] destRec = new int[source.length];
        copyArrayRecursive(source, destRec, 0);
        System.out.print("Recursive Copy: [");
        for (int i = 0; i < destRec.length; i++) {
            System.out.print(destRec[i]);
            if (i < destRec.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
