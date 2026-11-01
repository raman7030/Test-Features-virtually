package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5884 implements InterfaceC19748, AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f14471;

    /* JADX INFO: renamed from: ۙ */
    public int f14472;

    /* JADX INFO: renamed from: ۛ */
    public C5486 f14473;

    /* JADX INFO: renamed from: ۤ */
    public C6827 f14474;

    /* JADX INFO: renamed from: ۨ */
    public final C14443 f14475;

    /* JADX INFO: renamed from: ۫ */
    public C7896 f14476;

    /* JADX INFO: renamed from: ۬ */
    public int f14477;

    /* JADX INFO: renamed from: ᩶ */
    public C20637 f14478;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f14479;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f14480;

    /* JADX INFO: renamed from: ᩺ */
    public C12192 f14481;

    public C5884(C14443 c14443, int i) {
        this.f14475 = c14443;
        this.f14471 = i;
    }

    @Override // p067l.InterfaceC19748
    /* JADX INFO: renamed from: ֫ */
    public final void mo13231(int i, int i2) throws IOException {
        if (i2 >= 0) {
            long j = ((long) i) + ((long) i2);
            C14443 c14443 = this.f14475;
            if (j <= c14443.length()) {
                this.f14477 = i;
                this.f14472 = i2;
                this.f14481 = new C12192(c14443, i, i2, this.f14471);
                return;
            }
        }
        throw new IOException("Invalid migration page range");
    }

    @Override // p067l.InterfaceC19748
    /* JADX INFO: renamed from: ֫ */
    public final void mo13232(int i, long j, InputStream inputStream) {
        int i2 = this.f14471;
        if (i == 261) {
            this.f14478 = C20637.m46646(i2, j, inputStream);
            return;
        }
        switch (i) {
            case 256:
                this.f14476 = C7896.m18241(i2, j, inputStream);
                break;
            case 257:
                this.f14480 = m13224(j, inputStream);
                this.f14473 = C5486.m12122(new ByteArrayInputStream(this.f14480), j, i2);
                break;
            case 258:
                this.f14479 = m13224(j, inputStream);
                this.f14474 = C6827.m15642(new ByteArrayInputStream(this.f14479), j, i2);
                break;
            default:
                this.f14481.m28156(i, j, inputStream);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m13224(long j, InputStream inputStream) throws IOException {
        if (j < 0 || j > this.f14471) {
            throw new IOException("Migration app field exceeds limit");
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new IOException("Truncated migration app field");
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13230() throws IOException {
        C20637 c20637 = this.f14478;
        if (c20637 == null || this.f14476 == null || this.f14473 == null || this.f14474 == null || this.f14481 == null) {
            throw new IOException("Incomplete migration app fields");
        }
        if ((c20637.m46649() == 0 && this.f14477 != 0) || (this.f14478.m46649() == this.f14478.m46653() - 1 && ((long) this.f14477) + ((long) this.f14472) != this.f14475.length())) {
            throw new IOException("Migration page range disagrees with fragment manifest");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C12192 c12192 = this.f14481;
        if (c12192 != null) {
            c12192.close();
        }
    }
}
