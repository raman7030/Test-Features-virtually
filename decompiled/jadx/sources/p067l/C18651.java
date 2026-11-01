package p067l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C18651 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f55667;

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f55670 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f55669 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f55668 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        f55667 = map;
        C14110.m32032(-984833, map, "aliceblue", -332841, "antiquewhite");
        C17520.m39895(map, "aqua", -16711681, -8388652, "aquamarine");
        C14110.m32032(-983041, map, "azure", -657956, "beige");
        C14110.m32032(-6972, map, "bisque", -16777216, "black");
        C14110.m32032(-5171, map, "blanchedalmond", -16776961, "blue");
        C14110.m32032(-7722014, map, "blueviolet", -5952982, "brown");
        C14110.m32032(-2180985, map, "burlywood", -10510688, "cadetblue");
        C14110.m32032(-8388864, map, "chartreuse", -2987746, "chocolate");
        C14110.m32032(-32944, map, "coral", -10185235, "cornflowerblue");
        C14110.m32032(-1828, map, "cornsilk", -2354116, "crimson");
        C17520.m39895(map, "cyan", -16711681, -16777077, "darkblue");
        C14110.m32032(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        C17520.m39895(map, "darkgray", -5658199, -16751616, "darkgreen");
        C17520.m39895(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        C14110.m32032(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        C14110.m32032(-29696, map, "darkorange", -6737204, "darkorchid");
        C14110.m32032(-7667712, map, "darkred", -1468806, "darksalmon");
        C14110.m32032(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        C17520.m39895(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        C14110.m32032(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        C17520.m39895(map, "dodgerblue", -14774017, -5103070, "firebrick");
        C14110.m32032(-1296, map, "floralwhite", -14513374, "forestgreen");
        C17520.m39895(map, "fuchsia", -65281, -2302756, "gainsboro");
        C14110.m32032(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        C14110.m32032(-16744448, map, "green", -5374161, "greenyellow");
        C17520.m39895(map, "grey", -8355712, -983056, "honeydew");
        C14110.m32032(-38476, map, "hotpink", -3318692, "indianred");
        C14110.m32032(-11861886, map, "indigo", -16, "ivory");
        C14110.m32032(-989556, map, "khaki", -1644806, "lavender");
        C14110.m32032(-3851, map, "lavenderblush", -8586240, "lawngreen");
        C14110.m32032(-1331, map, "lemonchiffon", -5383962, "lightblue");
        C14110.m32032(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        C14110.m32032(-18751, map, "lightpink", -24454, "lightsalmon");
        C14110.m32032(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        C17520.m39895(map, "lightsteelblue", -5192482, -32, "lightyellow");
        C14110.m32032(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        C14110.m32032(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        C14110.m32032(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        C14110.m32032(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        C14110.m32032(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        C14110.m32032(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        C14110.m32032(-15132304, map, "midnightblue", -655366, "mintcream");
        C14110.m32032(-6943, map, "mistyrose", -6987, "moccasin");
        C14110.m32032(-8531, map, "navajowhite", -16777088, "navy");
        C14110.m32032(-133658, map, "oldlace", -8355840, "olive");
        C14110.m32032(-9728477, map, "olivedrab", -23296, "orange");
        C14110.m32032(-47872, map, "orangered", -2461482, "orchid");
        C14110.m32032(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        C14110.m32032(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        C14110.m32032(-4139, map, "papayawhip", -9543, "peachpuff");
        C14110.m32032(-3308225, map, "peru", -16181, "pink");
        C14110.m32032(-2252579, map, "plum", -5185306, "powderblue");
        C14110.m32032(-8388480, map, "purple", -10079335, "rebeccapurple");
        C14110.m32032(-65536, map, "red", -4419697, "rosybrown");
        C14110.m32032(-12490271, map, "royalblue", -7650029, "saddlebrown");
        C14110.m32032(-360334, map, "salmon", -744352, "sandybrown");
        C14110.m32032(-13726889, map, "seagreen", -2578, "seashell");
        C14110.m32032(-6270419, map, "sienna", -4144960, "silver");
        C14110.m32032(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        C17520.m39895(map, "snow", -1286, -16711809, "springgreen");
        C14110.m32032(-12156236, map, "steelblue", -2968436, "tan");
        C14110.m32032(-16744320, map, "teal", -2572328, "thistle");
        C14110.m32032(-40121, map, "tomato", 0, "transparent");
        C14110.m32032(-12525360, map, "turquoise", -1146130, "violet");
        C14110.m32032(-663885, map, "wheat", -1, "white");
        C14110.m32032(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m42402(String str) {
        return m42401(str, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42400(String str) {
        return m42401(str, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42401(String str, boolean z) {
        int i;
        C23877.m52957(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f55668 : f55669).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f55670.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f55667.get(C16726.m37957(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
