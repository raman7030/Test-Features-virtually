package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2267 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5377 f7358;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f7359;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7360 = 1;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C5377 c5377;
        int i = this.f7360;
        if (i <= 0) {
            throw new IllegalStateException("Session metadata already released");
        }
        int i2 = i - 1;
        this.f7360 = i2;
        if (i2 == 0 && (c5377 = this.f7358) != null) {
            c5377.close();
        }
    }

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7497() {
        int i = this.f7360;
        if (i == 0) {
            throw new IllegalStateException("Session metadata is closed");
        }
        this.f7360 = i + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m7496() {
        return this.f7359;
    }

    public C2267(byte[] bArr, C5377 c5377) {
        this.f7359 = bArr;
        this.f7358 = c5377;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2267 m7494(C1143 c1143, byte[] bArr) {
        if (bArr.length > 8192) {
            throw new IllegalArgumentException("Session metadata is too large");
        }
        C5377 c5377M3921 = c1143 == null ? null : c1143.m3921((((long) bArr.length) + 23) & (-8));
        try {
            return new C2267((byte[]) bArr.clone(), c5377M3921);
        } catch (Error | RuntimeException e) {
            if (c5377M3921 != null) {
                c5377M3921.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2267 m7495(C21605 c21605, long j, C7493 c7493) throws IOException {
        int i = c7493.f23082;
        if (i > 8192) {
            throw new IOException("Session metadata is too large");
        }
        C5377 c5377M3921 = c21605.f69370.m3921((((long) i) + 23) & (-8));
        try {
            return new C2267(c21605.m48802(j, c7493), c5377M3921);
        } catch (IOException | Error | RuntimeException e) {
            c5377M3921.close();
            throw e;
        }
    }
}
