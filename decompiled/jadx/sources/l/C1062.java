package l;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1062 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f3908;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9591 f3909;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f3910 = new CountDownLatch(2);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f3911 = new AtomicReference();

    public C1062(C9591 c9591) {
        this.f3909 = c9591;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3632(C12392 c12392, CharSequence charSequence, AbstractC15440 abstractC15440, C12392 c12393, CharSequence charSequence2, AbstractC15440 abstractC15441) throws Throwable {
        boolean z;
        RunnableC5296 runnableC5296 = new RunnableC5296(this, c12392, charSequence, abstractC15440);
        RunnableC5296 runnableC5297 = new RunnableC5296(this, c12393, charSequence2, abstractC15441);
        boolean z2 = false;
        try {
            runnableC5296.m15221();
            runnableC5297.m15221();
            while (this.f3910.getCount() != 0) {
                if (m3629()) {
                    runnableC5296.m15222();
                    runnableC5297.m15222();
                }
                try {
                    try {
                        this.f3910.await(20L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        this.f3908 = true;
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
            while (m3629() && (c12392.m30370() || c12393.m30370())) {
                c12392.m30462();
                c12393.m30462();
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                    this.f3908 = true;
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Throwable th2 = (Throwable) this.f3911.get();
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            return !m3629();
        } catch (Throwable th3) {
            th = th3;
            z = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m3629() {
        return this.f3908 || this.f3911.get() != null || this.f3909.f29114.m20039();
    }
}
