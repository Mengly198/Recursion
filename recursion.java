public class recursion {
  public static void main(String[] args) {

    System.out.println(reverseString("Hello"));    
    System.out.println(reverseString1("Hello"));



  }

  public static String reverseString1(String str) {
    StringBuilder reversed = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
        reversed.append(str.charAt(i));
    }
    return reversed.toString();
  }
  public static String reverseString(String str) {
    if (str.isEmpty()) {
        return str;
    }
    return reverseString(str.substring(1)) + str.charAt(0);
}

}
