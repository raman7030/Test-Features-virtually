package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۢᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R2DU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9763 extends AbstractC11446 {
    @Override // l.AbstractC11446
    /* JADX INFO: renamed from: ֫ */
    public final int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 <= charSequence.length()) {
            CharSequence charSequenceSubSequence = charSequence.subSequence(i5, i6);
            try {
                stringWriter.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
                return i4 + 4;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
            }
        }
        throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + ((Object) charSequence.subSequence(i, charSequence.length())) + "' due to end of CharSequence");
    }
}
