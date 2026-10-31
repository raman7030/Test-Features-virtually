package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9UP */
/* JADX INFO: loaded from: classes2.dex */
public class C5859 extends OutputStream {

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f17965 = C11321.m27961(C5859.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f17966;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17967;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12209 f17968;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5818 f17969;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f17970;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11463 f17971;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f17972;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17973;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10052 f17974;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12168 f17975;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f17976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f17977;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17978;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f17979;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f17980;

    /* JADX INFO: renamed from: ֫ */
    public synchronized C12209 mo5164() {
        if (isOpen()) {
            f17965.mo7101("File already open");
            C12209 c12209 = this.f17968;
            c12209.m29686();
            return c12209;
        }
        C12209 c12209M31362 = this.f17979.m31362(this.f17967, this.f17978, this.f17973, 128, 0);
        c12209M31362.m29686();
        this.f17968 = c12209M31362;
        return c12209M31362;
    }

    public C5859(C12914 c12914) throws C3037 {
        this.f17976 = new byte[1];
        this.f17979 = c12914;
        this.f17967 = 82;
        this.f17973 = 7;
        this.f17978 = 2;
        try {
            C3618 c3618M31375 = c12914.m31375();
            try {
                boolean zM11100 = c3618M31375.m11100();
                this.f17980 = zM11100;
                C12209 c12209Mo5164 = mo5164();
                try {
                    m16417(c3618M31375);
                    if (zM11100) {
                        C23911 c23911 = new C23911(c3618M31375.m11094(), c12209Mo5164.m29690());
                        c23911.m52666(new C7893());
                        c3618M31375.m11087(c23911, null, EnumC0214.NO_RETRY);
                    }
                    c12209Mo5164.m29688();
                    c3618M31375.close();
                } catch (Throwable th) {
                    try {
                        c12209Mo5164.m29688();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    public C5859(C11504 c11504, C3618 c3618) {
        this.f17976 = new byte[1];
        this.f17979 = c11504;
        this.f17968 = null;
        this.f17967 = 0;
        this.f17978 = 0;
        this.f17973 = 0;
        this.f17980 = c3618.m11100();
        m16417(c3618);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16417(C3618 c3618) {
        int sendBufferSize = c3618.getSendBufferSize();
        if (this.f17980) {
            this.f17966 = sendBufferSize;
            this.f17972 = sendBufferSize;
            return;
        }
        this.f17967 &= -81;
        this.f17966 = sendBufferSize - 70;
        boolean zM11089 = c3618.m11089(16);
        this.f17970 = zM11089;
        InterfaceC2148 interfaceC2148 = f17965;
        if (!zM11089) {
            interfaceC2148.mo7088("No support for NT SMBs");
        }
        if (c3618.m11089(32768) && !c3618.m11096()) {
            this.f17972 = Math.min(((C13722) c3618.m11094()).m32997() - 70, 65465);
        } else {
            interfaceC2148.mo7088("No support or SMB signing is enabled, not enabling large writes");
            this.f17972 = this.f17966;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Negotiated file write size is " + this.f17972);
        }
        if (this.f17970) {
            this.f17974 = new C10052(c3618.m11094());
            this.f17969 = new C5818(c3618.m11094());
        } else {
            this.f17975 = new C12168(c3618.m11094());
            this.f17971 = new C11463(c3618.m11094());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12914 c12914 = this.f17979;
        try {
            if (this.f17968.m29689()) {
                this.f17968.m29688();
            }
        } finally {
            c12914.m31374();
            this.f17976 = null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f17976;
        bArr[0] = (byte) i;
        m16418(0, bArr, 1, 0);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m16418(0, bArr, bArr.length, 0);
    }

    public boolean isOpen() {
        C12209 c12209 = this.f17968;
        return c12209 != null && c12209.m29689();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m16418(i, bArr, i2, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16418(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long jM16318;
        int i5 = i2;
        InterfaceC2148 interfaceC2148 = f17965;
        if (i5 <= 0) {
            return;
        }
        if (this.f17976 == null) {
            throw new IOException("Bad file descriptor");
        }
        C12209 c12209Mo5164 = mo5164();
        try {
            C3618 c3618M29693 = c12209Mo5164.m29693();
            try {
                if (interfaceC2148.mo7086()) {
                    StringBuilder sb = new StringBuilder("write: fid=");
                    sb.append(c12209Mo5164);
                    sb.append(",off=");
                    i4 = i;
                    sb.append(i4);
                    sb.append(",len=");
                    sb.append(i5);
                    sb.append(",fp=");
                    sb.append(this.f17977);
                    interfaceC2148.mo7088(sb.toString());
                } else {
                    i4 = i;
                }
                do {
                    int i6 = this.f17979.mo28329() == 1 ? this.f17972 : this.f17966;
                    if (i5 <= i6) {
                        i6 = i5;
                    }
                    if (this.f17980) {
                        C9095 c9095 = new C9095(c3618M29693.m11094(), c12209Mo5164.m29690());
                        c9095.m23469(this.f17977);
                        c9095.m23467(i4, i6, bArr);
                        jM16318 = ((C16149) c3618M29693.m11087(c9095, null, EnumC0214.NO_RETRY)).m38067();
                        this.f17977 += jM16318;
                    } else if (this.f17970) {
                        this.f17974.m25234(c12209Mo5164.m29692(), this.f17977, i5 - i6, bArr, i4, i6);
                        if ((i3 & 1) != 0) {
                            this.f17974.m25234(c12209Mo5164.m29692(), this.f17977, i5, bArr, i4, i6);
                            this.f17974.m25235(8);
                        } else {
                            this.f17974.m25235(0);
                        }
                        c3618M29693.m11087(this.f17974, this.f17969, EnumC0214.NO_RETRY);
                        jM16318 = this.f17969.m16318();
                        this.f17977 += jM16318;
                    } else {
                        if (interfaceC2148.mo7099()) {
                            interfaceC2148.mo7101(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f17977), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                        this.f17975.m29634(c12209Mo5164.m29692(), this.f17977, i5 - i6, bArr, i4, i6);
                        c3618M29693.m11087(this.f17975, this.f17971, new EnumC0214[0]);
                        long jM28269 = this.f17971.m28269();
                        this.f17977 += jM28269;
                        i5 = (int) (((long) i5) - jM28269);
                        i4 = (int) (((long) i4) + jM28269);
                        if (interfaceC2148.mo7099()) {
                            interfaceC2148.mo7101(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f17977), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                    }
                    i5 = (int) (((long) i5) - jM16318);
                    i4 = (int) (((long) i4) + jM16318);
                } while (i5 > 0);
                c3618M29693.close();
                c12209Mo5164.m29688();
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
            if (c12209Mo5164 == null) {
                throw th3;
            }
            try {
                c12209Mo5164.m29688();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
