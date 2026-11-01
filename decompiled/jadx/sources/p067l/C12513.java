package p067l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۧ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12513 implements InterfaceC14070 {

    /* JADX INFO: renamed from: ܰ */
    public static final InterfaceC4410 f35072 = C13128.m30022(C12513.class);

    /* JADX INFO: renamed from: ۗ */
    public boolean f35073;

    /* JADX INFO: renamed from: ۙ */
    public C13972 f35074;

    /* JADX INFO: renamed from: ۤ */
    public int f35076;

    /* JADX INFO: renamed from: ۨ */
    public int f35077;

    /* JADX INFO: renamed from: ۬ */
    public int f35079;

    /* JADX INFO: renamed from: ᩶ */
    public long f35080;

    /* JADX INFO: renamed from: ᩸ */
    public int f35081;

    /* JADX INFO: renamed from: ᩹ */
    public C14642 f35082;

    /* JADX INFO: renamed from: ۫ */
    public int f35078 = 0;

    /* JADX INFO: renamed from: ۛ */
    public byte[] f35075 = new byte[8];

    /* JADX INFO: renamed from: ᩺ */
    public C7898 f35083 = null;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            C13972 c13972 = this.f35074;
            if (c13972 != null) {
                try {
                    c13972.m31750();
                    this.f35074 = null;
                } catch (C20777 e) {
                    throw C5255.m11331(e);
                }
            }
            this.f35082.m33460();
        } catch (Throwable th) {
            this.f35082.m33460();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13972 m28823() {
        C13972 c13972 = this.f35074;
        if (c13972 != null && c13972.m31751()) {
            C13972 c13973 = this.f35074;
            c13973.m31748();
            return c13973;
        }
        C13972 c13972M33448 = this.f35082.m33448(this.f35079, this.f35081, 7, 128, this.f35078);
        c13972M33448.m31748();
        this.f35074 = c13972M33448;
        return c13972M33448;
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws C5255 {
        short s = (short) i;
        byte[] bArr = this.f35075;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws C5255 {
        short s = (short) i;
        byte[] bArr = this.f35075;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    public C12513(C14642 c14642) throws C5255 {
        this.f35081 = 0;
        this.f35082 = c14642;
        try {
            C5807 c5807M33461 = c14642.m33461();
            try {
                this.f35079 = 17;
                this.f35081 = 1;
                m28823().m31750();
                this.f35076 = c5807M33461.m13067() - 70;
                this.f35077 = c5807M33461.getSendBufferSize() - 70;
                if (c5807M33461.m13065(16384)) {
                    this.f35073 = true;
                    this.f35076 = Math.min(((C15410) c5807M33461.m13070()).m35096() - 70, c5807M33461.m13072() ? 65465 : 16777145);
                }
                if (c5807M33461.m13065(32768) && !c5807M33461.m13072()) {
                    this.f35077 = Math.min(((C15410) c5807M33461.m13070()).m35111() - 70, 65465);
                }
                this.f35080 = 0L;
                c5807M33461.close();
            } catch (Throwable th) {
                if (c5807M33461 != null) {
                    try {
                        c5807M33461.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws C5255 {
        byte[] bArr = this.f35075;
        C5137.m10969((int) (j & 4294967295L), 4, bArr);
        C5137.m10969((int) ((j >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws C5255 {
        int iFloatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = this.f35075;
        C5137.m10969(iFloatToIntBits, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws C5255 {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = this.f35075;
        C5137.m10969((int) (jDoubleToLongBits & 4294967295L), 4, bArr);
        C5137.m10969((int) ((jDoubleToLongBits >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    public final int read(byte[] bArr, int i, int i2) throws C5255 {
        int i3;
        int iM3711;
        byte[] bArr2 = bArr;
        char c = 0;
        if (i2 <= 0) {
            return 0;
        }
        long j = this.f35080;
        try {
            C13972 c13972M28823 = m28823();
            try {
                C5807 c5807M31755 = c13972M28823.m31755();
                try {
                    int i4 = i;
                    C2532 c2532 = new C2532(i4, c5807M31755.m13070(), bArr2);
                    int i5 = i2;
                    while (true) {
                        int i6 = this.f35076;
                        int i7 = i5 > i6 ? i6 : i5;
                        if (c5807M31755.m13076()) {
                            C22413 c22413 = new C22413(c5807M31755.m13070(), c13972M28823.m31752(), bArr2, i4);
                            c22413.m50317(this.f35080);
                            c22413.m50316(i7);
                            c22413.m50315(i5 - i4);
                            try {
                                EnumC2572[] enumC2572Arr = new EnumC2572[1];
                                enumC2572Arr[c] = EnumC2572.NO_RETRY;
                                iM3711 = ((C11684) c5807M31755.m13063(c22413, null, enumC2572Arr)).m26855();
                            } catch (C5255 e) {
                                if (e.m11333() != -1073741807) {
                                    throw e;
                                }
                                f35072.mo9176("Reached end of file", (Exception) e);
                                iM3711 = -1;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            C20639 c20639 = new C20639(c5807M31755.m13070(), c13972M28823.m31754(), this.f35080, i3);
                            if (this.f35073) {
                                c20639.m46656(i3 & 65535);
                                c20639.m46655(65535 & (i3 >> 16));
                            }
                            try {
                                c5807M31755.m13063(c20639, c2532, EnumC2572.NO_RETRY);
                                iM3711 = c2532.m3711();
                            } catch (C20777 e2) {
                                throw C5255.m11331(e2);
                            }
                        }
                        if (iM3711 <= 0) {
                            long j2 = this.f35080 - j;
                            if (j2 <= 0) {
                                j2 = -1;
                            }
                            int i8 = (int) j2;
                            c5807M31755.close();
                            c13972M28823.m31750();
                            return i8;
                        }
                        this.f35080 += (long) iM3711;
                        i5 -= iM3711;
                        i4 += iM3711;
                        c2532.m3713(iM3711);
                        if (i5 > 0 && iM3711 == i3) {
                            bArr2 = bArr;
                            j = j;
                            c = 0;
                        }
                        int i9 = (int) (this.f35080 - j);
                        c5807M31755.close();
                        c13972M28823.m31750();
                        return i9;
                    }
                } catch (Throwable th) {
                    try {
                        c5807M31755.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c13972M28823.m31750();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C20777 e3) {
            throw C5255.m11331(e3);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws C5255 {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws C5255 {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new C21349();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        this.f35080 += (long) i;
        return i;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws C5255 {
        byte[] bArr = this.f35075;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws C5255 {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws C5255 {
        long jM18243;
        C7898 c7898 = this.f35083;
        if (i2 <= 0) {
            return;
        }
        try {
            C13972 c13972M28823 = m28823();
            try {
                C5807 c5807M31755 = c13972M28823.m31755();
                int i3 = i;
                int i4 = i2;
                do {
                    try {
                        int i5 = this.f35077;
                        int i6 = i4 > i5 ? i5 : i4;
                        if (c5807M31755.m13076()) {
                            C11013 c11013 = new C11013(c5807M31755.m13070(), c13972M28823.m31752());
                            c11013.m25416(this.f35080);
                            c11013.m25415((i4 - i6) - i3);
                            c11013.m25414(i3, i6, bArr);
                            jM18243 = ((C17717) c5807M31755.m13063(c11013, null, EnumC2572.NO_RETRY)).m40259();
                        } else {
                            c5807M31755.m13063(new C11922(c5807M31755.m13070(), c13972M28823.m31754(), this.f35080, (i4 - i6) - i3, bArr, i3, i6), c7898, EnumC2572.NO_RETRY);
                            jM18243 = c7898.m18243();
                        }
                        this.f35080 += jM18243;
                        i4 = (int) (((long) i4) - jM18243);
                        i3 = (int) (((long) i3) + jM18243);
                    } catch (Throwable th) {
                        try {
                            c5807M31755.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } while (i4 > 0);
                c5807M31755.close();
                c13972M28823.m31750();
            } catch (Throwable th3) {
                try {
                    c13972M28823.m31750();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C20777 e) {
            throw C5255.m11331(e);
        }
    }

    public final void seek(long j) {
        this.f35080 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 1) >= 0) {
            return bArr[0] != 0;
        }
        throw new C21349();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 1) < 0) {
            throw new C21349();
        }
        return bArr[0];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 1) < 0) {
            throw new C21349();
        }
        return bArr[0] & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 2) < 0) {
            throw new C21349();
        }
        return C5137.m10968(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 2) < 0) {
            throw new C21349();
        }
        return C5137.m10968(0, bArr) & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 2) < 0) {
            throw new C21349();
        }
        return (char) C5137.m10968(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 4) < 0) {
            throw new C21349();
        }
        return C5137.m10972(0, bArr);
    }

    @Override // java.io.DataInput
    public final long readLong() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 8) >= 0) {
            return (((long) C5137.m10972(4, bArr)) & 4294967295L) | ((((long) C5137.m10972(0, bArr)) & 4294967295L) << 32);
        }
        throw new C21349();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 4) >= 0) {
            return Float.intBitsToFloat(C5137.m10972(0, bArr));
        }
        throw new C21349();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C21349 {
        byte[] bArr = this.f35075;
        if (read(bArr, 0, 8) >= 0) {
            return Double.longBitsToDouble((((long) C5137.m10972(4, bArr)) & 4294967295L) | ((((long) C5137.m10972(0, bArr)) & 4294967295L) << 32));
        }
        throw new C21349();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            byte[] bArr = this.f35075;
            int i2 = read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255;
            if (i2 == -1 || i2 == 10) {
                z = true;
            } else if (i2 == 13) {
                long j = this.f35080;
                if ((read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255) != 10) {
                    this.f35080 = j;
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
    public final String readUTF() throws C5255 {
        int unsignedShort = readUnsignedShort();
        byte[] bArr = new byte[unsignedShort];
        read(bArr, 0, unsignedShort);
        try {
            return C5137.m10973(unsignedShort, bArr);
        } catch (IOException e) {
            throw new C5255("", e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws C5255 {
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f35075;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws C5255 {
        byte[] bArr = this.f35075;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws C5255 {
        byte[] bArr = this.f35075;
        C5137.m10969(i, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws C5255 {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws C5255 {
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
    public final void writeUTF(String str) throws C5255 {
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
