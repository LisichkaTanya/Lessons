package Tasks;

public class TestAll {

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
}

class AsciiCharSequence implements CharSequence {
    private final byte[] byteSequence;

    public AsciiCharSequence(byte[] bytesSequence) {
        this.byteSequence = bytesSequence;
    }

    @Override
    public int length() {
        return byteSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(byteSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(byteSequence);
    }
}