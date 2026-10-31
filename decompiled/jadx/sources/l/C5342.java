package l;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: renamed from: l.ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W593 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C5342 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16662 = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }
}
