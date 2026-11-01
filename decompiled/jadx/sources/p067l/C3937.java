package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G1S8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3937 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public DataInputStream f8534;

    /* JADX INFO: renamed from: ۨ */
    public C3660 f8537;

    /* JADX INFO: renamed from: ۫ */
    public C22437 f8538;

    /* JADX INFO: renamed from: ۬ */
    public C24053 f8539;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f8542;

    /* JADX INFO: renamed from: ܰ */
    public int f8540 = 0;

    /* JADX INFO: renamed from: ۗ */
    public boolean f8533 = false;

    /* JADX INFO: renamed from: ۤ */
    public boolean f8536 = true;

    /* JADX INFO: renamed from: ۛ */
    public boolean f8535 = true;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f8543 = false;

    /* JADX INFO: renamed from: ᩶ */
    public IOException f8541 = null;

    /* JADX INFO: renamed from: ᩺ */
    public final byte[] f8544 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m7779(int i) {
        return (m7777(i) / 1024) + IShizukuService.Stub.TRANSACTION_isHidden;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7777(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unsupported dictionary size "));
        }
        return (i + 15) & (-16);
    }

    public C3937(InputStream inputStream, int i, C6422 c6422) {
        inputStream.getClass();
        this.f8542 = c6422;
        this.f8534 = new DataInputStream(inputStream);
        this.f8537 = new C3660(c6422);
        this.f8539 = new C24053(m7777(i), c6422);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f8544;
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
        if (this.f8534 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f8541;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f8543) {
            return -1;
        }
        while (i2 > 0) {
            try {
                if (this.f8540 == 0) {
                    m7778();
                    if (this.f8543) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                int iMin = Math.min(this.f8540, i2);
                if (!this.f8533) {
                    this.f8539.m53310(iMin, this.f8534);
                } else {
                    this.f8539.m53312(iMin);
                    this.f8538.m50410();
                }
                int iM53307 = this.f8539.m53307(i, bArr);
                i += iM53307;
                i2 -= iM53307;
                i4 += iM53307;
                int i5 = this.f8540 - iM53307;
                this.f8540 = i5;
                if (i5 == 0 && (!this.f8537.m7013() || this.f8539.m53313())) {
                    throw new C23856();
                }
            } catch (IOException e) {
                this.f8541 = e;
                throw e;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7778() throws IOException {
        int unsignedByte = this.f8534.readUnsignedByte();
        if (unsignedByte == 0) {
            this.f8543 = true;
            C24053 c24053 = this.f8539;
            if (c24053 != null) {
                C6422 c6422 = this.f8542;
                c24053.m53311(c6422);
                this.f8539 = null;
                this.f8537.m7012(c6422);
                this.f8537 = null;
                return;
            }
            return;
        }
        if (unsignedByte >= 224 || unsignedByte == 1) {
            this.f8535 = true;
            this.f8536 = false;
            this.f8539.m53315();
        } else if (this.f8536) {
            throw new C23856();
        }
        if (unsignedByte < 128) {
            if (unsignedByte > 2) {
                throw new C23856();
            }
            this.f8533 = false;
            this.f8540 = this.f8534.readUnsignedShort() + 1;
            return;
        }
        this.f8533 = true;
        int i = (unsignedByte & 31) << 16;
        this.f8540 = i;
        this.f8540 = this.f8534.readUnsignedShort() + 1 + i;
        int unsignedShort = this.f8534.readUnsignedShort() + 1;
        if (unsignedByte >= 192) {
            this.f8535 = false;
            int unsignedByte2 = this.f8534.readUnsignedByte();
            if (unsignedByte2 > 224) {
                throw new C23856();
            }
            int i2 = unsignedByte2 / 45;
            int i3 = unsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new C23856();
            }
            this.f8538 = new C22437(this.f8539, this.f8537, i5, i4, i2);
        } else {
            if (this.f8535) {
                throw new C23856();
            }
            if (unsignedByte >= 160) {
                this.f8538.mo10616();
            }
        }
        this.f8537.m7011(unsignedShort, this.f8534);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        DataInputStream dataInputStream = this.f8534;
        if (dataInputStream == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f8541;
        if (iOException == null) {
            return this.f8533 ? this.f8540 : Math.min(this.f8540, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8534 != null) {
            C24053 c24053 = this.f8539;
            if (c24053 != null) {
                C6422 c6422 = this.f8542;
                c24053.m53311(c6422);
                this.f8539 = null;
                this.f8537.m7012(c6422);
                this.f8537 = null;
            }
            try {
                this.f8534.close();
            } finally {
                this.f8534 = null;
            }
        }
    }
}
