package p067l;

/* JADX INFO: renamed from: l.ۘۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6O1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5898 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m13245(InterfaceC2808 interfaceC2808, InterfaceC2808 interfaceC2809) {
        if (interfaceC2808 == null || interfaceC2809 == null) {
            return false;
        }
        String text = interfaceC2808.getText();
        String text2 = interfaceC2809.getText();
        C24435 c24435 = new C24435(new C22149(C17588.m40053(text, text2)));
        c24435.m45727();
        InterfaceC2808 interfaceC2808NextToken = c24435.nextToken();
        if (interfaceC2808NextToken.getType() == interfaceC2808.getType() && interfaceC2808NextToken.mo4433() + 1 == text.length()) {
            InterfaceC2808 interfaceC2808NextToken2 = c24435.nextToken();
            if (interfaceC2808NextToken2.getType() == interfaceC2809.getType() && interfaceC2808NextToken2.mo4434() == text.length()) {
                if (interfaceC2808NextToken2.mo4433() + 1 == text2.length() + text.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
