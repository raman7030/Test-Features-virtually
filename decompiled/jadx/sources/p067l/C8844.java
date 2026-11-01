package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۜܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OARH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8844 extends C4821 {

    /* JADX INFO: renamed from: ۬ */
    public final int f24014;

    public C8844(AbstractC24937 abstractC24937, InterfaceC24346 interfaceC24346, int i) {
        super(abstractC24937, interfaceC24346, null);
        this.f24014 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f24014;
        if (i < 0 || i >= ((InterfaceC24346) m10224()).size()) {
            string = "";
        } else {
            String strMo13949 = ((InterfaceC24346) m10224()).mo13949(C16399.m37214(i, i));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo13949.toCharArray()) {
                if (c == '\t') {
                    sb.append("\\t");
                } else if (c == '\n') {
                    sb.append("\\n");
                } else if (c == '\r') {
                    sb.append("\\r");
                } else {
                    sb.append(c);
                }
            }
            string = sb.toString();
        }
        Locale.getDefault();
        return "LexerNoViableAltException('" + string + "')";
    }
}
