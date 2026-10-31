package l;

/* JADX INFO: renamed from: l.ۡ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8752 extends EnumC19541 {
    public /* synthetic */ C8752() {
        this("AfterAttributeName", 35);
    }

    public C8752(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            c19129.f60287.m22247((char) 65533);
            c19129.m44177(EnumC19541.f63138);
            return;
        }
        if (cM41800 != ' ') {
            if (cM41800 != '\"' && cM41800 != '\'') {
                if (cM41800 == '/') {
                    c19129.m44177(EnumC19541.f63123);
                    return;
                }
                if (cM41800 == 65535) {
                    c19129.m44171(this);
                    c19129.m44177(EnumC19541.f63120);
                    return;
                }
                if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r') {
                    return;
                }
                switch (cM41800) {
                    case '<':
                        break;
                    case '=':
                        c19129.m44177(EnumC19541.f63124);
                        break;
                    case '>':
                        c19129.m44172();
                        c19129.m44177(EnumC19541.f63120);
                        break;
                    default:
                        c19129.f60287.m22255();
                        c17842.m41798();
                        c19129.m44177(EnumC19541.f63138);
                        break;
                }
                return;
            }
            c19129.m44174(this);
            c19129.f60287.m22255();
            c19129.f60287.m22247(cM41800);
            c19129.m44177(EnumC19541.f63138);
        }
    }
}
