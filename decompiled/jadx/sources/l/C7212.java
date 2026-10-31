package l;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.۟ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7212 extends AbstractC21052 {
    @Override // l.AbstractC21052
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19297(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        boolean z = false;
        if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
            stringWriter.write(charSequence.toString());
            return;
        }
        String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
        char[] cArr = C2001.f6695;
        if (!C9679.m24615((CharSequence) string)) {
            if (!((cArr == null ? 0 : Array.getLength(cArr)) == 0)) {
                int length = string.length();
                int length2 = cArr.length;
                int i = length - 1;
                int i2 = length2 - 1;
                loop0: for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = string.charAt(i3);
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (cArr[i4] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == string.charAt(i3 + 1)))) {
                            z = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        if (z) {
            stringWriter.write(C9679.m24611(string, C2001.f6693, C2001.f6694));
        } else {
            stringWriter.write(charSequence.toString());
        }
    }
}
