package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4523 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C7479 f10146;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f10147;

    /* JADX INFO: renamed from: ᩹ */
    public int f10148 = 1;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C7479 c7479;
        int i = this.f10148;
        if (i <= 0) {
            throw new IllegalStateException("Session metadata already released");
        }
        int i2 = i - 1;
        this.f10148 = i2;
        if (i2 == 0 && (c7479 = this.f10146) != null) {
            c7479.close();
        }
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public final synchronized void m9579() {
        int i = this.f10148;
        if (i == 0) {
            throw new IllegalStateException("Session metadata is closed");
        }
        this.f10148 = i + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m9578() {
        return this.f10147;
    }

    public C4523(byte[] bArr, C7479 c7479) {
        this.f10147 = bArr;
        this.f10146 = c7479;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4523 m9576(C3455 c3455, byte[] bArr) {
        if (bArr.length > 8192) {
            throw new IllegalArgumentException("Session metadata is too large");
        }
        C7479 c7479M6162 = c3455 == null ? null : c3455.m6162((((long) bArr.length) + 23) & (-8));
        try {
            return new C4523((byte[]) bArr.clone(), c7479M6162);
        } catch (Error | RuntimeException e) {
            if (c7479M6162 != null) {
                c7479M6162.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4523 m9577(C22902 c22902, long j, C9490 c9490) throws IOException {
        int i = c9490.f25994;
        if (i > 8192) {
            throw new IOException("Session metadata is too large");
        }
        C7479 c7479M6162 = c22902.f72073.m6162((((long) i) + 23) & (-8));
        try {
            return new C4523(c22902.m51149(j, c9490), c7479M6162);
        } catch (IOException | Error | RuntimeException e) {
            c7479M6162.close();
            throw e;
        }
    }
}
