package p067l;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۤܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public class C12279 extends InputStream implements DataInput, InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public byte[] f34293;

    /* JADX INFO: renamed from: ۙ */
    public int f34294;

    /* JADX INFO: renamed from: ᩶ */
    public int f34295;

    /* JADX INFO: renamed from: ᩸ */
    public ByteOrder f34296;

    /* JADX INFO: renamed from: ᩹ */
    public final DataInputStream f34297;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12279(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f34295 = bArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12279(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C12279(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f34297 = dataInputStream;
        dataInputStream.mark(0);
        this.f34294 = 0;
        this.f34296 = byteOrder;
        this.f34295 = inputStream instanceof C12279 ? ((C12279) inputStream).f34295 : -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28301(ByteOrder byteOrder) {
        this.f34296 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f34297.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f34294++;
        return this.f34297.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f34297.read(bArr, i, i2);
        this.f34294 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f34294++;
        return this.f34297.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f34294++;
        return this.f34297.readBoolean();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f34294 += 2;
        return this.f34297.readChar();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f34294 += 2;
        return this.f34297.readUTF();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f34294 += i2;
        this.f34297.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f34294 += bArr.length;
        this.f34297.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f34294++;
        int i = this.f34297.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f34294 += 2;
        DataInputStream dataInputStream = this.f34297;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f34296;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f34296);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f34294 += 4;
        DataInputStream dataInputStream = this.f34297;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f34296;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f34296);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28300(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f34297;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f34293 == null) {
                    this.f34293 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f34293, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(C19768.m44906(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f34294 += i2;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f34294 += 2;
        DataInputStream dataInputStream = this.f34297;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f34296;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f34296);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        this.f34294 += 8;
        DataInputStream dataInputStream = this.f34297;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f34296;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
            j2 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f34296);
            }
            j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
            j2 = i8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int length() {
        return this.f34295;
    }
}
