package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0719o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.crypto.sphincs.Horst;

/* JADX INFO: renamed from: l.۟ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9531 {
    COMMON,
    LATIN,
    GREEK,
    CYRILLIC,
    ARMENIAN,
    HEBREW,
    ARABIC,
    SYRIAC,
    THAANA,
    DEVANAGARI,
    BENGALI,
    GURMUKHI,
    GUJARATI,
    ORIYA,
    TAMIL,
    TELUGU,
    KANNADA,
    MALAYALAM,
    SINHALA,
    THAI,
    LAO,
    TIBETAN,
    MYANMAR,
    GEORGIAN,
    HANGUL,
    ETHIOPIC,
    CHEROKEE,
    CANADIAN_ABORIGINAL,
    OGHAM,
    RUNIC,
    KHMER,
    MONGOLIAN,
    HIRAGANA,
    KATAKANA,
    BOPOMOFO,
    HAN,
    YI,
    OLD_ITALIC,
    GOTHIC,
    DESERET,
    INHERITED,
    TAGALOG,
    HANUNOO,
    BUHID,
    TAGBANWA,
    LIMBU,
    TAI_LE,
    LINEAR_B,
    UGARITIC,
    SHAVIAN,
    OSMANYA,
    CYPRIOT,
    BRAILLE,
    BUGINESE,
    COPTIC,
    NEW_TAI_LUE,
    GLAGOLITIC,
    TIFINAGH,
    SYLOTI_NAGRI,
    OLD_PERSIAN,
    KHAROSHTHI,
    BALINESE,
    CUNEIFORM,
    PHOENICIAN,
    PHAGS_PA,
    NKO,
    SUNDANESE,
    BATAK,
    LEPCHA,
    OL_CHIKI,
    VAI,
    SAURASHTRA,
    KAYAH_LI,
    REJANG,
    LYCIAN,
    CARIAN,
    LYDIAN,
    CHAM,
    TAI_THAM,
    TAI_VIET,
    AVESTAN,
    EGYPTIAN_HIEROGLYPHS,
    SAMARITAN,
    MANDAIC,
    LISU,
    BAMUM,
    JAVANESE,
    MEETEI_MAYEK,
    IMPERIAL_ARAMAIC,
    OLD_SOUTH_ARABIAN,
    INSCRIPTIONAL_PARTHIAN,
    INSCRIPTIONAL_PAHLAVI,
    OLD_TURKIC,
    BRAHMI,
    KAITHI,
    MEROITIC_HIEROGLYPHS,
    MEROITIC_CURSIVE,
    SORA_SOMPENG,
    CHAKMA,
    SHARADA,
    TAKRI,
    MIAO,
    UNKNOWN;


    /* JADX INFO: renamed from: ۗܽ */
    public static final EnumC9531[] f26110;

    /* JADX INFO: renamed from: ۙܽ */
    public static final int[] f26117;

    /* JADX INFO: renamed from: ᩶ܽ */
    public static HashMap f26184;

    static {
        EnumC9531 enumC9531 = COMMON;
        EnumC9531 enumC9532 = LATIN;
        EnumC9531 enumC9533 = GREEK;
        EnumC9531 enumC9534 = CYRILLIC;
        EnumC9531 enumC9535 = ARMENIAN;
        EnumC9531 enumC9536 = HEBREW;
        EnumC9531 enumC9537 = ARABIC;
        EnumC9531 enumC9538 = SYRIAC;
        EnumC9531 enumC9539 = THAANA;
        EnumC9531 enumC95310 = DEVANAGARI;
        EnumC9531 enumC95311 = BENGALI;
        EnumC9531 enumC95312 = GURMUKHI;
        EnumC9531 enumC95313 = GUJARATI;
        EnumC9531 enumC95314 = ORIYA;
        EnumC9531 enumC95315 = TAMIL;
        EnumC9531 enumC95316 = TELUGU;
        EnumC9531 enumC95317 = KANNADA;
        EnumC9531 enumC95318 = MALAYALAM;
        EnumC9531 enumC95319 = SINHALA;
        EnumC9531 enumC95320 = THAI;
        EnumC9531 enumC95321 = LAO;
        EnumC9531 enumC95322 = TIBETAN;
        EnumC9531 enumC95323 = MYANMAR;
        EnumC9531 enumC95324 = GEORGIAN;
        EnumC9531 enumC95325 = HANGUL;
        EnumC9531 enumC95326 = ETHIOPIC;
        EnumC9531 enumC95327 = CHEROKEE;
        EnumC9531 enumC95328 = CANADIAN_ABORIGINAL;
        EnumC9531 enumC95329 = OGHAM;
        EnumC9531 enumC95330 = RUNIC;
        EnumC9531 enumC95331 = KHMER;
        EnumC9531 enumC95332 = MONGOLIAN;
        EnumC9531 enumC95333 = HIRAGANA;
        EnumC9531 enumC95334 = KATAKANA;
        EnumC9531 enumC95335 = BOPOMOFO;
        EnumC9531 enumC95336 = HAN;
        EnumC9531 enumC95337 = YI;
        EnumC9531 enumC95338 = OLD_ITALIC;
        EnumC9531 enumC95339 = GOTHIC;
        EnumC9531 enumC95340 = DESERET;
        EnumC9531 enumC95341 = INHERITED;
        EnumC9531 enumC95342 = TAGALOG;
        EnumC9531 enumC95343 = HANUNOO;
        EnumC9531 enumC95344 = BUHID;
        EnumC9531 enumC95345 = TAGBANWA;
        EnumC9531 enumC95346 = LIMBU;
        EnumC9531 enumC95347 = TAI_LE;
        EnumC9531 enumC95348 = LINEAR_B;
        EnumC9531 enumC95349 = UGARITIC;
        EnumC9531 enumC95350 = SHAVIAN;
        EnumC9531 enumC95351 = OSMANYA;
        EnumC9531 enumC95352 = CYPRIOT;
        EnumC9531 enumC95353 = BRAILLE;
        EnumC9531 enumC95354 = BUGINESE;
        EnumC9531 enumC95355 = COPTIC;
        EnumC9531 enumC95356 = NEW_TAI_LUE;
        EnumC9531 enumC95357 = GLAGOLITIC;
        EnumC9531 enumC95358 = TIFINAGH;
        EnumC9531 enumC95359 = SYLOTI_NAGRI;
        EnumC9531 enumC95360 = OLD_PERSIAN;
        EnumC9531 enumC95361 = KHAROSHTHI;
        EnumC9531 enumC95362 = BALINESE;
        EnumC9531 enumC95363 = CUNEIFORM;
        EnumC9531 enumC95364 = PHOENICIAN;
        EnumC9531 enumC95365 = PHAGS_PA;
        EnumC9531 enumC95366 = NKO;
        EnumC9531 enumC95367 = SUNDANESE;
        EnumC9531 enumC95368 = BATAK;
        EnumC9531 enumC95369 = LEPCHA;
        EnumC9531 enumC95370 = OL_CHIKI;
        EnumC9531 enumC95371 = VAI;
        EnumC9531 enumC95372 = SAURASHTRA;
        EnumC9531 enumC95373 = KAYAH_LI;
        EnumC9531 enumC95374 = REJANG;
        EnumC9531 enumC95375 = LYCIAN;
        EnumC9531 enumC95376 = CARIAN;
        EnumC9531 enumC95377 = LYDIAN;
        EnumC9531 enumC95378 = CHAM;
        EnumC9531 enumC95379 = TAI_THAM;
        EnumC9531 enumC95380 = TAI_VIET;
        EnumC9531 enumC95381 = AVESTAN;
        EnumC9531 enumC95382 = EGYPTIAN_HIEROGLYPHS;
        EnumC9531 enumC95383 = SAMARITAN;
        EnumC9531 enumC95384 = MANDAIC;
        EnumC9531 enumC95385 = LISU;
        EnumC9531 enumC95386 = BAMUM;
        EnumC9531 enumC95387 = JAVANESE;
        EnumC9531 enumC95388 = MEETEI_MAYEK;
        EnumC9531 enumC95389 = IMPERIAL_ARAMAIC;
        EnumC9531 enumC95390 = OLD_SOUTH_ARABIAN;
        EnumC9531 enumC95391 = INSCRIPTIONAL_PARTHIAN;
        EnumC9531 enumC95392 = INSCRIPTIONAL_PAHLAVI;
        EnumC9531 enumC95393 = OLD_TURKIC;
        EnumC9531 enumC95394 = BRAHMI;
        EnumC9531 enumC95395 = KAITHI;
        EnumC9531 enumC95396 = MEROITIC_HIEROGLYPHS;
        EnumC9531 enumC95397 = MEROITIC_CURSIVE;
        EnumC9531 enumC95398 = SORA_SOMPENG;
        EnumC9531 enumC95399 = CHAKMA;
        EnumC9531 enumC953100 = SHARADA;
        EnumC9531 enumC953101 = TAKRI;
        EnumC9531 enumC953102 = MIAO;
        EnumC9531 enumC953103 = UNKNOWN;
        f26117 = new int[]{0, 65, 91, 97, 123, 170, 171, 186, 187, 192, 215, 216, 247, 248, 697, 736, 741, 746, 748, 768, 880, 884, 885, 894, EnumC5674.f13824, 901, 902, 903, 904, 994, 1008, 1024, 1157, 1159, 1329, 1417, 1418, 1425, 1536, 1548, 1549, 1563, 1566, 1567, 1568, 1600, 1601, 1611, 1622, 1632, 1642, 1648, 1649, 1757, 1758, Params.POLY_BYTES, 1872, 1920, 1984, 2048, 2112, 2208, 2304, 2385, 2387, 2404, 2406, 2433, 2561, 2689, 2817, 2946, 3073, 3202, 3330, 3458, 3585, 3647, 3648, 3713, 3840, 4053, 4057, 4096, 4256, 4347, 4348, C0719o.a.f2905k, 4608, 5024, 5120, 5760, 5792, 5867, 5870, 5888, 5920, 5941, 5952, 5984, 6016, 6144, 6146, 6148, 6149, 6150, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6912, 7040, 7104, 7168, 7248, 7360, 7376, 7379, 7380, 7393, 7394, 7401, 7405, 7406, 7412, 7413, 7424, 7462, 7467, 7468, 7517, 7522, 7526, 7531, 7544, 7545, 7615, 7616, 7680, 7936, 8192, 8204, 8206, 8305, 8308, 8319, 8320, 8336, 8352, 8400, 8448, 8486, 8487, 8490, 8492, 8498, 8499, 8526, 8527, 8544, 8585, 10240, 10496, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12272, 12293, 12294, 12295, 12296, 12321, 12330, 12334, 12336, 12344, 12348, 12353, 12441, 12443, 12445, 12448, 12449, 12539, 12541, 12549, 12593, 12688, 12704, 12736, 12784, 12800, 12832, 12896, 12927, 13008, 13144, Horst.HORST_SIGBYTES, 19904, 19968, 40960, 42192, 42240, 42560, 42656, 42752, 42786, 42888, 42891, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43520, 43616, 43648, 43744, 43777, 43968, 44032, 55292, 63744, 64256, 64275, 64285, 64336, 64830, 64848, 65021, 65024, 65040, 65056, 65072, 65136, 65279, 65313, 65339, 65345, 65371, 65382, 65392, 65393, 65438, 65440, 65504, 65536, 65792, 65856, 65936, 66045, 66176, 66208, 66304, 66352, 66432, 66464, 66560, 66640, 66688, 67584, 67648, 67840, 67872, 67968, 68000, 68096, 68192, 68352, 68416, 68448, 68608, 69216, 69632, 69760, 69840, 69888, 70016, 71296, 73728, 77824, 92160, 93952, 110592, 110593, 118784, 119143, 119146, 119163, 119171, 119173, 119180, 119210, 119214, 119296, 119552, 126464, 126976, 127488, 127489, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, 917505, 917760, 918000};
        f26110 = new EnumC9531[]{enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC95335, enumC9531, enumC95341, enumC9533, enumC9531, enumC9533, enumC9531, enumC9533, enumC9531, enumC9533, enumC9531, enumC9533, enumC95355, enumC9533, enumC9534, enumC95341, enumC9534, enumC9535, enumC9531, enumC9535, enumC9536, enumC9537, enumC9531, enumC9537, enumC9531, enumC9537, enumC9531, enumC9537, enumC9531, enumC9537, enumC95341, enumC9537, enumC9531, enumC9537, enumC95341, enumC9537, enumC9531, enumC9537, enumC9538, enumC9537, enumC9539, enumC95366, enumC95383, enumC95384, enumC9537, enumC95310, enumC95341, enumC95310, enumC9531, enumC95310, enumC95311, enumC95312, enumC95313, enumC95314, enumC95315, enumC95316, enumC95317, enumC95318, enumC95319, enumC95320, enumC9531, enumC95320, enumC95321, enumC95322, enumC9531, enumC95322, enumC95323, enumC95324, enumC9531, enumC95324, enumC95325, enumC95326, enumC95327, enumC95328, enumC95329, enumC95330, enumC9531, enumC95330, enumC95342, enumC95343, enumC9531, enumC95344, enumC95345, enumC95331, enumC95332, enumC9531, enumC95332, enumC9531, enumC95332, enumC95328, enumC95346, enumC95347, enumC95356, enumC95331, enumC95354, enumC95379, enumC95362, enumC95367, enumC95368, enumC95369, enumC95370, enumC95367, enumC95341, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC9532, enumC9533, enumC9534, enumC9532, enumC9533, enumC9532, enumC9533, enumC9532, enumC9534, enumC9532, enumC9533, enumC95341, enumC9532, enumC9533, enumC9531, enumC95341, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC95341, enumC9531, enumC9533, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC95353, enumC9531, enumC95357, enumC9532, enumC95355, enumC95324, enumC95358, enumC95326, enumC9534, enumC9531, enumC95336, enumC9531, enumC95336, enumC9531, enumC95336, enumC9531, enumC95336, enumC95341, enumC95325, enumC9531, enumC95336, enumC9531, enumC95333, enumC95341, enumC9531, enumC95333, enumC9531, enumC95334, enumC9531, enumC95334, enumC95335, enumC95325, enumC9531, enumC95335, enumC9531, enumC95334, enumC95325, enumC9531, enumC95325, enumC9531, enumC95334, enumC9531, enumC95336, enumC9531, enumC95336, enumC95337, enumC95385, enumC95371, enumC9534, enumC95386, enumC9531, enumC9532, enumC9531, enumC9532, enumC95359, enumC9531, enumC95365, enumC95372, enumC95310, enumC95373, enumC95374, enumC95325, enumC95387, enumC95378, enumC95323, enumC95380, enumC95388, enumC95326, enumC95388, enumC95325, enumC953103, enumC95336, enumC9532, enumC9535, enumC9536, enumC9537, enumC9531, enumC9537, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC9537, enumC9531, enumC9532, enumC9531, enumC9532, enumC9531, enumC95334, enumC9531, enumC95334, enumC9531, enumC95325, enumC9531, enumC95348, enumC9531, enumC9533, enumC9531, enumC95341, enumC95375, enumC95376, enumC95338, enumC95339, enumC95349, enumC95360, enumC95340, enumC95350, enumC95351, enumC95352, enumC95389, enumC95364, enumC95377, enumC95396, enumC95397, enumC95361, enumC95390, enumC95381, enumC95391, enumC95392, enumC95393, enumC9537, enumC95394, enumC95395, enumC95398, enumC95399, enumC953100, enumC953101, enumC95363, enumC95382, enumC95386, enumC953102, enumC95334, enumC95333, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC95341, enumC9531, enumC9533, enumC9531, enumC9537, enumC9531, enumC95333, enumC9531, enumC95336, enumC9531, enumC95341, enumC953103};
        HashMap map = new HashMap(128);
        f26184 = map;
        map.put("ARAB", enumC9537);
        f26184.put("ARMI", enumC95389);
        f26184.put("ARMN", enumC9535);
        f26184.put("AVST", enumC95381);
        f26184.put("BALI", enumC95362);
        f26184.put("BAMU", enumC95386);
        f26184.put("BATK", enumC95368);
        f26184.put("BENG", enumC95311);
        f26184.put("BOPO", enumC95335);
        f26184.put("BRAI", enumC95353);
        f26184.put("BRAH", enumC95394);
        f26184.put("BUGI", enumC95354);
        f26184.put("BUHD", enumC95344);
        f26184.put("CAKM", enumC95399);
        f26184.put("CANS", enumC95328);
        f26184.put("CARI", enumC95376);
        f26184.put("CHAM", enumC95378);
        f26184.put("CHER", enumC95327);
        f26184.put("COPT", enumC95355);
        f26184.put("CPRT", enumC95352);
        f26184.put("CYRL", enumC9534);
        f26184.put("DEVA", enumC95310);
        f26184.put("DSRT", enumC95340);
        f26184.put("EGYP", enumC95382);
        f26184.put("ETHI", enumC95326);
        f26184.put("GEOR", enumC95324);
        f26184.put("GLAG", enumC95357);
        f26184.put("GOTH", enumC95339);
        f26184.put("GREK", enumC9533);
        f26184.put("GUJR", enumC95313);
        f26184.put("GURU", enumC95312);
        f26184.put("HANG", enumC95325);
        f26184.put("HANI", enumC95336);
        f26184.put("HANO", enumC95343);
        f26184.put("HEBR", enumC9536);
        f26184.put("HIRA", enumC95333);
        f26184.put("ITAL", enumC95338);
        f26184.put("JAVA", enumC95387);
        f26184.put("KALI", enumC95373);
        f26184.put("KANA", enumC95334);
        f26184.put("KHAR", enumC95361);
        f26184.put("KHMR", enumC95331);
        f26184.put("KNDA", enumC95317);
        f26184.put("KTHI", enumC95395);
        f26184.put("LANA", enumC95379);
        f26184.put("LAOO", enumC95321);
        f26184.put("LATN", enumC9532);
        f26184.put("LEPC", enumC95369);
        f26184.put("LIMB", enumC95346);
        f26184.put("LINB", enumC95348);
        f26184.put("LISU", enumC95385);
        f26184.put("LYCI", enumC95375);
        f26184.put("LYDI", enumC95377);
        f26184.put("MAND", enumC95384);
        f26184.put("MERC", enumC95397);
        f26184.put("MERO", enumC95396);
        f26184.put("MLYM", enumC95318);
        f26184.put("MONG", enumC95332);
        f26184.put("MTEI", enumC95388);
        f26184.put("MYMR", enumC95323);
        f26184.put("NKOO", enumC95366);
        f26184.put("OGAM", enumC95329);
        f26184.put("OLCK", enumC95370);
        f26184.put("ORKH", enumC95393);
        f26184.put("ORYA", enumC95314);
        f26184.put("OSMA", enumC95351);
        f26184.put("PHAG", enumC95365);
        f26184.put("PLRD", enumC953102);
        f26184.put("PHLI", enumC95392);
        f26184.put("PHNX", enumC95364);
        f26184.put("PRTI", enumC95391);
        f26184.put("RJNG", enumC95374);
        f26184.put("RUNR", enumC95330);
        f26184.put("SAMR", enumC95383);
        f26184.put("SARB", enumC95390);
        f26184.put("SAUR", enumC95372);
        f26184.put("SHAW", enumC95350);
        f26184.put("SHRD", enumC953100);
        f26184.put("SINH", enumC95319);
        f26184.put("SORA", enumC95398);
        f26184.put("SUND", enumC95367);
        f26184.put("SYLO", enumC95359);
        f26184.put("SYRC", enumC9538);
        f26184.put("TAGB", enumC95345);
        f26184.put("TALE", enumC95347);
        f26184.put("TAKR", enumC953101);
        f26184.put("TALU", enumC95356);
        f26184.put("TAML", enumC95315);
        f26184.put("TAVT", enumC95380);
        f26184.put("TELU", enumC95316);
        f26184.put("TFNG", enumC95358);
        f26184.put("TGLG", enumC95342);
        f26184.put("THAA", enumC9539);
        f26184.put("THAI", enumC95320);
        f26184.put("TIBT", enumC95322);
        f26184.put("UGAR", enumC95349);
        f26184.put("VAII", enumC95371);
        f26184.put("XPEO", enumC95360);
        f26184.put("XSUX", enumC95363);
        f26184.put("YIII", enumC95337);
        f26184.put("ZINH", enumC95341);
        f26184.put("ZYYY", enumC9531);
        f26184.put("ZZZZ", enumC953103);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC9531 m22196(int i) {
        if (!Character.isValidCodePoint(i)) {
            throw new IllegalArgumentException();
        }
        if (C4426.m9241(i) == 0) {
            return UNKNOWN;
        }
        int iBinarySearch = Arrays.binarySearch(f26117, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return f26110[iBinarySearch];
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC9531 m22197(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        EnumC9531 enumC9531 = (EnumC9531) f26184.get(upperCase);
        return enumC9531 != null ? enumC9531 : valueOf(upperCase);
    }
}
