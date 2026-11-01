package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.᩸᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes.dex */
public final class C23101 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51520(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        int iM51517;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int iM51518 = m51517((InputStream) pushbackInputStream);
        int iM51519 = m51517((InputStream) pushbackInputStream);
        int i = (iM51519 << 8) | iM51518;
        byte[] bArr = new byte[8192];
        if (i != 10831 && i != 10847) {
            pushbackInputStream.unread(new byte[]{(byte) iM51518, (byte) iM51519});
            m51519(pushbackInputStream, outputStream, bArr, j);
            return;
        }
        byte[] bArr2 = new byte[6];
        for (int i2 = 0; i2 < 6; i2++) {
            bArr2[i2] = (byte) m51517((InputStream) pushbackInputStream);
        }
        C14677 c14677 = new C14677(bArr2);
        int i3 = c14677.readInt();
        int iM33581 = c14677.m33581();
        if (i3 > 0) {
            long j2 = i3;
            if (j2 <= j && iM33581 == (131071 + j2) / 131072) {
                for (int i4 = 0; i4 < iM33581; i4++) {
                    if (i == 10831) {
                        iM51517 = m51517((InputStream) pushbackInputStream) | (m51517((InputStream) pushbackInputStream) << 8);
                    } else {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 <= 28) {
                                int iM515110 = m51517((InputStream) pushbackInputStream);
                                if (i5 == 28 && (iM515110 & 248) != 0) {
                                    throw new IOException("Legacy compression block length overflows");
                                }
                                i6 |= (iM515110 & 127) << i5;
                                if ((iM515110 & 128) == 0) {
                                    iM51517 = i6;
                                    break;
                                }
                                i5 += 7;
                            } else {
                                throw new IOException("Invalid legacy compression block length");
                            }
                        }
                    }
                    if (iM51517 <= 0) {
                        throw new IOException("Invalid legacy compression block length");
                    }
                    C17064 c17064 = new C17064(pushbackInputStream, iM51517);
                    long jMin = Math.min(131072L, j2);
                    if (m51519(c17064, outputStream, bArr, jMin) != jMin || c17064.f50457 != 0) {
                        throw new IOException("Legacy compression block does not match declared length");
                    }
                    j2 -= jMin;
                }
                if (pushbackInputStream.read() != -1) {
                    throw new IOException("Trailing bytes in legacy compression container");
                }
                return;
            }
        }
        throw new IOException("Invalid legacy compression block count or total length");
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m51519(InputStream inputStream, OutputStream outputStream, byte[] bArr, long j) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new C10360(inputStream), 1024);
        long j2 = 0;
        while (true) {
            try {
                int i = gZIPInputStream.read(bArr);
                if (i == -1) {
                    gZIPInputStream.close();
                    return j2;
                }
                if (i <= 0) {
                    throw new IOException("Legacy decompression made no progress");
                }
                long j3 = i;
                if (j3 > j - j2) {
                    throw new IOException("Legacy state exceeds decompression limit");
                }
                outputStream.write(bArr, 0, i);
                j2 += j3;
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m51517(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException("Truncated legacy compression container");
    }
}
