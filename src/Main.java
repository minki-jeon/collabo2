import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new TreeSet<>();

        Random rand = new Random();

        while (lottoNumbers.size() < 6) {
            int num = rand.nextInt(45) + 1; // 1~45
            lottoNumbers.add(num);
        }

        System.out.println("이번 주 로또 번호: " + lottoNumbers);

        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
            }
        }
    }
}