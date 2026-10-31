package l;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.֡֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0075 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return run();
    }

    public static Unsafe run() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
