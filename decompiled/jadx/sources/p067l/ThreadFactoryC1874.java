package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩷ۤ */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC1874 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1174(runnable);
    }
}
