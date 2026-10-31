package l;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1995 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f6678;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f6679;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3545 f6680;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14561 f6681;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17066 f6682;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f6683;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f6684;

    public RunnableC1995(C3545 c3545, ThreadLocal threadLocal, String str, InterfaceC17066 interfaceC17066, AtomicBoolean atomicBoolean, C14561 c14561, AtomicReference atomicReference) {
        this.f6682 = interfaceC17066;
        this.f6679 = atomicBoolean;
        this.f6681 = c14561;
        this.f6678 = atomicReference;
        this.f6680 = c3545;
        this.f6683 = threadLocal;
        this.f6684 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3545 c3545 = this.f6680;
        if (this.f6682.mo1526()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f6679;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            MessageDigest messageDigest = (MessageDigest) this.f6683.get();
            C11003.requireNonNull(messageDigest);
            C14460.m34527(messageDigest, this.f6681.m34753().m42189(c3545));
            if (Base64.encodeToString(messageDigest.digest(), 2).equals(this.f6684)) {
                return;
            }
            c3545.m10813();
            atomicBoolean.set(true);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            do {
                atomicReference = this.f6678;
                if (atomicReference.compareAndSet(null, th)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }
}
