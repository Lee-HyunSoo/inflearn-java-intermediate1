package lang.clazz.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lotto = generator.generate();

        System.out.print("로또 번호 출력: ");
        for (int l : lotto) {
            System.out.print(l + " ");
        }
    }
}
