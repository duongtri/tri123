 
/**
* Tác giả: Dương Minh Trí.
* Description.
* Class MyBigNumber trong đó có hàm cộng hai chuỗi.
* Hàm sum trong class trên thực hiện cộng hai chuỗi.
*/

public class MyBigNumber {
    
    /**
     * Hai chuỗi để cộng chỉ chứa các ký tự từ 0 đến 9.
     * <br/>
     * @param s1 là số có dạng chuỗi.
     * @param s2 là số có dạng chuỗi.
     * @return chuỗi mà dạng số của nó bằng s1 + s2.
    */
    public String sum(final String s1,final String s2) {
        // Kiểm tra xem chuỗi đã cho có rỗng hay không, nếu có mặc định nó là 0
        if (s2 == null || s2 == "") {
            s2 = "0";
        }
        if (s1 == null || s1 == "") {
            s1 = "0";
        }       
        String answer = ""; // answer là chuỗi kết quả, ban đầu là rỗng 
        int l1 = s1.length();// số chữ số trong chuỗi thứ 1
        int l2 = s2.length();// số chữ số trong chuỗi thứ 2
        int max = (l1 > l2) ? l1 : l2;// max độ dài lớn nhất trong hai chuỗi
        int carry = 0;// carry là biến nhớ trong trường hợp cộng vào lớn hơn 9
        int v1 = 0;// v1 là vị trí trong chuỗi s1
        int v2 = 0;// v2 là vị trí trong chuỗi s2
        char c1;// c1 là ký tự cuối cùng trong s1
        char c2;// c2 là ký tự cuối cùng trong s2
        int temp = 0;// temp là biến dùng tạm để cộng hai giá trị cuối cùng trong hai chuỗi cho nhau
        for (int i = 0; i < max; i++) //duyệt từ đầu đến độ dài lớn hơn trong hai chuỗi.
        {
            v1 = l1 - i - 1;// cập nhật lại vị trí s1
            v2 = l2 - i - 1;// cập nhật lại vị trí s2

            // kiểm tra vị trí của 2 chuỗi xem có bị âm hay không
            c1 = (v1 > -1) ? s1.charAt(v1) : '0';
            c2 = (v2 >= 0) ? s2.charAt(v2) : '0';

            // chuyển ký tự thành số xong cộng hai số đó lại cộng thêm nhớ, '0' trong mã ASCII là 48
            temp = (c1 - '0') + (c2 - '0') + carry;

            // ghép phần dư của phép cộng vào đầu biến answer, 
            // vì nếu cộng vào mà lớn hơn 10 thì phải lấy số hàng đơn vị 
            answer = (temp % 10) + answer;
            carry = temp / 10;// nếu như tổng lớn hơn 10 tức là biến carry sẽ bằng 1
        }

        // trong trường hợp đã duyệt hết chuỗi nhưng carry vẫn bằng 1 thì ghép 1 vào đầu chuỗi kết quả 
        if (carry > 0) 
        {
            answer = 1 + answer;
        }

        return answer;// trả về kết quả cuối cùng 
    }
}