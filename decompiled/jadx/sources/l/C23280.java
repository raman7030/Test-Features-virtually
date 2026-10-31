package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJW */
/* JADX INFO: loaded from: classes.dex */
public final class C23280 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f74754;

    static {
        C6785 c6785M24537 = AbstractC9608.m24537();
        c6785M24537.mo18428("aliceblue", "#f0f8ff");
        c6785M24537.mo18428("antiquewhite", "#faebd7");
        c6785M24537.mo18428("aqua", "#00ffff");
        c6785M24537.mo18428("aquamarine", "#7fffd4");
        c6785M24537.mo18428("azure", "#f0ffff");
        c6785M24537.mo18428("beige", "#f5f5dc");
        c6785M24537.mo18428("bisque", "#ffe4c4");
        c6785M24537.mo18428("black", "#000000");
        c6785M24537.mo18428("blanchedalmond", "#ffebcd");
        c6785M24537.mo18428("blue", "#0000ff");
        c6785M24537.mo18428("blueviolet", "#8a2be2");
        c6785M24537.mo18428("brown", "#a52a2a");
        c6785M24537.mo18428("burlywood", "#deb887");
        c6785M24537.mo18428("cadetblue", "#5f9ea0");
        c6785M24537.mo18428("chartreuse", "#7fff00");
        c6785M24537.mo18428("chocolate", "#d2691e");
        c6785M24537.mo18428("coral", "#ff7f50");
        c6785M24537.mo18428("cornflowerblue", "#6495ed");
        c6785M24537.mo18428("cornsilk", "#fff8dc");
        c6785M24537.mo18428("crimson", "#dc143c");
        c6785M24537.mo18428("cyan", "#00ffff");
        c6785M24537.mo18428("darkblue", "#00008b");
        c6785M24537.mo18428("darkcyan", "#008b8b");
        c6785M24537.mo18428("darkgoldenrod", "#b8860b");
        c6785M24537.mo18428("darkgray", "#a9a9a9");
        c6785M24537.mo18428("darkgrey", "#a9a9a9");
        c6785M24537.mo18428("darkgreen", "#006400");
        c6785M24537.mo18428("darkkhaki", "#bdb76b");
        c6785M24537.mo18428("darkmagenta", "#8b008b");
        c6785M24537.mo18428("darkolivegreen", "#556b2f");
        c6785M24537.mo18428("darkorange", "#ff8c00");
        c6785M24537.mo18428("darkorchid", "#9932cc");
        c6785M24537.mo18428("darkred", "#8b0000");
        c6785M24537.mo18428("darksalmon", "#e9967a");
        c6785M24537.mo18428("darkseagreen", "#8fbc8f");
        c6785M24537.mo18428("darkslateblue", "#483d8b");
        c6785M24537.mo18428("darkslategray", "#2f4f4f");
        c6785M24537.mo18428("darkslategrey", "#2f4f4f");
        c6785M24537.mo18428("darkturquoise", "#00ced1");
        c6785M24537.mo18428("darkviolet", "#9400d3");
        c6785M24537.mo18428("deeppink", "#ff1493");
        c6785M24537.mo18428("deepskyblue", "#00bfff");
        c6785M24537.mo18428("dimgray", "#696969");
        c6785M24537.mo18428("dimgrey", "#696969");
        c6785M24537.mo18428("dodgerblue", "#1e90ff");
        c6785M24537.mo18428("firebrick", "#b22222");
        c6785M24537.mo18428("floralwhite", "#fffaf0");
        c6785M24537.mo18428("forestgreen", "#228b22");
        c6785M24537.mo18428("fuchsia", "#ff00ff");
        c6785M24537.mo18428("gainsboro", "#dcdcdc");
        c6785M24537.mo18428("ghostwhite", "#f8f8ff");
        c6785M24537.mo18428("gold", "#ffd700");
        c6785M24537.mo18428("goldenrod", "#daa520");
        c6785M24537.mo18428("gray", "#808080");
        c6785M24537.mo18428("grey", "#808080");
        c6785M24537.mo18428("green", "#008000");
        c6785M24537.mo18428("greenyellow", "#adff2f");
        c6785M24537.mo18428("honeydew", "#f0fff0");
        c6785M24537.mo18428("hotpink", "#ff69b4");
        c6785M24537.mo18428("indianred", "#cd5c5c");
        c6785M24537.mo18428("indigo", "#4b0082");
        c6785M24537.mo18428("ivory", "#fffff0");
        c6785M24537.mo18428("khaki", "#f0e68c");
        c6785M24537.mo18428("lavender", "#e6e6fa");
        c6785M24537.mo18428("lavenderblush", "#fff0f5");
        c6785M24537.mo18428("lawngreen", "#7cfc00");
        c6785M24537.mo18428("lemonchiffon", "#fffacd");
        c6785M24537.mo18428("lightblue", "#add8e6");
        c6785M24537.mo18428("lightcoral", "#f08080");
        c6785M24537.mo18428("lightcyan", "#e0ffff");
        c6785M24537.mo18428("lightgoldenrodyellow", "#fafad2");
        c6785M24537.mo18428("lightgray", "#d3d3d3");
        c6785M24537.mo18428("lightgrey", "#d3d3d3");
        c6785M24537.mo18428("lightgreen", "#90ee90");
        c6785M24537.mo18428("lightpink", "#ffb6c1");
        c6785M24537.mo18428("lightsalmon", "#ffa07a");
        c6785M24537.mo18428("lightseagreen", "#20b2aa");
        c6785M24537.mo18428("lightskyblue", "#87cefa");
        c6785M24537.mo18428("lightslategray", "#778899");
        c6785M24537.mo18428("lightslategrey", "#778899");
        c6785M24537.mo18428("lightsteelblue", "#b0c4de");
        c6785M24537.mo18428("lightyellow", "#ffffe0");
        c6785M24537.mo18428("lime", "#00ff00");
        c6785M24537.mo18428("limegreen", "#32cd32");
        c6785M24537.mo18428("linen", "#faf0e6");
        c6785M24537.mo18428("magenta", "#ff00ff");
        c6785M24537.mo18428("maroon", "#800000");
        c6785M24537.mo18428("mediumaquamarine", "#66cdaa");
        c6785M24537.mo18428("mediumblue", "#0000cd");
        c6785M24537.mo18428("mediumorchid", "#ba55d3");
        c6785M24537.mo18428("mediumpurple", "#9370db");
        c6785M24537.mo18428("mediumseagreen", "#3cb371");
        c6785M24537.mo18428("mediumslateblue", "#7b68ee");
        c6785M24537.mo18428("mediumspringgreen", "#00fa9a");
        c6785M24537.mo18428("mediumturquoise", "#48d1cc");
        c6785M24537.mo18428("mediumvioletred", "#c71585");
        c6785M24537.mo18428("midnightblue", "#191970");
        c6785M24537.mo18428("mintcream", "#f5fffa");
        c6785M24537.mo18428("mistyrose", "#ffe4e1");
        c6785M24537.mo18428("moccasin", "#ffe4b5");
        c6785M24537.mo18428("navajowhite", "#ffdead");
        c6785M24537.mo18428("navy", "#000080");
        c6785M24537.mo18428("oldlace", "#fdf5e6");
        c6785M24537.mo18428("olive", "#808000");
        c6785M24537.mo18428("olivedrab", "#6b8e23");
        c6785M24537.mo18428("orange", "#ffa500");
        c6785M24537.mo18428("orangered", "#ff4500");
        c6785M24537.mo18428("orchid", "#da70d6");
        c6785M24537.mo18428("palegoldenrod", "#eee8aa");
        c6785M24537.mo18428("palegreen", "#98fb98");
        c6785M24537.mo18428("paleturquoise", "#afeeee");
        c6785M24537.mo18428("palevioletred", "#db7093");
        c6785M24537.mo18428("papayawhip", "#ffefd5");
        c6785M24537.mo18428("peachpuff", "#ffdab9");
        c6785M24537.mo18428("peru", "#cd853f");
        c6785M24537.mo18428("pink", "#ffc0cb");
        c6785M24537.mo18428("plum", "#dda0dd");
        c6785M24537.mo18428("powderblue", "#b0e0e6");
        c6785M24537.mo18428("purple", "#800080");
        c6785M24537.mo18428("rebeccapurple", "#663399");
        c6785M24537.mo18428("red", "#ff0000");
        c6785M24537.mo18428("rosybrown", "#bc8f8f");
        c6785M24537.mo18428("royalblue", "#4169e1");
        c6785M24537.mo18428("saddlebrown", "#8b4513");
        c6785M24537.mo18428("salmon", "#fa8072");
        c6785M24537.mo18428("sandybrown", "#f4a460");
        c6785M24537.mo18428("seagreen", "#2e8b57");
        c6785M24537.mo18428("seashell", "#fff5ee");
        c6785M24537.mo18428("sienna", "#a0522d");
        c6785M24537.mo18428("silver", "#c0c0c0");
        c6785M24537.mo18428("skyblue", "#87ceeb");
        c6785M24537.mo18428("slateblue", "#6a5acd");
        c6785M24537.mo18428("slategray", "#708090");
        c6785M24537.mo18428("slategrey", "#708090");
        c6785M24537.mo18428("snow", "#fffafa");
        c6785M24537.mo18428("springgreen", "#00ff7f");
        c6785M24537.mo18428("steelblue", "#4682b4");
        c6785M24537.mo18428("tan", "#d2b48c");
        c6785M24537.mo18428("teal", "#008080");
        c6785M24537.mo18428("thistle", "#d8bfd8");
        c6785M24537.mo18428("tomato", "#ff6347");
        c6785M24537.mo18428("turquoise", "#40e0d0");
        c6785M24537.mo18428("violet", "#ee82ee");
        c6785M24537.mo18428("wheat", "#f5deb3");
        c6785M24537.mo18428("white", "#ffffff");
        c6785M24537.mo18428("whitesmoke", "#f5f5f5");
        c6785M24537.mo18428("yellow", "#ffff00");
        c6785M24537.mo18428("yellowgreen", "#9acd32");
        f74754 = c6785M24537.mo18429();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51596(String str) {
        String strTrim = str.trim();
        if (strTrim.startsWith("#")) {
            return strTrim;
        }
        if ("none".equals(strTrim)) {
            return "#00000000";
        }
        if (strTrim.startsWith("rgb(") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            String[] strArrSplit = strTrim.substring(4, strTrim.length() - 1).split(",");
            if (strArrSplit.length != 3) {
                throw new IllegalArgumentException(str);
            }
            StringBuilder sbM32307 = C13325.m32307(7, "#");
            for (int i = 0; i < 3; i++) {
                sbM32307.append(String.format("%02X", Integer.valueOf(m51595(strArrSplit[i].trim(), str))));
            }
            return sbM32307.toString();
        }
        if (!strTrim.startsWith("rgba(") || !strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return (String) f74754.get(strTrim.toLowerCase(Locale.ENGLISH));
        }
        String[] strArrSplit2 = strTrim.substring(5, strTrim.length() - 1).split(",");
        if (strArrSplit2.length != 4) {
            throw new IllegalArgumentException(str);
        }
        StringBuilder sbM32308 = C13325.m32307(9, "#");
        for (int i2 = 0; i2 < 4; i2++) {
            sbM32308.append(String.format("%02X", Integer.valueOf(m51595(strArrSplit2[(i2 + 3) % 4].trim(), str))));
        }
        return sbM32308.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51595(String str, String str2) {
        try {
            return str.endsWith("%") ? Math.max(0, Math.min(255, Math.round((Float.parseFloat(str.substring(0, str.length() - 1)) * 255.0f) / 100.0f))) : Math.max(0, Math.min(255, Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str2);
        }
    }
}
