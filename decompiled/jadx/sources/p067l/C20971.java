package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.UTFDataFormatException;
import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.᩵ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCDV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20971 extends AbstractC7559 implements InterfaceC10241, ObjectInput {

    /* JADX INFO: renamed from: ۙ */
    public int f65876;

    /* JADX INFO: renamed from: ᩶ */
    public int f65877;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f65878;

    /* JADX INFO: renamed from: ᩹ */
    public int f65879;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectInput
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public C20971(byte[] bArr, int i) {
        this.f65878 = bArr;
        this.f65879 = Math.min(i, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f65876 = this.f65877;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f65877 = this.f65876;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int available() {
        return this.f65879 - this.f65876;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final long skip(long j) {
        int i = this.f65876;
        int i2 = this.f65879;
        if (j <= i2 - i) {
            this.f65876 = i + ((int) j);
            return j;
        }
        long j2 = i2 - i;
        this.f65876 = i2;
        return j2;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read() {
        int i = this.f65876;
        if (this.f65879 == i) {
            return -1;
        }
        this.f65876 = i + 1;
        return this.f65878[i] & 255;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f65876;
        int i4 = this.f65879;
        if (i4 == i3) {
            return i2 == 0 ? 0 : -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f65878, this.f65876, bArr, i, iMin);
        this.f65876 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) skip(i);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return read() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) read();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return read() & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) ((read() << 8) | (read() & 255));
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) (((read() & 255) << 8) | (read() & 255));
    }

    @Override // java.io.DataInput
    public final int readInt() {
        return (read() << 24) | ((read() & 255) << 16) | ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
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
    @Deprecated
    public final String readLine() {
        StringBuilder sb = new StringBuilder(99);
        while (true) {
            int i = read();
            int i2 = -1;
            if (i == -1) {
                if (sb.length() == 0) {
                    return null;
                }
                return sb.toString();
            }
            if (i == 10) {
                return sb.toString();
            }
            if (i == 13) {
                long j = this.f65879;
                long j2 = this.f65876;
                if (j > j2) {
                    i2 = this.f65878[(int) (((long) 0) + j2)] & 255;
                }
                if (i2 == 10) {
                    read();
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    @Override // java.io.DataInput
    public final String readUTF() throws UTFDataFormatException {
        try {
            if (available() > 0) {
                return DataInputStream.readUTF(this);
            }
            return null;
        } catch (UTFDataFormatException e) {
            throw e;
        } catch (IOException e2) {
            throw new UncheckedIOException("readUTF @ " + this, e2);
        }
    }

    @Override // java.io.ObjectInput
    public final Object readObject() throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(this);
        try {
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Throwable th) {
            try {
                objectInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
