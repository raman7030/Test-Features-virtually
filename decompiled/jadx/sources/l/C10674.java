package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۧ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10674 implements InterfaceC12312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f32100 = C11321.m27961(C10674.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f32101;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12209 f32102;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32104;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32105;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f32108;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f32110;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f32106 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f32103 = new byte[8];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C5818 f32111 = null;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            C12209 c12209 = this.f32102;
            if (c12209 != null) {
                try {
                    c12209.m29688();
                    this.f32102 = null;
                } catch (C19369 e) {
                    throw C3037.m9289(e);
                }
            }
            this.f32110.m31374();
        } catch (Throwable th) {
            this.f32110.m31374();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12209 m26784() {
        C12209 c12209 = this.f32102;
        if (c12209 != null && c12209.m29689()) {
            C12209 c122010 = this.f32102;
            c122010.m29686();
            return c122010;
        }
        C12209 c12209M31362 = this.f32110.m31362(this.f32107, this.f32109, 7, 128, this.f32106);
        c12209M31362.m29686();
        this.f32102 = c12209M31362;
        return c12209M31362;
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws C3037 {
        short s = (short) i;
        byte[] bArr = this.f32103;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws C3037 {
        short s = (short) i;
        byte[] bArr = this.f32103;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    public C10674(C12914 c12914) throws C3037 {
        this.f32109 = 0;
        this.f32110 = c12914;
        try {
            C3618 c3618M31375 = c12914.m31375();
            try {
                this.f32107 = 17;
                this.f32109 = 1;
                m26784().m29688();
                this.f32104 = c3618M31375.m11091() - 70;
                this.f32105 = c3618M31375.getSendBufferSize() - 70;
                if (c3618M31375.m11089(16384)) {
                    this.f32101 = true;
                    this.f32104 = Math.min(((C13722) c3618M31375.m11094()).m32982() - 70, c3618M31375.m11096() ? 65465 : 16777145);
                }
                if (c3618M31375.m11089(32768) && !c3618M31375.m11096()) {
                    this.f32105 = Math.min(((C13722) c3618M31375.m11094()).m32997() - 70, 65465);
                }
                this.f32108 = 0L;
                c3618M31375.close();
            } catch (Throwable th) {
                if (c3618M31375 != null) {
                    try {
                        c3618M31375.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws C3037 {
        byte[] bArr = this.f32103;
        C2913.m8901((int) (j & 4294967295L), 4, bArr);
        C2913.m8901((int) ((j >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws C3037 {
        int iFloatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = this.f32103;
        C2913.m8901(iFloatToIntBits, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws C3037 {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = this.f32103;
        C2913.m8901((int) (jDoubleToLongBits & 4294967295L), 4, bArr);
        C2913.m8901((int) ((jDoubleToLongBits >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    public final int read(byte[] bArr, int i, int i2) throws C3037 {
        int i3;
        int iM1303;
        byte[] bArr2 = bArr;
        char c = 0;
        if (i2 <= 0) {
            return 0;
        }
        long j = this.f32108;
        try {
            C12209 c12209M26784 = m26784();
            try {
                C3618 c3618M29693 = c12209M26784.m29693();
                try {
                    int i4 = i;
                    C0172 c0172 = new C0172(i4, c3618M29693.m11094(), bArr2);
                    int i5 = i2;
                    while (true) {
                        int i6 = this.f32104;
                        int i7 = i5 > i6 ? i6 : i5;
                        if (c3618M29693.m11100()) {
                            C21090 c21090 = new C21090(c3618M29693.m11094(), c12209M26784.m29690(), bArr2, i4);
                            c21090.m47987(this.f32108);
                            c21090.m47986(i7);
                            c21090.m47985(i5 - i4);
                            try {
                                EnumC0214[] enumC0214Arr = new EnumC0214[1];
                                enumC0214Arr[c] = EnumC0214.NO_RETRY;
                                iM1303 = ((C9801) c3618M29693.m11087(c21090, null, enumC0214Arr)).m24840();
                            } catch (C3037 e) {
                                if (e.m9291() != -1073741807) {
                                    throw e;
                                }
                                f32100.mo7081("Reached end of file", (Exception) e);
                                iM1303 = -1;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            C19224 c19224 = new C19224(c3618M29693.m11094(), c12209M26784.m29692(), this.f32108, i3);
                            if (this.f32101) {
                                c19224.m44362(i3 & 65535);
                                c19224.m44361(65535 & (i3 >> 16));
                            }
                            try {
                                c3618M29693.m11087(c19224, c0172, EnumC0214.NO_RETRY);
                                iM1303 = c0172.m1303();
                            } catch (C19369 e2) {
                                throw C3037.m9289(e2);
                            }
                        }
                        if (iM1303 <= 0) {
                            long j2 = this.f32108 - j;
                            if (j2 <= 0) {
                                j2 = -1;
                            }
                            int i8 = (int) j2;
                            c3618M29693.close();
                            c12209M26784.m29688();
                            return i8;
                        }
                        this.f32108 += (long) iM1303;
                        i5 -= iM1303;
                        i4 += iM1303;
                        c0172.m1305(iM1303);
                        if (i5 > 0 && iM1303 == i3) {
                            bArr2 = bArr;
                            j = j;
                            c = 0;
                        }
                        int i9 = (int) (this.f32108 - j);
                        c3618M29693.close();
                        c12209M26784.m29688();
                        return i9;
                    }
                } catch (Throwable th) {
                    try {
                        c3618M29693.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c12209M26784.m29688();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C19369 e3) {
            throw C3037.m9289(e3);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws C3037 {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws C3037 {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new C19971();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        this.f32108 += (long) i;
        return i;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws C3037 {
        byte[] bArr = this.f32103;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws C3037 {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws C3037 {
        long jM16318;
        C5818 c5818 = this.f32111;
        if (i2 <= 0) {
            return;
        }
        try {
            C12209 c12209M26784 = m26784();
            try {
                C3618 c3618M29693 = c12209M26784.m29693();
                int i3 = i;
                int i4 = i2;
                do {
                    try {
                        int i5 = this.f32105;
                        int i6 = i4 > i5 ? i5 : i4;
                        if (c3618M29693.m11100()) {
                            C9095 c9095 = new C9095(c3618M29693.m11094(), c12209M26784.m29690());
                            c9095.m23469(this.f32108);
                            c9095.m23468((i4 - i6) - i3);
                            c9095.m23467(i3, i6, bArr);
                            jM16318 = ((C16149) c3618M29693.m11087(c9095, null, EnumC0214.NO_RETRY)).m38067();
                        } else {
                            c3618M29693.m11087(new C10052(c3618M29693.m11094(), c12209M26784.m29692(), this.f32108, (i4 - i6) - i3, bArr, i3, i6), c5818, EnumC0214.NO_RETRY);
                            jM16318 = c5818.m16318();
                        }
                        this.f32108 += jM16318;
                        i4 = (int) (((long) i4) - jM16318);
                        i3 = (int) (((long) i3) + jM16318);
                    } catch (Throwable th) {
                        try {
                            c3618M29693.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } while (i4 > 0);
                c3618M29693.close();
                c12209M26784.m29688();
            } catch (Throwable th3) {
                try {
                    c12209M26784.m29688();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    public final void seek(long j) {
        this.f32108 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) >= 0) {
            return bArr[0] != 0;
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) < 0) {
            throw new C19971();
        }
        return bArr[0];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) < 0) {
            throw new C19971();
        }
        return bArr[0] & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return C2913.m8900(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return C2913.m8900(0, bArr) & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return (char) C2913.m8900(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 4) < 0) {
            throw new C19971();
        }
        return C2913.m8904(0, bArr);
    }

    @Override // java.io.DataInput
    public final long readLong() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 8) >= 0) {
            return (((long) C2913.m8904(4, bArr)) & 4294967295L) | ((((long) C2913.m8904(0, bArr)) & 4294967295L) << 32);
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 4) >= 0) {
            return Float.intBitsToFloat(C2913.m8904(0, bArr));
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C19971 {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 8) >= 0) {
            return Double.longBitsToDouble((((long) C2913.m8904(4, bArr)) & 4294967295L) | ((((long) C2913.m8904(0, bArr)) & 4294967295L) << 32));
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            byte[] bArr = this.f32103;
            int i2 = read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255;
            if (i2 == -1 || i2 == 10) {
                z = true;
            } else if (i2 == 13) {
                long j = this.f32108;
                if ((read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255) != 10) {
                    this.f32108 = j;
                }
                z = true;
            } else {
                stringBuffer.append((char) i2);
            }
            i = i2;
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final String readUTF() throws C3037 {
        int unsignedShort = readUnsignedShort();
        byte[] bArr = new byte[unsignedShort];
        read(bArr, 0, unsignedShort);
        try {
            return C2913.m8905(unsignedShort, bArr);
        } catch (IOException e) {
            throw new C3037("", e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws C3037 {
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f32103;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws C3037 {
        byte[] bArr = this.f32103;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws C3037 {
        byte[] bArr = this.f32103;
        C2913.m8901(i, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws C3037 {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws C3037 {
        int length = str.length();
        int i = length * 2;
        byte[] bArr = new byte[i];
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 + 1;
            char c = cArr[i3];
            bArr[i2] = (byte) (c >>> '\b');
            i2 += 2;
            bArr[i4] = (byte) c;
        }
        write(bArr, 0, i);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws C3037 {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            i = 3;
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                i4 = 1;
            } else if (cCharAt > 2047) {
                i4 = 3;
            }
            i3 += i4;
            i2++;
        }
        byte[] bArr = new byte[i3];
        writeShort(i3);
        int length2 = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3 && i6 < length2) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i5] = (byte) cCharAt2;
                i5++;
            } else if (cCharAt2 > 2047) {
                if (i3 - i5 < i) {
                    break;
                }
                bArr[i5] = (byte) (((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i5 += 3;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if (i3 - i5 < 2) {
                    break;
                }
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i5 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
            i = 3;
        }
        write(bArr, 0, i3);
    }
}
