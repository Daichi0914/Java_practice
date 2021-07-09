package poker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoleJudgeTest {

    @Test
    public void 数字をスペルに変換することができる() throws Exception {
        RoleJudge rj = new RoleJudge();
        String[] cards1  = {"2C", "3H", "4S", "8C", "AH"};
        String[] cards2    = {"2H", "4S", "4C", "2D", "4H"};
        String[] cards3 = {"2H", "3D", "5S", "9C", "KD"};
        String highCardAce = rj.roleJudge(cards1);
        String fullHouse = rj.roleJudge(cards2);
        String highCardKing = rj.roleJudge(cards3);
        assertEquals(highCardAce, "high card: Ace");
        assertEquals(fullHouse, "full house");
        assertEquals(highCardKing, "high card: K");
    }

}