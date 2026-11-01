package p067l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.۠᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10445 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public InputStream f28896;

    /* JADX INFO: renamed from: ۤ */
    public final DataInputStream f28899;

    /* JADX INFO: renamed from: ۫ */
    public final C21845 f28901;

    /* JADX INFO: renamed from: ۬ */
    public final int f28902;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f28903;

    /* JADX INFO: renamed from: ᩶ */
    public long f28904;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC7290 f28905;

    /* JADX INFO: renamed from: ᩹ */
    public long f28906;

    /* JADX INFO: renamed from: ᩺ */
    public long f28907;

    /* JADX INFO: renamed from: ۨ */
    public long f28900 = 0;

    /* JADX INFO: renamed from: ۙ */
    public boolean f28897 = false;

    /* JADX INFO: renamed from: ۛ */
    public final byte[] f28898 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C10445(InputStream inputStream, AbstractC7290 abstractC7290, boolean z, int i, C6422 c6422) throws C13798, IOException {
        this.f28907 = -1L;
        this.f28906 = -1L;
        this.f28905 = abstractC7290;
        this.f28903 = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f28899 = dataInputStream;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 0) {
            throw new C13798();
        }
        int i2 = (unsignedByte + 1) * 4;
        this.f28902 = i2;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) unsignedByte;
        dataInputStream.readFully(bArr, 1, i2 - 1);
        int i3 = i2 - 4;
        if (!C16676.m37753(0, bArr, i3, i3)) {
            throw new C23856("XZ Block Header is corrupt");
        }
        int i4 = bArr[1];
        if ((i4 & 60) != 0) {
            throw new C11314("Unsupported options in XZ Block Header");
        }
        int i5 = i4 & 3;
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        byte[][] bArr2 = new byte[i6][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
        try {
            long jM16746 = (9223372036854775804L - ((long) i2)) - ((long) abstractC7290.m16746());
            this.f28904 = jM16746;
            if ((bArr[1] & 64) != 0) {
                long jM37750 = C16676.m37750(byteArrayInputStream);
                this.f28906 = jM37750;
                if (jM37750 == 0 || jM37750 > jM16746) {
                    throw new C23856();
                }
                this.f28904 = jM37750;
            }
            if ((bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
                this.f28907 = C16676.m37750(byteArrayInputStream);
            }
            for (int i7 = 0; i7 < i6; i7++) {
                jArr[i7] = C16676.m37750(byteArrayInputStream);
                long jM37751 = C16676.m37750(byteArrayInputStream);
                if (jM37751 > byteArrayInputStream.available()) {
                    throw new C23856();
                }
                byte[] bArr3 = new byte[(int) jM37751];
                bArr2[i7] = bArr3;
                byteArrayInputStream.read(bArr3);
            }
            for (int iAvailable = byteArrayInputStream.available(); iAvailable > 0; iAvailable--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new C11314("Unsupported options in XZ Block Header");
                }
            }
            InterfaceC12457[] interfaceC12457Arr = new InterfaceC12457[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                long j = jArr[i8];
                if (j == 33) {
                    interfaceC12457Arr[i8] = new C15808(bArr2[i8]);
                } else if (j == 3) {
                    interfaceC12457Arr[i8] = new C5751(bArr2[i8]);
                } else {
                    if (j < 4 || j > 11) {
                        throw new C11314("Unknown Filter ID " + jArr[i8]);
                    }
                    interfaceC12457Arr[i8] = new C20504(j, bArr2[i8]);
                }
            }
            C16006.m36379(interfaceC12457Arr);
            if (i >= 0) {
                int iMo12821 = 0;
                for (int i9 = 0; i9 < i6; i9++) {
                    iMo12821 += interfaceC12457Arr[i9].mo12821();
                }
                if (iMo12821 > i) {
                    throw new C18689(C20780.m46928("", iMo12821, " KiB of memory would be needed; limit was ", " KiB", i));
                }
            }
            C21845 c21845 = new C21845(inputStream);
            this.f28901 = c21845;
            this.f28896 = c21845;
            while (i5 >= 0) {
                this.f28896 = interfaceC12457Arr[i5].mo12822(this.f28896, c6422);
                i5--;
            }
        } catch (IOException unused) {
            throw new C23856("XZ Block Header is corrupt");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f28898;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f28897) {
            return -1;
        }
        int i3 = this.f28896.read(bArr, i, i2);
        if (i3 > 0) {
            if (this.f28903) {
                this.f28905.mo3895(bArr, i, i3);
            }
            this.f28900 += (long) i3;
            long jM49281 = this.f28901.m49281();
            if (jM49281 >= 0 && jM49281 <= this.f28904) {
                long j = this.f28900;
                if (j >= 0) {
                    long j2 = this.f28907;
                    if (j2 == -1 || j <= j2) {
                        if (i3 < i2 || j == j2) {
                            if (this.f28896.read() != -1) {
                                throw new C23856();
                            }
                            m24162();
                            this.f28897 = true;
                            return i3;
                        }
                    }
                }
            }
            throw new C23856();
        }
        if (i3 == -1) {
            m24162();
            this.f28897 = true;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24162() throws IOException {
        long jM49281 = this.f28901.m49281();
        long j = this.f28906;
        if (j == -1 || j == jM49281) {
            long j2 = this.f28907;
            if (j2 == -1 || j2 == this.f28900) {
                while (true) {
                    long j3 = 1 + jM49281;
                    long j4 = jM49281 & 3;
                    DataInputStream dataInputStream = this.f28899;
                    if (j4 != 0) {
                        if (dataInputStream.readUnsignedByte() != 0) {
                            throw new C23856();
                        }
                        jM49281 = j3;
                    } else {
                        AbstractC7290 abstractC7290 = this.f28905;
                        byte[] bArr = new byte[abstractC7290.m16746()];
                        dataInputStream.readFully(bArr);
                        if (!this.f28903 || Arrays.equals(abstractC7290.mo3896(), bArr)) {
                            return;
                        }
                        throw new C23856("Integrity check (" + abstractC7290.m16745() + ") does not match");
                    }
                }
            }
        }
        throw new C23856();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f28896.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f28896.close();
        } catch (IOException unused) {
        }
        this.f28896 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m24164() {
        return ((long) this.f28902) + this.f28901.m49281() + ((long) this.f28905.m16746());
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24163() {
        return this.f28900;
    }
}
