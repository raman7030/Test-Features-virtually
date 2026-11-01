package p067l;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩻ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC24644 implements ThreadFactory {
    public ThreadFactoryC24644() {
    }

    public /* synthetic */ ThreadFactoryC24644(int i) {
        this();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        final Thread thread = new Thread(null, runnable, "commons-pool-evictor");
        thread.setDaemon(true);
        AccessController.doPrivileged(new PrivilegedAction() { // from class: l.ܳۘ֡
            @Override // java.security.PrivilegedAction
            public final Object run() {
                thread.setContextClassLoader(ThreadFactoryC24644.class.getClassLoader());
                return null;
            }
        });
        return thread;
    }
}
