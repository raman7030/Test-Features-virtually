package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9UP */
/* JADX INFO: loaded from: classes2.dex */
public class C7937 extends OutputStream {

    /* JADX INFO: renamed from: ܽ֫ */
    public static final InterfaceC4410 f20819 = C13128.m30022(C7937.class);

    /* JADX INFO: renamed from: ֫֫ */
    public int f20820;

    /* JADX INFO: renamed from: ۗ */
    public int f20821;

    /* JADX INFO: renamed from: ۙ */
    public C13972 f20822;

    /* JADX INFO: renamed from: ۛ */
    public C7898 f20823;

    /* JADX INFO: renamed from: ۟ */
    public boolean f20824;

    /* JADX INFO: renamed from: ۤ */
    public C13263 f20825;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f20826;

    /* JADX INFO: renamed from: ۨ */
    public int f20827;

    /* JADX INFO: renamed from: ۫ */
    public C11922 f20828;

    /* JADX INFO: renamed from: ۬ */
    public C13933 f20829;

    /* JADX INFO: renamed from: ܰ */
    public byte[] f20830;

    /* JADX INFO: renamed from: ᩶ */
    public long f20831;

    /* JADX INFO: renamed from: ᩸ */
    public int f20832;

    /* JADX INFO: renamed from: ᩹ */
    public C14642 f20833;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f20834;

    /* JADX INFO: renamed from: ֫ */
    public synchronized C13972 mo7406() {
        if (isOpen()) {
            f20819.mo9196("File already open");
            C13972 c13972 = this.f20822;
            c13972.m31748();
            return c13972;
        }
        C13972 c13972M33448 = this.f20833.m33448(this.f20821, this.f20832, this.f20827, 128, 0);
        c13972M33448.m31748();
        this.f20822 = c13972M33448;
        return c13972M33448;
    }

    public C7937(C14642 c14642) throws C5255 {
        this.f20830 = new byte[1];
        this.f20833 = c14642;
        this.f20821 = 82;
        this.f20827 = 7;
        this.f20832 = 2;
        try {
            C5807 c5807M33461 = c14642.m33461();
            try {
                boolean zM13076 = c5807M33461.m13076();
                this.f20834 = zM13076;
                C13972 c13972Mo7406 = mo7406();
                try {
                    m18342(c5807M33461);
                    if (zM13076) {
                        C25094 c25094 = new C25094(c5807M33461.m13070(), c13972Mo7406.m31752());
                        c25094.m55072(new C9870());
                        c5807M33461.m13063(c25094, null, EnumC2572.NO_RETRY);
                    }
                    c13972Mo7406.m31750();
                    c5807M33461.close();
                } catch (Throwable th) {
                    try {
                        c13972Mo7406.m31750();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    public C7937(C13302 c13302, C5807 c5807) {
        this.f20830 = new byte[1];
        this.f20833 = c13302;
        this.f20822 = null;
        this.f20821 = 0;
        this.f20832 = 0;
        this.f20827 = 0;
        this.f20834 = c5807.m13076();
        m18342(c5807);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18342(C5807 c5807) {
        int sendBufferSize = c5807.getSendBufferSize();
        if (this.f20834) {
            this.f20820 = sendBufferSize;
            this.f20826 = sendBufferSize;
            return;
        }
        this.f20821 &= -81;
        this.f20820 = sendBufferSize - 70;
        boolean zM13065 = c5807.m13065(16);
        this.f20824 = zM13065;
        InterfaceC4410 interfaceC4410 = f20819;
        if (!zM13065) {
            interfaceC4410.mo9183("No support for NT SMBs");
        }
        if (c5807.m13065(32768) && !c5807.m13072()) {
            this.f20826 = Math.min(((C15410) c5807.m13070()).m35111() - 70, 65465);
        } else {
            interfaceC4410.mo9183("No support or SMB signing is enabled, not enabling large writes");
            this.f20826 = this.f20820;
        }
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Negotiated file write size is " + this.f20826);
        }
        if (this.f20824) {
            this.f20828 = new C11922(c5807.m13070());
            this.f20823 = new C7898(c5807.m13070());
        } else {
            this.f20829 = new C13933(c5807.m13070());
            this.f20825 = new C13263(c5807.m13070());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C14642 c14642 = this.f20833;
        try {
            if (this.f20822.m31751()) {
                this.f20822.m31750();
            }
        } finally {
            c14642.m33460();
            this.f20830 = null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f20830;
        bArr[0] = (byte) i;
        m18343(0, bArr, 1, 0);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m18343(0, bArr, bArr.length, 0);
    }

    public boolean isOpen() {
        C13972 c13972 = this.f20822;
        return c13972 != null && c13972.m31751();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m18343(i, bArr, i2, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18343(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long jM18243;
        int i5 = i2;
        InterfaceC4410 interfaceC4410 = f20819;
        if (i5 <= 0) {
            return;
        }
        if (this.f20830 == null) {
            throw new IOException("Bad file descriptor");
        }
        C13972 c13972Mo7406 = mo7406();
        try {
            C5807 c5807M31755 = c13972Mo7406.m31755();
            try {
                if (interfaceC4410.mo9181()) {
                    StringBuilder sb = new StringBuilder("write: fid=");
                    sb.append(c13972Mo7406);
                    sb.append(",off=");
                    i4 = i;
                    sb.append(i4);
                    sb.append(",len=");
                    sb.append(i5);
                    sb.append(",fp=");
                    sb.append(this.f20831);
                    interfaceC4410.mo9183(sb.toString());
                } else {
                    i4 = i;
                }
                do {
                    int i6 = this.f20833.mo30373() == 1 ? this.f20826 : this.f20820;
                    if (i5 <= i6) {
                        i6 = i5;
                    }
                    if (this.f20834) {
                        C11013 c11013 = new C11013(c5807M31755.m13070(), c13972Mo7406.m31752());
                        c11013.m25416(this.f20831);
                        c11013.m25414(i4, i6, bArr);
                        jM18243 = ((C17717) c5807M31755.m13063(c11013, null, EnumC2572.NO_RETRY)).m40259();
                        this.f20831 += jM18243;
                    } else if (this.f20824) {
                        this.f20828.m27251(c13972Mo7406.m31754(), this.f20831, i5 - i6, bArr, i4, i6);
                        if ((i3 & 1) != 0) {
                            this.f20828.m27251(c13972Mo7406.m31754(), this.f20831, i5, bArr, i4, i6);
                            this.f20828.m27252(8);
                        } else {
                            this.f20828.m27252(0);
                        }
                        c5807M31755.m13063(this.f20828, this.f20823, EnumC2572.NO_RETRY);
                        jM18243 = this.f20823.m18243();
                        this.f20831 += jM18243;
                    } else {
                        if (interfaceC4410.mo9194()) {
                            interfaceC4410.mo9196(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f20831), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                        this.f20829.m31696(c13972Mo7406.m31754(), this.f20831, i5 - i6, bArr, i4, i6);
                        c5807M31755.m13063(this.f20829, this.f20825, new EnumC2572[0]);
                        long jM30313 = this.f20825.m30313();
                        this.f20831 += jM30313;
                        i5 = (int) (((long) i5) - jM30313);
                        i4 = (int) (((long) i4) + jM30313);
                        if (interfaceC4410.mo9194()) {
                            interfaceC4410.mo9196(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f20831), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                    }
                    i5 = (int) (((long) i5) - jM18243);
                    i4 = (int) (((long) i4) + jM18243);
                } while (i5 > 0);
                c5807M31755.close();
                c13972Mo7406.m31750();
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
            if (c13972Mo7406 == null) {
                throw th3;
            }
            try {
                c13972Mo7406.m31750();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
