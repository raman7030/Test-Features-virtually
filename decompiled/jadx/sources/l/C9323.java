package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9323 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2267 f28275;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5131 f28276;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f28277;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final IOException f28278;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f28279;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final IOException f28280;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C8617 f28281;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11999 f28282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2309 f28283;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23433 f28284;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f28285;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f28286;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C2267 m24000() {
        C2267 c2267;
        c2267 = this.f28275;
        if (c2267 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        c2267.m7497();
        return c2267;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m24001() {
        if (this.f28275 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f28279;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C11999 m24002() {
        if (this.f28275 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f28282;
    }

    public C9323(C8617 c8617, C11999 c11999, C2267 c2267, C2309 c2309, C5131 c5131, C23433 c23433, long j, IOException iOException, IOException iOException2) {
        c8617.f26325.m48811();
        this.f28281 = c8617;
        this.f28282 = c11999;
        this.f28275 = c2267;
        this.f28283 = c2309;
        this.f28276 = c5131;
        this.f28279 = c2267.f7359;
        this.f28284 = c23433;
        this.f28277 = c23433.f75241;
        this.f28286 = c23433.f75238;
        this.f28285 = j;
        this.f28278 = iOException;
        this.f28280 = iOException2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C2267 c2267 = this.f28275;
            if (c2267 == null) {
                return;
            }
            this.f28275 = null;
            this.f28279 = null;
            this.f28282 = null;
            this.f28283 = null;
            this.f28276 = null;
            try {
                c2267.close();
            } finally {
                this.f28281.f26325.m48812();
            }
        }
    }
}
