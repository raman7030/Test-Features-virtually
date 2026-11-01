package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۙᩴ */
/* JADX INFO: compiled from: C58G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1081 extends AbstractC4406 {

    /* JADX INFO: renamed from: ܽ */
    public static volatile C1081 f18078;

    /* JADX INFO: renamed from: ۧ */
    public C1466 f18079;

    public C1081() {
        super(1);
        this.f18079 = new C1466();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1081 m15926() {
        if (f18078 != null) {
            return f18078;
        }
        synchronized (C1081.class) {
            if (f18078 == null) {
                f18078 = new C1081();
            }
        }
        return f18078;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15927(Runnable runnable) {
        this.f18079.m32924(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15928() {
        this.f18079.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
