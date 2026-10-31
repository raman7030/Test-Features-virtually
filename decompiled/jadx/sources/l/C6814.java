package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۜܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OARH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6814 extends C2581 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f21137;

    public C6814(AbstractC23747 abstractC23747, InterfaceC23125 interfaceC23125, int i) {
        super(abstractC23747, interfaceC23125, null);
        this.f21137 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f21137;
        if (i < 0 || i >= ((InterfaceC23125) m8185()).size()) {
            string = "";
        } else {
            String strMo12025 = ((InterfaceC23125) m8185()).mo12025(C14763.m35067(i, i));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo12025.toCharArray()) {
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
