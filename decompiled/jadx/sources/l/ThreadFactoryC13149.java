package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.۬ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6M7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC13149 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "GalleryWebpDecode");
    }
}
