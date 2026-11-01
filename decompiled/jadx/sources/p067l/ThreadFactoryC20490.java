package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ᩴ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC20490 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC3439(3, runnable), "GalleryPrefetch");
    }
}
