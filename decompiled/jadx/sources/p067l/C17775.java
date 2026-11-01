package p067l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17775 {
    /* JADX INFO: renamed from: ֫ */
    public static C11071 m40372(C9729 c9729, int i, int i2, Charset charset, int i3, Runnable runnable, C5036 c5036, OutputStreamWriter outputStreamWriter, boolean z) throws IOException {
        int i4 = i;
        long j = i2 - i4;
        C11742 c11742 = z ? new C11742() : null;
        OutputStreamWriter outputStreamWriter2 = c11742 != null ? new OutputStreamWriter(c11742, charset) : null;
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
                    char cCharAt = c9729.charAt(i7);
                    cArr[i7 - i6] = cCharAt;
                    if (c5036 != null) {
                        c5036.m10741(cCharAt);
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
            long j6 = c11742 == null ? 0L : c11742.f32788;
            C13929 c13929Matcher = C13259.m30304("\\b[\\p{L}\\d]+\\b").matcher((CharSequence) c9729);
            c13929Matcher.m31669();
            c13929Matcher.m31664(runnable);
            c13929Matcher.m56472region(i4, i2);
            long j7 = 0;
            while (c13929Matcher.find()) {
                j7++;
            }
            C13929 c13929Matcher2 = C13259.m30304("[\\u4e00-\\u9fa5]").matcher((CharSequence) c9729);
            c13929Matcher2.m31669();
            c13929Matcher2.m31664(runnable);
            c13929Matcher2.m56472region(i4, i2);
            while (c13929Matcher2.find()) {
                j5++;
            }
            int length = i3 - "\n".getBytes(charset).length;
            long j8 = j6;
            long j9 = 1;
            while (i4 < i2) {
                if (c9729.charAt(i4) == '\n') {
                    j9++;
                    if (z) {
                        j8 += (long) length;
                    }
                }
                i4++;
            }
            return new C11071(j8, j4, j7, j5, j9, 0);
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
