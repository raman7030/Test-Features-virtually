package l;

/* JADX INFO: renamed from: l.᩵᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19683 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45263(C10720 c10720, C18977 c18977) {
        int i;
        boolean z;
        while (true) {
            int iM26898 = c10720.m26898();
            boolean z2 = false;
            switch (c10720.m26901()) {
                case 0:
                    c18977.getClass();
                    EnumC0631 enumC0631 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, 1);
                    return;
                case 1:
                    c10720.m26903();
                    int iM26899 = c10720.m26898() - iM26898;
                    c18977.getClass();
                    EnumC0631 enumC0632 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, iM26899);
                    break;
                case 2:
                    c10720.m26906();
                    int iM268910 = c10720.m26898() - iM26898;
                    c18977.getClass();
                    EnumC0631 enumC0633 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, iM268910);
                    break;
                case 3:
                    int iM26908 = c10720.m26908();
                    if (iM26908 < 0) {
                        iM26908 = ~iM26908;
                        z2 = true;
                    }
                    c18977.mo15816(iM26908, c10720.m26903() - 1, c10720.m26903() - 1, z2);
                    break;
                case 4:
                    int iM26909 = c10720.m26908();
                    if (iM26909 < 0) {
                        i = ~iM26909;
                        z = true;
                    } else {
                        i = iM26909;
                        z = false;
                    }
                    c18977.mo15815(i, c10720.m26903() - 1, c10720.m26903() - 1, c10720.m26903() - 1, z);
                    break;
                case 5:
                    c10720.m26908();
                    int iM268911 = c10720.m26898() - iM26898;
                    c18977.getClass();
                    EnumC0631 enumC0634 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, iM268911);
                    break;
                case 6:
                    c10720.m26908();
                    int iM268912 = c10720.m26898() - iM26898;
                    c18977.getClass();
                    EnumC0631 enumC0635 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, iM268912);
                    break;
                case 7:
                    c18977.getClass();
                    EnumC0631 enumC0636 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, 1);
                    break;
                case 8:
                    c18977.getClass();
                    EnumC0631 enumC0637 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, 1);
                    break;
                case 9:
                    c18977.mo15814(c10720.m26903());
                    break;
                default:
                    c18977.getClass();
                    EnumC0631 enumC0638 = EnumC0631.DBG_END_SEQUENCE;
                    c18977.mo21996(iM26898, 1);
                    break;
            }
        }
    }
}
