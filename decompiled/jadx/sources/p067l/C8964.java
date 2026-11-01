package p067l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۜᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 32DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8964 extends AbstractC13246 {
    @Override // p067l.AbstractC13246
    /* JADX INFO: renamed from: ֫ */
    public final int mo18199(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        int i2;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0 || (cCharAt = charSequence.charAt((i2 = i + 1))) < '0' || cCharAt > '7') {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && (cCharAt2 = charSequence.charAt(i3)) >= '0' && cCharAt2 <= '7') {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && (cCharAt3 = charSequence.charAt(i2)) >= '0' && cCharAt3 <= '3' && (cCharAt4 = charSequence.charAt(i4)) >= '0' && cCharAt4 <= '7') {
                sb.append(charSequence.charAt(i4));
            }
        }
        stringWriter.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
