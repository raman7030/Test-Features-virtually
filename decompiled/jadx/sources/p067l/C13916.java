package p067l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.۫ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13916 extends AbstractC13246 {
    @Override // p067l.AbstractC13246
    /* JADX INFO: renamed from: ֫ */
    public final int mo18199(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (i != 0) {
            throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
        }
        String string = charSequence.toString();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf = string.indexOf(92, i2);
            if (iIndexOf == -1) {
                break;
            }
            if (iIndexOf > i3) {
                stringWriter.write(string.substring(i3, iIndexOf));
            }
            i3 = iIndexOf + 1;
            i2 = iIndexOf + 2;
        }
        if (i3 < string.length()) {
            stringWriter.write(string.substring(i3));
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
