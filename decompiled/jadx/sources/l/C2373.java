package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;

/* JADX INFO: renamed from: l.ۖۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2373 extends C3784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadGroup f7579 = (ThreadGroup) AccessController.doPrivileged(new C15777());

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f7580 = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public C2373(C17189 c17189) {
        super(c17189, ClassLoader.getSystemClassLoader(), f7579, f7580);
    }

    @Override // l.C3784
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7689() {
        C5195.m14965(this);
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }
}
