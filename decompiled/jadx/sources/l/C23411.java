package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GH */
/* JADX INFO: loaded from: classes.dex */
public final class C23411 implements InterfaceC7889 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C0225 f75171 = new C0225(2);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f75172;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f75174;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75177;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f75181;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC2245 f75183;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f75179 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75182 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f75176 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75173 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f75178 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f75180 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f75175 = 0;

    public C23411(InterfaceC2245 interfaceC2245) {
        this.f75183 = interfaceC2245;
        byte[] bArr = (byte[]) f75171.m1479();
        if (bArr == null) {
            bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        this.f75181 = bArr;
        this.f75174 = 131072L;
        this.f75177 = false;
        this.f75172 = 0L;
    }

    @Override // l.InterfaceC7889
    public final int available() {
        long length = length() - getFilePointer();
        if (length <= 2147483647L) {
            return (int) length;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51856() {
        long filePointer = getFilePointer();
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m51859(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException("Data out of range (UShort)");
        }
        write(i & 255);
        write((i >>> 8) & 255);
    }

    @Override // l.InterfaceC7889
    public final void write(int i) {
        long j = this.f75180;
        long j2 = this.f75178;
        if (j >= j2) {
            if (this.f75177 && j2 < this.f75174) {
                this.f75178 = j2 + 1;
            } else {
                seek(j);
                long j3 = this.f75180;
                long j4 = this.f75178;
                if (j3 == j4) {
                    this.f75178 = j4 + 1;
                }
            }
        }
        byte[] bArr = this.f75181;
        long j5 = this.f75180;
        bArr[(int) (j5 - this.f75175)] = (byte) i;
        this.f75180 = j5 + 1;
        this.f75173 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51857(char c) {
        write(c & 255);
        write((c >>> '\b') & 255);
    }

    public final void writeInt(int i) {
        write(i & 255);
        write((i >>> 8) & 255);
        write((i >>> 16) & 255);
        write((i >>> 24) & 255);
    }

    @Override // l.InterfaceC7889
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7889
    public final byte readByte() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC7889
    /* JADX INFO: renamed from: ۛۧ */
    public final int mo21172() {
        return (readByte() & 255) | ((readByte() & 255) << 8);
    }

    @Override // l.InterfaceC7889
    public final int read() {
        long j = this.f75180;
        if (j >= this.f75178) {
            if (this.f75177) {
                return -1;
            }
            seek(j);
            if (this.f75180 == this.f75178) {
                return -1;
            }
        }
        byte[] bArr = this.f75181;
        long j2 = this.f75180;
        byte b = bArr[(int) (j2 - this.f75175)];
        this.f75180 = j2 + 1;
        return b & 255;
    }

    @Override // l.InterfaceC7889
    public final int readInt() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    @Override // l.InterfaceC7889
    public final long readLong() {
        return (((long) readByte()) & 255) | ((((long) readByte()) & 255) << 8) | ((((long) readByte()) & 255) << 16) | ((((long) readByte()) & 255) << 24) | ((((long) readByte()) & 255) << 32) | ((((long) readByte()) & 255) << 40) | ((((long) readByte()) & 255) << 48) | ((255 & ((long) readByte())) << 56);
    }

    @Override // l.InterfaceC7889
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7889
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f75180;
        if (j >= this.f75178) {
            if (this.f75177) {
                return -1;
            }
            seek(j);
            if (this.f75180 == this.f75178) {
                return -1;
            }
        }
        int iMin = Math.min(i2, (int) (this.f75178 - this.f75180));
        System.arraycopy(this.f75181, (int) (this.f75180 - this.f75175), bArr, i, iMin);
        this.f75180 += (long) iMin;
        return iMin;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long position() {
        return getFilePointer();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel position(long j) {
        seek(j);
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() {
        return length();
    }

    @Override // l.InterfaceC7889
    /* JADX INFO: renamed from: ۧ */
    public final int mo21175(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                return i3;
            }
            i3 += i4;
        } while (i3 < i2);
        return i3;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j) {
        setLength(j);
        return this;
    }

    @Override // l.InterfaceC7889
    public final void readFully(byte[] bArr) throws EOFException {
        m51858(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51858(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // l.InterfaceC7889
    public final long length() {
        long j = this.f75180;
        if (this.f75179 == -1) {
            this.f75179 = this.f75183.length();
        }
        return Math.max(j, this.f75179);
    }

    public final void setLength(long j) {
        m51855();
        InterfaceC2245 interfaceC2245 = this.f75183;
        interfaceC2245.setLength(j);
        this.f75179 = j;
        if (this.f75180 > j) {
            this.f75180 = j;
        }
        if (this.f75172 > j) {
            interfaceC2245.seek(j);
            this.f75172 = j;
        }
        this.f75178 = 0L;
        this.f75175 = 0L;
        seek(this.f75180);
    }

    @Override // l.InterfaceC7889
    public final void seek(long j) {
        if (j >= this.f75178 || j < this.f75175) {
            m51855();
            long j2 = (-131072) & j;
            this.f75175 = j2;
            this.f75174 = ((long) this.f75181.length) + j2;
            long j3 = this.f75172;
            InterfaceC2245 interfaceC2245 = this.f75183;
            if (j3 != j2) {
                interfaceC2245.seek(j2);
                this.f75172 = this.f75175;
            }
            int length = this.f75181.length;
            int i = 0;
            while (length > 0) {
                int i2 = interfaceC2245.read(this.f75181, i, length);
                if (i2 < 0) {
                    break;
                }
                i += i2;
                length -= i2;
            }
            byte[] bArr = this.f75181;
            boolean z = i < bArr.length;
            this.f75177 = z;
            if (z) {
                Arrays.fill(bArr, i, bArr.length, (byte) -1);
            }
            long j4 = i;
            this.f75172 += j4;
            this.f75178 = this.f75175 + j4;
        } else if (j < this.f75180) {
            m51855();
        }
        this.f75180 = j;
    }

    @Override // l.InterfaceC7889
    public final long getFilePointer() {
        return this.f75180;
    }

    @Override // l.InterfaceC7889
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        long j = this.f75180;
        long length = length();
        long j2 = ((long) i) + j;
        if (j2 <= length) {
            length = j2;
        }
        seek(length);
        return (int) (length - j);
    }

    @Override // l.InterfaceC7889
    public final String getName() {
        return this.f75183.getName();
    }

    @Override // l.InterfaceC7889
    /* JADX INFO: renamed from: ۜ֫ */
    public final InterfaceC2245 mo21173() {
        return this.f75183;
    }

    @Override // l.InterfaceC7889
    /* JADX INFO: renamed from: ۡ */
    public final C23411 mo21174() {
        return new C23411(this.f75183.mo7437());
    }

    @Override // l.InterfaceC7889
    /* JADX INFO: renamed from: ۧ */
    public final C23411 mo21176(long j, long j2) {
        return new C23411(this.f75183.mo7438(j, j2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23411 m51861(long j, long j2) {
        return new C23411(this.f75183.mo7440(j, j2));
    }

    @Override // l.InterfaceC7889
    public final void flush() {
        m51855();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m51860() {
        if (this.f75176) {
            this.f75183.mo7439();
            this.f75176 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f75182) {
            return;
        }
        m51855();
        this.f75182 = true;
        this.f75183.close();
        f75171.m1477(this.f75181);
        this.f75181 = null;
    }

    @Override // l.InterfaceC7889
    public final boolean isClosed() {
        return this.f75182;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f75182;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @Override // l.InterfaceC7889, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int iMin;
        int iRemaining = byteBuffer.remaining();
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (iRemaining > iAvailable) {
            iRemaining = iAvailable;
        }
        int i = 0;
        do {
            int i2 = iRemaining - i;
            long j = this.f75180;
            if (j >= this.f75178) {
                if (!this.f75177) {
                    seek(j);
                    if (this.f75180 != this.f75178) {
                        iMin = Math.min(i2, (int) (this.f75178 - this.f75180));
                        byteBuffer.put(this.f75181, (int) (this.f75180 - this.f75175), iMin);
                        this.f75180 += (long) iMin;
                    }
                }
                iMin = -1;
            } else {
                iMin = Math.min(i2, (int) (this.f75178 - this.f75180));
                byteBuffer.put(this.f75181, (int) (this.f75180 - this.f75175), iMin);
                this.f75180 += (long) iMin;
            }
            if (iMin < 0) {
                return i;
            }
            i += iMin;
        } while (i < iRemaining);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002f A[SYNTHETIC] */
    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            int iRemaining = byteBuffer.remaining();
            long j = this.f75180;
            long j2 = this.f75178;
            if (j >= j2) {
                if (this.f75177) {
                    long j3 = this.f75174;
                    if (j2 < j3) {
                        this.f75178 = j3;
                    } else {
                        seek(j);
                        if (this.f75180 == this.f75178) {
                            this.f75178 = this.f75174;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f75180 == this.f75178) {
                        this.f75178 = this.f75174;
                    }
                }
            }
            int iMin = Math.min(iRemaining, (int) (this.f75178 - this.f75180));
            byteBuffer.get(this.f75181, (int) (this.f75180 - this.f75175), iMin);
            this.f75180 += (long) iMin;
            i += iMin;
            this.f75173 = true;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51855() {
        if (this.f75173) {
            long j = this.f75172;
            long j2 = this.f75175;
            InterfaceC2245 interfaceC2245 = this.f75183;
            if (j != j2) {
                interfaceC2245.seek(j2);
            }
            interfaceC2245.write(this.f75181, 0, (int) (this.f75180 - this.f75175));
            long j3 = this.f75180;
            this.f75172 = j3;
            this.f75173 = false;
            long j4 = this.f75179;
            if (j4 != -1 && j3 > j4) {
                this.f75179 = -1L;
            }
            this.f75176 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[SYNTHETIC] */
    @Override // l.InterfaceC7889
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            long j = this.f75180;
            long j2 = this.f75178;
            if (j >= j2) {
                if (this.f75177) {
                    long j3 = this.f75174;
                    if (j2 < j3) {
                        this.f75178 = j3;
                    } else {
                        seek(j);
                        if (this.f75180 == this.f75178) {
                            this.f75178 = this.f75174;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f75180 == this.f75178) {
                        this.f75178 = this.f75174;
                    }
                }
            }
            int iMin = Math.min(i2, (int) (this.f75178 - this.f75180));
            System.arraycopy(bArr, i, this.f75181, (int) (this.f75180 - this.f75175), iMin);
            this.f75180 += (long) iMin;
            i += iMin;
            i2 -= iMin;
            this.f75173 = true;
        }
    }
}
