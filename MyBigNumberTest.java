
/**
 *
 * @author Hy's PC
 */
public class MyBigNumberTest implements IReceiver {

    /**
     * Hàm main dùng để chạy các testcase Trong đó hàm main gọi lại các hàm chứa
     * test case để kiểm tra tính đúng đắng của chương trình
     */
    public static void main(String[] args) {

        // gọi các hàm chứatestcase
        TestCase1();
        TestCase2();
        TestCase3();
        TestCase4();
        TestCase5();
		TestCase6();
        
    }

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }

    // các hàm chứa tescase
    public static void TestCase1() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 1:\n");
        mybignumber.sum("99", "99");
    }

    public static void TestCase2() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 2:\n");
        mybignumber.sum("9", "99");
    }
	
	public static void TestCase3() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 2:\n");
        mybignumber.sum("98", "99");
    }

    public static void TestCase4() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 3:\n");
        mybignumber.sum("99", "9999");
    }

    public static void TestCase5() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 4:\n");
        mybignumber.sum("AA", "9999");
    }

    public static void TestCase6() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        System.out.println("Case 5:\n");
        mybignumber.sum("99", "9*");
}
}