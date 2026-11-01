package p067l;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4265 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AtomicReference f9458;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AtomicBoolean f9459;

    /* JADX INFO: renamed from: ۫ */
    public final C5738 f9460;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C16207 f9461;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC18588 f9462;

    /* JADX INFO: renamed from: ᩸ */
    public final ThreadLocal f9463;

    /* JADX INFO: renamed from: ᩹ */
    public final String f9464;

    public RunnableC4265(C5738 c5738, ThreadLocal threadLocal, String str, InterfaceC18588 interfaceC18588, AtomicBoolean atomicBoolean, C16207 c16207, AtomicReference atomicReference) {
        this.f9462 = interfaceC18588;
        this.f9459 = atomicBoolean;
        this.f9461 = c16207;
        this.f9458 = atomicReference;
        this.f9460 = c5738;
        this.f9463 = threadLocal;
        this.f9464 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C5738 c5738 = this.f9460;
        if (this.f9462.mo3924()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f9459;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            MessageDigest messageDigest = (MessageDigest) this.f9463.get();
            C12826.requireNonNull(messageDigest);
            C16111.m36661(messageDigest, this.f9461.m36902().m44448(c5738));
            if (Base64.encodeToString(messageDigest.digest(), 2).equals(this.f9464)) {
                return;
            }
            c5738.m12794();
            atomicBoolean.set(true);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            do {
                atomicReference = this.f9458;
                if (atomicReference.compareAndSet(null, th)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }
}
