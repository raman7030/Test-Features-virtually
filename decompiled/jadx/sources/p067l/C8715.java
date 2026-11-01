package p067l;

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
public final class C8715 {

    /* JADX INFO: renamed from: ᩴ */
    public static final String[] f23617 = new String[0];

    /* JADX INFO: renamed from: ֫ */
    public final long f23618;

    /* JADX INFO: renamed from: ۖ */
    public final long f23619;

    /* JADX INFO: renamed from: ۘ */
    public final long f23620;

    /* JADX INFO: renamed from: ۜ */
    public final long f23621;

    /* JADX INFO: renamed from: ۡ */
    public final long f23622;

    /* JADX INFO: renamed from: ۢ */
    public final long[] f23623;

    /* JADX INFO: renamed from: ۧ */
    public final long f23624;

    /* JADX INFO: renamed from: ܳ */
    public final long f23625;

    /* JADX INFO: renamed from: ܺ */
    public final long f23626;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f23627 = new byte[1024];

    /* JADX INFO: renamed from: ܿ */
    public final long f23628;

    /* JADX INFO: renamed from: ᩳ */
    public final long f23629;

    /* JADX INFO: renamed from: ᩷ */
    public final long f23630;

    /* JADX INFO: renamed from: ᩻ */
    public final long f23631;

    public C8715(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f23626 = j;
        this.f23622 = j2;
        this.f23620 = j3;
        this.f23619 = j4;
        this.f23624 = j5;
        this.f23618 = j6;
        this.f23628 = j7;
        this.f23629 = j8;
        this.f23630 = j9;
        this.f23621 = j10;
        this.f23631 = j11;
        this.f23625 = j12;
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("Too many boot hierarchy types");
        }
        this.f23623 = new long[(int) j4];
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8715 m20164(File file) throws IOException {
        if (!file.isFile() || file.length() != 3415240) {
            throw new IOException("Boot hierarchy raw file size mismatch");
        }
        byte[] bArr = new byte[208];
        MessageDigest messageDigestM36668 = C16111.m36668();
        MessageDigest messageDigestM36669 = C16111.m36668();
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
        messageDigestM36668.update(bArr);
        byte[] bArr2 = new byte[32768];
        while (true) {
            int i3 = fileInputStream.read(bArr2);
            if (i3 == -1) {
                break;
            }
            messageDigestM36668.update(bArr2, 0, i3);
            messageDigestM36669.update(bArr2, 0, i3);
        }
        fileInputStream.close();
        if (!"bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc".equals(C16111.m36665(messageDigestM36668.digest()))) {
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
        if (!"d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a".equals(C16111.m36665(bArr3)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C16111.m36665(bArr4)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C16111.m36665(messageDigestM36669.digest()))) {
            throw new IOException("Boot hierarchy payload identity mismatch");
        }
        long[] jArr3 = {jArr2[0], m20160(12, j), m20160(16, j2), m20160(4, j3), m20160(20, j4), m20160(8, j5)};
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
        C8715 c8715 = new C8715(jArr[0], jArr2[0], jArr[1], j, jArr[2], j2, jArr[3], j3, jArr[4], j4, jArr[5], j5);
        byte[] bArr5 = c8715.f23627;
        long[] jArr4 = c8715.f23623;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        for (int i8 = 0; i8 < jArr4.length; i8++) {
            try {
                randomAccessFile.seek((((long) i8) * 12) + c8715.f23620);
                long jM20161 = m20161(randomAccessFile);
                long jM20162 = m20161(randomAccessFile);
                c8715.m20165(jM20161, jM20162);
                randomAccessFile.seek(c8715.f23626 + jM20161);
                long j11 = -3750763034362895579L;
                while (jM20162 > 0) {
                    int iMin = (int) Math.min(bArr5.length, jM20162);
                    randomAccessFile.readFully(bArr5, 0, iMin);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        j11 = (j11 ^ ((long) (bArr5[i9] & 255))) * 1099511628211L;
                    }
                    jM20162 -= (long) iMin;
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
        return c8715;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[EDGE_INSN: B:76:0x0192->B:77:0x0193 BREAK  A[LOOP:2: B:57:0x0148->B:64:0x0169]] */
    /* JADX INFO: renamed from: ֫ */
    public final C18102 m20166(RandomAccessFile randomAccessFile, String str, String str2) throws IOException {
        String[] strArr;
        int unsignedByte;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 1048576) {
            long j = -3750763034362895579L;
            for (byte b : bytes) {
                j = (j ^ ((long) (b & 255))) * 1099511628211L;
            }
            if (Arrays.binarySearch(this.f23623, j) >= 0) {
                long jM20162 = m20162(randomAccessFile, bytes, this.f23620, this.f23619, 12);
                long j2 = 0;
                if (jM20162 < 0) {
                    return C18102.f54040;
                }
                randomAccessFile.seek(C10050.m23418(jM20162, 12L, this.f23620, 8L));
                long jM20161 = m20161(randomAccessFile);
                if (jM20161 == 4294967295L) {
                    return C18102.f54040;
                }
                if (jM20161 >= this.f23618) {
                    throw new IOException("Invalid boot hierarchy class index");
                }
                randomAccessFile.seek((jM20161 * 16) + this.f23624);
                if (m20161(randomAccessFile) != jM20162) {
                    throw new IOException("Boot hierarchy class/type mismatch");
                }
                long jM20163 = m20161(randomAccessFile);
                long jM20164 = m20161(randomAccessFile);
                int iReverseBytes = Short.reverseBytes(randomAccessFile.readShort()) & HPKE.aead_EXPORT_ONLY;
                int unsignedByte2 = randomAccessFile.readUnsignedByte();
                if (randomAccessFile.readUnsignedByte() == 0 && (unsignedByte2 & (-2)) == 0) {
                    long j3 = this.f23629;
                    if (jM20164 <= j3 && iReverseBytes <= j3 - jM20164) {
                        String strM20163 = jM20163 == 4294967295L ? null : m20163(randomAccessFile, jM20163);
                        if (iReverseBytes == 0) {
                            strArr = f23617;
                        } else {
                            strArr = new String[iReverseBytes];
                        }
                        String[] strArr2 = strArr;
                        for (int i = 0; i < iReverseBytes; i++) {
                            randomAccessFile.seek(((((long) i) + jM20164) * 4) + this.f23628);
                            strArr2[i] = m20163(randomAccessFile, m20161(randomAccessFile));
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
                        long jM20165 = m20162(randomAccessFile, bytes2, this.f23630, this.f23621, 20);
                        if (jM20165 < 0) {
                            unsignedByte = -1;
                            break;
                        }
                        randomAccessFile.seek(C10050.m23418(jM20165, 20L, this.f23630, 8L));
                        long jReverseBytes = Long.reverseBytes(randomAccessFile.readLong());
                        long jM20166 = m20161(randomAccessFile);
                        if (jReverseBytes >= 0 && jReverseBytes % 8 == 0) {
                            long j4 = this.f23625;
                            if (jReverseBytes <= j4 * 8 && jM20166 <= j4 - (jReverseBytes / 8)) {
                                long j5 = jM20166 - 1;
                                while (true) {
                                    if (j2 > j5) {
                                        unsignedByte = -1;
                                        break;
                                    }
                                    long j6 = (j2 + j5) >>> c;
                                    randomAccessFile.seek((j6 * 8) + this.f23631 + jReverseBytes);
                                    long jM20167 = m20161(randomAccessFile);
                                    if (jM20167 >= jM20162) {
                                        if (jM20167 <= jM20162) {
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
                        if (!C8359.m19287(i2)) {
                            throw new IOException("Invalid boot hierarchy method flags");
                        }
                        return C18102.m41170(new C12739(strM20163, strArr2, unsignedByte2, i2, z));
                    }
                }
                throw new IOException("Invalid boot hierarchy class record");
            }
        }
        return C18102.f54040;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m20162(RandomAccessFile randomAccessFile, byte[] bArr, long j, long j2, int i) throws IOException {
        long j3;
        long j4;
        int iCompare;
        long j5;
        long j6 = j2 - 1;
        long j7 = 0;
        while (j7 <= j6) {
            long j8 = (j7 + j6) >>> 1;
            randomAccessFile.seek((((long) i) * j8) + j);
            long jM20161 = m20161(randomAccessFile);
            long jM20162 = m20161(randomAccessFile);
            m20165(jM20161, jM20162);
            long jMin = Math.min(jM20162, bArr.length);
            long j9 = j6;
            randomAccessFile.seek(this.f23626 + jM20161);
            long j10 = 0;
            while (true) {
                if (j10 < jMin) {
                    byte[] bArr2 = this.f23627;
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
                    iCompare = Long.compare(jM20162, bArr.length);
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

    /* JADX INFO: renamed from: ֫ */
    private String m20163(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (j < 0 || j >= this.f23619) {
            throw new IOException("Invalid boot hierarchy type id");
        }
        randomAccessFile.seek((j * 12) + this.f23620);
        long jM20161 = m20161(randomAccessFile);
        long jM20162 = m20161(randomAccessFile);
        m20165(jM20161, jM20162);
        if (jM20162 > 1048576) {
            throw new IOException("Boot hierarchy string is too large");
        }
        byte[] bArr = new byte[(int) jM20162];
        randomAccessFile.seek(this.f23626 + jM20161);
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20165(long j, long j2) throws IOException {
        if (j >= 0 && j2 >= 0) {
            long j3 = this.f23622;
            if (j <= j3 && j2 <= j3 - j) {
                return;
            }
        }
        throw new IOException("Invalid boot hierarchy string slice");
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m20160(int i, long j) throws IOException {
        long j2 = i;
        if (j <= C14849.FOREVER_NS / j2) {
            return j * j2;
        }
        throw new IOException("Boot hierarchy count overflow");
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m20161(RandomAccessFile randomAccessFile) {
        return ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
    }
}
