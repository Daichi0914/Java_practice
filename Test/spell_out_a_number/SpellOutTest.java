package spell_out_a_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

class SpellOutTest {

    @Test
    public void 数字をスペルに変換することができる() throws Exception {
        SpellOut so = new SpellOut();
        int[] arr = {99, 300, 310, 1501, 12609, 512607, 43112603};
        String[] expected = {
                "ninety nine",
                "three hundred",
                "three hundred and ten",
                "one thousand, five hundred and one",
                "twelve thousand, six hundred and nine",
                "five hundred and twelve thousand, six hundred and seven",
                "forty three million, one hundred and twelve thousand, six hundred and three"
        };
        String[] actual = so.spellOut(arr);
        Assert.assertArrayEquals(actual, expected);
    }

}
