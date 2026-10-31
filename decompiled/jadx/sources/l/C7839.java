package l;

/* JADX INFO: renamed from: l.۠֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7839 extends EnumC19541 {
    public /* synthetic */ C7839() {
        this("RCDATAEndTagName", 12);
    }

    public C7839(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41808()) {
            String strM41811 = c17842.m41811();
            c19129.f60287.m22256(strM41811);
            c19129.f60299.append(strM41811);
            return;
        }
        char cM41800 = c17842.m41800();
        if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r' || cM41800 == ' ') {
            if (c19129.m44178()) {
                c19129.m44177(EnumC19541.f63142);
                return;
            } else {
                m20932(c19129, c17842);
                return;
            }
        }
        if (cM41800 == '/') {
            if (c19129.m44178()) {
                c19129.m44177(EnumC19541.f63123);
                return;
            } else {
                m20932(c19129, c17842);
                return;
            }
        }
        if (cM41800 == '>') {
            if (c19129.m44178()) {
                c19129.m44172();
                c19129.m44177(EnumC19541.f63120);
                return;
            } else {
                m20932(c19129, c17842);
                return;
            }
        }
        m20932(c19129, c17842);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20932(C19129 c19129, C17842 c17842) {
        c19129.m44163("</");
        c19129.m44165(c19129.f60299);
        c17842.m41798();
        c19129.m44177(EnumC19541.f63162);
    }
}
