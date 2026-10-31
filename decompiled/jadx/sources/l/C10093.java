package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79WK */
/* JADX INFO: loaded from: classes3.dex */
public class C10093 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f30383 = C11321.m27961(C10093.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f30384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12209 f30385;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30387;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f30388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30389;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30390;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f30391;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f30392;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f30394;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f30395;

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public synchronized C12209 mo19515() {
        C12209 c12209 = this.f30385;
        if (c12209 != null && c12209.m29689()) {
            C12209 c122010 = this.f30385;
            c122010.m29686();
            return c122010;
        }
        C12914 c12914 = this.f30394;
        if (c12914 instanceof C11504) {
            this.f30385 = c12914.m31362(32, ((C11504) c12914).m28327() & 16711680, this.f30386, 128, 0);
        } else {
            C12209 c12209M31362 = c12914.m31362(this.f30390, this.f30393, this.f30386, 128, 0);
            c12209M31362.m29686();
            this.f30385 = c12209M31362;
        }
        return this.f30385;
    }

    public C10093(C12914 c12914) throws C3037 {
        this.f30395 = new byte[1];
        this.f30394 = c12914;
        this.f30391 = false;
        this.f30390 = 0;
        this.f30393 = 1;
        this.f30386 = 7;
        try {
            C3618 c3618M31375 = c12914.m31375();
            try {
                this.f30388 = c3618M31375.m11100();
                if (c12914.mo28329() != 16) {
                    C12209 c12209Mo19515 = mo19515();
                    if (c12209Mo19515 != null) {
                        c12209Mo19515.m29688();
                    }
                    this.f30390 = 0;
                }
                m25352(c3618M31375);
                c3618M31375.close();
            } catch (Throwable th) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    public C10093(C11504 c11504, C3618 c3618) throws C3037 {
        this.f30395 = new byte[1];
        this.f30394 = c11504;
        this.f30385 = null;
        this.f30391 = false;
        this.f30388 = c3618.m11100();
        try {
            m25352(c3618);
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25352(InterfaceC18435 interfaceC18435) {
        if (this.f30388) {
            C3618 c3618 = (C3618) interfaceC18435;
            this.f30389 = c3618.m11091();
            this.f30387 = c3618.m11091();
            return;
        }
        C3618 c3619 = (C3618) interfaceC18435;
        this.f30389 = Math.min(c3619.m11091() - 70, c3619.m11102() - 70);
        boolean zM11089 = c3619.m11089(16384);
        InterfaceC2148 interfaceC2148 = f30383;
        if (zM11089) {
            this.f30384 = true;
            this.f30387 = Math.min(((C13722) c3619.m11094()).m32982() - 70, c3619.m11096() ? 65465 : 16777145);
            interfaceC2148.mo7088("Enabling LARGE_READX with " + this.f30387);
        } else {
            interfaceC2148.mo7088("LARGE_READX disabled");
            this.f30387 = this.f30389;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Negotiated file read size is " + this.f30387);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m25351(C3037 c3037) {
        Throwable cause = c3037.getCause();
        IOException iOException = c3037;
        if (cause instanceof C1708) {
            C1708 c1708 = (C1708) cause;
            cause = c1708.getCause();
            iOException = c1708;
        }
        if (!(cause instanceof InterruptedException)) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(cause.getMessage());
        interruptedIOException.initCause(cause);
        return interruptedIOException;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0016 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        C12914 c12914 = this.f30394;
        boolean z = this.f30391;
        try {
            C12209 c12209 = this.f30385;
            if (c12209 != null) {
                c12209.m29688();
            }
            this.f30395 = null;
            this.f30385 = null;
            if (z) {
                c12914.close();
            }
        } catch (C3037 e) {
            throw m25351(e);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m25353(0, 1, this.f30395) == -1) {
            return -1;
        }
        return this.f30395[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return m25353(0, bArr.length, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return m25353(i, i2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #6 {all -> 0x01ca, blocks: (B:9:0x001e, B:11:0x0024, B:12:0x0043, B:14:0x0055, B:20:0x0061, B:22:0x0067, B:26:0x0099, B:28:0x00a3, B:30:0x00ad, B:36:0x00c1, B:38:0x00cd, B:45:0x00f1, B:54:0x0103, B:86:0x019c, B:41:0x00e0, B:43:0x00e9, B:55:0x0110, B:35:0x00bf, B:100:0x01b5, B:106:0x01c5, B:107:0x01c9, B:61:0x011f, B:64:0x013f, B:69:0x0162, B:71:0x0172, B:80:0x0184, B:65:0x014b, B:67:0x014f, B:15:0x0058), top: B:137:0x001e, outer: #4 }] */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m25353(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        int i4;
        int i5;
        int iM1303;
        long j;
        byte[] bArr2 = bArr;
        InterfaceC2148 interfaceC2148 = f30383;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.f30392;
        if (this.f30395 == null) {
            throw new IOException("Bad file descriptor");
        }
        C12209 c12209Mo19515 = mo19515();
        try {
            C3618 c3618M29693 = c12209Mo19515.m29693();
            try {
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101("read: fid=" + c12209Mo19515 + ",off=" + i + ",len=" + i2);
                }
                C0172 c0172 = new C0172(i, c3618M29693.m11094(), bArr2);
                int iMo28329 = this.f30394.mo28329();
                int i6 = iMo28329 == 1 ? this.f30387 : this.f30389;
                int i7 = i2;
                int i8 = i;
                while (true) {
                    int i9 = i7 > i6 ? i6 : i7;
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7101("read: len=" + i7 + ",r=" + i9 + ",fp=" + this.f30392 + ",b.length=" + bArr2.length);
                    }
                    try {
                        if (c3618M29693.m11100()) {
                            i4 = -1;
                            try {
                                C21090 c21090 = new C21090(c3618M29693.m11094(), c12209Mo19515.m29690(), bArr2, i8);
                                try {
                                    c21090.m47987(iMo28329 == 16 ? 0L : this.f30392);
                                    c21090.m47986(i9);
                                    c21090.m47985(i7 - i9);
                                    try {
                                        iM1303 = ((C9801) c3618M29693.m11087(c21090, null, EnumC0214.NO_RETRY)).m24840();
                                    } catch (C3037 e) {
                                        if (e.m9291() != -1073741807) {
                                            throw e;
                                        }
                                        interfaceC2148.mo7081("Reached end of file", (Exception) e);
                                        iM1303 = -1;
                                    }
                                    if (iM1303 <= 0) {
                                        long j3 = this.f30392 - j2;
                                        if (j3 <= 0) {
                                            j3 = -1;
                                        }
                                        int i10 = (int) j3;
                                        c3618M29693.close();
                                        c12209Mo19515.m29688();
                                        return i10;
                                    }
                                    this.f30392 += (long) iM1303;
                                    i8 += iM1303;
                                    i7 -= iM1303;
                                    i5 = i9;
                                    i3 = iMo28329;
                                } catch (C3037 e2) {
                                    e = e2;
                                    i3 = iMo28329;
                                    if (i3 == 16) {
                                    }
                                    throw m25351(e);
                                }
                            } catch (C3037 e3) {
                                e = e3;
                                i3 = iMo28329;
                            }
                        } else {
                            int i11 = iMo28329;
                            try {
                                int i12 = i8;
                                int i13 = i9;
                                C19224 c19224 = new C19224(c3618M29693.m11094(), c12209Mo19515.m29692(), this.f30392, i13);
                                i3 = i11;
                                if (i3 == 16) {
                                    try {
                                        c19224.m44363();
                                        c19224.m44362(1024);
                                        c19224.m44360();
                                    } catch (C3037 e4) {
                                        e = e4;
                                        i4 = -1;
                                        if (i3 == 16 || e.m9291() != -1073741493) {
                                            throw m25351(e);
                                        }
                                        c3618M29693.close();
                                        c12209Mo19515.m29688();
                                        return i4;
                                    }
                                } else {
                                    if (this.f30384) {
                                        i5 = i13;
                                        c19224.m44362(i5 & 65535);
                                        c19224.m44361(65535 & (i5 >> 16));
                                    }
                                    c3618M29693.m11087(c19224, c0172, EnumC0214.NO_RETRY);
                                    iM1303 = c0172.m1303();
                                    if (iM1303 <= 0) {
                                        j = this.f30392 - j2;
                                        if (j <= 0) {
                                            j = -1;
                                        }
                                        int i14 = (int) j;
                                        c3618M29693.close();
                                        c12209Mo19515.m29688();
                                        return i14;
                                    }
                                    this.f30392 += (long) iM1303;
                                    i7 -= iM1303;
                                    c0172.m1305(iM1303);
                                    i8 = i12;
                                }
                                i5 = i13;
                                c3618M29693.m11087(c19224, c0172, EnumC0214.NO_RETRY);
                                iM1303 = c0172.m1303();
                                if (iM1303 <= 0) {
                                    j = this.f30392 - j2;
                                    if (j <= 0) {
                                        j = -1;
                                    }
                                    int i15 = (int) j;
                                    c3618M29693.close();
                                    c12209Mo19515.m29688();
                                    return i15;
                                }
                                this.f30392 += (long) iM1303;
                                i7 -= iM1303;
                                c0172.m1305(iM1303);
                                i8 = i12;
                            } catch (C3037 e5) {
                                e = e5;
                                i3 = i11;
                            }
                        }
                        i6 = i6;
                        if (i7 > i6 && iM1303 == i5) {
                            iMo28329 = i3;
                            bArr2 = bArr;
                        }
                        int i16 = (int) (this.f30392 - j2);
                        c3618M29693.close();
                        c12209Mo19515.m29688();
                        return i16;
                    } catch (C3037 e6) {
                        e = e6;
                        i3 = iMo28329;
                    }
                }
            } catch (Throwable th) {
                try {
                    c3618M29693.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (c12209Mo19515 == null) {
                throw th3;
            }
            try {
                c12209Mo19515.m29688();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        this.f30392 += j;
        return j;
    }
}
