// TODO: Porker カード判定
//  Input: 2C 3H 4S 8C AH Output: high card: Ace
//  Input: 2H 4S 4C 2D 4H Output: full house
//  Input: 2H 3D 5S 9C KD Output: high card: K
//  ポーカの全てのルールを満たす

package poker;

public class Main {
    public static void main(String[] args) {
        String[] trumpCardsMark = {"S", "H", "D", "C"};
        String[] trumpCardsNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] trumpJoker = {"Jo", "Jo"};
//        System.out.println(RoleJudge.roleJudge());
    }
}
