import java.util.Arrays;
public class TestArray {

    public static <T> void main(String[] args) {
        ArrayList<Integer> TestyTime = new ArrayList<>();

        TestyTime.addToBack(1);
        TestyTime.addToBack(2);
        TestyTime.addToBack(3);
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));

        TestyTime.addToBack(4);
        TestyTime.addToBack(5);
        TestyTime.addToBack(6);
        TestyTime.addToBack(7);
        TestyTime.addToBack(8);

        System.out.println("Size =" + TestyTime.size());
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));

        TestyTime.addToBack(9);
        TestyTime.addToBack(10);
        TestyTime.addToBack(11);
        TestyTime.addToBack(12);
        TestyTime.addToFront(13);

        for(int i=0; i<TestyTime.size(); i++){
            System.out.print(TestyTime.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Size =" + TestyTime.size());

        TestyTime.removeFromFront();
        System.out.println("zero index = " + TestyTime.get(0));

        for(int i=0; i<TestyTime.size(); i++){
            System.out.print(TestyTime.get(i) + ", ");
        }
        System.out.println();
        System.out.println("length =" + Arrays.toString(TestyTime.getBackingArray()));

        System.out.println("Size =" + TestyTime.size());
        // TestyTime.removeFromBack();




    }
}
