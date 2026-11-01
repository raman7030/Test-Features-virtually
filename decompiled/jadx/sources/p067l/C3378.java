package p067l;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f6679;

    /* JADX INFO: renamed from: ۧ */
    public final C11484 f6680;

    /* JADX INFO: renamed from: ܽ */
    public final CountDownLatch f6681 = new CountDownLatch(2);

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicReference f6682 = new AtomicReference();

    public C3378(C11484 c11484) {
        this.f6680 = c11484;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5903(C14146 c14146, CharSequence charSequence, AbstractC17043 abstractC17043, C14146 c14147, CharSequence charSequence2, AbstractC17043 abstractC17044) throws Throwable {
        boolean z;
        RunnableC7402 runnableC7402 = new RunnableC7402(this, c14146, charSequence, abstractC17043);
        RunnableC7402 runnableC7403 = new RunnableC7402(this, c14147, charSequence2, abstractC17044);
        boolean z2 = false;
        try {
            runnableC7402.m17124();
            runnableC7403.m17124();
            while (this.f6681.getCount() != 0) {
                if (m5900()) {
                    runnableC7402.m17125();
                    runnableC7403.m17125();
                }
                try {
                    try {
                        this.f6681.await(20L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        this.f6679 = true;
                        z2 = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            while (m5900() && (c14146.m32434() || c14147.m32434())) {
                c14146.m32526();
                c14147.m32526();
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                    this.f6679 = true;
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Throwable th2 = (Throwable) this.f6682.get();
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            return !m5900();
        } catch (Throwable th3) {
            th = th3;
            z = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m5900() {
        return this.f6679 || this.f6682.get() != null || this.f6680.f32061.m22014();
    }
}
