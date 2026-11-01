package p067l;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes.dex */
public final class C25087 {

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f80037;

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f80038;

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f80039;

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f80040 = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: ֫ */
    public final int f80041;

    /* JADX INFO: renamed from: ۧ */
    public final PointF f80042;

    static {
        String str = C5792.f14228;
        Locale locale = Locale.US;
        f80037 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f80039 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f80038 = Pattern.compile("\\\\an(\\d+)");
    }

    public C25087(int i, PointF pointF) {
        this.f80041 = i;
        this.f80042 = pointF;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25087 m55066(String str) {
        int iM20800;
        Matcher matcher = f80040.matcher(str);
        PointF pointF = null;
        int i = -1;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            try {
                PointF pointFM55067 = m55067(strGroup);
                if (pointFM55067 != null) {
                    pointF = pointFM55067;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f80038.matcher(strGroup);
                if (matcher2.find()) {
                    String strGroup2 = matcher2.group(1);
                    strGroup2.getClass();
                    iM20800 = C8994.m20800(strGroup2);
                } else {
                    iM20800 = -1;
                }
                if (iM20800 != -1) {
                    i = iM20800;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new C25087(i, pointF);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m55068(String str) {
        return f80040.matcher(str).replaceAll("");
    }

    /* JADX INFO: renamed from: ۧ */
    public static PointF m55067(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f80037.matcher(str);
        Matcher matcher2 = f80039.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                C21334.m48349("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
