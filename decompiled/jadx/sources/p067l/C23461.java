package p067l;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes.dex */
public final class C23461 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f74712;

    /* JADX INFO: renamed from: ۧ */
    public static final C16754 f74713;

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f74714;

    /* JADX INFO: renamed from: ᩳ */
    public static final C22791 f74715;

    /* JADX INFO: renamed from: ֫ */
    public static List m52176(InputStream inputStream) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C10721.f29698;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return (List) C19888.lines(new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset))).collect(C24205.toList());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܶۢ֡] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.᩸ۢ֡] */
    static {
        char c = File.separatorChar;
        f74712 = new byte[0];
        System.lineSeparator();
        EnumC21450.LF.getString();
        EnumC21450.CRLF.getString();
        final C2673 c2673 = new C2673();
        f74713 = new ThreadLocal() { // from class: l.ܶۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c2673.getClass();
                return new byte[8192];
            }
        };
        f74714 = new byte[8192];
        final C7368 c7368 = new C7368(0);
        f74715 = new ThreadLocal() { // from class: l.᩸ۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c7368.getClass();
                return new char[8192];
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m52174(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        C12826.requireNonNull(inputStream, "inputStream");
        C12826.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return j;
            }
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52177(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52181(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        return C14073.m31933(Channels.newChannel(inputStream), Channels.newChannel(inputStream2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52180(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        int i = C10721.f29698;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = (char[]) f74715.get();
        Arrays.fill(cArr, (char) 0);
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return;
            } else {
                writer.write(cArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52179(InputStream inputStream, OutputStream outputStream) throws IOException {
        m52174(inputStream, outputStream, 8192);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m52182() {
        byte[] bArr = f74714;
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52178(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        byte[] bArr = (byte[]) f74713.get();
        Arrays.fill(bArr, (byte) 0);
        long j2 = 0;
        if (j == 0) {
            return;
        }
        int length = bArr.length;
        int iMin = (j <= 0 || j >= ((long) length)) ? length : (int) j;
        while (iMin > 0) {
            int i = inputStream.read(bArr, 0, iMin);
            if (-1 == i) {
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            j2 += (long) i;
            if (j > 0) {
                iMin = (int) Math.min(j - j2, length);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m52171(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i == 0) {
            return 0;
        }
        C12826.requireNonNull(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i - i2, i2);
            if (-1 == i3) {
                break;
            }
            i2 -= i3;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m52184(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iM52171 = m52171(inputStream, bArr, i);
        if (iM52171 != i) {
            throw new EOFException(C19768.m44907("Length to read: ", i, iM52171, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m52172(long j, InputStream inputStream) {
        return m52173(inputStream, j, new C3344());
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m52173(InputStream inputStream, long j, Supplier supplier) {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "Skip count must be non-negative, actual: "));
        }
        long j2 = j;
        while (j2 > 0) {
            byte[] bArr = (byte[]) supplier.get();
            long j3 = inputStream.read(bArr, 0, (int) Math.min(j2, bArr.length));
            if (j3 < 0) {
                break;
            }
            j2 -= j3;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m52183(long j, InputStream inputStream) throws EOFException {
        long jM52173 = m52173(inputStream, j, new C3344());
        if (jM52173 == j) {
            return;
        }
        StringBuilder sbM33191 = C14536.m33191("Bytes to skip: ", " actual: ", j);
        sbM33191.append(jM52173);
        throw new EOFException(sbM33191.toString());
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m52185(InputStream inputStream) {
        int i = C16259.f47818;
        new C18942();
        C16259 c16259M43030 = C18942.m43030();
        C19613 c19613 = new C19613(new C20780(0), new C9387(7, c16259M43030));
        try {
            m52179(inputStream, c19613);
            byte[] bArrMo18597 = c16259M43030.mo18597();
            c19613.close();
            return bArrMo18597;
        } catch (Throwable th) {
            try {
                c19613.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52175(InputStream inputStream, Charset charset) throws IOException {
        C18271 c18271 = new C18271();
        m52180(inputStream, c18271, charset);
        return c18271.toString();
    }
}
