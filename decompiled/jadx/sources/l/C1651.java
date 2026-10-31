package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G1S8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1651 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DataInputStream f5754;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1359 f5757;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21116 f5758;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22817 f5759;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f5762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5760 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f5753 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5756 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f5755 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f5763 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f5761 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final byte[] f5764 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m5549(int i) {
        return (m5547(i) / 1024) + IShizukuService.Stub.TRANSACTION_isHidden;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5547(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported dictionary size "));
        }
        return (i + 15) & (-16);
    }

    public C1651(InputStream inputStream, int i, C4265 c4265) {
        inputStream.getClass();
        this.f5762 = c4265;
        this.f5754 = new DataInputStream(inputStream);
        this.f5757 = new C1359(c4265);
        this.f5759 = new C22817(m5547(i), c4265);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f5764;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f5754 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f5761;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f5763) {
            return -1;
        }
        while (i2 > 0) {
            try {
                if (this.f5760 == 0) {
                    m5548();
                    if (this.f5763) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                int iMin = Math.min(this.f5760, i2);
                if (!this.f5753) {
                    this.f5759.m50920(iMin, this.f5754);
                } else {
                    this.f5759.m50922(iMin);
                    this.f5758.m48080();
                }
                int iM50917 = this.f5759.m50917(i, bArr);
                i += iM50917;
                i2 -= iM50917;
                i4 += iM50917;
                int i5 = this.f5760 - iM50917;
                this.f5760 = i5;
                if (i5 == 0 && (!this.f5757.m4775() || this.f5759.m50923())) {
                    throw new C22609();
                }
            } catch (IOException e) {
                this.f5761 = e;
                throw e;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5548() throws IOException {
        int unsignedByte = this.f5754.readUnsignedByte();
        if (unsignedByte == 0) {
            this.f5763 = true;
            C22817 c22817 = this.f5759;
            if (c22817 != null) {
                C4265 c4265 = this.f5762;
                c22817.m50921(c4265);
                this.f5759 = null;
                this.f5757.m4774(c4265);
                this.f5757 = null;
                return;
            }
            return;
        }
        if (unsignedByte >= 224 || unsignedByte == 1) {
            this.f5755 = true;
            this.f5756 = false;
            this.f5759.m50925();
        } else if (this.f5756) {
            throw new C22609();
        }
        if (unsignedByte < 128) {
            if (unsignedByte > 2) {
                throw new C22609();
            }
            this.f5753 = false;
            this.f5760 = this.f5754.readUnsignedShort() + 1;
            return;
        }
        this.f5753 = true;
        int i = (unsignedByte & 31) << 16;
        this.f5760 = i;
        this.f5760 = this.f5754.readUnsignedShort() + 1 + i;
        int unsignedShort = this.f5754.readUnsignedShort() + 1;
        if (unsignedByte >= 192) {
            this.f5755 = false;
            int unsignedByte2 = this.f5754.readUnsignedByte();
            if (unsignedByte2 > 224) {
                throw new C22609();
            }
            int i2 = unsignedByte2 / 45;
            int i3 = unsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new C22609();
            }
            this.f5758 = new C21116(this.f5759, this.f5757, i5, i4, i2);
        } else {
            if (this.f5755) {
                throw new C22609();
            }
            if (unsignedByte >= 160) {
                this.f5758.mo8553();
            }
        }
        this.f5757.m4773(unsignedShort, this.f5754);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        DataInputStream dataInputStream = this.f5754;
        if (dataInputStream == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f5761;
        if (iOException == null) {
            return this.f5753 ? this.f5760 : Math.min(this.f5760, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5754 != null) {
            C22817 c22817 = this.f5759;
            if (c22817 != null) {
                C4265 c4265 = this.f5762;
                c22817.m50921(c4265);
                this.f5759 = null;
                this.f5757.m4774(c4265);
                this.f5757 = null;
            }
            try {
                this.f5754.close();
            } finally {
                this.f5754 = null;
            }
        }
    }
}
