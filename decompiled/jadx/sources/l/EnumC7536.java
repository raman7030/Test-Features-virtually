package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.crypto.sphincs.Horst;

/* JADX INFO: renamed from: l.۟ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7536 {
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


    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC7536[] f23197;

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f23204;

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap f23271;

    static {
        EnumC7536 enumC7536 = COMMON;
        EnumC7536 enumC7537 = LATIN;
        EnumC7536 enumC7538 = GREEK;
        EnumC7536 enumC7539 = CYRILLIC;
        EnumC7536 enumC75310 = ARMENIAN;
        EnumC7536 enumC75311 = HEBREW;
        EnumC7536 enumC75312 = ARABIC;
        EnumC7536 enumC75313 = SYRIAC;
        EnumC7536 enumC75314 = THAANA;
        EnumC7536 enumC75315 = DEVANAGARI;
        EnumC7536 enumC75316 = BENGALI;
        EnumC7536 enumC75317 = GURMUKHI;
        EnumC7536 enumC75318 = GUJARATI;
        EnumC7536 enumC75319 = ORIYA;
        EnumC7536 enumC75320 = TAMIL;
        EnumC7536 enumC75321 = TELUGU;
        EnumC7536 enumC75322 = KANNADA;
        EnumC7536 enumC75323 = MALAYALAM;
        EnumC7536 enumC75324 = SINHALA;
        EnumC7536 enumC75325 = THAI;
        EnumC7536 enumC75326 = LAO;
        EnumC7536 enumC75327 = TIBETAN;
        EnumC7536 enumC75328 = MYANMAR;
        EnumC7536 enumC75329 = GEORGIAN;
        EnumC7536 enumC75330 = HANGUL;
        EnumC7536 enumC75331 = ETHIOPIC;
        EnumC7536 enumC75332 = CHEROKEE;
        EnumC7536 enumC75333 = CANADIAN_ABORIGINAL;
        EnumC7536 enumC75334 = OGHAM;
        EnumC7536 enumC75335 = RUNIC;
        EnumC7536 enumC75336 = KHMER;
        EnumC7536 enumC75337 = MONGOLIAN;
        EnumC7536 enumC75338 = HIRAGANA;
        EnumC7536 enumC75339 = KATAKANA;
        EnumC7536 enumC75340 = BOPOMOFO;
        EnumC7536 enumC75341 = HAN;
        EnumC7536 enumC75342 = YI;
        EnumC7536 enumC75343 = OLD_ITALIC;
        EnumC7536 enumC75344 = GOTHIC;
        EnumC7536 enumC75345 = DESERET;
        EnumC7536 enumC75346 = INHERITED;
        EnumC7536 enumC75347 = TAGALOG;
        EnumC7536 enumC75348 = HANUNOO;
        EnumC7536 enumC75349 = BUHID;
        EnumC7536 enumC75350 = TAGBANWA;
        EnumC7536 enumC75351 = LIMBU;
        EnumC7536 enumC75352 = TAI_LE;
        EnumC7536 enumC75353 = LINEAR_B;
        EnumC7536 enumC75354 = UGARITIC;
        EnumC7536 enumC75355 = SHAVIAN;
        EnumC7536 enumC75356 = OSMANYA;
        EnumC7536 enumC75357 = CYPRIOT;
        EnumC7536 enumC75358 = BRAILLE;
        EnumC7536 enumC75359 = BUGINESE;
        EnumC7536 enumC75360 = COPTIC;
        EnumC7536 enumC75361 = NEW_TAI_LUE;
        EnumC7536 enumC75362 = GLAGOLITIC;
        EnumC7536 enumC75363 = TIFINAGH;
        EnumC7536 enumC75364 = SYLOTI_NAGRI;
        EnumC7536 enumC75365 = OLD_PERSIAN;
        EnumC7536 enumC75366 = KHAROSHTHI;
        EnumC7536 enumC75367 = BALINESE;
        EnumC7536 enumC75368 = CUNEIFORM;
        EnumC7536 enumC75369 = PHOENICIAN;
        EnumC7536 enumC75370 = PHAGS_PA;
        EnumC7536 enumC75371 = NKO;
        EnumC7536 enumC75372 = SUNDANESE;
        EnumC7536 enumC75373 = BATAK;
        EnumC7536 enumC75374 = LEPCHA;
        EnumC7536 enumC75375 = OL_CHIKI;
        EnumC7536 enumC75376 = VAI;
        EnumC7536 enumC75377 = SAURASHTRA;
        EnumC7536 enumC75378 = KAYAH_LI;
        EnumC7536 enumC75379 = REJANG;
        EnumC7536 enumC75380 = LYCIAN;
        EnumC7536 enumC75381 = CARIAN;
        EnumC7536 enumC75382 = LYDIAN;
        EnumC7536 enumC75383 = CHAM;
        EnumC7536 enumC75384 = TAI_THAM;
        EnumC7536 enumC75385 = TAI_VIET;
        EnumC7536 enumC75386 = AVESTAN;
        EnumC7536 enumC75387 = EGYPTIAN_HIEROGLYPHS;
        EnumC7536 enumC75388 = SAMARITAN;
        EnumC7536 enumC75389 = MANDAIC;
        EnumC7536 enumC75390 = LISU;
        EnumC7536 enumC75391 = BAMUM;
        EnumC7536 enumC75392 = JAVANESE;
        EnumC7536 enumC75393 = MEETEI_MAYEK;
        EnumC7536 enumC75394 = IMPERIAL_ARAMAIC;
        EnumC7536 enumC75395 = OLD_SOUTH_ARABIAN;
        EnumC7536 enumC75396 = INSCRIPTIONAL_PARTHIAN;
        EnumC7536 enumC75397 = INSCRIPTIONAL_PAHLAVI;
        EnumC7536 enumC75398 = OLD_TURKIC;
        EnumC7536 enumC75399 = BRAHMI;
        EnumC7536 enumC753100 = KAITHI;
        EnumC7536 enumC753101 = MEROITIC_HIEROGLYPHS;
        EnumC7536 enumC753102 = MEROITIC_CURSIVE;
        EnumC7536 enumC753103 = SORA_SOMPENG;
        EnumC7536 enumC753104 = CHAKMA;
        EnumC7536 enumC753105 = SHARADA;
        EnumC7536 enumC753106 = TAKRI;
        EnumC7536 enumC753107 = MIAO;
        EnumC7536 enumC753108 = UNKNOWN;
        f23204 = new int[]{0, 65, 91, 97, 123, 170, 171, 186, 187, 192, 215, 216, 247, 248, 697, 736, 741, 746, 748, 768, 880, 884, 885, 894, EnumC3478.f11019, 901, 902, 903, 904, 994, 1008, 1024, 1157, 1159, 1329, 1417, 1418, 1425, 1536, 1548, 1549, 1563, 1566, 1567, 1568, 1600, 1601, 1611, 1622, 1632, 1642, 1648, 1649, 1757, 1758, Params.POLY_BYTES, 1872, 1920, 1984, 2048, 2112, 2208, 2304, 2385, 2387, 2404, 2406, 2433, 2561, 2689, 2817, 2946, 3073, 3202, 3330, 3458, 3585, 3647, 3648, 3713, 3840, 4053, 4057, 4096, 4256, 4347, 4348, o.a.k, 4608, 5024, 5120, 5760, 5792, 5867, 5870, 5888, 5920, 5941, 5952, 5984, 6016, 6144, 6146, 6148, 6149, 6150, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6912, 7040, 7104, 7168, 7248, 7360, 7376, 7379, 7380, 7393, 7394, 7401, 7405, 7406, 7412, 7413, 7424, 7462, 7467, 7468, 7517, 7522, 7526, 7531, 7544, 7545, 7615, 7616, 7680, 7936, 8192, 8204, 8206, 8305, 8308, 8319, 8320, 8336, 8352, 8400, 8448, 8486, 8487, 8490, 8492, 8498, 8499, 8526, 8527, 8544, 8585, 10240, 10496, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12272, 12293, 12294, 12295, 12296, 12321, 12330, 12334, 12336, 12344, 12348, 12353, 12441, 12443, 12445, 12448, 12449, 12539, 12541, 12549, 12593, 12688, 12704, 12736, 12784, 12800, 12832, 12896, 12927, 13008, 13144, Horst.HORST_SIGBYTES, 19904, 19968, 40960, 42192, 42240, 42560, 42656, 42752, 42786, 42888, 42891, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43520, 43616, 43648, 43744, 43777, 43968, 44032, 55292, 63744, 64256, 64275, 64285, 64336, 64830, 64848, 65021, 65024, 65040, 65056, 65072, 65136, 65279, 65313, 65339, 65345, 65371, 65382, 65392, 65393, 65438, 65440, 65504, 65536, 65792, 65856, 65936, 66045, 66176, 66208, 66304, 66352, 66432, 66464, 66560, 66640, 66688, 67584, 67648, 67840, 67872, 67968, 68000, 68096, 68192, 68352, 68416, 68448, 68608, 69216, 69632, 69760, 69840, 69888, 70016, 71296, 73728, 77824, 92160, 93952, 110592, 110593, 118784, 119143, 119146, 119163, 119171, 119173, 119180, 119210, 119214, 119296, 119552, 126464, 126976, 127488, 127489, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, 917505, 917760, 918000};
        f23197 = new EnumC7536[]{enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC75340, enumC7536, enumC75346, enumC7538, enumC7536, enumC7538, enumC7536, enumC7538, enumC7536, enumC7538, enumC7536, enumC7538, enumC75360, enumC7538, enumC7539, enumC75346, enumC7539, enumC75310, enumC7536, enumC75310, enumC75311, enumC75312, enumC7536, enumC75312, enumC7536, enumC75312, enumC7536, enumC75312, enumC7536, enumC75312, enumC75346, enumC75312, enumC7536, enumC75312, enumC75346, enumC75312, enumC7536, enumC75312, enumC75313, enumC75312, enumC75314, enumC75371, enumC75388, enumC75389, enumC75312, enumC75315, enumC75346, enumC75315, enumC7536, enumC75315, enumC75316, enumC75317, enumC75318, enumC75319, enumC75320, enumC75321, enumC75322, enumC75323, enumC75324, enumC75325, enumC7536, enumC75325, enumC75326, enumC75327, enumC7536, enumC75327, enumC75328, enumC75329, enumC7536, enumC75329, enumC75330, enumC75331, enumC75332, enumC75333, enumC75334, enumC75335, enumC7536, enumC75335, enumC75347, enumC75348, enumC7536, enumC75349, enumC75350, enumC75336, enumC75337, enumC7536, enumC75337, enumC7536, enumC75337, enumC75333, enumC75351, enumC75352, enumC75361, enumC75336, enumC75359, enumC75384, enumC75367, enumC75372, enumC75373, enumC75374, enumC75375, enumC75372, enumC75346, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC7537, enumC7538, enumC7539, enumC7537, enumC7538, enumC7537, enumC7538, enumC7537, enumC7539, enumC7537, enumC7538, enumC75346, enumC7537, enumC7538, enumC7536, enumC75346, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC75346, enumC7536, enumC7538, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC75358, enumC7536, enumC75362, enumC7537, enumC75360, enumC75329, enumC75363, enumC75331, enumC7539, enumC7536, enumC75341, enumC7536, enumC75341, enumC7536, enumC75341, enumC7536, enumC75341, enumC75346, enumC75330, enumC7536, enumC75341, enumC7536, enumC75338, enumC75346, enumC7536, enumC75338, enumC7536, enumC75339, enumC7536, enumC75339, enumC75340, enumC75330, enumC7536, enumC75340, enumC7536, enumC75339, enumC75330, enumC7536, enumC75330, enumC7536, enumC75339, enumC7536, enumC75341, enumC7536, enumC75341, enumC75342, enumC75390, enumC75376, enumC7539, enumC75391, enumC7536, enumC7537, enumC7536, enumC7537, enumC75364, enumC7536, enumC75370, enumC75377, enumC75315, enumC75378, enumC75379, enumC75330, enumC75392, enumC75383, enumC75328, enumC75385, enumC75393, enumC75331, enumC75393, enumC75330, enumC753108, enumC75341, enumC7537, enumC75310, enumC75311, enumC75312, enumC7536, enumC75312, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC75312, enumC7536, enumC7537, enumC7536, enumC7537, enumC7536, enumC75339, enumC7536, enumC75339, enumC7536, enumC75330, enumC7536, enumC75353, enumC7536, enumC7538, enumC7536, enumC75346, enumC75380, enumC75381, enumC75343, enumC75344, enumC75354, enumC75365, enumC75345, enumC75355, enumC75356, enumC75357, enumC75394, enumC75369, enumC75382, enumC753101, enumC753102, enumC75366, enumC75395, enumC75386, enumC75396, enumC75397, enumC75398, enumC75312, enumC75399, enumC753100, enumC753103, enumC753104, enumC753105, enumC753106, enumC75368, enumC75387, enumC75391, enumC753107, enumC75339, enumC75338, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC75346, enumC7536, enumC7538, enumC7536, enumC75312, enumC7536, enumC75338, enumC7536, enumC75341, enumC7536, enumC75346, enumC753108};
        HashMap map = new HashMap(128);
        f23271 = map;
        map.put("ARAB", enumC75312);
        f23271.put("ARMI", enumC75394);
        f23271.put("ARMN", enumC75310);
        f23271.put("AVST", enumC75386);
        f23271.put("BALI", enumC75367);
        f23271.put("BAMU", enumC75391);
        f23271.put("BATK", enumC75373);
        f23271.put("BENG", enumC75316);
        f23271.put("BOPO", enumC75340);
        f23271.put("BRAI", enumC75358);
        f23271.put("BRAH", enumC75399);
        f23271.put("BUGI", enumC75359);
        f23271.put("BUHD", enumC75349);
        f23271.put("CAKM", enumC753104);
        f23271.put("CANS", enumC75333);
        f23271.put("CARI", enumC75381);
        f23271.put("CHAM", enumC75383);
        f23271.put("CHER", enumC75332);
        f23271.put("COPT", enumC75360);
        f23271.put("CPRT", enumC75357);
        f23271.put("CYRL", enumC7539);
        f23271.put("DEVA", enumC75315);
        f23271.put("DSRT", enumC75345);
        f23271.put("EGYP", enumC75387);
        f23271.put("ETHI", enumC75331);
        f23271.put("GEOR", enumC75329);
        f23271.put("GLAG", enumC75362);
        f23271.put("GOTH", enumC75344);
        f23271.put("GREK", enumC7538);
        f23271.put("GUJR", enumC75318);
        f23271.put("GURU", enumC75317);
        f23271.put("HANG", enumC75330);
        f23271.put("HANI", enumC75341);
        f23271.put("HANO", enumC75348);
        f23271.put("HEBR", enumC75311);
        f23271.put("HIRA", enumC75338);
        f23271.put("ITAL", enumC75343);
        f23271.put("JAVA", enumC75392);
        f23271.put("KALI", enumC75378);
        f23271.put("KANA", enumC75339);
        f23271.put("KHAR", enumC75366);
        f23271.put("KHMR", enumC75336);
        f23271.put("KNDA", enumC75322);
        f23271.put("KTHI", enumC753100);
        f23271.put("LANA", enumC75384);
        f23271.put("LAOO", enumC75326);
        f23271.put("LATN", enumC7537);
        f23271.put("LEPC", enumC75374);
        f23271.put("LIMB", enumC75351);
        f23271.put("LINB", enumC75353);
        f23271.put("LISU", enumC75390);
        f23271.put("LYCI", enumC75380);
        f23271.put("LYDI", enumC75382);
        f23271.put("MAND", enumC75389);
        f23271.put("MERC", enumC753102);
        f23271.put("MERO", enumC753101);
        f23271.put("MLYM", enumC75323);
        f23271.put("MONG", enumC75337);
        f23271.put("MTEI", enumC75393);
        f23271.put("MYMR", enumC75328);
        f23271.put("NKOO", enumC75371);
        f23271.put("OGAM", enumC75334);
        f23271.put("OLCK", enumC75375);
        f23271.put("ORKH", enumC75398);
        f23271.put("ORYA", enumC75319);
        f23271.put("OSMA", enumC75356);
        f23271.put("PHAG", enumC75370);
        f23271.put("PLRD", enumC753107);
        f23271.put("PHLI", enumC75397);
        f23271.put("PHNX", enumC75369);
        f23271.put("PRTI", enumC75396);
        f23271.put("RJNG", enumC75379);
        f23271.put("RUNR", enumC75335);
        f23271.put("SAMR", enumC75388);
        f23271.put("SARB", enumC75395);
        f23271.put("SAUR", enumC75377);
        f23271.put("SHAW", enumC75355);
        f23271.put("SHRD", enumC753105);
        f23271.put("SINH", enumC75324);
        f23271.put("SORA", enumC753103);
        f23271.put("SUND", enumC75372);
        f23271.put("SYLO", enumC75364);
        f23271.put("SYRC", enumC75313);
        f23271.put("TAGB", enumC75350);
        f23271.put("TALE", enumC75352);
        f23271.put("TAKR", enumC753106);
        f23271.put("TALU", enumC75361);
        f23271.put("TAML", enumC75320);
        f23271.put("TAVT", enumC75385);
        f23271.put("TELU", enumC75321);
        f23271.put("TFNG", enumC75363);
        f23271.put("TGLG", enumC75347);
        f23271.put("THAA", enumC75314);
        f23271.put("THAI", enumC75325);
        f23271.put("TIBT", enumC75327);
        f23271.put("UGAR", enumC75354);
        f23271.put("VAII", enumC75376);
        f23271.put("XPEO", enumC75365);
        f23271.put("XSUX", enumC75368);
        f23271.put("YIII", enumC75342);
        f23271.put("ZINH", enumC75346);
        f23271.put("ZYYY", enumC7536);
        f23271.put("ZZZZ", enumC753108);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7536 m20220(int i) {
        if (!Character.isValidCodePoint(i)) {
            throw new IllegalArgumentException();
        }
        if (C2164.m7146(i) == 0) {
            return UNKNOWN;
        }
        int iBinarySearch = Arrays.binarySearch(f23204, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return f23197[iBinarySearch];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7536 m20221(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        EnumC7536 enumC7536 = (EnumC7536) f23271.get(upperCase);
        return enumC7536 != null ? enumC7536 : valueOf(upperCase);
    }
}
