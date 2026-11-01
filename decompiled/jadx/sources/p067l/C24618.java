package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GH */
/* JADX INFO: loaded from: classes.dex */
public final class C24618 implements InterfaceC9866 {

    /* JADX INFO: renamed from: ۟ */
    public static final C2582 f77917 = new C2582(2);

    /* JADX INFO: renamed from: ۗ */
    public long f77918;

    /* JADX INFO: renamed from: ۛ */
    public long f77920;

    /* JADX INFO: renamed from: ۫ */
    public boolean f77923;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f77927;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC4502 f77929;

    /* JADX INFO: renamed from: ܰ */
    public long f77925 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f77928 = false;

    /* JADX INFO: renamed from: ۨ */
    public boolean f77922 = false;

    /* JADX INFO: renamed from: ۙ */
    public boolean f77919 = false;

    /* JADX INFO: renamed from: ۬ */
    public long f77924 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public long f77926 = 0;

    /* JADX INFO: renamed from: ۤ */
    public long f77921 = 0;

    public C24618(InterfaceC4502 interfaceC4502) {
        this.f77929 = interfaceC4502;
        byte[] bArr = (byte[]) f77917.m3892();
        if (bArr == null) {
            bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        this.f77927 = bArr;
        this.f77920 = 131072L;
        this.f77923 = false;
        this.f77918 = 0L;
    }

    @Override // p067l.InterfaceC9866
    public final int available() {
        long length = length() - getFilePointer();
        if (length <= 2147483647L) {
            return (int) length;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54254() {
        long filePointer = getFilePointer();
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m54257(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException("Data out of range (UShort)");
        }
        write(i & 255);
        write((i >>> 8) & 255);
    }

    @Override // p067l.InterfaceC9866
    public final void write(int i) {
        long j = this.f77926;
        long j2 = this.f77924;
        if (j >= j2) {
            if (this.f77923 && j2 < this.f77920) {
                this.f77924 = j2 + 1;
            } else {
                seek(j);
                long j3 = this.f77926;
                long j4 = this.f77924;
                if (j3 == j4) {
                    this.f77924 = j4 + 1;
                }
            }
        }
        byte[] bArr = this.f77927;
        long j5 = this.f77926;
        bArr[(int) (j5 - this.f77921)] = (byte) i;
        this.f77926 = j5 + 1;
        this.f77919 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54255(char c) {
        write(c & 255);
        write((c >>> '\b') & 255);
    }

    public final void writeInt(int i) {
        write(i & 255);
        write((i >>> 8) & 255);
        write((i >>> 16) & 255);
        write((i >>> 24) & 255);
    }

    @Override // p067l.InterfaceC9866
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // p067l.InterfaceC9866
    public final byte readByte() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // p067l.InterfaceC9866
    /* JADX INFO: renamed from: ۛۧ */
    public final int mo23137() {
        return (readByte() & 255) | ((readByte() & 255) << 8);
    }

    @Override // p067l.InterfaceC9866
    public final int read() {
        long j = this.f77926;
        if (j >= this.f77924) {
            if (this.f77923) {
                return -1;
            }
            seek(j);
            if (this.f77926 == this.f77924) {
                return -1;
            }
        }
        byte[] bArr = this.f77927;
        long j2 = this.f77926;
        byte b = bArr[(int) (j2 - this.f77921)];
        this.f77926 = j2 + 1;
        return b & 255;
    }

    @Override // p067l.InterfaceC9866
    public final int readInt() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    @Override // p067l.InterfaceC9866
    public final long readLong() {
        return (((long) readByte()) & 255) | ((((long) readByte()) & 255) << 8) | ((((long) readByte()) & 255) << 16) | ((((long) readByte()) & 255) << 24) | ((((long) readByte()) & 255) << 32) | ((((long) readByte()) & 255) << 40) | ((((long) readByte()) & 255) << 48) | ((255 & ((long) readByte())) << 56);
    }

    @Override // p067l.InterfaceC9866
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p067l.InterfaceC9866
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f77926;
        if (j >= this.f77924) {
            if (this.f77923) {
                return -1;
            }
            seek(j);
            if (this.f77926 == this.f77924) {
                return -1;
            }
        }
        int iMin = Math.min(i2, (int) (this.f77924 - this.f77926));
        System.arraycopy(this.f77927, (int) (this.f77926 - this.f77921), bArr, i, iMin);
        this.f77926 += (long) iMin;
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

    @Override // p067l.InterfaceC9866
    /* JADX INFO: renamed from: ۧ */
    public final int mo23140(int i, int i2, byte[] bArr) {
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

    @Override // p067l.InterfaceC9866
    public final void readFully(byte[] bArr) throws EOFException {
        m54256(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54256(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // p067l.InterfaceC9866
    public final long length() {
        long j = this.f77926;
        if (this.f77925 == -1) {
            this.f77925 = this.f77929.length();
        }
        return Math.max(j, this.f77925);
    }

    public final void setLength(long j) {
        m54253();
        InterfaceC4502 interfaceC4502 = this.f77929;
        interfaceC4502.setLength(j);
        this.f77925 = j;
        if (this.f77926 > j) {
            this.f77926 = j;
        }
        if (this.f77918 > j) {
            interfaceC4502.seek(j);
            this.f77918 = j;
        }
        this.f77924 = 0L;
        this.f77921 = 0L;
        seek(this.f77926);
    }

    @Override // p067l.InterfaceC9866
    public final void seek(long j) {
        if (j >= this.f77924 || j < this.f77921) {
            m54253();
            long j2 = (-131072) & j;
            this.f77921 = j2;
            this.f77920 = ((long) this.f77927.length) + j2;
            long j3 = this.f77918;
            InterfaceC4502 interfaceC4502 = this.f77929;
            if (j3 != j2) {
                interfaceC4502.seek(j2);
                this.f77918 = this.f77921;
            }
            int length = this.f77927.length;
            int i = 0;
            while (length > 0) {
                int i2 = interfaceC4502.read(this.f77927, i, length);
                if (i2 < 0) {
                    break;
                }
                i += i2;
                length -= i2;
            }
            byte[] bArr = this.f77927;
            boolean z = i < bArr.length;
            this.f77923 = z;
            if (z) {
                Arrays.fill(bArr, i, bArr.length, (byte) -1);
            }
            long j4 = i;
            this.f77918 += j4;
            this.f77924 = this.f77921 + j4;
        } else if (j < this.f77926) {
            m54253();
        }
        this.f77926 = j;
    }

    @Override // p067l.InterfaceC9866
    public final long getFilePointer() {
        return this.f77926;
    }

    @Override // p067l.InterfaceC9866
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        long j = this.f77926;
        long length = length();
        long j2 = ((long) i) + j;
        if (j2 <= length) {
            length = j2;
        }
        seek(length);
        return (int) (length - j);
    }

    @Override // p067l.InterfaceC9866
    public final String getName() {
        return this.f77929.getName();
    }

    @Override // p067l.InterfaceC9866
    /* JADX INFO: renamed from: ۜ֫ */
    public final InterfaceC4502 mo23138() {
        return this.f77929;
    }

    @Override // p067l.InterfaceC9866
    /* JADX INFO: renamed from: ۡ */
    public final C24618 mo23139() {
        return new C24618(this.f77929.mo9519());
    }

    @Override // p067l.InterfaceC9866
    /* JADX INFO: renamed from: ۧ */
    public final C24618 mo23141(long j, long j2) {
        return new C24618(this.f77929.mo9520(j, j2));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24618 m54259(long j, long j2) {
        return new C24618(this.f77929.mo9522(j, j2));
    }

    @Override // p067l.InterfaceC9866
    public final void flush() {
        m54253();
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m54258() {
        if (this.f77922) {
            this.f77929.mo9521();
            this.f77922 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f77928) {
            return;
        }
        m54253();
        this.f77928 = true;
        this.f77929.close();
        f77917.m3890(this.f77927);
        this.f77927 = null;
    }

    @Override // p067l.InterfaceC9866
    public final boolean isClosed() {
        return this.f77928;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f77928;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @Override // p067l.InterfaceC9866, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
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
            long j = this.f77926;
            if (j >= this.f77924) {
                if (!this.f77923) {
                    seek(j);
                    if (this.f77926 != this.f77924) {
                        iMin = Math.min(i2, (int) (this.f77924 - this.f77926));
                        byteBuffer.put(this.f77927, (int) (this.f77926 - this.f77921), iMin);
                        this.f77926 += (long) iMin;
                    }
                }
                iMin = -1;
            } else {
                iMin = Math.min(i2, (int) (this.f77924 - this.f77926));
                byteBuffer.put(this.f77927, (int) (this.f77926 - this.f77921), iMin);
                this.f77926 += (long) iMin;
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
            long j = this.f77926;
            long j2 = this.f77924;
            if (j >= j2) {
                if (this.f77923) {
                    long j3 = this.f77920;
                    if (j2 < j3) {
                        this.f77924 = j3;
                    } else {
                        seek(j);
                        if (this.f77926 == this.f77924) {
                            this.f77924 = this.f77920;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f77926 == this.f77924) {
                        this.f77924 = this.f77920;
                    }
                }
            }
            int iMin = Math.min(iRemaining, (int) (this.f77924 - this.f77926));
            byteBuffer.get(this.f77927, (int) (this.f77926 - this.f77921), iMin);
            this.f77926 += (long) iMin;
            i += iMin;
            this.f77919 = true;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m54253() {
        if (this.f77919) {
            long j = this.f77918;
            long j2 = this.f77921;
            InterfaceC4502 interfaceC4502 = this.f77929;
            if (j != j2) {
                interfaceC4502.seek(j2);
            }
            interfaceC4502.write(this.f77927, 0, (int) (this.f77926 - this.f77921));
            long j3 = this.f77926;
            this.f77918 = j3;
            this.f77919 = false;
            long j4 = this.f77925;
            if (j4 != -1 && j3 > j4) {
                this.f77925 = -1L;
            }
            this.f77922 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[SYNTHETIC] */
    @Override // p067l.InterfaceC9866
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            long j = this.f77926;
            long j2 = this.f77924;
            if (j >= j2) {
                if (this.f77923) {
                    long j3 = this.f77920;
                    if (j2 < j3) {
                        this.f77924 = j3;
                    } else {
                        seek(j);
                        if (this.f77926 == this.f77924) {
                            this.f77924 = this.f77920;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f77926 == this.f77924) {
                        this.f77924 = this.f77920;
                    }
                }
            }
            int iMin = Math.min(i2, (int) (this.f77924 - this.f77926));
            System.arraycopy(bArr, i, this.f77927, (int) (this.f77926 - this.f77921), iMin);
            this.f77926 += (long) iMin;
            i += iMin;
            i2 -= iMin;
            this.f77919 = true;
        }
    }
}
