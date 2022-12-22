package module7;

import java.util.Arrays;

public class CustomStringBuilder {
    private int CAPACITY = 16;
    private byte [] bytes = new byte[CAPACITY];
    private int currentLength = 0;

    public void append(int item) {
        append(Integer.toString(item));
    }
    public void append(String str){
        byte[] newBytes = str.getBytes();
        int minRequiredLength = currentLength + newBytes.length;
        if(minRequiredLength > CAPACITY) {
            int newCapacity = Math.max(CAPACITY * 2, minRequiredLength);
            CAPACITY = newCapacity;
            bytes = Arrays.copyOf(bytes, newCapacity);
        }
        System.arraycopy(newBytes, 0, bytes, currentLength, newBytes.length);
        currentLength += newBytes.length;
    }

    @Override
    public String toString() {
        return new String(bytes, 0, currentLength);
    }

    public static void main(String[] args) {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();
        customStringBuilder.append("1");
        customStringBuilder.append("2");
        customStringBuilder.append("3");
        String res = customStringBuilder.toString();
        System.out.println("res = " + res);
    }
}
