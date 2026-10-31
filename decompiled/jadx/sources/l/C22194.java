package l;

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
public final class C22194 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f71991;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15137 f71992;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f71993;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C21489 f71994;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m49849(InputStream inputStream) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C8789.f26773;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return (List) C18434.lines(new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset))).collect(C22976.toList());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܶۢ֡] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.᩸ۢ֡] */
    static {
        char c = File.separatorChar;
        f71991 = new byte[0];
        System.lineSeparator();
        EnumC20078.LF.getString();
        EnumC20078.CRLF.getString();
        final C0321 c0321 = new C0321();
        f71992 = new ThreadLocal() { // from class: l.ܶۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c0321.getClass();
                return new byte[8192];
            }
        };
        f71993 = new byte[8192];
        final C5261 c5261 = new C5261(0);
        f71994 = new ThreadLocal() { // from class: l.᩸ۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c5261.getClass();
                return new char[8192];
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49847(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        C11003.requireNonNull(inputStream, "inputStream");
        C11003.requireNonNull(outputStream, "outputStream");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49850(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49854(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        return C12316.m29873(Channels.newChannel(inputStream), Channels.newChannel(inputStream2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49853(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        int i = C8789.f26773;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = (char[]) f71994.get();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49852(InputStream inputStream, OutputStream outputStream) throws IOException {
        m49847(inputStream, outputStream, 8192);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m49855() {
        byte[] bArr = f71993;
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49851(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        byte[] bArr = (byte[]) f71992.get();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49844(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i == 0) {
            return 0;
        }
        C11003.requireNonNull(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Length must not be negative: "));
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49857(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iM49844 = m49844(inputStream, bArr, i);
        if (iM49844 != i) {
            throw new EOFException(C18307.m42646("Length to read: ", i, iM49844, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49845(long j, InputStream inputStream) {
        return m49846(inputStream, j, new C1027());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49846(InputStream inputStream, long j, Supplier supplier) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Skip count must be non-negative, actual: "));
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49856(long j, InputStream inputStream) throws EOFException {
        long jM49846 = m49846(inputStream, j, new C1027());
        if (jM49846 == j) {
            return;
        }
        StringBuilder sbM31106 = C12803.m31106("Bytes to skip: ", " actual: ", j);
        sbM31106.append(jM49846);
        throw new EOFException(sbM31106.toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m49858(InputStream inputStream) {
        int i = C14616.f44711;
        new C17439();
        C14616 c14616M40772 = C17439.m40772();
        C18145 c18145 = new C18145(new C19373(0), new C7385(7, c14616M40772));
        try {
            m49852(inputStream, c18145);
            byte[] bArrMo16671 = c14616M40772.mo16671();
            c18145.close();
            return bArrMo16671;
        } catch (Throwable th) {
            try {
                c18145.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49848(InputStream inputStream, Charset charset) throws IOException {
        C16733 c16733 = new C16733();
        m49853(inputStream, c16733, charset);
        return c16733.toString();
    }
}
