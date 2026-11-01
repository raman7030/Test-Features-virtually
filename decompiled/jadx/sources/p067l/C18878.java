package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܿ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18878 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C22902 f56367;

    /* JADX INFO: renamed from: ۙ */
    public C11229 f56368;

    /* JADX INFO: renamed from: ᩶ */
    public final C21561 f56369;

    /* JADX INFO: renamed from: ᩸ */
    public C9256 f56370;

    /* JADX INFO: renamed from: ᩹ */
    public final C10558 f56371;

    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #11 {all -> 0x002d, blocks: (B:14:0x0015, B:16:0x0019, B:17:0x001b, B:20:0x0020, B:21:0x0025), top: B:96:0x0015, outer: #8, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #3 {all -> 0x0074, blocks: (B:46:0x005d, B:48:0x0061, B:49:0x0063, B:52:0x0068, B:53:0x006d), top: B:81:0x005d, outer: #8, inners: #0 }] */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C9256 c9256;
        C9256 c9257;
        C11229 c11229 = this.f56368;
        if (c11229 == null) {
            return;
        }
        this.f56368 = null;
        try {
            c11229.close();
            try {
                C22902 c22902 = this.f56367;
                if (c22902 == null) {
                    c9257 = this.f56370;
                    if (c9257 != null) {
                        this.f56370 = null;
                        c9257.close();
                    }
                    this.f56369.close();
                    return;
                }
                c22902.close();
                try {
                    c9257 = this.f56370;
                    if (c9257 != null) {
                        this.f56370 = null;
                        try {
                            c9257.close();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f56369.close();
                    return;
                } catch (Throwable th) {
                    this.f56369.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C9256 c9258 = this.f56370;
                    if (c9258 != null) {
                        this.f56370 = null;
                        try {
                            c9258.close();
                        } catch (IOException e2) {
                            throw new UncheckedIOException(e2);
                        }
                    }
                    this.f56369.close();
                    throw th2;
                } catch (Throwable th3) {
                    this.f56369.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.f56367 == null) {
                    c9256 = this.f56370;
                    if (c9256 != null) {
                        this.f56370 = null;
                        c9256.close();
                    }
                    this.f56369.close();
                    throw th4;
                }
                this.f56367.close();
                try {
                    c9256 = this.f56370;
                    if (c9256 != null) {
                        this.f56370 = null;
                        try {
                            c9256.close();
                        } catch (IOException e3) {
                            throw new UncheckedIOException(e3);
                        }
                    }
                    this.f56369.close();
                    throw th4;
                } catch (Throwable th5) {
                    this.f56369.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                try {
                    C9256 c9259 = this.f56370;
                    if (c9259 != null) {
                        this.f56370 = null;
                        try {
                            c9259.close();
                        } catch (IOException e4) {
                            throw new UncheckedIOException(e4);
                        }
                    }
                    this.f56369.close();
                    throw th6;
                } catch (Throwable th7) {
                    this.f56369.close();
                    throw th7;
                }
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] m42961() {
        return (byte[]) m42960().f31227.clone();
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized UUID m42962() {
        m42960();
        return this.f56367.f72077;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized C24913 m42963() {
        C24913 c24913;
        C11229 c11229M42960 = m42960();
        C5056 c5056 = new C5056(c11229M42960.f31230, c11229M42960.f31234);
        C4523 c4523M26009 = c11229M42960.m26009();
        try {
            this.f56371.m24341(c11229M42960);
            C22902 c22902 = this.f56367;
            C4563 c4563 = c11229M42960.f31231;
            if (c4563 == null) {
                c4563 = new C4563();
            }
            c24913 = new C24913(c22902, c5056, c4523M26009, c4563, this.f56371, this.f56369, C14620.f41739, 0);
            c24913.f79563 = c11229M42960.f31224;
            c24913.f79557 = this.f56370;
            this.f56370 = null;
            this.f56368 = null;
            c11229M42960.close();
        } catch (Throwable th) {
            try {
                c5056.close();
                throw th;
            } finally {
                c4523M26009.close();
            }
        }
        return c24913;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized long m42964() {
        return m42960().f31225;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized C14443 m42965() {
        C11229 c11229M42960;
        c11229M42960 = m42960();
        return new C14443(c11229M42960.f31230, c11229M42960.f31234);
    }

    public C18878(C22902 c22902, C10558 c10558, C11229 c11229, C21561 c21561) {
        this.f56367 = c22902;
        this.f56371 = c10558;
        this.f56368 = c11229;
        this.f56369 = c21561;
    }

    /* JADX INFO: renamed from: ۜ */
    private C11229 m42960() {
        C11229 c11229 = this.f56368;
        if (c11229 != null) {
            return c11229;
        }
        throw new IllegalStateException("Recovery handle is closed");
    }
}
