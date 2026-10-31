package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A2DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16817 extends AbstractC22734 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51619 = 32;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51618 = 127;

    @Override // l.AbstractC22734
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23385(int i, StringWriter stringWriter) throws IOException {
        if (i >= this.f51619 && i <= this.f51618) {
            return false;
        }
        if (i > 65535) {
            char[] chars = Character.toChars(i);
            StringBuilder sb = new StringBuilder("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            sb.append(hexString.toUpperCase(locale));
            sb.append("\\u");
            sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            stringWriter.write(sb.toString());
            return true;
        }
        stringWriter.write("\\u");
        char[] cArr = AbstractC11446.f34218;
        stringWriter.write(cArr[(i >> 12) & 15]);
        stringWriter.write(cArr[(i >> 8) & 15]);
        stringWriter.write(cArr[(i >> 4) & 15]);
        stringWriter.write(cArr[i & 15]);
        return true;
    }
}
