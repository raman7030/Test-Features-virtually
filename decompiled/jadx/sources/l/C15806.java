package l;

/* JADX INFO: renamed from: l.ܺ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15806 extends EnumC19541 {
    public /* synthetic */ C15806() {
        this("BeforeAttributeValue", 36);
    }

    public C15806(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            c19129.f60287.m22253((char) 65533);
            c19129.m44177(EnumC19541.f63161);
            return;
        }
        if (cM41800 != ' ') {
            if (cM41800 == '\"') {
                c19129.m44177(EnumC19541.f63154);
                return;
            }
            if (cM41800 != '`') {
                if (cM41800 == 65535) {
                    c19129.m44171(this);
                    c19129.m44172();
                    c19129.m44177(EnumC19541.f63120);
                    return;
                }
                if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r') {
                    return;
                }
                if (cM41800 == '&') {
                    c17842.m41798();
                    c19129.m44177(EnumC19541.f63161);
                    return;
                }
                if (cM41800 == '\'') {
                    c19129.m44177(EnumC19541.f63190);
                    return;
                }
                switch (cM41800) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c19129.m44174(this);
                        c19129.m44172();
                        c19129.m44177(EnumC19541.f63120);
                        break;
                    default:
                        c17842.m41798();
                        c19129.m44177(EnumC19541.f63161);
                        break;
                }
                return;
            }
            c19129.m44174(this);
            c19129.f60287.m22253(cM41800);
            c19129.m44177(EnumC19541.f63161);
        }
    }
}
