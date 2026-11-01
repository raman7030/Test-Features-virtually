package p067l;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8K */
/* JADX INFO: loaded from: classes3.dex */
public final class C12091 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f33791;

    /* JADX INFO: renamed from: ۧ */
    public static long f33792;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27880() {
        try {
            if (f33791 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f33791 == null) {
                f33792 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f33791 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f33791.invoke(null, Long.valueOf(f33792))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
