public class SplitEx {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\s");
//        String[] s= p.split("yash tailor suryakant");
//        for (String s1:
//             s) {
//            System.out.println(s1);
//        }

//        Pattern p = Pattern.compile("a");
//        String[] s= p.split("yash tailor suryakant");
//        for (String s1:
//                s) {
//            System.out.println(s1);
//        }

//        Pattern p = Pattern.compile("\\.");
//        Pattern p = Pattern.compile("[.]");
//        String[] s= p.split("www.google.com");
//        for (String s1:
//                s) {
//            System.out.println(s1);
//        }

        String s = "Yash Tailor";
        String[] arr = s.split("\\s");
        for (String s1 : arr) {
            System.out.println(s1);
        }
    }
}
