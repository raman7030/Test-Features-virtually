package l;

import java.security.AccessControlContext;

/* JADX INFO: renamed from: l.ۘۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes2.dex */
public class C3784 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17189 f11955;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17895 f11956;

    /* JADX INFO: renamed from: ֫ */
    public void mo7689() {
    }

    public C3784(C17189 c17189, ClassLoader classLoader) {
        super("aFJWorkerThread");
        C5195.m14966(this, classLoader);
        this.f11955 = c17189;
        this.f11956 = c17189.m40438(this);
    }

    public C3784(C17189 c17189, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aFJWorkerThread");
        super.setContextClassLoader(classLoader);
        C5195.m14967(this, accessControlContext);
        C5195.m14965(this);
        this.f11955 = c17189;
        this.f11956 = c17189.m40438(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C17189 c17189 = this.f11955;
        C17895 c17895 = this.f11956;
        if (c17895.f54640 == null) {
            try {
                c17189.m40442(c17895);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            c17189.m40439(this, th);
        }
    }
}
