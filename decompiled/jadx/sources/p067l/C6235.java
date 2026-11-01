package p067l;

import java.io.Closeable;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۘܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AO5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6235 implements DataInput, Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final InputStream f15733;

    /* JADX INFO: renamed from: ۙ */
    public int f15734;

    /* JADX INFO: renamed from: ᩶ */
    public int f15737;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f15738;

    /* JADX INFO: renamed from: ᩹ */
    public final int f15739;

    /* JADX INFO: renamed from: ۬ */
    public int f15736 = 0;

    /* JADX INFO: renamed from: ۫ */
    public String[] f15735 = new String[32];

    public C6235(InputStream inputStream) {
        C12826.requireNonNull(inputStream);
        this.f15733 = inputStream;
        this.f15738 = new byte[32768];
        this.f15739 = 32768;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14145(int i) throws IOException {
        int i2 = this.f15737;
        int i3 = this.f15734;
        int i4 = i2 - i3;
        byte[] bArr = this.f15738;
        System.arraycopy(bArr, i3, bArr, 0, i4);
        this.f15734 = 0;
        this.f15737 = i4;
        while (true) {
            i -= i4;
            if (i <= 0) {
                return;
            }
            int i5 = this.f15737;
            i4 = this.f15733.read(bArr, i5, this.f15739 - i5);
            if (i4 == -1) {
                throw new EOFException();
            }
            this.f15737 += i4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15733.close();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f15739;
        byte[] bArr2 = this.f15738;
        if (i3 >= i2) {
            if (this.f15737 - this.f15734 < i2) {
                m14145(i2);
            }
            System.arraycopy(bArr2, this.f15734, bArr, i, i2);
            this.f15734 += i2;
            return;
        }
        int i4 = this.f15737;
        int i5 = this.f15734;
        int i6 = i4 - i5;
        System.arraycopy(bArr2, i5, bArr, i, i6);
        this.f15734 += i6;
        do {
            i += i6;
            i2 -= i6;
            if (i2 <= 0) {
                return;
            } else {
                i6 = this.f15733.read(bArr, i, i2);
            }
        } while (i6 != -1);
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        int unsignedShort = readUnsignedShort();
        if (this.f15739 >= unsignedShort) {
            if (this.f15737 - this.f15734 < unsignedShort) {
                m14145(unsignedShort);
            }
            String str = new String(this.f15738, this.f15734, unsignedShort, StandardCharsets.UTF_8);
            this.f15734 += unsignedShort;
            return str;
        }
        byte[] bArr = new byte[unsignedShort];
        readFully(bArr, 0, unsignedShort);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m14147() throws IOException {
        int unsignedShort = readUnsignedShort();
        if (unsignedShort == 65535) {
            String utf = readUTF();
            int i = this.f15736;
            if (i < 65535) {
                String[] strArr = this.f15735;
                if (i == strArr.length) {
                    this.f15735 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
                }
                String[] strArr2 = this.f15735;
                int i2 = this.f15736;
                this.f15736 = i2 + 1;
                strArr2[i2] = utf;
            }
            return utf;
        }
        return this.f15735[unsignedShort];
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m14146() throws IOException {
        if (this.f15737 - this.f15734 < 1) {
            m14145(1);
        }
        return this.f15738[this.f15734];
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        if (this.f15737 - this.f15734 < 1) {
            m14145(1);
        }
        int i = this.f15734;
        this.f15734 = i + 1;
        return this.f15738[i];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return readByte() & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        if (this.f15737 - this.f15734 < 2) {
            m14145(2);
        }
        int i = this.f15734;
        int i2 = i + 1;
        this.f15734 = i2;
        byte[] bArr = this.f15738;
        int i3 = (bArr[i] & 255) << 8;
        this.f15734 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return readShort() & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        if (this.f15737 - this.f15734 < 4) {
            m14145(4);
        }
        int i = this.f15734;
        int i2 = i + 1;
        this.f15734 = i2;
        byte[] bArr = this.f15738;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f15734 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f15734 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f15734 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        if (this.f15737 - this.f15734 < 8) {
            m14145(8);
        }
        int i = this.f15734;
        int i2 = i + 1;
        this.f15734 = i2;
        byte[] bArr = this.f15738;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f15734 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f15734 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i + 4;
        this.f15734 = i8;
        int i9 = i7 | (bArr[i6] & 255);
        int i10 = i + 5;
        this.f15734 = i10;
        int i11 = (bArr[i8] & 255) << 24;
        int i12 = i + 6;
        this.f15734 = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i + 7;
        this.f15734 = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f15734 = i + 8;
        return (((long) i9) << 32) | (((long) ((bArr[i14] & 255) | i15)) & 4294967295L);
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
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException();
    }
}
