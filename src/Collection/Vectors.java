package Collection;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // Create a new vector
        Vector<Integer> v = new Vector<>(3, 2);

        // Add elements to the vector
        v.addElement(1);
        v.add(1);
        // Insert an element at index 1
        v.insertElementAt(0, 1);

        // Remove the element at index 2
        v.removeElementAt(2);

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }
        v.add(34);
        v.add(34);
        v.add(4);
        System.out.println(v.size());
    }
}
