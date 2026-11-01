package p067l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9649 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f26559;

    /* JADX INFO: renamed from: ۙ */
    public final C4305 f26560;

    /* JADX INFO: renamed from: ᩶ */
    public final Closeable f26561;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f26562;

    /* JADX INFO: renamed from: ᩹ */
    public final FutureC5767 f26563 = new FutureC5767();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m22440() {
        if (!this.f26559 && !this.f26562) {
            this.f26559 = true;
            try {
                C4081.f8988.execute(new Runnable() { // from class: l.ܰᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9649 c9649 = this.f45458;
                        c9649.getClass();
                        try {
                            c9649.close();
                        } catch (IOException unused) {
                        }
                    }
                });
            } catch (RuntimeException unused) {
                this.f26559 = false;
            }
        }
    }

    public C9649(C4305 c4305, Closeable closeable) {
        this.f26560 = c4305;
        this.f26561 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        synchronized (this) {
            z = this.f26562;
            this.f26562 = true;
        }
        if (!z) {
            try {
                this.f26561.close();
                this.f26563.m12889((Object) null);
            } catch (Throwable th) {
                try {
                    this.f26563.m12891(th);
                } catch (Throwable th2) {
                    C4305.m8751(this.f26560, this);
                    throw th2;
                }
            }
            C4305.m8751(this.f26560, this);
        }
        try {
            this.f26563.m12907();
        } catch (C15154 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new IOException("Input close failed", cause);
            }
            throw ((Error) cause);
        }
    }
}
