package p067l;

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
public final class C3824 {
    /* JADX INFO: renamed from: ֫ */
    public static C9560 m7468(AbstractC17043 abstractC17043, String str, long j, long j2, int i, int i2) throws IOException {
        InputStream inputStreamMo29987 = abstractC17043.mo29987();
        try {
            C9560 c9560M7467 = m7467(inputStreamMo29987, str, j, j2, i, i2, C16111.m36666());
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return c9560M7467;
        } catch (Throwable th) {
            if (inputStreamMo29987 == null) {
                throw th;
            }
            try {
                inputStreamMo29987.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24312 m7469(InputStream inputStream, String str, long j, long j2, int i, int i2) throws IOException {
        try {
            byte[] bArrCopyOf = new byte[32768];
            int iM7466 = m7466(inputStream, bArrCopyOf);
            if (iM7466 != 32768) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM7466);
            }
            C18615 c18615M36053 = C15932.m36053(str, bArrCopyOf);
            int i3 = c18615M36053.f55584;
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArrCopyOf, i3, iM7466 - i3), inputStream);
            CharsetDecoder charsetDecoderNewDecoder = c18615M36053.f55585.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
            try {
                C15594 c15594 = new C15594(i, i2, j, j2);
                m7470(new C14254(inputStreamReader), c15594, false);
                C24312 c24312 = new C24312(C15594.m35444(c15594), c18615M36053.f55586);
                inputStreamReader.close();
                inputStream.close();
                return c24312;
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

    /* JADX INFO: renamed from: ֫ */
    public static C9560 m7467(InputStream inputStream, String str, long j, long j2, int i, int i2, MessageDigest messageDigest) throws C5276, IOException {
        byte[] bArrCopyOf = new byte[32768];
        int iM7466 = m7466(inputStream, bArrCopyOf);
        messageDigest.update(bArrCopyOf, 0, iM7466);
        if (iM7466 != 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM7466);
        }
        C18615 c18615M36053 = C15932.m36053(str, bArrCopyOf);
        int i3 = c18615M36053.f55584;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf, i3, iM7466 - i3);
        C12243 c12243 = new C12243(inputStream);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, new DigestInputStream(c12243, messageDigest));
        CharsetDecoder charsetDecoderNewDecoder = c18615M36053.f55585.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C15594 c15594 = new C15594(i, i2, j, j2);
            m7470(new C14254(inputStreamReader), c15594, true);
            C13584 c13584M35444 = C15594.m35444(c15594);
            C9560 c9560 = new C9560(c13584M35444.f38204, c18615M36053.f55586, j, j2, c13584M35444.f38202, c13584M35444.f38203, c13584M35444.f38198, c13584M35444.f38205, c13584M35444.f38201, C16111.m36665(messageDigest.digest()).substring(0, 16), ((long) iM7466) + c12243.f34206, c13584M35444.f38200, c13584M35444.f38199, c13584M35444.f38197);
            inputStreamReader.close();
            return c9560;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m7470(C14254 c14254, C15594 c15594, boolean z) throws IOException {
        int iM32764 = -1;
        do {
            if (iM32764 < 0) {
                iM32764 = C14254.m32764(c14254);
            }
            if (iM32764 < 0) {
                return;
            }
            if (iM32764 == 13) {
                iM32764 = C14254.m32764(c14254);
                if (iM32764 == 10) {
                    C15594.m35446(c15594, "\r\n");
                } else {
                    C15594.m35446(c15594, "\r");
                }
            } else if (iM32764 == 10) {
                C15594.m35446(c15594, "\n");
            } else {
                C15594.m35445(c15594, iM32764);
            }
            iM32764 = -1;
        } while (!C15594.m35449(c15594));
        if (z) {
            C14254.m32763(c14254);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7466(InputStream inputStream, byte[] bArr) throws IOException {
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
