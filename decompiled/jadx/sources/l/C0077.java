package l;

/* JADX INFO: renamed from: l.֡֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0077 extends EnumC19541 {
    public /* synthetic */ C0077() {
        this("TagName", 9);
    }

    public C0077(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1032(C19129 c19129, C17842 c17842) {
        c19129.f60287.m22256(c17842.m41790());
        char cM41800 = c17842.m41800();
        if (cM41800 != 0) {
            if (cM41800 != ' ') {
                if (cM41800 == '/') {
                    c19129.m44177(EnumC19541.f63123);
                    return;
                }
                if (cM41800 == '<') {
                    c17842.m41798();
                    c19129.m44174(this);
                } else if (cM41800 != '>') {
                    if (cM41800 == 65535) {
                        c19129.m44171(this);
                        c19129.m44177(EnumC19541.f63120);
                        return;
                    } else if (cM41800 != '\t' && cM41800 != '\n' && cM41800 != '\f' && cM41800 != '\r') {
                        AbstractC8545 abstractC8545 = c19129.f60287;
                        abstractC8545.getClass();
                        abstractC8545.m22256(String.valueOf(cM41800));
                        return;
                    }
                }
                c19129.m44172();
                c19129.m44177(EnumC19541.f63120);
                return;
            }
            c19129.m44177(EnumC19541.f63142);
            return;
        }
        c19129.f60287.m22256(EnumC19541.f63160);
    }
}
