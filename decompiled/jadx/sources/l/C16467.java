package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܽۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16467 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC6381 f50614;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50615;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC2771 f50616;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC13644 f50617;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15469 f50618;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f50620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50619 = true;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f50613 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f50622 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f50612 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f50610 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f50611 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f50621 = new byte[6];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final byte[] f50609 = new byte[1];

    public C16467(AbstractC6381 abstractC6381, C10824 c10824, C4265 c4265) {
        abstractC6381.getClass();
        this.f50620 = c4265;
        this.f50614 = abstractC6381;
        this.f50618 = new C15469(c4265);
        int iM27067 = c10824.m27067();
        AbstractC2771 abstractC2771M8545 = AbstractC2771.m8545(this.f50618, c10824.m27070(), c10824.m27071(), c10824.m27066(), iM27067, 65536 > iM27067 ? 65536 - iM27067 : 0, c10824.m27065(), c10824.m27069(), c10824.m27062(), c4265);
        this.f50616 = abstractC2771M8545;
        this.f50617 = abstractC2771M8545.m8559();
        this.f50615 = c10824.m27070() + (c10824.m27071() * 45);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f50609;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f50611;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f50610) {
            throw new C2357("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iM32785 = this.f50617.m32785(i, i2, bArr);
                i += iM32785;
                i2 -= iM32785;
                this.f50612 += iM32785;
                if (this.f50616.m8557()) {
                    m38773();
                }
            } catch (IOException e) {
                this.f50611 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38773() throws IOException {
        int i;
        int iM36553 = this.f50618.m36553();
        int iM8558 = this.f50616.m8558();
        int i2 = iM36553 + 2;
        byte[] bArr = this.f50621;
        if (i2 >= iM8558) {
            this.f50616.mo8553();
            iM8558 = this.f50616.m8558();
            int i3 = iM8558;
            while (i3 > 0) {
                int iMin = Math.min(i3, 65536);
                bArr[0] = (byte) (this.f50619 ? 1 : 2);
                int i4 = iMin - 1;
                bArr[1] = (byte) (i4 >>> 8);
                bArr[2] = (byte) i4;
                this.f50614.write(bArr, 0, 3);
                this.f50617.m32786(this.f50614, i3, iMin);
                i3 -= iMin;
                this.f50619 = false;
            }
            this.f50613 = true;
        } else {
            boolean z = this.f50622;
            if (z) {
                i = this.f50619 ? BERTags.FLAGS : 192;
            } else {
                i = this.f50613 ? DHParameters.DEFAULT_MINIMUM_LENGTH : 128;
            }
            int i5 = iM8558 - 1;
            bArr[0] = (byte) (i | (i5 >>> 16));
            bArr[1] = (byte) (i5 >>> 8);
            bArr[2] = (byte) i5;
            int i6 = iM36553 - 1;
            bArr[3] = (byte) (i6 >>> 8);
            bArr[4] = (byte) i6;
            if (z) {
                bArr[5] = (byte) this.f50615;
                this.f50614.write(bArr, 0, 6);
            } else {
                this.f50614.write(bArr, 0, 5);
            }
            this.f50618.m36554(this.f50614);
            this.f50622 = false;
            this.f50613 = false;
            this.f50619 = false;
        }
        this.f50612 -= iM8558;
        this.f50616.m8562();
        this.f50618.m36560();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38774() throws IOException {
        IOException iOException = this.f50611;
        if (iOException != null) {
            throw iOException;
        }
        this.f50617.m32792();
        while (this.f50612 > 0) {
            try {
                this.f50616.m8557();
                m38773();
            } catch (IOException e) {
                this.f50611 = e;
                throw e;
            }
        }
        this.f50614.write(0);
        this.f50610 = true;
        AbstractC2771 abstractC2771 = this.f50616;
        C4265 c4265 = this.f50620;
        abstractC2771.m8555(c4265);
        this.f50616 = null;
        this.f50617 = null;
        this.f50618.m36555(c4265);
        this.f50618 = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f50611;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f50610) {
            throw new C2357("Stream finished or closed");
        }
        try {
            this.f50617.m32789();
            while (this.f50612 > 0) {
                this.f50616.m8557();
                m38773();
            }
            this.f50614.flush();
        } catch (IOException e) {
            this.f50611 = e;
            throw e;
        }
    }

    @Override // l.AbstractC6381
    public final void finish() throws IOException {
        if (this.f50610) {
            return;
        }
        m38774();
        try {
            this.f50614.finish();
        } catch (IOException e) {
            this.f50611 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f50614 != null) {
            if (!this.f50610) {
                try {
                    m38774();
                } catch (IOException unused) {
                }
            }
            try {
                this.f50614.close();
            } catch (IOException e) {
                if (this.f50611 == null) {
                    this.f50611 = e;
                }
            }
            this.f50614 = null;
        }
        IOException iOException = this.f50611;
        if (iOException != null) {
            throw iOException;
        }
    }
}
