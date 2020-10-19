package BT1;

/**
 * 1. Viết chương trình, cho phép tính tổng các số nguyên trong dãy số sau(tùy ý),
 * mà các số này có tổng 2 số liền kề là số chẵn.
 * ví dụ:
 * Trong chuỗi s = "11,23,31,70,13,15,99"
 * tổng = 11 + 31 + 13 + 15 + 99 không tồn tại 23 và 70 trong chuỗi bởi vì tổng của 2 chữ số 2+3 = 5 là số lẽ.
 */
public class BT1 {
    public static void main(String[] args) {
        // split chuỗi s thành 1 mảng x
        // ParseInt mảng đó thành 1 mảng int x
        // Kiểm tra số nào là số lẻx
        // Tính tổng
        String s = "11,23,31,70,13,15,99";
        String[] strArray = s.split(",\\s*");
        int[] intArray = parseInt(strArray);
        System.out.println(sum(intArray));

    }

    private static int[] parseInt(String[] strArr) {
        int[] intArray = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArray[i] = Integer.parseInt(strArr[i]);
        }
        return intArray;
    }

    private static boolean isOdd(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 1;
    }

    private static int sum(int[] intArr) {
        int sumArr = 0;
        for (int number: intArr) {
            if (!isOdd(number)) sumArr += number;
        }
        return sumArr;
    }
}
