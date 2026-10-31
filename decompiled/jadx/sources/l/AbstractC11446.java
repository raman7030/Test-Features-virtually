package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۨۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 52DI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11446 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f34218 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo16274(CharSequence charSequence, int i, StringWriter stringWriter);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28254(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            int length = charSequence.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo16274 = mo16274(charSequence, iCharCount, stringWriter);
                if (iMo16274 == 0) {
                    char cCharAt = charSequence.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = charSequence.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iMo16274; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
