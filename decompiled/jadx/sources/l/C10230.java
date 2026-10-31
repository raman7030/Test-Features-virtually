package l;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10230 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f30830;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f30831;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25858() {
        try {
            if (f30830 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f30830 == null) {
                f30831 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f30830 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f30830.invoke(null, Long.valueOf(f30831))).booleanValue();
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
