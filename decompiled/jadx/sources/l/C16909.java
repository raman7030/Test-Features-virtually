package l;

import android.os.Build;
import android.widget.EdgeEffect;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܽ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16909 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f51968;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Field f51969;

    static {
        boolean z = Build.VERSION.SDK_INT >= 31;
        f51968 = z;
        Field field = null;
        if (z) {
            try {
                C23379.class.getDeclaredField("֫").setAccessible(true);
                try {
                    Field declaredField = EdgeEffect.class.getDeclaredField("mEdgeEffectType");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Exception unused) {
                }
                f51969 = field;
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        f51969 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39764(EdgeEffect edgeEffect) {
        Field field;
        if (!f51968 || (field = f51969) == null) {
            return;
        }
        try {
            field.setInt(edgeEffect, 0);
        } catch (Exception unused) {
        }
    }
}
