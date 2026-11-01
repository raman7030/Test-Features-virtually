package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.֫ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4250 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC8233 f9413;

    /* JADX INFO: renamed from: ᩶ */
    public final C12968 f9415;

    /* JADX INFO: renamed from: ᩹ */
    public final Inflater f9417;

    /* JADX INFO: renamed from: ۙ */
    public int f9414 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final CRC32 f9416 = new CRC32();

    public C4250(InterfaceC3579 interfaceC3579) {
        if (interfaceC3579 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f9417 = inflater;
        int i = C25037.f79922;
        C6262 c6262 = new C6262(interfaceC3579);
        this.f9413 = c6262;
        this.f9415 = new C12968(c6262, inflater);
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        short s;
        C6262 c6262;
        short s2;
        long j2;
        int i = this.f9414;
        CRC32 crc32 = this.f9416;
        InterfaceC8233 interfaceC8233 = this.f9413;
        if (i == 0) {
            C6262 c6263 = (C6262) interfaceC8233;
            c6263.mo14218(10L);
            C14268 c14269 = c6263.f15843;
            byte bM32787 = c14269.m32787(3L);
            boolean z = ((bM32787 >> 1) & 1) == 1;
            if (z) {
                m8637(c6263.f15843, 0L, 10L);
            }
            m8636(8075, c6263.readShort(), "ID1ID2");
            c6263.skip(8L);
            if (((bM32787 >> 2) & 1) == 1) {
                c6263.mo14218(2L);
                if (z) {
                    s2 = 65280;
                    m8637(c6263.f15843, 0L, 2L);
                } else {
                    s2 = 65280;
                }
                short s3 = c14269.readShort();
                Charset charset = C23026.f72410;
                long j3 = (short) (((s3 & 255) << 8) | ((s3 & s2) >>> 8));
                c6263.mo14218(j3);
                if (z) {
                    m8637(c6263.f15843, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c6263.skip(j2);
                s = s2;
            } else {
                s = 65280;
            }
            if (((bM32787 >> 3) & 1) == 1) {
                c6262 = c6263;
                long jM14206 = c6263.m14206((byte) 0, 0L, C14849.FOREVER_NS);
                if (jM14206 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m8637(c6262.f15843, 0L, jM14206 + 1);
                }
                c6262.skip(jM14206 + 1);
            } else {
                c6262 = c6263;
            }
            if (((bM32787 >> 4) & 1) == 1) {
                long jM14207 = c6262.m14206((byte) 0, 0L, C14849.FOREVER_NS);
                if (jM14207 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m8637(c6262.f15843, 0L, jM14207 + 1);
                }
                c6262.skip(jM14207 + 1);
            }
            if (z) {
                c6262.mo14218(2L);
                short s4 = c14269.readShort();
                Charset charset2 = C23026.f72410;
                m8636((short) (((s4 & 255) << 8) | ((s4 & s) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f9414 = 1;
        } else {
            s = 65280;
        }
        if (this.f9414 == 1) {
            long j4 = c14268.f40649;
            long jMo6580 = this.f9415.mo6580(c14268, 8192L);
            if (jMo6580 != -1) {
                m8637(c14268, j4, jMo6580);
                return jMo6580;
            }
            this.f9414 = 2;
        }
        if (this.f9414 != 2) {
            return -1L;
        }
        C6262 c6264 = (C6262) interfaceC8233;
        c6264.mo14218(4L);
        C14268 c142610 = c6264.f15843;
        int i2 = c142610.readInt();
        Charset charset3 = C23026.f72410;
        m8636(((i2 & 255) << 24) | ((i2 & (-16777216)) >>> 24) | ((i2 & 16711680) >>> 8) | ((i2 & s) << 8), (int) crc32.getValue(), "CRC");
        c6264.mo14218(4L);
        int i3 = c142610.readInt();
        m8636(((i3 & 255) << 24) | ((i3 & (-16777216)) >>> 24) | ((i3 & 16711680) >>> 8) | ((i3 & s) << 8), (int) this.f9417.getBytesWritten(), "ISIZE");
        this.f9414 = 3;
        if (c6264.mo14213()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return ((C6262) this.f9413).f15842.mo6579();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9415.close();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8637(C14268 c14268, long j, long j2) {
        C20344 c20344 = c14268.f40648;
        while (true) {
            int i = c20344.f62828;
            int i2 = c20344.f62831;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c20344 = c20344.f62830;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c20344.f62831) + j);
            int iMin = (int) Math.min(c20344.f62828 - i3, j2);
            this.f9416.update(c20344.f62827, i3, iMin);
            j2 -= (long) iMin;
            c20344 = c20344.f62830;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8636(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
