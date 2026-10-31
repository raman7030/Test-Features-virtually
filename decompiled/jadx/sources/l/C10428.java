package l;

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
public class C10428 extends InputStream implements DataInput, InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f31329;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31330;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteOrder f31332;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataInputStream f31333;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10428(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f31331 = bArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10428(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C10428(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f31333 = dataInputStream;
        dataInputStream.mark(0);
        this.f31330 = 0;
        this.f31332 = byteOrder;
        this.f31331 = inputStream instanceof C10428 ? ((C10428) inputStream).f31331 : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26272(ByteOrder byteOrder) {
        this.f31332 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f31333.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f31330++;
        return this.f31333.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f31333.read(bArr, i, i2);
        this.f31330 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f31330++;
        return this.f31333.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f31330++;
        return this.f31333.readBoolean();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f31330 += 2;
        return this.f31333.readChar();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f31330 += 2;
        return this.f31333.readUTF();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f31330 += i2;
        this.f31333.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f31330 += bArr.length;
        this.f31333.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f31330++;
        int i = this.f31333.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f31330 += 2;
        DataInputStream dataInputStream = this.f31333;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f31330 += 4;
        DataInputStream dataInputStream = this.f31333;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26271(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f31333;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f31329 == null) {
                    this.f31329 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f31329, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(C18307.m42645(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f31330 += i2;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f31330 += 2;
        DataInputStream dataInputStream = this.f31333;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        this.f31330 += 8;
        DataInputStream dataInputStream = this.f31333;
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
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
            j2 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f31332);
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
        return this.f31331;
    }
}
