package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16210 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9156 m38160(C7744 c7744, int i, int i2, Charset charset, int i3, Runnable runnable, C2806 c2806, OutputStreamWriter outputStreamWriter, boolean z) throws IOException {
        int i4 = i;
        long j = i2 - i4;
        C9862 c9862 = z ? new C9862() : null;
        OutputStreamWriter outputStreamWriter2 = c9862 != null ? new OutputStreamWriter(c9862, charset) : null;
        int i5 = 32768;
        try {
            char[] cArr = new char[32768];
            int i6 = i4;
            while (i6 < i2) {
                runnable.run();
                int iMin = Math.min(i2, Math.min(i5, i2 - i6) + i6);
                int i7 = i6;
                while (i7 < iMin) {
                    long j2 = j;
                    char cCharAt = c7744.charAt(i7);
                    cArr[i7 - i6] = cCharAt;
                    if (c2806 != null) {
                        c2806.m8681(cCharAt);
                    }
                    i7++;
                    j = j2;
                }
                long j3 = j;
                if (outputStreamWriter2 != null) {
                    outputStreamWriter2.write(cArr, 0, iMin - i6);
                }
                if (outputStreamWriter != null) {
                    outputStreamWriter.write(cArr, 0, iMin - i6);
                }
                i6 = iMin;
                j = j3;
                i5 = 32768;
            }
            long j4 = j;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.close();
            }
            long j5 = 0;
            long j6 = c9862 == null ? 0L : c9862.f29835;
            C12164 c12164Matcher = C11459.m28260("\\b[\\p{L}\\d]+\\b").matcher((CharSequence) c7744);
            c12164Matcher.m29604();
            c12164Matcher.m29599(runnable);
            c12164Matcher.m29614region(i4, i2);
            long j7 = 0;
            while (c12164Matcher.find()) {
                j7++;
            }
            C12164 c12164Matcher2 = C11459.m28260("[\\u4e00-\\u9fa5]").matcher((CharSequence) c7744);
            c12164Matcher2.m29604();
            c12164Matcher2.m29599(runnable);
            c12164Matcher2.m29614region(i4, i2);
            while (c12164Matcher2.find()) {
                j5++;
            }
            int length = i3 - "\n".getBytes(charset).length;
            long j8 = j6;
            long j9 = 1;
            while (i4 < i2) {
                if (c7744.charAt(i4) == '\n') {
                    j9++;
                    if (z) {
                        j8 += (long) length;
                    }
                }
                i4++;
            }
            return new C9156(j8, j4, j7, j5, j9, 0);
        } catch (Throwable th) {
            if (outputStreamWriter2 == null) {
                throw th;
            }
            try {
                outputStreamWriter2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
