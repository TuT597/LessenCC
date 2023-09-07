public class CesarEncryption {
    public static void main (String[] args) {
        String original = "TESTINGXYZ";
        
        char[] encrypted = original.toCharArray();
        for (int i = 0; i < encrypted.length; i++) {
            if (encrypted[i] == 'X') {
                encrypted[i] = 'A';
            } else if (encrypted[i] == 'Y') {
                encrypted[i] = 'B';
            } else if (encrypted[i] == 'Z') {
                encrypted[i] = 'C';
            } else {
                encrypted[i] += 3;
            }
        }
        
        System.out.println(encrypted);
    }
}
