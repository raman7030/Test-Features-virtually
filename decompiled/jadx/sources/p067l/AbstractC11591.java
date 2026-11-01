package p067l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9G4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11591 implements Closeable {

    /* JADX INFO: renamed from: ᩶ */
    public long f32334;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f32335;

    /* JADX INFO: renamed from: ᩹ */
    public int f32336;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo25182();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo25183(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public final void m26687(C2460 c2460, int i) {
        this.f32336 = 0;
        byte[] bArr = this.f32335;
        if (bArr == null || bArr.length != 65536) {
            this.f32335 = new byte[65536];
        }
        byte[] bArr2 = this.f32335;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int iMo25183 = mo25183(bArr2);
                c2460.m28102(iMo25183, bArr2);
                this.f32334 += (long) iMo25183;
                this.f32336 += iMo25183;
            } catch (IOException e) {
                throw new C12776(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26686(C2460 c2460) {
        this.f32336 = 0;
        byte[] bArr = this.f32335;
        if (bArr == null || bArr.length != 65536) {
            this.f32335 = new byte[65536];
        }
        byte[] bArr2 = this.f32335;
        try {
            int iMo25183 = mo25183(bArr2);
            c2460.m28102(iMo25183, bArr2);
            this.f32334 += (long) iMo25183;
            this.f32336 += iMo25183;
        } catch (IOException e) {
            throw new C12776(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m26689() {
        return this.f32334;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m26688() {
        return this.f32336;
    }
}
