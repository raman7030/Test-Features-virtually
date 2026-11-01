package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩹۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC23418 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ boolean f74575;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f74576;

    public ThreadFactoryC23418(String str, boolean z) {
        this.f74576 = str;
        this.f74575 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f74576);
        thread.setDaemon(this.f74575);
        return thread;
    }
}
