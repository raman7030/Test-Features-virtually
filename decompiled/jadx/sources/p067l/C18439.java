package p067l;

import android.os.Build;
import android.widget.EdgeEffect;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܽ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18439 {

    /* JADX INFO: renamed from: ֫ */
    public static final boolean f55148;

    /* JADX INFO: renamed from: ۧ */
    public static final Field f55149;

    static {
        boolean z = Build.VERSION.SDK_INT >= 31;
        f55148 = z;
        Field field = null;
        if (z) {
            try {
                C24587.class.getDeclaredField("֫").setAccessible(true);
                try {
                    Field declaredField = EdgeEffect.class.getDeclaredField("mEdgeEffectType");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Exception unused) {
                }
                f55149 = field;
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        f55149 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42005(EdgeEffect edgeEffect) {
        Field field;
        if (!f55148 || (field = f55149) == null) {
            return;
        }
        try {
            field.setInt(edgeEffect, 0);
        } catch (Exception unused) {
        }
    }
}
