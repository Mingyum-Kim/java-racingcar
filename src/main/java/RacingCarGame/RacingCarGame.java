package RacingCarGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
                final Scanner scanner = new Scanner(System.in);
                String rawCarNames = scanner.nextLine();

                if (rawCarNames == null || rawCarNames.isEmpty()) {
                    throw new IllegalArgumentException("빈 문자열은 입력할 수 없습니다. 다시 입력해주세요.");
                }

                String[] carNames = rawCarNames.split(",");
                List<String> finalCarNames = new ArrayList<>();
                for (String carName : carNames) {
                    if (carName.length() <= 0 || carName.length() > 5) {
                        throw new IllegalArgumentException("올바르지 않는 자동차 이름입니다. 다시 입력해주세요.");
                    }
                    finalCarNames.add(carName.trim());
                }
                flag = false;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        // "포비,,브라운"
    }
}
