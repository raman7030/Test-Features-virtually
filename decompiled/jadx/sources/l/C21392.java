package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩸ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6LG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21392 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11679 f68887;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f68888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f68889;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f68890;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f68891;

    public C21392(AbstractC22967 abstractC22967) {
        this.f68889 = abstractC22967;
        this.f68887 = abstractC22967.mo6179();
        RandomAccessFile randomAccessFile = abstractC22967.mo17660() == null ? null : new RandomAccessFile(abstractC22967.mo17660(), "r");
        this.f68890 = randomAccessFile;
        if (randomAccessFile == null) {
            this.f68888 = new BufferedInputStream(abstractC22967.mo6178(), 32768);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48473(long j, byte[] bArr, int i, int i2, InterfaceC17066 interfaceC17066) {
        if (j < 0 || i2 < 0 || j > 268435456 - ((long) i2)) {
            throw new IOException("Animation input exceeds byte limit");
        }
        AbstractC22967.m51107(interfaceC17066);
        RandomAccessFile randomAccessFile = this.f68890;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j);
            while (i2 > 0) {
                AbstractC22967.m51107(interfaceC17066);
                int iMin = Math.min(i2, 32768);
                randomAccessFile.readFully(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
            return;
        }
        if (j < this.f68891) {
            C11679 c11679 = this.f68887;
            AbstractC22967 abstractC22967 = this.f68889;
            abstractC22967.m51108(c11679);
            this.f68888.close();
            this.f68888 = new BufferedInputStream(abstractC22967.mo6178(), 32768);
            this.f68891 = 0L;
        }
        while (this.f68891 < j) {
            AbstractC22967.m51107(interfaceC17066);
            long jSkip = this.f68888.skip(Math.min(j - this.f68891, X931RNG.BLOCK64_RESEED_MAX));
            if (jSkip == 0) {
                if (this.f68888.read() < 0) {
                    throw new IOException("Truncated animation input");
                }
                jSkip = 1;
            }
            this.f68891 += jSkip;
        }
        while (i2 > 0) {
            AbstractC22967.m51107(interfaceC17066);
            int i3 = this.f68888.read(bArr, i, Math.min(i2, 32768));
            if (i3 < 0) {
                throw new IOException("Truncated animation input");
            }
            if (i3 == 0) {
                int i4 = this.f68888.read();
                if (i4 < 0) {
                    throw new IOException("Truncated animation input");
                }
                bArr[i] = (byte) i4;
                i3 = 1;
            }
            i += i3;
            i2 -= i3;
            this.f68891 += (long) i3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f68890;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f68888;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
    }
}
