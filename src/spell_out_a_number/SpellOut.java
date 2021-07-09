package spell_out_a_number;

public class SpellOut {
    static String[] spellOut(int[] arr) {

    }
}

// 桁数を取得
// 3桁区切り
// 321 => tree hundred twenty one
// 321,321 => tree hundred twenty one thousand, tree hundred twenty one
// 321,321,321 => tree hundred twenty one million, tree hundred twenty one thousand, tree hundred twenty one
// 3桁目の数字 + hundred
// 6桁目の数字 + hundred
// 6桁目の塊 + thousand
// 9桁目の数字 + hundred
// 9桁目の塊 + million