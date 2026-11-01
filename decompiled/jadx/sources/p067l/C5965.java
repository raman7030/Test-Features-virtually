package p067l;

import java.security.AccessControlContext;

/* JADX INFO: renamed from: l.ۘۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes2.dex */
public class C5965 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final C18705 f14761;

    /* JADX INFO: renamed from: ᩹ */
    public final C19376 f14762;

    /* JADX INFO: renamed from: ֫ */
    public void mo9750() {
    }

    public C5965(C18705 c18705, ClassLoader classLoader) {
        super("aFJWorkerThread");
        C7306.m16876(this, classLoader);
        this.f14761 = c18705;
        this.f14762 = c18705.m42683(this);
    }

    public C5965(C18705 c18705, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aFJWorkerThread");
        super.setContextClassLoader(classLoader);
        C7306.m16877(this, accessControlContext);
        C7306.m16875(this);
        this.f14761 = c18705;
        this.f14762 = c18705.m42683(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C18705 c18705 = this.f14761;
        C19376 c19376 = this.f14762;
        if (c19376.f57837 == null) {
            try {
                c18705.m42687(c19376);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            c18705.m42684(this, th);
        }
    }
}
