package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.᩸᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes.dex */
public final class C21814 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49169(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        int iM49166;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int iM49167 = m49166((InputStream) pushbackInputStream);
        int iM49168 = m49166((InputStream) pushbackInputStream);
        int i = (iM49168 << 8) | iM49167;
        byte[] bArr = new byte[8192];
        if (i != 10831 && i != 10847) {
            pushbackInputStream.unread(new byte[]{(byte) iM49167, (byte) iM49168});
            m49168(pushbackInputStream, outputStream, bArr, j);
            return;
        }
        byte[] bArr2 = new byte[6];
        for (int i2 = 0; i2 < 6; i2++) {
            bArr2[i2] = (byte) m49166((InputStream) pushbackInputStream);
        }
        C12951 c12951 = new C12951(bArr2);
        int i3 = c12951.readInt();
        int iM31494 = c12951.m31494();
        if (i3 > 0) {
            long j2 = i3;
            if (j2 <= j && iM31494 == (131071 + j2) / 131072) {
                for (int i4 = 0; i4 < iM31494; i4++) {
                    if (i == 10831) {
                        iM49166 = m49166((InputStream) pushbackInputStream) | (m49166((InputStream) pushbackInputStream) << 8);
                    } else {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 <= 28) {
                                int iM49169 = m49166((InputStream) pushbackInputStream);
                                if (i5 == 28 && (iM49169 & 248) != 0) {
                                    throw new IOException("Legacy compression block length overflows");
                                }
                                i6 |= (iM49169 & 127) << i5;
                                if ((iM49169 & 128) == 0) {
                                    iM49166 = i6;
                                    break;
                                }
                                i5 += 7;
                            } else {
                                throw new IOException("Invalid legacy compression block length");
                            }
                        }
                    }
                    if (iM49166 <= 0) {
                        throw new IOException("Invalid legacy compression block length");
                    }
                    C15462 c15462 = new C15462(pushbackInputStream, iM49166);
                    long jMin = Math.min(131072L, j2);
                    if (m49168(c15462, outputStream, bArr, jMin) != jMin || c15462.f47328 != 0) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49168(InputStream inputStream, OutputStream outputStream, byte[] bArr, long j) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new C8408(inputStream), 1024);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49166(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException("Truncated legacy compression container");
    }
}
