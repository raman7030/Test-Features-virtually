package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19103 implements InterfaceC17006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f60177 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60178 = false;

    @Override // l.InterfaceC17006
    /* JADX INFO: renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        C20535 c20535;
        C9246 c9246M51434 = c23188.m51434();
        C20535 c20535M23724 = c9246M51434.m23724();
        int iM23722 = c9246M51434.m23722('`');
        C20535 c20535M23725 = c9246M51434.m23724();
        boolean z = this.f60178;
        HashMap map = this.f60177;
        if (z && ((c20535 = (C20535) map.get(Integer.valueOf(iM23722))) == null || c20535.compareTo(c20535M23724) <= 0)) {
            return new C4286(new C12897(c9246M51434.m23718(c20535M23724, c20535M23725).m41444()), c20535M23725);
        }
        while (c9246M51434.m23716('`') > 0) {
            C20535 c20535M23726 = c9246M51434.m23724();
            int iM23723 = c9246M51434.m23722('`');
            map.put(Integer.valueOf(iM23723), c20535M23726);
            if (iM23723 == iM23722) {
                C7108 c7108 = new C7108();
                String strReplace = c9246M51434.m23718(c20535M23725, c20535M23726).m41444().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && C7416.m19937(1, strReplace) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (strReplace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            strReplace = C15472.m36561(1, 1, strReplace);
                        }
                    }
                }
                c7108.m19122(strReplace);
                return new C4286(c7108, c9246M51434.m23724());
            }
        }
        this.f60178 = true;
        return new C4286(new C12897(c9246M51434.m23718(c20535M23724, c20535M23725).m41444()), c20535M23725);
    }
}
