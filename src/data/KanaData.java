package data;

import java.util.*;

public class KanaData {
    /** Map holding Hiragana characters and their Romaji readings */
    private static Map<String, String> hiraganaMap = new HashMap<>();
    /** Map holding Katakana characters and their Romaji readings */
    private static Map<String, String> katakanaMap = new HashMap<>();

    /** Initialize the Hiragana and Katakana maps with their corresponding Romaji readings */
    static {
        // Hiragana characters
        hiraganaMap.put("あ", "a");
        hiraganaMap.put("い", "i");
        hiraganaMap.put("う", "u");
        hiraganaMap.put("え", "e");
        hiraganaMap.put("お", "o");

        hiraganaMap.put("か", "ka");
        hiraganaMap.put("き", "ki");
        hiraganaMap.put("く", "ku");
        hiraganaMap.put("け", "ke");
        hiraganaMap.put("こ", "ko");

        hiraganaMap.put("さ", "sa");
        hiraganaMap.put("し", "shi");
        hiraganaMap.put("す", "su");
        hiraganaMap.put("せ", "se");
        hiraganaMap.put("そ", "so");

        hiraganaMap.put("た", "ta");
        hiraganaMap.put("ち", "chi");
        hiraganaMap.put("つ", "tsu");
        hiraganaMap.put("て", "te");
        hiraganaMap.put("と", "to");

        hiraganaMap.put("な", "na");
        hiraganaMap.put("に", "ni");
        hiraganaMap.put("ぬ", "nu");
        hiraganaMap.put("ね", "ne");
        hiraganaMap.put("の", "no");
        
        hiraganaMap.put("は", "ha");
        hiraganaMap.put("ひ", "hi");
        hiraganaMap.put("ふ", "fu");
        hiraganaMap.put("へ", "he");
        hiraganaMap.put("ほ", "ho");

        hiraganaMap.put("ま", "ma");
        hiraganaMap.put("み", "mi");
        hiraganaMap.put("む", "mu");
        hiraganaMap.put("め", "me");
        hiraganaMap.put("も", "mo");

        hiraganaMap.put("や", "ya");
        hiraganaMap.put("ゆ", "yu");
        hiraganaMap.put("よ", "yo");

        hiraganaMap.put("ら", "ra");
        hiraganaMap.put("り", "ri");
        hiraganaMap.put("る", "ru");
        hiraganaMap.put("れ", "re");
        hiraganaMap.put("ろ", "ro");

        hiraganaMap.put("わ", "wa");
        hiraganaMap.put("を", "wo");
        hiraganaMap.put("ん", "n");

        // Katakana characters
        katakanaMap.put("ア", "a");
        katakanaMap.put("イ", "i");
        katakanaMap.put("ウ", "u");
        katakanaMap.put("エ", "e");
        katakanaMap.put("オ", "o");

        katakanaMap.put("カ", "ka");
        katakanaMap.put("キ", "ki");
        katakanaMap.put("ク", "ku");
        katakanaMap.put("ケ", "ke");
        katakanaMap.put("コ", "ko");
 
        katakanaMap.put("サ", "sa");
        katakanaMap.put("シ", "shi");
        katakanaMap.put("ス", "su");
        katakanaMap.put("セ", "se");
        katakanaMap.put("ソ", "so");

        katakanaMap.put("タ", "ta");
        katakanaMap.put("チ", "chi");
        katakanaMap.put("ツ", "tsu");
        katakanaMap.put("テ", "te");
        katakanaMap.put("ト", "to");

        katakanaMap.put("ナ", "na");
        katakanaMap.put("ニ", "ni");
        katakanaMap.put("ヌ", "nu");
        katakanaMap.put("ネ", "ne");
        katakanaMap.put("ノ", "no");

        katakanaMap.put("ハ", "ha");
        katakanaMap.put("ヒ", "hi");
        katakanaMap.put("フ", "fu");
        katakanaMap.put("ヘ", "he");
        katakanaMap.put("ホ", "ho");

        katakanaMap.put("マ", "ma");
        katakanaMap.put("ミ", "mi");
        katakanaMap.put("ム", "mu");
        katakanaMap.put("メ", "me");
        katakanaMap.put("モ", "mo");

        katakanaMap.put("ヤ", "ya");
        katakanaMap.put("ユ", "yu");
        katakanaMap.put("ヨ", "yo");

        katakanaMap.put("ラ", "ra");
        katakanaMap.put("リ", "ri");
        katakanaMap.put("ル", "ru");
        katakanaMap.put("レ", "re");
        katakanaMap.put("ロ", "ro");

        katakanaMap.put("ワ", "wa");
        katakanaMap.put("ヲ", "wo");
        katakanaMap.put("ン", "n");
    }
}
