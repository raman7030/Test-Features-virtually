package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܿܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C17456 extends C11107 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17456 f53324;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C17456 m40824() {
        return new C17456();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static synchronized C17456 m40825() {
        C17456 c17456;
        c17456 = f53324;
        if (c17456 == null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                try {
                    c17456 = (C17456) C1802.f6209.submit(new CallableC18162()).get();
                    f53324 = c17456;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    c17456 = new C17456();
                    f53324 = c17456;
                } catch (C19369 e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return c17456;
    }

    public C17456() {
        super(new C7373());
    }
}
