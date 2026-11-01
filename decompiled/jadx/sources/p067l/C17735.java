package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܺ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17735 extends Reader {

    /* JADX INFO: renamed from: ֫֫ */
    public final C7479 f52972;

    /* JADX INFO: renamed from: ۗ */
    public int f52973;

    /* JADX INFO: renamed from: ۙ */
    public long f52974;

    /* JADX INFO: renamed from: ۛ */
    public final FileChannel f52975;

    /* JADX INFO: renamed from: ۟ */
    public final int f52976;

    /* JADX INFO: renamed from: ۤ */
    public boolean f52977;

    /* JADX INFO: renamed from: ۧ֫ */
    public char[] f52978;

    /* JADX INFO: renamed from: ۨ */
    public int f52979;

    /* JADX INFO: renamed from: ۫ */
    public byte[] f52980;

    /* JADX INFO: renamed from: ۬ */
    public final int f52981;

    /* JADX INFO: renamed from: ܰ */
    public final int f52982;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f52983;

    /* JADX INFO: renamed from: ᩶ */
    public int f52984;

    /* JADX INFO: renamed from: ᩸ */
    public int f52985;

    /* JADX INFO: renamed from: ᩹ */
    public int f52986;

    /* JADX INFO: renamed from: ᩺ */
    public int f52987;

    /* JADX INFO: renamed from: ֫ */
    public static C17735 m40294(InterfaceC22097 interfaceC22097, C3455 c3455) {
        FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.READ);
        try {
            return new C17735(fileChannelOpen, c3455);
        } catch (IOException | Error | RuntimeException e) {
            try {
                fileChannelOpen.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C17735(FileChannel fileChannel, C3455 c3455) throws IOException {
        int i;
        this.f52986 = -1;
        this.f52975 = fileChannel;
        byte[] bArr = new byte[4];
        m40296(fileChannel, 0L, bArr, 4);
        int i2 = new C14677(bArr).readInt();
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
        this.f52982 = i;
        if (fileChannel.size() < i) {
            throw new EOFException("Truncated legacy text partition table");
        }
        int i3 = (i - 4) / 2;
        this.f52972 = c3455.m6162((((((long) i3) * 2) + 23) & (-8)) + 4240);
        try {
            this.f52978 = new char[i3];
            this.f52980 = new byte[4096];
            int i4 = 0;
            int iMax = -1;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(this.f52980.length / 2, i3 - i4);
                m40296(fileChannel, (((long) i4) * 2) + 4, this.f52980, iMin * 2);
                int i6 = 0;
                while (i6 < iMin) {
                    char cM40297 = m40297(i6 * 2);
                    if (cM40297 != 65535) {
                        if (cM40297 < i3) {
                            char[] cArr = this.f52978;
                            if (cArr[cM40297] == 0) {
                                cArr[cM40297] = (char) (i4 + 1);
                                iMax = Math.max(iMax, (int) cM40297);
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
            this.f52981 = i5;
            int i7 = 0;
            int i8 = 0;
            long j = 0;
            while (true) {
                int i9 = this.f52981;
                if (i7 < i9) {
                    m40295(i7);
                    j += (long) this.f52984;
                    i8 = (i8 * 31) + this.f52985;
                    if (j > 2147483647L) {
                        throw new IOException("Legacy text exceeds coordinate limit");
                    }
                    i7++;
                } else {
                    int i10 = (int) j;
                    this.f52976 = i10;
                    this.f52983 = (i10 * 31) + (i9 == 0 ? 15739258 : i8);
                    this.f52986 = -1;
                    this.f52973 = 0;
                    this.f52984 = 0;
                    return;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f52972.close();
            throw e;
        }
    }

    public final int length() {
        return this.f52976;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40298() {
        return this.f52983;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40295(int i) throws IOException {
        long j = (((long) (this.f52978[i] - 1)) * X931RNG.BLOCK64_RESEED_MAX) + ((long) this.f52982);
        this.f52974 = j;
        FileChannel fileChannel = this.f52975;
        if (j > fileChannel.size() - X931RNG.BLOCK64_RESEED_MAX) {
            throw new EOFException("Truncated legacy text block");
        }
        m40296(fileChannel, this.f52974, this.f52980, 12);
        C14677 c14677 = new C14677(this.f52980);
        int i2 = c14677.readInt();
        this.f52987 = c14677.readInt();
        int i3 = c14677.readInt();
        this.f52979 = i3;
        int i4 = this.f52987;
        if (i4 < 0 || i3 < 0 || i4 > 16378 || i3 > 16378 - i4) {
            throw new IOException("Invalid legacy text gap");
        }
        this.f52984 = 16378 - i3;
        this.f52985 = ((((((i4 * 31) + i3) * 31) + i2) * 31) + this.f52978[i]) - 1;
        this.f52973 = 0;
        this.f52986 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    private char m40297(int i) {
        byte[] bArr = this.f52980;
        return (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40296(FileChannel fileChannel, long j, byte[] bArr, int i) throws IOException {
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
        if (this.f52977) {
            throw new IOException("Legacy text reader is closed");
        }
        while (true) {
            int i = this.f52973;
            if (i != this.f52984) {
                m40296(this.f52975, (((long) i) * 2) + this.f52974 + 12 + ((long) (i >= this.f52987 ? this.f52979 : 0)), this.f52980, 2);
                this.f52973++;
                return m40297(0);
            }
            int i2 = this.f52986 + 1;
            if (i2 == this.f52981) {
                return -1;
            }
            m40295(i2);
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this.f52977) {
            throw new IOException("Legacy text reader is closed");
        }
        C15113.m34521(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        loop0: while (i5 < i2) {
            if (!this.f52977) {
                while (true) {
                    i3 = this.f52973;
                    i4 = this.f52984;
                    if (i3 == i4) {
                        int i6 = this.f52986 + 1;
                        if (i6 == this.f52981) {
                            break loop0;
                        }
                        m40295(i6);
                    }
                }
                int i7 = this.f52987;
                if (i3 < i7) {
                    i4 = i7;
                }
                int iMin = Math.min(Math.min(i2 - i5, i4 - i3), this.f52980.length / 2);
                long j = this.f52974 + 12;
                int i8 = this.f52973;
                m40296(this.f52975, (((long) i8) * 2) + j + ((long) (i8 >= this.f52987 ? this.f52979 : 0)), this.f52980, iMin * 2);
                for (int i9 = 0; i9 < iMin; i9++) {
                    cArr[i + i5 + i9] = m40297(i9 * 2);
                }
                i5 += iMin;
                this.f52973 += iMin;
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
        C7479 c7479 = this.f52972;
        if (this.f52977) {
            return;
        }
        this.f52977 = true;
        try {
            this.f52975.close();
        } finally {
            this.f52978 = null;
            this.f52980 = null;
            c7479.close();
        }
    }
}
