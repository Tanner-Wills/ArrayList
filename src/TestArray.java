import java.util.Arrays;
public class TestArray {

    public static <T> void main(String[] args) {
        ArrayList<Integer> TestyTime = new ArrayList<>();

        System.out.println("Size =" + TestyTime.size());

        TestyTime.addToFront(1);
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        TestyTime.addToBack(2);
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        TestyTime.addToBack(3);
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        TestyTime.removeFromFront();
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        TestyTime.removeFromFront();
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        TestyTime.removeFromBack();
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));
        System.out.println("Size =" + TestyTime.size());

        // TestyTime.removeFromBack();




    }
}
