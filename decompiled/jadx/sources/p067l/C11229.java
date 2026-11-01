package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11229 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public C4523 f31223;

    /* JADX INFO: renamed from: ۙ */
    public C7245 f31224;

    /* JADX INFO: renamed from: ۛ */
    public final long f31225;

    /* JADX INFO: renamed from: ۤ */
    public final IOException f31226;

    /* JADX INFO: renamed from: ۨ */
    public byte[] f31227;

    /* JADX INFO: renamed from: ۫ */
    public final IOException f31228;

    /* JADX INFO: renamed from: ۬ */
    public final C10558 f31229;

    /* JADX INFO: renamed from: ܰ */
    public C13773 f31230;

    /* JADX INFO: renamed from: ᩶ */
    public C4563 f31231;

    /* JADX INFO: renamed from: ᩸ */
    public final C24639 f31232;

    /* JADX INFO: renamed from: ᩹ */
    public final long f31233;

    /* JADX INFO: renamed from: ᩺ */
    public final long f31234;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C4523 m26009() {
        C4523 c4523;
        c4523 = this.f31223;
        if (c4523 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        c4523.m9579();
        return c4523;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized byte[] m26010() {
        if (this.f31223 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f31227;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized C13773 m26011() {
        if (this.f31223 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f31230;
    }

    public C11229(C10558 c10558, C13773 c13773, C4523 c4523, C4563 c4563, C7245 c7245, C24639 c24639, long j, IOException iOException, IOException iOException2) {
        c10558.f29240.m51158();
        this.f31229 = c10558;
        this.f31230 = c13773;
        this.f31223 = c4523;
        this.f31231 = c4563;
        this.f31224 = c7245;
        this.f31227 = c4523.f10147;
        this.f31232 = c24639;
        this.f31225 = c24639.f77986;
        this.f31234 = c24639.f77983;
        this.f31233 = j;
        this.f31226 = iOException;
        this.f31228 = iOException2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C4523 c4523 = this.f31223;
            if (c4523 == null) {
                return;
            }
            this.f31223 = null;
            this.f31227 = null;
            this.f31230 = null;
            this.f31231 = null;
            this.f31224 = null;
            try {
                c4523.close();
            } finally {
                this.f31229.f29240.m51159();
            }
        }
    }
}
