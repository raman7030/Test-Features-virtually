package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16248 extends FilterInputStream implements DataInput, InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C16248(C9900 c9900) {
        super(c9900);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i = C18366.f57059;
        C18366.m42795(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        C18366.m42795(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return C13426.m32444((byte) 0, (byte) 0, m38213(), m38213());
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bM38213 = m38213();
        byte bM38214 = m38213();
        return C13426.m32444(m38213(), m38213(), bM38214, bM38213);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bM38213 = m38213();
        byte bM38214 = m38213();
        byte bM38215 = m38213();
        byte bM38216 = m38213();
        byte bM38217 = m38213();
        byte bM38218 = m38213();
        return ((((long) bM38214) & 255) << 8) | ((((long) bM38216) & 255) << 24) | ((((long) bM38218) & 255) << 40) | ((((long) m38213()) & 255) << 56) | ((((long) m38213()) & 255) << 48) | ((((long) bM38217) & 255) << 32) | ((((long) bM38215) & 255) << 16) | (((long) bM38213) & 255);
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte m38213() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }
}
