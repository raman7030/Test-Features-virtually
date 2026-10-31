package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 37TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15573 implements InterfaceC17006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13478 f47984;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f47985;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f47986;

    static {
        C22651 c22651M32514 = C13478.m32514();
        c22651M32514.m50653('<');
        c22651M32514.m50653('>');
        f47984 = c22651M32514.m50652();
        f47986 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        f47985 = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // l.InterfaceC17006
    /* JADX INFO: renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        String strM46315;
        C9246 c9246M51434 = c23188.m51434();
        c9246M51434.m23723();
        C20535 c20535M23724 = c9246M51434.m23724();
        int i = 0;
        while (true) {
            char cM23725 = c9246M51434.m23725();
            if (cM23725 == 0) {
                i = -1;
                break;
            }
            if (f47984.m32516(cM23725)) {
                break;
            }
            i++;
            c9246M51434.m23723();
        }
        if (i > 0 && c9246M51434.m23725() == '>') {
            C17712 c17712M23718 = c9246M51434.m23718(c20535M23724, c9246M51434.m23724());
            String strM41444 = c17712M23718.m41444();
            c9246M51434.m23723();
            if (f47986.matcher(strM41444).matches()) {
                strM46315 = strM41444;
            } else {
                strM46315 = f47985.matcher(strM41444).matches() ? C20094.m46315("mailto:", strM41444) : null;
            }
            if (strM46315 != null) {
                C2315 c2315 = new C2315(strM46315, null);
                C12897 c12897 = new C12897(strM41444);
                c12897.m1342(c17712M23718.m41447());
                c2315.m1343(c12897);
                return new C4286(c2315, c9246M51434.m23724());
            }
        }
        return null;
    }
}
