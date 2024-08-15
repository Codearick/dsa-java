public class ArrayAsArgs {
    public static void update(int [] marks, int a){
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
        a = a + 2;
    }
    public static void main(String[] args) {
        int variable = 8;
        int [] marks = {99, 83, 99}; // In java arrays are passed by call by reference.
        update(marks, variable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(variable);
    }
}
