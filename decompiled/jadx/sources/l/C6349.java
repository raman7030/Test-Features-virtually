package l;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۛ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAEW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6349 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17626(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17625(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m17626(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17628(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(C19370.m44628(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m17630(InputStream inputStream, int i) throws IOException {
        byte[] bArrM17628 = m17628(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM17628[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17627(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17629(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }
}
