package p067l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;

/* JADX INFO: renamed from: l.ۖۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4624 extends C5965 {

    /* JADX INFO: renamed from: ۙ */
    public static final ThreadGroup f10370 = (ThreadGroup) AccessController.doPrivileged(new C17363());

    /* JADX INFO: renamed from: ᩶ */
    public static final AccessControlContext f10371 = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public C4624(C18705 c18705) {
        super(c18705, ClassLoader.getSystemClassLoader(), f10370, f10371);
    }

    @Override // p067l.C5965
    /* JADX INFO: renamed from: ֫ */
    public final void mo9750() {
        C7306.m16875(this);
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }
}
