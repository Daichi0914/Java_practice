package spell_out_a_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpellOutTest {

    @Test
    public void 数字をスペルに変換することができる() throws Exception {
        SpellOut so = new SpellOut();
        String actual1 = so.spellOut(99);
        String actual2 = so.spellOut(300);
        String actual3 = so.spellOut(310);
        String actual4 = so.spellOut(1501);
        String actual5 = so.spellOut(12609);
        String actual6 = so.spellOut(512607);
        String actual7 = so.spellOut(43112603);
        assertEquals(actual1, "ninety nine");
        assertEquals(actual2, "three hundred");
        assertEquals(actual3, "three hundred and ten");
        assertEquals(actual4, "one thousand, five hundred and one");
        assertEquals(actual5, "twelve thousand, six hundred and nine");
        assertEquals(actual6, "five hundred and twelve thousand, six hundred and seven");
        assertEquals(actual7, "forty three million, one hundred and twelve thousand, six hundred and three");
    }

}
