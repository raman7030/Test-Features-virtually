package l;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 71JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12359 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f37046;

    static {
        try {
            Field declaredField = C13064.class.getDeclaredField("ۖ֫");
            f37046 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m29988(C13064 c13064, int i) {
        return c13064.m31656(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29990(C13064 c13064) {
        View viewM31656 = c13064.m31656(8388611);
        return viewM31656 != null && ((C15180) viewM31656.getLayoutParams()).f46374 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m29987(C13064 c13064, View view) {
        c13064.getClass();
        return ((C15180) view.getLayoutParams()).f46373;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29989(C13064 c13064, View view, float f) {
        c13064.m31646(f, view);
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (f == 1.0f) {
            c15180.f46374 = (c15180.f46374 | 1) & (-3);
        } else if (f == 0.0f) {
            c15180.f46374 &= -4;
        } else {
            c15180.f46374 = (c15180.f46374 | 2) & (-2);
        }
        try {
            f37046.setFloat(c13064, f);
            c13064.invalidate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
