package p067l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.֨ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D6OL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3282 {

    /* JADX INFO: renamed from: ֫ */
    public static final Unsafe f6392;

    static {
        Field declaredField;
        try {
            try {
                declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            } catch (NoSuchFieldException unused) {
                declaredField = Unsafe.class.getDeclaredField("THE_ONE");
            }
            declaredField.setAccessible(true);
            f6392 = (Unsafe) declaredField.get(null);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
