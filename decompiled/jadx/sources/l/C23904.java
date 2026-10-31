package l;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes.dex */
public final class C23904 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77286;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77287;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77288;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77289 = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f77290;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PointF f77291;

    static {
        String str = C3603.f11424;
        Locale locale = Locale.US;
        f77286 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f77288 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f77287 = Pattern.compile("\\\\an(\\d+)");
    }

    public C23904(int i, PointF pointF) {
        this.f77290 = i;
        this.f77291 = pointF;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23904 m52657(String str) {
        int iM18846;
        Matcher matcher = f77289.matcher(str);
        PointF pointF = null;
        int i = -1;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            try {
                PointF pointFM52658 = m52658(strGroup);
                if (pointFM52658 != null) {
                    pointF = pointFM52658;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f77287.matcher(strGroup);
                if (matcher2.find()) {
                    String strGroup2 = matcher2.group(1);
                    strGroup2.getClass();
                    iM18846 = C6971.m18846(strGroup2);
                } else {
                    iM18846 = -1;
                }
                if (iM18846 != -1) {
                    i = iM18846;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new C23904(i, pointF);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m52659(String str) {
        return f77289.matcher(str).replaceAll("");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PointF m52658(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f77286.matcher(str);
        Matcher matcher2 = f77288.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                C19956.m46035("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f, Float.parseFloat(strGroup2.trim()));
    }
}
