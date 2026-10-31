package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܿ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17371 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21605 f53184;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9323 f53185;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20194 f53186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7247 f53187;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8617 f53188;

    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #11 {all -> 0x002d, blocks: (B:14:0x0015, B:16:0x0019, B:17:0x001b, B:20:0x0020, B:21:0x0025), top: B:96:0x0015, outer: #8, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #3 {all -> 0x0074, blocks: (B:46:0x005d, B:48:0x0061, B:49:0x0063, B:52:0x0068, B:53:0x006d), top: B:81:0x005d, outer: #8, inners: #0 }] */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C7247 c7247;
        C7247 c7248;
        C9323 c9323 = this.f53185;
        if (c9323 == null) {
            return;
        }
        this.f53185 = null;
        try {
            c9323.close();
            try {
                C21605 c21605 = this.f53184;
                if (c21605 == null) {
                    c7248 = this.f53187;
                    if (c7248 != null) {
                        this.f53187 = null;
                        c7248.close();
                    }
                    this.f53186.close();
                    return;
                }
                c21605.close();
                try {
                    c7248 = this.f53187;
                    if (c7248 != null) {
                        this.f53187 = null;
                        try {
                            c7248.close();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f53186.close();
                    return;
                } catch (Throwable th) {
                    this.f53186.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C7247 c7249 = this.f53187;
                    if (c7249 != null) {
                        this.f53187 = null;
                        try {
                            c7249.close();
                        } catch (IOException e2) {
                            throw new UncheckedIOException(e2);
                        }
                    }
                    this.f53186.close();
                    throw th2;
                } catch (Throwable th3) {
                    this.f53186.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.f53184 == null) {
                    c7247 = this.f53187;
                    if (c7247 != null) {
                        this.f53187 = null;
                        c7247.close();
                    }
                    this.f53186.close();
                    throw th4;
                }
                this.f53184.close();
                try {
                    c7247 = this.f53187;
                    if (c7247 != null) {
                        this.f53187 = null;
                        try {
                            c7247.close();
                        } catch (IOException e3) {
                            throw new UncheckedIOException(e3);
                        }
                    }
                    this.f53186.close();
                    throw th4;
                } catch (Throwable th5) {
                    this.f53186.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                try {
                    C7247 c72410 = this.f53187;
                    if (c72410 != null) {
                        this.f53187 = null;
                        try {
                            c72410.close();
                        } catch (IOException e4) {
                            throw new UncheckedIOException(e4);
                        }
                    }
                    this.f53186.close();
                    throw th6;
                } catch (Throwable th7) {
                    this.f53186.close();
                    throw th7;
                }
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m40710() {
        return (byte[]) m40709().f28279.clone();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m40711() {
        m40709();
        return this.f53184.f69374;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C23721 m40712() {
        C23721 c23721;
        C9323 c9323M40709 = m40709();
        C2827 c2827 = new C2827(c9323M40709.f28282, c9323M40709.f28286);
        C2267 c2267M24000 = c9323M40709.m24000();
        try {
            this.f53188.m22372(c9323M40709);
            C21605 c21605 = this.f53184;
            C2309 c2309 = c9323M40709.f28283;
            if (c2309 == null) {
                c2309 = new C2309();
            }
            c23721 = new C23721(c21605, c2827, c2267M24000, c2309, this.f53188, this.f53186, C12891.f38696, 0);
            c23721.f76814 = c9323M40709.f28276;
            c23721.f76808 = this.f53187;
            this.f53187 = null;
            this.f53185 = null;
            c9323M40709.close();
        } catch (Throwable th) {
            try {
                c2827.close();
                throw th;
            } finally {
                c2267M24000.close();
            }
        }
        return c23721;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m40713() {
        return m40709().f28277;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C12704 m40714() {
        C9323 c9323M40709;
        c9323M40709 = m40709();
        return new C12704(c9323M40709.f28282, c9323M40709.f28286);
    }

    public C17371(C21605 c21605, C8617 c8617, C9323 c9323, C20194 c20194) {
        this.f53184 = c21605;
        this.f53188 = c8617;
        this.f53185 = c9323;
        this.f53186 = c20194;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C9323 m40709() {
        C9323 c9323 = this.f53185;
        if (c9323 != null) {
            return c9323;
        }
        throw new IllegalStateException("Recovery handle is closed");
    }
}
