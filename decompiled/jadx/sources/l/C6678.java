package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۜۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes2.dex */
public final class C6678 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f20742 = new String[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f20743;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f20744;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f20745;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f20746;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f20747;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long[] f20748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f20749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f20750;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f20751;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f20752 = new byte[1024];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f20753;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f20754;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f20755;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f20756;

    public C6678(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f20751 = j;
        this.f20747 = j2;
        this.f20745 = j3;
        this.f20744 = j4;
        this.f20749 = j5;
        this.f20743 = j6;
        this.f20753 = j7;
        this.f20754 = j8;
        this.f20755 = j9;
        this.f20746 = j10;
        this.f20756 = j11;
        this.f20750 = j12;
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("Too many boot hierarchy types");
        }
        this.f20748 = new long[(int) j4];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6678 m18216(File file) throws IOException {
        if (!file.isFile() || file.length() != 3415240) {
            throw new IOException("Boot hierarchy raw file size mismatch");
        }
        byte[] bArr = new byte[208];
        MessageDigest messageDigestM34534 = C14460.m34534();
        MessageDigest messageDigestM34535 = C14460.m34534();
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (i < 208) {
            try {
                int i2 = fileInputStream.read(bArr, i, 208 - i);
                if (i2 < 0) {
                    throw new IOException("Truncated boot hierarchy header");
                }
                i += i2;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        messageDigestM34534.update(bArr);
        byte[] bArr2 = new byte[32768];
        while (true) {
            int i3 = fileInputStream.read(bArr2);
            if (i3 == -1) {
                break;
            }
            messageDigestM34534.update(bArr2, 0, i3);
            messageDigestM34535.update(bArr2, 0, i3);
        }
        fileInputStream.close();
        if (!"bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc".equals(C14460.m34531(messageDigestM34534.digest()))) {
            throw new IOException("Boot hierarchy raw checksum mismatch");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferOrder.get() != 77 || byteBufferOrder.get() != 84 || byteBufferOrder.get() != 66 || byteBufferOrder.get() != 72 || (byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) != 1 || (byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) != 208 || byteBufferOrder.getInt() != 16909060 || (((long) byteBufferOrder.getInt()) & 4294967295L) != 36 || (((long) byteBufferOrder.getInt()) & 4294967295L) != 1) {
            throw new IOException("Invalid boot hierarchy header");
        }
        if (byteBufferOrder.getInt() != 0) {
            throw new IOException("Unsupported boot hierarchy flags");
        }
        long j = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j2 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j3 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j4 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j5 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        if (byteBufferOrder.getInt() != 0 || j2 > j) {
            throw new IOException("Invalid boot hierarchy counts");
        }
        long[] jArr = new long[6];
        long[] jArr2 = new long[6];
        for (int i4 = 0; i4 < 6; i4++) {
            jArr[i4] = byteBufferOrder.getLong();
            jArr2[i4] = byteBufferOrder.getLong();
        }
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byteBufferOrder.get(bArr3);
        byteBufferOrder.get(bArr4);
        if (!"d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a".equals(C14460.m34531(bArr3)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C14460.m34531(bArr4)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C14460.m34531(messageDigestM34535.digest()))) {
            throw new IOException("Boot hierarchy payload identity mismatch");
        }
        long[] jArr3 = {jArr2[0], m18212(12, j), m18212(16, j2), m18212(4, j3), m18212(20, j4), m18212(8, j5)};
        int i5 = 1;
        for (int i6 = 6; i5 < i6; i6 = 6) {
            if (jArr2[i5] != jArr3[i5]) {
                throw new IOException("Invalid boot hierarchy section length");
            }
            i5++;
        }
        int i7 = 0;
        long j6 = 208;
        while (i7 < 6) {
            long j7 = jArr[i7];
            long j8 = jArr2[i7];
            long length = file.length();
            if (j7 >= 208 && j8 >= 0 && j7 <= length && j8 <= length - j7) {
                long j9 = j7 + j8;
                long j10 = jArr[i7];
                if ((j10 & 7) != 0 || j10 < j6) {
                    throw new IOException("Overlapping boot hierarchy sections");
                }
                i7++;
                j6 = j9;
            } else {
                throw new IOException("Invalid boot hierarchy section range");
            }
        }
        if (j6 != file.length()) {
            throw new IOException("Trailing boot hierarchy data");
        }
        file.length();
        C6678 c6678 = new C6678(jArr[0], jArr2[0], jArr[1], j, jArr[2], j2, jArr[3], j3, jArr[4], j4, jArr[5], j5);
        byte[] bArr5 = c6678.f20752;
        long[] jArr4 = c6678.f20748;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        for (int i8 = 0; i8 < jArr4.length; i8++) {
            try {
                randomAccessFile.seek((((long) i8) * 12) + c6678.f20745);
                long jM18213 = m18213(randomAccessFile);
                long jM18214 = m18213(randomAccessFile);
                c6678.m18217(jM18213, jM18214);
                randomAccessFile.seek(c6678.f20751 + jM18213);
                long j11 = -3750763034362895579L;
                while (jM18214 > 0) {
                    int iMin = (int) Math.min(bArr5.length, jM18214);
                    randomAccessFile.readFully(bArr5, 0, iMin);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        j11 = (j11 ^ ((long) (bArr5[i9] & 255))) * 1099511628211L;
                    }
                    jM18214 -= (long) iMin;
                }
                jArr4[i8] = j11;
            } catch (Throwable th3) {
                try {
                    randomAccessFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        randomAccessFile.close();
        Arrays.sort(jArr4);
        return c6678;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[EDGE_INSN: B:76:0x0192->B:77:0x0193 BREAK  A[LOOP:2: B:57:0x0148->B:64:0x0169]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16555 m18218(RandomAccessFile randomAccessFile, String str, String str2) throws IOException {
        String[] strArr;
        int unsignedByte;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 1048576) {
            long j = -3750763034362895579L;
            for (byte b : bytes) {
                j = (j ^ ((long) (b & 255))) * 1099511628211L;
            }
            if (Arrays.binarySearch(this.f20748, j) >= 0) {
                long jM18214 = m18214(randomAccessFile, bytes, this.f20745, this.f20744, 12);
                long j2 = 0;
                if (jM18214 < 0) {
                    return C16555.f50862;
                }
                randomAccessFile.seek(C8083.m21450(jM18214, 12L, this.f20745, 8L));
                long jM18213 = m18213(randomAccessFile);
                if (jM18213 == 4294967295L) {
                    return C16555.f50862;
                }
                if (jM18213 >= this.f20743) {
                    throw new IOException("Invalid boot hierarchy class index");
                }
                randomAccessFile.seek((jM18213 * 16) + this.f20749);
                if (m18213(randomAccessFile) != jM18214) {
                    throw new IOException("Boot hierarchy class/type mismatch");
                }
                long jM18215 = m18213(randomAccessFile);
                long jM18216 = m18213(randomAccessFile);
                int iReverseBytes = Short.reverseBytes(randomAccessFile.readShort()) & HPKE.aead_EXPORT_ONLY;
                int unsignedByte2 = randomAccessFile.readUnsignedByte();
                if (randomAccessFile.readUnsignedByte() == 0 && (unsignedByte2 & (-2)) == 0) {
                    long j3 = this.f20754;
                    if (jM18216 <= j3 && iReverseBytes <= j3 - jM18216) {
                        String strM18215 = jM18215 == 4294967295L ? null : m18215(randomAccessFile, jM18215);
                        if (iReverseBytes == 0) {
                            strArr = f20742;
                        } else {
                            strArr = new String[iReverseBytes];
                        }
                        String[] strArr2 = strArr;
                        for (int i = 0; i < iReverseBytes; i++) {
                            randomAccessFile.seek(((((long) i) + jM18216) * 4) + this.f20753);
                            strArr2[i] = m18215(randomAccessFile, m18213(randomAccessFile));
                        }
                        char c = 1;
                        if (str2.length() > 1048576) {
                            unsignedByte = -1;
                            break;
                        }
                        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length > 1048576) {
                            unsignedByte = -1;
                            break;
                        }
                        long jM18217 = m18214(randomAccessFile, bytes2, this.f20755, this.f20746, 20);
                        if (jM18217 < 0) {
                            unsignedByte = -1;
                            break;
                        }
                        randomAccessFile.seek(C8083.m21450(jM18217, 20L, this.f20755, 8L));
                        long jReverseBytes = Long.reverseBytes(randomAccessFile.readLong());
                        long jM18218 = m18213(randomAccessFile);
                        if (jReverseBytes >= 0 && jReverseBytes % 8 == 0) {
                            long j4 = this.f20750;
                            if (jReverseBytes <= j4 * 8 && jM18218 <= j4 - (jReverseBytes / 8)) {
                                long j5 = jM18218 - 1;
                                while (true) {
                                    if (j2 > j5) {
                                        unsignedByte = -1;
                                        break;
                                    }
                                    long j6 = (j2 + j5) >>> c;
                                    randomAccessFile.seek((j6 * 8) + this.f20756 + jReverseBytes);
                                    long jM18219 = m18213(randomAccessFile);
                                    if (jM18219 >= jM18214) {
                                        if (jM18219 <= jM18214) {
                                            unsignedByte = randomAccessFile.readUnsignedByte();
                                            if (randomAccessFile.readUnsignedByte() == 0 && randomAccessFile.readUnsignedByte() == 0 && randomAccessFile.readUnsignedByte() == 0) {
                                                break;
                                            }
                                            throw new IOException("Invalid boot hierarchy posting record");
                                        }
                                        j5 = j6 - 1;
                                    } else {
                                        j2 = j6 + 1;
                                    }
                                    c = 1;
                                }
                            }
                        }
                        throw new IOException("Invalid boot hierarchy posting range");
                        boolean z = unsignedByte >= 0;
                        int i2 = !z ? 0 : unsignedByte;
                        if (!C6303.m17347(i2)) {
                            throw new IOException("Invalid boot hierarchy method flags");
                        }
                        return C16555.m38944(new C10912(strM18215, strArr2, unsignedByte2, i2, z));
                    }
                }
                throw new IOException("Invalid boot hierarchy class record");
            }
        }
        return C16555.f50862;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m18214(RandomAccessFile randomAccessFile, byte[] bArr, long j, long j2, int i) throws IOException {
        long j3;
        long j4;
        int iCompare;
        long j5;
        long j6 = j2 - 1;
        long j7 = 0;
        while (j7 <= j6) {
            long j8 = (j7 + j6) >>> 1;
            randomAccessFile.seek((((long) i) * j8) + j);
            long jM18213 = m18213(randomAccessFile);
            long jM18214 = m18213(randomAccessFile);
            m18217(jM18213, jM18214);
            long jMin = Math.min(jM18214, bArr.length);
            long j9 = j6;
            randomAccessFile.seek(this.f20751 + jM18213);
            long j10 = 0;
            while (true) {
                if (j10 < jMin) {
                    byte[] bArr2 = this.f20752;
                    j3 = j7;
                    j4 = j8;
                    int iMin = (int) Math.min(bArr2.length, jMin - j10);
                    randomAccessFile.readFully(bArr2, 0, iMin);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        int i3 = bArr2[i2] & 255;
                        int i4 = bArr[((int) j10) + i2] & 255;
                        if (i3 != i4) {
                            if (i3 >= i4) {
                                iCompare = 1;
                                break;
                            }
                            iCompare = -1;
                            break;
                        }
                    }
                    j10 += (long) iMin;
                    j7 = j3;
                    j8 = j4;
                } else {
                    j3 = j7;
                    j4 = j8;
                    iCompare = Long.compare(jM18214, bArr.length);
                    break;
                }
            }
            if (iCompare < 0) {
                j7 = j4 + 1;
                j5 = j9;
            } else {
                if (iCompare <= 0) {
                    return j4;
                }
                j5 = j4 - 1;
                j7 = j3;
            }
            j6 = j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m18215(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (j < 0 || j >= this.f20744) {
            throw new IOException("Invalid boot hierarchy type id");
        }
        randomAccessFile.seek((j * 12) + this.f20745);
        long jM18213 = m18213(randomAccessFile);
        long jM18214 = m18213(randomAccessFile);
        m18217(jM18213, jM18214);
        if (jM18214 > 1048576) {
            throw new IOException("Boot hierarchy string is too large");
        }
        byte[] bArr = new byte[(int) jM18214];
        randomAccessFile.seek(this.f20751 + jM18213);
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18217(long j, long j2) throws IOException {
        if (j >= 0 && j2 >= 0) {
            long j3 = this.f20747;
            if (j <= j3 && j2 <= j3 - j) {
                return;
            }
        }
        throw new IOException("Invalid boot hierarchy string slice");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m18212(int i, long j) throws IOException {
        long j2 = i;
        if (j <= C13132.FOREVER_NS / j2) {
            return j * j2;
        }
        throw new IOException("Boot hierarchy count overflow");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m18213(RandomAccessFile randomAccessFile) {
        return ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
    }
}
