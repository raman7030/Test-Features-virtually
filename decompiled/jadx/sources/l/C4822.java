package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C58G */
/* JADX INFO: loaded from: classes3.dex */
public final class C4822 extends AbstractC2143 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile C4822 f15245;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12583 f15246;

    public C4822() {
        super(1);
        this.f15246 = new C12583();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4822 m14046() {
        if (f15245 != null) {
            return f15245;
        }
        synchronized (C4822.class) {
            if (f15245 == null) {
                f15245 = new C4822();
            }
        }
        return f15245;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14047(Runnable runnable) {
        this.f15246.m30847(runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14048() {
        this.f15246.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
