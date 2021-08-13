import java.util.Arrays;

public class TestArray {

    public static <T> void main(String[] args) {
        ArrayList<Integer> TestyTime = new ArrayList<>();




        System.out.println(TestyTime.size());
        TestyTime.addToBack(1);

        System.out.println(Arrays.toString(new ArrayList[]{TestyTime}));


    }
}
