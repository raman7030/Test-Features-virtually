package p067l;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 71JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14114 {

    /* JADX INFO: renamed from: ֫ */
    public static final Field f40062;

    static {
        try {
            Field declaredField = C14784.class.getDeclaredField("ۖ֫");
            f40062 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m32049(C14784 c14784, int i) {
        return c14784.m33743(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32051(C14784 c14784) {
        View viewM33743 = c14784.m33743(8388611);
        return viewM33743 != null && ((C16795) viewM33743.getLayoutParams()).f49499 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m32048(C14784 c14784, View view) {
        c14784.getClass();
        return ((C16795) view.getLayoutParams()).f49498;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32050(C14784 c14784, View view, float f) {
        c14784.m33733(f, view);
        C16795 c16795 = (C16795) view.getLayoutParams();
        if (f == 1.0f) {
            c16795.f49499 = (c16795.f49499 | 1) & (-3);
        } else if (f == 0.0f) {
            c16795.f49499 &= -4;
        } else {
            c16795.f49499 = (c16795.f49499 | 2) & (-2);
        }
        try {
            f40062.setFloat(c14784, f);
            c14784.invalidate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
