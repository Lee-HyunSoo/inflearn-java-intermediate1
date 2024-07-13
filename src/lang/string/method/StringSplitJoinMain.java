package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
//        for (String s : splitStr) {
//            joinStr += s + "-";
//        }
//        System.out.println("joinStr = " + joinStr); // Apple-Banana-Orange-

        for (int i = 0; i < splitStr.length; i++) {
            joinStr += splitStr[i];
            if (i == splitStr.length - 1) {
                break;
            }
            joinStr += "-";
        }
        System.out.println("joinStr = " + joinStr); // Apple-Banana-Orange

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결 된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}