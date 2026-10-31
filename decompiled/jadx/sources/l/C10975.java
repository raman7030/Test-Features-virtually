package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۧۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22ZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Thread f33028 = Looper.getMainLooper().getThread();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27285() {
        return f33028 == Thread.currentThread();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27286() {
        if (m27285()) {
            throw new IllegalStateException("Blocking UI wait must not be called on the UI thread");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27284() {
        Thread threadCurrentThread = Thread.currentThread();
        return f33028 == threadCurrentThread || threadCurrentThread.getName().startsWith("binder:");
    }
}
