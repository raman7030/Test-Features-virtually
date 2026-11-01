package p067l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17811 extends FilterInputStream implements DataInput, InterfaceC16534 {
    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C17811(C11778 c11778) {
        super(c11778);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i = C19824.f60279;
        C19824.m45067(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        C19824.m45067(this, bArr, i, i2);
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
        return C15129.m34546((byte) 0, (byte) 0, m40427(), m40427());
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bM40427 = m40427();
        byte bM40428 = m40427();
        return C15129.m34546(m40427(), m40427(), bM40428, bM40427);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bM40427 = m40427();
        byte bM40428 = m40427();
        byte bM40429 = m40427();
        byte bM404210 = m40427();
        byte bM404211 = m40427();
        byte bM404212 = m40427();
        return ((((long) bM40428) & 255) << 8) | ((((long) bM404210) & 255) << 24) | ((((long) bM404212) & 255) << 40) | ((((long) m40427()) & 255) << 56) | ((((long) m40427()) & 255) << 48) | ((((long) bM404211) & 255) << 32) | ((((long) bM40429) & 255) << 16) | (((long) bM40427) & 255);
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

    /* JADX INFO: renamed from: ֫ */
    private byte m40427() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }
}
