public class Problem10 {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";
        String[] languages = str.split(",");
        for (String language : languages) {
            System.out.println(language);
        }
    }
    
}
