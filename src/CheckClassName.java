public class CheckClassName {
    private static ClassExample classExample;
    public static final String[] CLASS_NAMES = {"C0225G", "P2552K", "A2148H", "C1240I", "P2334K"};
    public static final String[] INVALID_CLASS_NAMES = {"CAP1234", "CAP55h", "C1256225E", "P123H", "CAP12345678"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        System.out.println("--- Testing Class Name ---");
        for (String className : CLASS_NAMES) {
          boolean isValid = classExample.validate(className);
            System.out.println("Class Name: " + className + " is valid: " + isValid);
        }
        System.out.println("--- Testing Invalid Class Name ---");

        for (String className : INVALID_CLASS_NAMES) {
            boolean isValid = classExample.validate(className);
            System.out.println("Class Name: " + className + " is valid: " + isValid);
        }
    }
}
