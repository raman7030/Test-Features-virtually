package p067l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ܰۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 62DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15256 extends AbstractC22376 {
    @Override // p067l.AbstractC22376
    /* JADX INFO: renamed from: ֫ */
    public final void mo21245(CharSequence charSequence, StringWriter stringWriter) throws IOException {
        String string = charSequence.toString();
        char[] cArr = C4270.f9482;
        if (string != null && cArr != null) {
            int length = string.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = string.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == string.charAt(i3 + 1)))) {
                        stringWriter.write(34);
                        stringWriter.write(C11567.m26625(string, C4270.f9481, C4270.f9480));
                        stringWriter.write(34);
                        return;
                    }
                }
            }
        }
        stringWriter.write(string);
    }
}
