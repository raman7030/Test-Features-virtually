package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJW */
/* JADX INFO: loaded from: classes.dex */
public final class C24494 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC11500 f77498;

    static {
        C8817 c8817M26550 = AbstractC11500.m26550();
        c8817M26550.mo20376("aliceblue", "#f0f8ff");
        c8817M26550.mo20376("antiquewhite", "#faebd7");
        c8817M26550.mo20376("aqua", "#00ffff");
        c8817M26550.mo20376("aquamarine", "#7fffd4");
        c8817M26550.mo20376("azure", "#f0ffff");
        c8817M26550.mo20376("beige", "#f5f5dc");
        c8817M26550.mo20376("bisque", "#ffe4c4");
        c8817M26550.mo20376("black", "#000000");
        c8817M26550.mo20376("blanchedalmond", "#ffebcd");
        c8817M26550.mo20376("blue", "#0000ff");
        c8817M26550.mo20376("blueviolet", "#8a2be2");
        c8817M26550.mo20376("brown", "#a52a2a");
        c8817M26550.mo20376("burlywood", "#deb887");
        c8817M26550.mo20376("cadetblue", "#5f9ea0");
        c8817M26550.mo20376("chartreuse", "#7fff00");
        c8817M26550.mo20376("chocolate", "#d2691e");
        c8817M26550.mo20376("coral", "#ff7f50");
        c8817M26550.mo20376("cornflowerblue", "#6495ed");
        c8817M26550.mo20376("cornsilk", "#fff8dc");
        c8817M26550.mo20376("crimson", "#dc143c");
        c8817M26550.mo20376("cyan", "#00ffff");
        c8817M26550.mo20376("darkblue", "#00008b");
        c8817M26550.mo20376("darkcyan", "#008b8b");
        c8817M26550.mo20376("darkgoldenrod", "#b8860b");
        c8817M26550.mo20376("darkgray", "#a9a9a9");
        c8817M26550.mo20376("darkgrey", "#a9a9a9");
        c8817M26550.mo20376("darkgreen", "#006400");
        c8817M26550.mo20376("darkkhaki", "#bdb76b");
        c8817M26550.mo20376("darkmagenta", "#8b008b");
        c8817M26550.mo20376("darkolivegreen", "#556b2f");
        c8817M26550.mo20376("darkorange", "#ff8c00");
        c8817M26550.mo20376("darkorchid", "#9932cc");
        c8817M26550.mo20376("darkred", "#8b0000");
        c8817M26550.mo20376("darksalmon", "#e9967a");
        c8817M26550.mo20376("darkseagreen", "#8fbc8f");
        c8817M26550.mo20376("darkslateblue", "#483d8b");
        c8817M26550.mo20376("darkslategray", "#2f4f4f");
        c8817M26550.mo20376("darkslategrey", "#2f4f4f");
        c8817M26550.mo20376("darkturquoise", "#00ced1");
        c8817M26550.mo20376("darkviolet", "#9400d3");
        c8817M26550.mo20376("deeppink", "#ff1493");
        c8817M26550.mo20376("deepskyblue", "#00bfff");
        c8817M26550.mo20376("dimgray", "#696969");
        c8817M26550.mo20376("dimgrey", "#696969");
        c8817M26550.mo20376("dodgerblue", "#1e90ff");
        c8817M26550.mo20376("firebrick", "#b22222");
        c8817M26550.mo20376("floralwhite", "#fffaf0");
        c8817M26550.mo20376("forestgreen", "#228b22");
        c8817M26550.mo20376("fuchsia", "#ff00ff");
        c8817M26550.mo20376("gainsboro", "#dcdcdc");
        c8817M26550.mo20376("ghostwhite", "#f8f8ff");
        c8817M26550.mo20376("gold", "#ffd700");
        c8817M26550.mo20376("goldenrod", "#daa520");
        c8817M26550.mo20376("gray", "#808080");
        c8817M26550.mo20376("grey", "#808080");
        c8817M26550.mo20376("green", "#008000");
        c8817M26550.mo20376("greenyellow", "#adff2f");
        c8817M26550.mo20376("honeydew", "#f0fff0");
        c8817M26550.mo20376("hotpink", "#ff69b4");
        c8817M26550.mo20376("indianred", "#cd5c5c");
        c8817M26550.mo20376("indigo", "#4b0082");
        c8817M26550.mo20376("ivory", "#fffff0");
        c8817M26550.mo20376("khaki", "#f0e68c");
        c8817M26550.mo20376("lavender", "#e6e6fa");
        c8817M26550.mo20376("lavenderblush", "#fff0f5");
        c8817M26550.mo20376("lawngreen", "#7cfc00");
        c8817M26550.mo20376("lemonchiffon", "#fffacd");
        c8817M26550.mo20376("lightblue", "#add8e6");
        c8817M26550.mo20376("lightcoral", "#f08080");
        c8817M26550.mo20376("lightcyan", "#e0ffff");
        c8817M26550.mo20376("lightgoldenrodyellow", "#fafad2");
        c8817M26550.mo20376("lightgray", "#d3d3d3");
        c8817M26550.mo20376("lightgrey", "#d3d3d3");
        c8817M26550.mo20376("lightgreen", "#90ee90");
        c8817M26550.mo20376("lightpink", "#ffb6c1");
        c8817M26550.mo20376("lightsalmon", "#ffa07a");
        c8817M26550.mo20376("lightseagreen", "#20b2aa");
        c8817M26550.mo20376("lightskyblue", "#87cefa");
        c8817M26550.mo20376("lightslategray", "#778899");
        c8817M26550.mo20376("lightslategrey", "#778899");
        c8817M26550.mo20376("lightsteelblue", "#b0c4de");
        c8817M26550.mo20376("lightyellow", "#ffffe0");
        c8817M26550.mo20376("lime", "#00ff00");
        c8817M26550.mo20376("limegreen", "#32cd32");
        c8817M26550.mo20376("linen", "#faf0e6");
        c8817M26550.mo20376("magenta", "#ff00ff");
        c8817M26550.mo20376("maroon", "#800000");
        c8817M26550.mo20376("mediumaquamarine", "#66cdaa");
        c8817M26550.mo20376("mediumblue", "#0000cd");
        c8817M26550.mo20376("mediumorchid", "#ba55d3");
        c8817M26550.mo20376("mediumpurple", "#9370db");
        c8817M26550.mo20376("mediumseagreen", "#3cb371");
        c8817M26550.mo20376("mediumslateblue", "#7b68ee");
        c8817M26550.mo20376("mediumspringgreen", "#00fa9a");
        c8817M26550.mo20376("mediumturquoise", "#48d1cc");
        c8817M26550.mo20376("mediumvioletred", "#c71585");
        c8817M26550.mo20376("midnightblue", "#191970");
        c8817M26550.mo20376("mintcream", "#f5fffa");
        c8817M26550.mo20376("mistyrose", "#ffe4e1");
        c8817M26550.mo20376("moccasin", "#ffe4b5");
        c8817M26550.mo20376("navajowhite", "#ffdead");
        c8817M26550.mo20376("navy", "#000080");
        c8817M26550.mo20376("oldlace", "#fdf5e6");
        c8817M26550.mo20376("olive", "#808000");
        c8817M26550.mo20376("olivedrab", "#6b8e23");
        c8817M26550.mo20376("orange", "#ffa500");
        c8817M26550.mo20376("orangered", "#ff4500");
        c8817M26550.mo20376("orchid", "#da70d6");
        c8817M26550.mo20376("palegoldenrod", "#eee8aa");
        c8817M26550.mo20376("palegreen", "#98fb98");
        c8817M26550.mo20376("paleturquoise", "#afeeee");
        c8817M26550.mo20376("palevioletred", "#db7093");
        c8817M26550.mo20376("papayawhip", "#ffefd5");
        c8817M26550.mo20376("peachpuff", "#ffdab9");
        c8817M26550.mo20376("peru", "#cd853f");
        c8817M26550.mo20376("pink", "#ffc0cb");
        c8817M26550.mo20376("plum", "#dda0dd");
        c8817M26550.mo20376("powderblue", "#b0e0e6");
        c8817M26550.mo20376("purple", "#800080");
        c8817M26550.mo20376("rebeccapurple", "#663399");
        c8817M26550.mo20376("red", "#ff0000");
        c8817M26550.mo20376("rosybrown", "#bc8f8f");
        c8817M26550.mo20376("royalblue", "#4169e1");
        c8817M26550.mo20376("saddlebrown", "#8b4513");
        c8817M26550.mo20376("salmon", "#fa8072");
        c8817M26550.mo20376("sandybrown", "#f4a460");
        c8817M26550.mo20376("seagreen", "#2e8b57");
        c8817M26550.mo20376("seashell", "#fff5ee");
        c8817M26550.mo20376("sienna", "#a0522d");
        c8817M26550.mo20376("silver", "#c0c0c0");
        c8817M26550.mo20376("skyblue", "#87ceeb");
        c8817M26550.mo20376("slateblue", "#6a5acd");
        c8817M26550.mo20376("slategray", "#708090");
        c8817M26550.mo20376("slategrey", "#708090");
        c8817M26550.mo20376("snow", "#fffafa");
        c8817M26550.mo20376("springgreen", "#00ff7f");
        c8817M26550.mo20376("steelblue", "#4682b4");
        c8817M26550.mo20376("tan", "#d2b48c");
        c8817M26550.mo20376("teal", "#008080");
        c8817M26550.mo20376("thistle", "#d8bfd8");
        c8817M26550.mo20376("tomato", "#ff6347");
        c8817M26550.mo20376("turquoise", "#40e0d0");
        c8817M26550.mo20376("violet", "#ee82ee");
        c8817M26550.mo20376("wheat", "#f5deb3");
        c8817M26550.mo20376("white", "#ffffff");
        c8817M26550.mo20376("whitesmoke", "#f5f5f5");
        c8817M26550.mo20376("yellow", "#ffff00");
        c8817M26550.mo20376("yellowgreen", "#9acd32");
        f77498 = c8817M26550.mo20377();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53992(String str) {
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
            StringBuilder sbM34407 = C15033.m34407(7, "#");
            for (int i = 0; i < 3; i++) {
                sbM34407.append(String.format("%02X", Integer.valueOf(m53991(strArrSplit[i].trim(), str))));
            }
            return sbM34407.toString();
        }
        if (!strTrim.startsWith("rgba(") || !strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return (String) f77498.get(strTrim.toLowerCase(Locale.ENGLISH));
        }
        String[] strArrSplit2 = strTrim.substring(5, strTrim.length() - 1).split(",");
        if (strArrSplit2.length != 4) {
            throw new IllegalArgumentException(str);
        }
        StringBuilder sbM34408 = C15033.m34407(9, "#");
        for (int i2 = 0; i2 < 4; i2++) {
            sbM34408.append(String.format("%02X", Integer.valueOf(m53991(strArrSplit2[(i2 + 3) % 4].trim(), str))));
        }
        return sbM34408.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53991(String str, String str2) {
        try {
            return str.endsWith("%") ? Math.max(0, Math.min(255, Math.round((Float.parseFloat(str.substring(0, str.length() - 1)) * 255.0f) / 100.0f))) : Math.max(0, Math.min(255, Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str2);
        }
    }
}
