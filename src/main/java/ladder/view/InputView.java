package ladder.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String QUESTION_PEOPLE_NAME = "참여할 사람 이름을 입력하세요.";
    private static final String QUESTION_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

    public static String[] askingPeopleName() {
        System.out.println(QUESTION_PEOPLE_NAME);
        return scanner.nextLine().split(",");
    }

    public static int askingLadderMaxHeight() {
        System.out.println(QUESTION_LADDER_HEIGHT);
        return scanner.nextInt();
    }
}
