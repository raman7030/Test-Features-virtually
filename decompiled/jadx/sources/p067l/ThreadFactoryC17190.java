package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ܺ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC17190 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String f51171;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f51171);
    }
}
