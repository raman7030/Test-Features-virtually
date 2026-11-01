package p067l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1RE */
/* JADX INFO: loaded from: classes5.dex */
public final class C22043 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC8433 f69359;

    /* JADX INFO: renamed from: ۤ */
    public final byte[] f69362;

    /* JADX INFO: renamed from: ۬ */
    public final DataOutputStream f69364;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f69366;

    /* JADX INFO: renamed from: ۛ */
    public int f69361 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f69367 = true;

    /* JADX INFO: renamed from: ۙ */
    public boolean f69360 = false;

    /* JADX INFO: renamed from: ᩶ */
    public IOException f69365 = null;

    /* JADX INFO: renamed from: ۫ */
    public final byte[] f69363 = new byte[1];

    public C22043(AbstractC8433 abstractC8433, C6422 c6422) {
        abstractC8433.getClass();
        this.f69359 = abstractC8433;
        this.f69364 = new DataOutputStream(abstractC8433);
        this.f69366 = c6422;
        this.f69362 = c6422.mo7199(65536);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f69363;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f69362;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f69365;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f69360) {
            throw new C4608("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(65536 - this.f69361, i2);
                DataOutputStream dataOutputStream = this.f69364;
                if (iMin != 65536) {
                    System.arraycopy(bArr, i, bArr2, this.f69361, iMin);
                    int i4 = this.f69361 + iMin;
                    this.f69361 = i4;
                    if (i4 == 65536) {
                        dataOutputStream.writeByte(this.f69367 ? 1 : 2);
                        dataOutputStream.writeShort(i4 - 1);
                        dataOutputStream.write(bArr2, 0, i4);
                        this.f69367 = false;
                        this.f69361 = 0;
                    }
                } else {
                    dataOutputStream.writeByte(this.f69367 ? 1 : 2);
                    dataOutputStream.writeShort(iMin - 1);
                    dataOutputStream.write(bArr, i, iMin);
                    this.f69367 = false;
                }
                i += iMin;
                i2 -= iMin;
            } catch (IOException e) {
                this.f69365 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49644() throws IOException {
        IOException iOException = this.f69365;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f69360) {
            throw new C4608("Stream finished or closed");
        }
        try {
            int i = this.f69361;
            byte[] bArr = this.f69362;
            if (i > 0) {
                DataOutputStream dataOutputStream = this.f69364;
                dataOutputStream.writeByte(this.f69367 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f69367 = false;
                this.f69361 = 0;
            }
            this.f69359.write(0);
            this.f69360 = true;
            this.f69366.mo7197(bArr);
        } catch (IOException e) {
            this.f69365 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f69365;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f69360) {
            throw new C4608("Stream finished or closed");
        }
        try {
            int i = this.f69361;
            if (i > 0) {
                byte[] bArr = this.f69362;
                DataOutputStream dataOutputStream = this.f69364;
                dataOutputStream.writeByte(this.f69367 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f69367 = false;
                this.f69361 = 0;
            }
            this.f69359.flush();
        } catch (IOException e) {
            this.f69365 = e;
            throw e;
        }
    }

    @Override // p067l.AbstractC8433
    public final void finish() throws IOException {
        if (this.f69360) {
            return;
        }
        m49644();
        try {
            this.f69359.finish();
        } catch (IOException e) {
            this.f69365 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f69359 != null) {
            if (!this.f69360) {
                try {
                    m49644();
                } catch (IOException unused) {
                }
            }
            try {
                this.f69359.close();
            } catch (IOException e) {
                if (this.f69365 == null) {
                    this.f69365 = e;
                }
            }
            this.f69359 = null;
        }
        IOException iOException = this.f69365;
        if (iOException != null) {
            throw iOException;
        }
    }
}
