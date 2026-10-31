package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.֨ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D6OL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Unsafe f3616;

    static {
        Field declaredField;
        try {
            try {
                declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            } catch (NoSuchFieldException unused) {
                declaredField = Unsafe.class.getDeclaredField("THE_ONE");
            }
            declaredField.setAccessible(true);
            f3616 = (Unsafe) declaredField.get(null);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
