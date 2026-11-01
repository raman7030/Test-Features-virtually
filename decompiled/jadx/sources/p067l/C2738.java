package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2738 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f4611 = new byte[256];

    /* JADX INFO: renamed from: ۧ */
    public final C11102 f4612;

    /* JADX INFO: renamed from: ܽ */
    public final BufferedInputStream f4613;

    /* JADX INFO: renamed from: ᩳ */
    public long f4614;

    public C2738(BufferedInputStream bufferedInputStream, C11102 c11102) {
        this.f4613 = bufferedInputStream;
        this.f4612 = c11102;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4275() {
        AbstractC24196.m53499(this.f4612);
        long j = this.f4614 + 1;
        this.f4614 = j;
        if (j > 268435456) {
            throw new IOException("GIF input exceeds byte limit");
        }
        int i = this.f4613.read();
        if (i >= 0) {
            return i;
        }
        throw new IOException("Truncated GIF container");
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m4277() {
        return m4275() | (m4275() << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4276(int i) {
        while (i > 0) {
            AbstractC24196.m53499(this.f4612);
            byte[] bArr = this.f4611;
            int i2 = this.f4613.read(bArr, 0, Math.min(i, bArr.length));
            if (i2 < 0) {
                throw new IOException("Truncated GIF container");
            }
            if (i2 == 0) {
                m4275();
                i--;
            } else {
                long j = this.f4614 + ((long) i2);
                this.f4614 = j;
                if (j > 268435456) {
                    throw new IOException("GIF input exceeds byte limit");
                }
                i -= i2;
            }
        }
    }
}
