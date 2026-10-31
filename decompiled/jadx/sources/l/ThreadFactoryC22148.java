package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩹۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC22148 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f71853;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f71854;

    public ThreadFactoryC22148(String str, boolean z) {
        this.f71854 = str;
        this.f71853 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f71854);
        thread.setDaemon(this.f71853);
        return thread;
    }
}
