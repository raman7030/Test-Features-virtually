package l;

/* JADX INFO: renamed from: l.ۘۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6O1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3714 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11298(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC0464) {
        if (interfaceC0463 == null || interfaceC0464 == null) {
            return false;
        }
        String text = interfaceC0463.getText();
        String text2 = interfaceC0464.getText();
        C23218 c23218 = new C23218(new C20813(C16014.m37867(text, text2)));
        c23218.m43458();
        InterfaceC0463 interfaceC0463NextToken = c23218.nextToken();
        if (interfaceC0463NextToken.getType() == interfaceC0463.getType() && interfaceC0463NextToken.mo2053() + 1 == text.length()) {
            InterfaceC0463 interfaceC0463NextToken2 = c23218.nextToken();
            if (interfaceC0463NextToken2.getType() == interfaceC0464.getType() && interfaceC0463NextToken2.mo2054() == text.length()) {
                if (interfaceC0463NextToken2.mo2053() + 1 == text2.length() + text.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
