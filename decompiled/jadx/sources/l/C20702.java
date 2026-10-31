package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1RE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20702 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC6381 f66678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f66681;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f66683;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f66685;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f66680 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f66686 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66679 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f66684 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f66682 = new byte[1];

    public C20702(AbstractC6381 abstractC6381, C4265 c4265) {
        abstractC6381.getClass();
        this.f66678 = abstractC6381;
        this.f66683 = new DataOutputStream(abstractC6381);
        this.f66685 = c4265;
        this.f66681 = c4265.mo4956(65536);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f66682;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f66681;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f66684;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f66679) {
            throw new C2357("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(65536 - this.f66680, i2);
                DataOutputStream dataOutputStream = this.f66683;
                if (iMin != 65536) {
                    System.arraycopy(bArr, i, bArr2, this.f66680, iMin);
                    int i4 = this.f66680 + iMin;
                    this.f66680 = i4;
                    if (i4 == 65536) {
                        dataOutputStream.writeByte(this.f66686 ? 1 : 2);
                        dataOutputStream.writeShort(i4 - 1);
                        dataOutputStream.write(bArr2, 0, i4);
                        this.f66686 = false;
                        this.f66680 = 0;
                    }
                } else {
                    dataOutputStream.writeByte(this.f66686 ? 1 : 2);
                    dataOutputStream.writeShort(iMin - 1);
                    dataOutputStream.write(bArr, i, iMin);
                    this.f66686 = false;
                }
                i += iMin;
                i2 -= iMin;
            } catch (IOException e) {
                this.f66684 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47317() throws IOException {
        IOException iOException = this.f66684;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f66679) {
            throw new C2357("Stream finished or closed");
        }
        try {
            int i = this.f66680;
            byte[] bArr = this.f66681;
            if (i > 0) {
                DataOutputStream dataOutputStream = this.f66683;
                dataOutputStream.writeByte(this.f66686 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f66686 = false;
                this.f66680 = 0;
            }
            this.f66678.write(0);
            this.f66679 = true;
            this.f66685.mo4954(bArr);
        } catch (IOException e) {
            this.f66684 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f66684;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f66679) {
            throw new C2357("Stream finished or closed");
        }
        try {
            int i = this.f66680;
            if (i > 0) {
                byte[] bArr = this.f66681;
                DataOutputStream dataOutputStream = this.f66683;
                dataOutputStream.writeByte(this.f66686 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f66686 = false;
                this.f66680 = 0;
            }
            this.f66678.flush();
        } catch (IOException e) {
            this.f66684 = e;
            throw e;
        }
    }

    @Override // l.AbstractC6381
    public final void finish() throws IOException {
        if (this.f66679) {
            return;
        }
        m47317();
        try {
            this.f66678.finish();
        } catch (IOException e) {
            this.f66684 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66678 != null) {
            if (!this.f66679) {
                try {
                    m47317();
                } catch (IOException unused) {
                }
            }
            try {
                this.f66678.close();
            } catch (IOException e) {
                if (this.f66684 == null) {
                    this.f66684 = e;
                }
            }
            this.f66678 = null;
        }
        IOException iOException = this.f66684;
        if (iOException != null) {
            throw iOException;
        }
    }
}
