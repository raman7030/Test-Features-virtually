package p067l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܽۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18018 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۤ */
    public AbstractC8433 f53792;

    /* JADX INFO: renamed from: ۨ */
    public final int f53793;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC5002 f53794;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC15335 f53795;

    /* JADX INFO: renamed from: ܰ */
    public C17070 f53796;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f53798;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f53797 = true;

    /* JADX INFO: renamed from: ۟ */
    public boolean f53791 = true;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f53800 = true;

    /* JADX INFO: renamed from: ۛ */
    public int f53790 = 0;

    /* JADX INFO: renamed from: ۗ */
    public boolean f53788 = false;

    /* JADX INFO: renamed from: ۙ */
    public IOException f53789 = null;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f53799 = new byte[6];

    /* JADX INFO: renamed from: ֫֫ */
    public final byte[] f53787 = new byte[1];

    public C18018(AbstractC8433 abstractC8433, C12655 c12655, C6422 c6422) {
        abstractC8433.getClass();
        this.f53798 = c6422;
        this.f53792 = abstractC8433;
        this.f53796 = new C17070(c6422);
        int iM29112 = c12655.m29112();
        AbstractC5002 abstractC5002M10608 = AbstractC5002.m10608(this.f53796, c12655.m29115(), c12655.m29116(), c12655.m29111(), iM29112, 65536 > iM29112 ? 65536 - iM29112 : 0, c12655.m29110(), c12655.m29114(), c12655.m29107(), c6422);
        this.f53794 = abstractC5002M10608;
        this.f53795 = abstractC5002M10608.m10622();
        this.f53793 = c12655.m29115() + (c12655.m29116() * 45);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f53787;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f53789;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f53788) {
            throw new C4608("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iM34900 = this.f53795.m34900(i, i2, bArr);
                i += iM34900;
                i2 -= iM34900;
                this.f53790 += iM34900;
                if (this.f53794.m10620()) {
                    m40999();
                }
            } catch (IOException e) {
                this.f53789 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40999() throws IOException {
        int i;
        int iM38712 = this.f53796.m38712();
        int iM10621 = this.f53794.m10621();
        int i2 = iM38712 + 2;
        byte[] bArr = this.f53799;
        if (i2 >= iM10621) {
            this.f53794.mo10616();
            iM10621 = this.f53794.m10621();
            int i3 = iM10621;
            while (i3 > 0) {
                int iMin = Math.min(i3, 65536);
                bArr[0] = (byte) (this.f53797 ? 1 : 2);
                int i4 = iMin - 1;
                bArr[1] = (byte) (i4 >>> 8);
                bArr[2] = (byte) i4;
                this.f53792.write(bArr, 0, 3);
                this.f53795.m34901(this.f53792, i3, iMin);
                i3 -= iMin;
                this.f53797 = false;
            }
            this.f53791 = true;
        } else {
            boolean z = this.f53800;
            if (z) {
                i = this.f53797 ? BERTags.FLAGS : 192;
            } else {
                i = this.f53791 ? DHParameters.DEFAULT_MINIMUM_LENGTH : 128;
            }
            int i5 = iM10621 - 1;
            bArr[0] = (byte) (i | (i5 >>> 16));
            bArr[1] = (byte) (i5 >>> 8);
            bArr[2] = (byte) i5;
            int i6 = iM38712 - 1;
            bArr[3] = (byte) (i6 >>> 8);
            bArr[4] = (byte) i6;
            if (z) {
                bArr[5] = (byte) this.f53793;
                this.f53792.write(bArr, 0, 6);
            } else {
                this.f53792.write(bArr, 0, 5);
            }
            this.f53796.m38713(this.f53792);
            this.f53800 = false;
            this.f53791 = false;
            this.f53797 = false;
        }
        this.f53790 -= iM10621;
        this.f53794.m10625();
        this.f53796.m38719();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m41000() throws IOException {
        IOException iOException = this.f53789;
        if (iOException != null) {
            throw iOException;
        }
        this.f53795.m34907();
        while (this.f53790 > 0) {
            try {
                this.f53794.m10620();
                m40999();
            } catch (IOException e) {
                this.f53789 = e;
                throw e;
            }
        }
        this.f53792.write(0);
        this.f53788 = true;
        AbstractC5002 abstractC5002 = this.f53794;
        C6422 c6422 = this.f53798;
        abstractC5002.m10618(c6422);
        this.f53794 = null;
        this.f53795 = null;
        this.f53796.m38714(c6422);
        this.f53796 = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f53789;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f53788) {
            throw new C4608("Stream finished or closed");
        }
        try {
            this.f53795.m34904();
            while (this.f53790 > 0) {
                this.f53794.m10620();
                m40999();
            }
            this.f53792.flush();
        } catch (IOException e) {
            this.f53789 = e;
            throw e;
        }
    }

    @Override // p067l.AbstractC8433
    public final void finish() throws IOException {
        if (this.f53788) {
            return;
        }
        m41000();
        try {
            this.f53792.finish();
        } catch (IOException e) {
            this.f53789 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f53792 != null) {
            if (!this.f53788) {
                try {
                    m41000();
                } catch (IOException unused) {
                }
            }
            try {
                this.f53792.close();
            } catch (IOException e) {
                if (this.f53789 == null) {
                    this.f53789 = e;
                }
            }
            this.f53792 = null;
        }
        IOException iOException = this.f53789;
        if (iOException != null) {
            throw iOException;
        }
    }
}
