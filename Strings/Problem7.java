public class Problem7 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); 
        System.out.println(str1.equalsIgnoreCase(str2)); 
        System.out.println(str1.startsWith("he")); 
        System.out.println(str1.endsWith("lo")); 
        System.out.println(str1.compareTo(str2));
    }
    
}
