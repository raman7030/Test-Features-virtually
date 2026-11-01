package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79WK */
/* JADX INFO: loaded from: classes3.dex */
public class C11961 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۟ */
    public static final InterfaceC4410 f33343 = C13128.m30022(C11961.class);

    /* JADX INFO: renamed from: ۗ */
    public boolean f33344;

    /* JADX INFO: renamed from: ۙ */
    public C13972 f33345;

    /* JADX INFO: renamed from: ۛ */
    public int f33346;

    /* JADX INFO: renamed from: ۤ */
    public int f33347;

    /* JADX INFO: renamed from: ۨ */
    public boolean f33348;

    /* JADX INFO: renamed from: ۫ */
    public int f33349;

    /* JADX INFO: renamed from: ۬ */
    public int f33350;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f33351;

    /* JADX INFO: renamed from: ᩶ */
    public long f33352;

    /* JADX INFO: renamed from: ᩸ */
    public int f33353;

    /* JADX INFO: renamed from: ᩹ */
    public C14642 f33354;

    /* JADX INFO: renamed from: ᩺ */
    public byte[] f33355;

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public synchronized C13972 mo21482() {
        C13972 c13972 = this.f33345;
        if (c13972 != null && c13972.m31751()) {
            C13972 c13973 = this.f33345;
            c13973.m31748();
            return c13973;
        }
        C14642 c14642 = this.f33354;
        if (c14642 instanceof C13302) {
            this.f33345 = c14642.m33448(32, ((C13302) c14642).m30371() & 16711680, this.f33346, 128, 0);
        } else {
            C13972 c13972M33448 = c14642.m33448(this.f33350, this.f33353, this.f33346, 128, 0);
            c13972M33448.m31748();
            this.f33345 = c13972M33448;
        }
        return this.f33345;
    }

    public C11961(C14642 c14642) throws C5255 {
        this.f33355 = new byte[1];
        this.f33354 = c14642;
        this.f33351 = false;
        this.f33350 = 0;
        this.f33353 = 1;
        this.f33346 = 7;
        try {
            C5807 c5807M33461 = c14642.m33461();
            try {
                this.f33348 = c5807M33461.m13076();
                if (c14642.mo30373() != 16) {
                    C13972 c13972Mo21482 = mo21482();
                    if (c13972Mo21482 != null) {
                        c13972Mo21482.m31750();
                    }
                    this.f33350 = 0;
                }
                m27371(c5807M33461);
                c5807M33461.close();
            } catch (Throwable th) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    public C11961(C13302 c13302, C5807 c5807) throws C5255 {
        this.f33355 = new byte[1];
        this.f33354 = c13302;
        this.f33345 = null;
        this.f33351 = false;
        this.f33348 = c5807.m13076();
        try {
            m27371(c5807);
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27371(InterfaceC19889 interfaceC19889) {
        if (this.f33348) {
            C5807 c5807 = (C5807) interfaceC19889;
            this.f33349 = c5807.m13067();
            this.f33347 = c5807.m13067();
            return;
        }
        C5807 c5808 = (C5807) interfaceC19889;
        this.f33349 = Math.min(c5808.m13067() - 70, c5808.m13078() - 70);
        boolean zM13065 = c5808.m13065(16384);
        InterfaceC4410 interfaceC4410 = f33343;
        if (zM13065) {
            this.f33344 = true;
            this.f33347 = Math.min(((C15410) c5808.m13070()).m35096() - 70, c5808.m13072() ? 65465 : 16777145);
            interfaceC4410.mo9183("Enabling LARGE_READX with " + this.f33347);
        } else {
            interfaceC4410.mo9183("LARGE_READX disabled");
            this.f33347 = this.f33349;
        }
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Negotiated file read size is " + this.f33347);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m27370(C5255 c5255) {
        Throwable cause = c5255.getCause();
        IOException iOException = c5255;
        if (cause instanceof C3992) {
            C3992 c3992 = (C3992) cause;
            cause = c3992.getCause();
            iOException = c3992;
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
        C14642 c14642 = this.f33354;
        boolean z = this.f33351;
        try {
            C13972 c13972 = this.f33345;
            if (c13972 != null) {
                c13972.m31750();
            }
            this.f33355 = null;
            this.f33345 = null;
            if (z) {
                c14642.close();
            }
        } catch (C5255 e) {
            throw m27370(e);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m27372(0, 1, this.f33355) == -1) {
            return -1;
        }
        return this.f33355[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return m27372(0, bArr.length, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return m27372(i, i2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #6 {all -> 0x01ca, blocks: (B:9:0x001e, B:11:0x0024, B:12:0x0043, B:14:0x0055, B:20:0x0061, B:22:0x0067, B:26:0x0099, B:28:0x00a3, B:30:0x00ad, B:36:0x00c1, B:38:0x00cd, B:45:0x00f1, B:54:0x0103, B:86:0x019c, B:41:0x00e0, B:43:0x00e9, B:55:0x0110, B:35:0x00bf, B:100:0x01b5, B:106:0x01c5, B:107:0x01c9, B:61:0x011f, B:64:0x013f, B:69:0x0162, B:71:0x0172, B:80:0x0184, B:65:0x014b, B:67:0x014f, B:15:0x0058), top: B:137:0x001e, outer: #4 }] */
    /* JADX INFO: renamed from: ܿ */
    public final int m27372(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        int i4;
        int i5;
        int iM3711;
        long j;
        byte[] bArr2 = bArr;
        InterfaceC4410 interfaceC4410 = f33343;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.f33352;
        if (this.f33355 == null) {
            throw new IOException("Bad file descriptor");
        }
        C13972 c13972Mo21482 = mo21482();
        try {
            C5807 c5807M31755 = c13972Mo21482.m31755();
            try {
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196("read: fid=" + c13972Mo21482 + ",off=" + i + ",len=" + i2);
                }
                C2532 c2532 = new C2532(i, c5807M31755.m13070(), bArr2);
                int iMo30373 = this.f33354.mo30373();
                int i6 = iMo30373 == 1 ? this.f33347 : this.f33349;
                int i7 = i2;
                int i8 = i;
                while (true) {
                    int i9 = i7 > i6 ? i6 : i7;
                    if (interfaceC4410.mo9194()) {
                        interfaceC4410.mo9196("read: len=" + i7 + ",r=" + i9 + ",fp=" + this.f33352 + ",b.length=" + bArr2.length);
                    }
                    try {
                        if (c5807M31755.m13076()) {
                            i4 = -1;
                            try {
                                C22413 c22413 = new C22413(c5807M31755.m13070(), c13972Mo21482.m31752(), bArr2, i8);
                                try {
                                    c22413.m50317(iMo30373 == 16 ? 0L : this.f33352);
                                    c22413.m50316(i9);
                                    c22413.m50315(i7 - i9);
                                    try {
                                        iM3711 = ((C11684) c5807M31755.m13063(c22413, null, EnumC2572.NO_RETRY)).m26855();
                                    } catch (C5255 e) {
                                        if (e.m11333() != -1073741807) {
                                            throw e;
                                        }
                                        interfaceC4410.mo9176("Reached end of file", (Exception) e);
                                        iM3711 = -1;
                                    }
                                    if (iM3711 <= 0) {
                                        long j3 = this.f33352 - j2;
                                        if (j3 <= 0) {
                                            j3 = -1;
                                        }
                                        int i10 = (int) j3;
                                        c5807M31755.close();
                                        c13972Mo21482.m31750();
                                        return i10;
                                    }
                                    this.f33352 += (long) iM3711;
                                    i8 += iM3711;
                                    i7 -= iM3711;
                                    i5 = i9;
                                    i3 = iMo30373;
                                } catch (C5255 e2) {
                                    e = e2;
                                    i3 = iMo30373;
                                    if (i3 == 16) {
                                    }
                                    throw m27370(e);
                                }
                            } catch (C5255 e3) {
                                e = e3;
                                i3 = iMo30373;
                            }
                        } else {
                            int i11 = iMo30373;
                            try {
                                int i12 = i8;
                                int i13 = i9;
                                C20639 c20639 = new C20639(c5807M31755.m13070(), c13972Mo21482.m31754(), this.f33352, i13);
                                i3 = i11;
                                if (i3 == 16) {
                                    try {
                                        c20639.m46657();
                                        c20639.m46656(1024);
                                        c20639.m46654();
                                    } catch (C5255 e4) {
                                        e = e4;
                                        i4 = -1;
                                        if (i3 == 16 || e.m11333() != -1073741493) {
                                            throw m27370(e);
                                        }
                                        c5807M31755.close();
                                        c13972Mo21482.m31750();
                                        return i4;
                                    }
                                } else {
                                    if (this.f33344) {
                                        i5 = i13;
                                        c20639.m46656(i5 & 65535);
                                        c20639.m46655(65535 & (i5 >> 16));
                                    }
                                    c5807M31755.m13063(c20639, c2532, EnumC2572.NO_RETRY);
                                    iM3711 = c2532.m3711();
                                    if (iM3711 <= 0) {
                                        j = this.f33352 - j2;
                                        if (j <= 0) {
                                            j = -1;
                                        }
                                        int i14 = (int) j;
                                        c5807M31755.close();
                                        c13972Mo21482.m31750();
                                        return i14;
                                    }
                                    this.f33352 += (long) iM3711;
                                    i7 -= iM3711;
                                    c2532.m3713(iM3711);
                                    i8 = i12;
                                }
                                i5 = i13;
                                c5807M31755.m13063(c20639, c2532, EnumC2572.NO_RETRY);
                                iM3711 = c2532.m3711();
                                if (iM3711 <= 0) {
                                    j = this.f33352 - j2;
                                    if (j <= 0) {
                                        j = -1;
                                    }
                                    int i15 = (int) j;
                                    c5807M31755.close();
                                    c13972Mo21482.m31750();
                                    return i15;
                                }
                                this.f33352 += (long) iM3711;
                                i7 -= iM3711;
                                c2532.m3713(iM3711);
                                i8 = i12;
                            } catch (C5255 e5) {
                                e = e5;
                                i3 = i11;
                            }
                        }
                        i6 = i6;
                        if (i7 > i6 && iM3711 == i5) {
                            iMo30373 = i3;
                            bArr2 = bArr;
                        }
                        int i16 = (int) (this.f33352 - j2);
                        c5807M31755.close();
                        c13972Mo21482.m31750();
                        return i16;
                    } catch (C5255 e6) {
                        e = e6;
                        i3 = iMo30373;
                    }
                }
            } catch (Throwable th) {
                try {
                    c5807M31755.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (c13972Mo21482 == null) {
                throw th3;
            }
            try {
                c13972Mo21482.m31750();
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
        this.f33352 += j;
        return j;
    }
}
