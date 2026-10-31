package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܺ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16168 extends Reader {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5377 f49806;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f49807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f49808;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final FileChannel f49809;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f49810;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f49811;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public char[] f49812;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f49814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f49815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f49816;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f49817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49818;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49819;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49820;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f49821;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16168 m38102(InterfaceC20758 interfaceC20758, C1143 c1143) {
        FileChannel fileChannelOpen = C12084.open(interfaceC20758, EnumC3824.READ);
        try {
            return new C16168(fileChannelOpen, c1143);
        } catch (IOException | Error | RuntimeException e) {
            try {
                fileChannelOpen.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C16168(FileChannel fileChannel, C1143 c1143) throws IOException {
        int i;
        this.f49820 = -1;
        this.f49809 = fileChannel;
        byte[] bArr = new byte[4];
        m38104(fileChannel, 0L, bArr, 4);
        int i2 = new C12951(bArr).readInt();
        if (i2 == 2053616492) {
            i = 8192;
        } else if (i2 == 2053617772) {
            i = 32768;
        } else {
            if (i2 != 2053619564) {
                throw new IOException("Unsupported legacy text file magic");
            }
            i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        this.f49816 = i;
        if (fileChannel.size() < i) {
            throw new EOFException("Truncated legacy text partition table");
        }
        int i3 = (i - 4) / 2;
        this.f49806 = c1143.m3921((((((long) i3) * 2) + 23) & (-8)) + 4240);
        try {
            this.f49812 = new char[i3];
            this.f49814 = new byte[4096];
            int i4 = 0;
            int iMax = -1;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(this.f49814.length / 2, i3 - i4);
                m38104(fileChannel, (((long) i4) * 2) + 4, this.f49814, iMin * 2);
                int i6 = 0;
                while (i6 < iMin) {
                    char cM38105 = m38105(i6 * 2);
                    if (cM38105 != 65535) {
                        if (cM38105 < i3) {
                            char[] cArr = this.f49812;
                            if (cArr[cM38105] == 0) {
                                cArr[cM38105] = (char) (i4 + 1);
                                iMax = Math.max(iMax, (int) cM38105);
                                i5++;
                            }
                        }
                        throw new IOException("Invalid legacy text block order");
                    }
                    i6++;
                    i4++;
                }
            }
            if (iMax + 1 != i5) {
                throw new IOException("Missing legacy text block ordinal");
            }
            this.f49815 = i5;
            int i7 = 0;
            int i8 = 0;
            long j = 0;
            while (true) {
                int i9 = this.f49815;
                if (i7 < i9) {
                    m38103(i7);
                    j += (long) this.f49818;
                    i8 = (i8 * 31) + this.f49819;
                    if (j > 2147483647L) {
                        throw new IOException("Legacy text exceeds coordinate limit");
                    }
                    i7++;
                } else {
                    int i10 = (int) j;
                    this.f49810 = i10;
                    this.f49817 = (i10 * 31) + (i9 == 0 ? 15739258 : i8);
                    this.f49820 = -1;
                    this.f49807 = 0;
                    this.f49818 = 0;
                    return;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f49806.close();
            throw e;
        }
    }

    public final int length() {
        return this.f49810;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38106() {
        return this.f49817;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38103(int i) throws IOException {
        long j = (((long) (this.f49812[i] - 1)) * X931RNG.BLOCK64_RESEED_MAX) + ((long) this.f49816);
        this.f49808 = j;
        FileChannel fileChannel = this.f49809;
        if (j > fileChannel.size() - X931RNG.BLOCK64_RESEED_MAX) {
            throw new EOFException("Truncated legacy text block");
        }
        m38104(fileChannel, this.f49808, this.f49814, 12);
        C12951 c12951 = new C12951(this.f49814);
        int i2 = c12951.readInt();
        this.f49821 = c12951.readInt();
        int i3 = c12951.readInt();
        this.f49813 = i3;
        int i4 = this.f49821;
        if (i4 < 0 || i3 < 0 || i4 > 16378 || i3 > 16378 - i4) {
            throw new IOException("Invalid legacy text gap");
        }
        this.f49818 = 16378 - i3;
        this.f49819 = ((((((i4 * 31) + i3) * 31) + i2) * 31) + this.f49812[i]) - 1;
        this.f49807 = 0;
        this.f49820 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private char m38105(int i) {
        byte[] bArr = this.f49814;
        return (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38104(FileChannel fileChannel, long j, byte[] bArr, int i) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int i2 = fileChannel.read(byteBufferWrap, j);
            if (i2 < 0) {
                throw new EOFException("Truncated legacy text data");
            }
            if (i2 == 0) {
                throw new IOException("Legacy text read made no progress");
            }
            j += (long) i2;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (this.f49811) {
            throw new IOException("Legacy text reader is closed");
        }
        while (true) {
            int i = this.f49807;
            if (i != this.f49818) {
                m38104(this.f49809, (((long) i) * 2) + this.f49808 + 12 + ((long) (i >= this.f49821 ? this.f49813 : 0)), this.f49814, 2);
                this.f49807++;
                return m38105(0);
            }
            int i2 = this.f49820 + 1;
            if (i2 == this.f49815) {
                return -1;
            }
            m38103(i2);
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this.f49811) {
            throw new IOException("Legacy text reader is closed");
        }
        C13409.m32419(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        loop0: while (i5 < i2) {
            if (!this.f49811) {
                while (true) {
                    i3 = this.f49807;
                    i4 = this.f49818;
                    if (i3 == i4) {
                        int i6 = this.f49820 + 1;
                        if (i6 == this.f49815) {
                            break loop0;
                        }
                        m38103(i6);
                    }
                }
                int i7 = this.f49821;
                if (i3 < i7) {
                    i4 = i7;
                }
                int iMin = Math.min(Math.min(i2 - i5, i4 - i3), this.f49814.length / 2);
                long j = this.f49808 + 12;
                int i8 = this.f49807;
                m38104(this.f49809, (((long) i8) * 2) + j + ((long) (i8 >= this.f49821 ? this.f49813 : 0)), this.f49814, iMin * 2);
                for (int i9 = 0; i9 < iMin; i9++) {
                    cArr[i + i5 + i9] = m38105(i9 * 2);
                }
                i5 += iMin;
                this.f49807 += iMin;
            } else {
                throw new IOException("Legacy text reader is closed");
            }
        }
        if (i5 == 0) {
            return -1;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f49806;
        if (this.f49811) {
            return;
        }
        this.f49811 = true;
        try {
            this.f49809.close();
        } finally {
            this.f49812 = null;
            this.f49814 = null;
            c5377.close();
        }
    }
}
