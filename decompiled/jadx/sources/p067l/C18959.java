package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܿܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C18959 extends C12925 {

    /* JADX INFO: renamed from: ۨ */
    public static C18959 f56512;

    /* JADX INFO: renamed from: ۖ */
    public static /* synthetic */ C18959 m43082() {
        return new C18959();
    }

    /* JADX INFO: renamed from: ۘ */
    public static synchronized C18959 m43083() {
        C18959 c18959;
        c18959 = f56512;
        if (c18959 == null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                try {
                    c18959 = (C18959) C4081.f8988.submit(new CallableC19630()).get();
                    f56512 = c18959;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    c18959 = new C18959();
                    f56512 = c18959;
                } catch (C20777 e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return c18959;
    }

    public C18959() {
        super(new C9376());
    }
}
