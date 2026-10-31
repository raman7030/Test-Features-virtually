package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1532 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7567 m5240(AbstractC15440 abstractC15440, String str, long j, long j2, int i, int i2) throws IOException {
        InputStream inputStreamMo27926 = abstractC15440.mo27926();
        try {
            C7567 c7567M5239 = m5239(inputStreamMo27926, str, j, j2, i, i2, C14460.m34532());
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return c7567M5239;
        } catch (Throwable th) {
            if (inputStreamMo27926 == null) {
                throw th;
            }
            try {
                inputStreamMo27926.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23089 m5241(InputStream inputStream, String str, long j, long j2, int i, int i2) throws IOException {
        try {
            byte[] bArrCopyOf = new byte[32768];
            int iM5238 = m5238(inputStream, bArrCopyOf);
            if (iM5238 != 32768) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM5238);
            }
            C17095 c17095M33920 = C14272.m33920(str, bArrCopyOf);
            int i3 = c17095M33920.f52401;
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArrCopyOf, i3, iM5238 - i3), inputStream);
            CharsetDecoder charsetDecoderNewDecoder = c17095M33920.f52402.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
            try {
                C13916 c13916 = new C13916(i, i2, j, j2);
                m5242(new C12506(inputStreamReader), c13916, false);
                C23089 c23089 = new C23089(C13916.m33325(c13916), c17095M33920.f52403);
                inputStreamReader.close();
                inputStream.close();
                return c23089;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7567 m5239(InputStream inputStream, String str, long j, long j2, int i, int i2, MessageDigest messageDigest) throws C3059, IOException {
        byte[] bArrCopyOf = new byte[32768];
        int iM5238 = m5238(inputStream, bArrCopyOf);
        messageDigest.update(bArrCopyOf, 0, iM5238);
        if (iM5238 != 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM5238);
        }
        C17095 c17095M33920 = C14272.m33920(str, bArrCopyOf);
        int i3 = c17095M33920.f52401;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf, i3, iM5238 - i3);
        C10390 c10390 = new C10390(inputStream);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, new DigestInputStream(c10390, messageDigest));
        CharsetDecoder charsetDecoderNewDecoder = c17095M33920.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C13916 c13916 = new C13916(i, i2, j, j2);
            m5242(new C12506(inputStreamReader), c13916, true);
            C11801 c11801M33325 = C13916.m33325(c13916);
            C7567 c7567 = new C7567(c11801M33325.f35202, c17095M33920.f52403, j, j2, c11801M33325.f35200, c11801M33325.f35201, c11801M33325.f35196, c11801M33325.f35203, c11801M33325.f35199, C14460.m34531(messageDigest.digest()).substring(0, 16), ((long) iM5238) + c10390.f31241, c11801M33325.f35198, c11801M33325.f35197, c11801M33325.f35195);
            inputStreamReader.close();
            return c7567;
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5242(C12506 c12506, C13916 c13916, boolean z) throws IOException {
        int iM30689 = -1;
        do {
            if (iM30689 < 0) {
                iM30689 = C12506.m30689(c12506);
            }
            if (iM30689 < 0) {
                return;
            }
            if (iM30689 == 13) {
                iM30689 = C12506.m30689(c12506);
                if (iM30689 == 10) {
                    C13916.m33327(c13916, "\r\n");
                } else {
                    C13916.m33327(c13916, "\r");
                }
            } else if (iM30689 == 10) {
                C13916.m33327(c13916, "\n");
            } else {
                C13916.m33326(c13916, iM30689);
            }
            iM30689 = -1;
        } while (!C13916.m33330(c13916));
        if (z) {
            C12506.m30688(c12506);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5238(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = 0;
        while (i2 < bArr.length && (i = inputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            if (i == 0) {
                int i3 = inputStream.read();
                if (i3 < 0) {
                    break;
                }
                bArr[i2] = (byte) i3;
                i2++;
            } else {
                i2 += i;
            }
        }
        return i2;
    }
}
