package p067l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A2DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18351 extends AbstractC23974 {

    /* JADX INFO: renamed from: ܽ */
    public final int f54800 = 32;

    /* JADX INFO: renamed from: ۧ */
    public final int f54799 = 127;

    @Override // p067l.AbstractC23974
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25330(int i, StringWriter stringWriter) throws IOException {
        if (i >= this.f54800 && i <= this.f54799) {
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
        char[] cArr = AbstractC13246.f37214;
        stringWriter.write(cArr[(i >> 12) & 15]);
        stringWriter.write(cArr[(i >> 8) & 15]);
        stringWriter.write(cArr[(i >> 4) & 15]);
        stringWriter.write(cArr[i & 15]);
        return true;
    }
}
