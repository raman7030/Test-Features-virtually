package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩸ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6LG */
/* JADX INFO: loaded from: classes4.dex */
public final class C22699 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C13468 f71582;

    /* JADX INFO: renamed from: ۙ */
    public BufferedInputStream f71583;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC24196 f71584;

    /* JADX INFO: renamed from: ᩸ */
    public final RandomAccessFile f71585;

    /* JADX INFO: renamed from: ᩹ */
    public long f71586;

    public C22699(AbstractC24196 abstractC24196) {
        this.f71584 = abstractC24196;
        this.f71582 = abstractC24196.mo8381();
        RandomAccessFile randomAccessFile = abstractC24196.mo19605() == null ? null : new RandomAccessFile(abstractC24196.mo19605(), "r");
        this.f71585 = randomAccessFile;
        if (randomAccessFile == null) {
            this.f71583 = new BufferedInputStream(abstractC24196.mo8380(), 32768);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50809(long j, byte[] bArr, int i, int i2, InterfaceC18588 interfaceC18588) {
        if (j < 0 || i2 < 0 || j > 268435456 - ((long) i2)) {
            throw new IOException("Animation input exceeds byte limit");
        }
        AbstractC24196.m53499(interfaceC18588);
        RandomAccessFile randomAccessFile = this.f71585;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j);
            while (i2 > 0) {
                AbstractC24196.m53499(interfaceC18588);
                int iMin = Math.min(i2, 32768);
                randomAccessFile.readFully(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
            return;
        }
        if (j < this.f71586) {
            C13468 c13468 = this.f71582;
            AbstractC24196 abstractC24196 = this.f71584;
            abstractC24196.m53500(c13468);
            this.f71583.close();
            this.f71583 = new BufferedInputStream(abstractC24196.mo8380(), 32768);
            this.f71586 = 0L;
        }
        while (this.f71586 < j) {
            AbstractC24196.m53499(interfaceC18588);
            long jSkip = this.f71583.skip(Math.min(j - this.f71586, X931RNG.BLOCK64_RESEED_MAX));
            if (jSkip == 0) {
                if (this.f71583.read() < 0) {
                    throw new IOException("Truncated animation input");
                }
                jSkip = 1;
            }
            this.f71586 += jSkip;
        }
        while (i2 > 0) {
            AbstractC24196.m53499(interfaceC18588);
            int i3 = this.f71583.read(bArr, i, Math.min(i2, 32768));
            if (i3 < 0) {
                throw new IOException("Truncated animation input");
            }
            if (i3 == 0) {
                int i4 = this.f71583.read();
                if (i4 < 0) {
                    throw new IOException("Truncated animation input");
                }
                bArr[i] = (byte) i4;
                i3 = 1;
            }
            i += i3;
            i2 -= i3;
            this.f71586 += (long) i3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f71585;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f71583;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
    }
}
