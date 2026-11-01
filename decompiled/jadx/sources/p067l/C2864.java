package p067l;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.֡ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2864 extends OutputStream implements InterfaceC10241, ObjectOutput, InterfaceC3535 {

    /* JADX INFO: renamed from: ᩶ */
    public int f4948;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f4949;

    /* JADX INFO: renamed from: ᩹ */
    public int f4950;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectOutput
    public final void close() {
    }

    public C2864(int i) {
        this.f4949 = new byte[i];
    }

    public C2864() {
        this(16);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4599() {
        this.f4950 = 0;
        this.f4948 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4600() {
        byte[] bArr = this.f4949;
        int i = this.f4950;
        if (i < bArr.length) {
            byte[] bArr2 = i == 0 ? C7747.f20313 : new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        this.f4949 = bArr;
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(int i) {
        int i2 = this.f4948;
        byte[] bArr = this.f4949;
        if (i2 >= bArr.length) {
            this.f4949 = C7747.m17896(i2 + 1, this.f4950, bArr);
        }
        byte[] bArr2 = this.f4949;
        int i3 = this.f4948;
        int i4 = i3 + 1;
        this.f4948 = i4;
        bArr2[i3] = (byte) i;
        if (this.f4950 < i4) {
            this.f4950 = i4;
        }
    }

    public final void position(long j) {
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C17588.m40051(j, "Position too large: "));
        }
        this.f4948 = (int) j;
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        write(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        write(i >> 24);
        write(i >> 16);
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        writeInt((int) (j >> 32));
        writeInt((int) j);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    @Deprecated
    public final void writeBytes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((byte) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            writeChar(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        int i = this.f4948;
        writeShort(0);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                write(cCharAt);
            } else if (cCharAt >= 2048) {
                write(((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                write(((cCharAt >> 6) & 63) | 128);
                write((cCharAt & '?') | 128);
            } else {
                write(((cCharAt >> 6) & 31) | 192);
                write((cCharAt & '?') | 128);
            }
            if (this.f4948 - i > 65537) {
                this.f4948 = i;
                this.f4950 = i;
                throw new IllegalArgumentException(String.format("UTF encoded string too long: %d: %s", Integer.valueOf(str.length()), str.substring(0, 99)));
            }
        }
        int i3 = (this.f4948 - i) - 2;
        byte[] bArr = this.f4949;
        bArr[i] = (byte) (i3 >> 8);
        bArr[i + 1] = (byte) i3;
    }

    @Override // java.io.ObjectOutput
    public final void writeObject(Object obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(this);
        try {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        C11755.m26983(bArr.length, i, i2);
        int i3 = this.f4948;
        int i4 = i3 + i2;
        byte[] bArr2 = this.f4949;
        if (i4 > bArr2.length) {
            this.f4949 = C7747.m17896(i3 + i2, i3, bArr2);
        }
        System.arraycopy(bArr, i, this.f4949, this.f4948, i2);
        int i5 = this.f4948;
        if (i5 + i2 > this.f4950) {
            int i6 = i5 + i2;
            this.f4948 = i6;
            this.f4950 = i6;
        }
    }
}
