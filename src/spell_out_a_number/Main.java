// TODO: Spell out a number. For example
//      o) 99 --> ninety nine
//      o) 300 --> three hundred
//      o) 310 --> three hundred and ten
//      o) 1501 --> one thousand, five hundred and one
//      o) 12609 --> twelve thousand, six hundred and nine
//      o) 512607 --> five hundred and twelve thousand, six hundred and seven
//      o) 43112603 --> forty three million, one hundred and twelve thousand, six hundred and three

package spell_out_a_number;

public class Main {
    public static void main(String[] args) {
        int[] arr = {99, 300, 310, 1501, 12609, 512607, 43112603};
        SpellOut.spellOut(arr);
    }
}
