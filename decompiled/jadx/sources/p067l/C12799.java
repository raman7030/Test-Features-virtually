package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۧۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22ZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12799 {

    /* JADX INFO: renamed from: ֫ */
    public static final Thread f36021 = Looper.getMainLooper().getThread();

    /* JADX INFO: renamed from: ۧ */
    public static boolean m29347() {
        return f36021 == Thread.currentThread();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29348() {
        if (m29347()) {
            throw new IllegalStateException("Blocking UI wait must not be called on the UI thread");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29346() {
        Thread threadCurrentThread = Thread.currentThread();
        return f36021 == threadCurrentThread || threadCurrentThread.getName().startsWith("binder:");
    }
}
