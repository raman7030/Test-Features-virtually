package l;

/* JADX INFO: renamed from: l.ۖ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2402 extends EnumC19541 {
    public /* synthetic */ C2402() {
        this("AttributeValue_doubleQuoted", 37);
    }

    public C2402(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        String strM41780 = c17842.m41780(false);
        if (strM41780.length() > 0) {
            c19129.f60287.m22254(strM41780);
        } else {
            c19129.f60287.m22250();
        }
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            c19129.f60287.m22253((char) 65533);
            return;
        }
        if (cM41800 == '\"') {
            c19129.m44177(EnumC19541.f63179);
            return;
        }
        if (cM41800 != '&') {
            if (cM41800 == 65535) {
                c19129.m44171(this);
                c19129.m44177(EnumC19541.f63120);
                return;
            } else {
                c19129.f60287.m22253(cM41800);
                return;
            }
        }
        int[] iArrM44168 = c19129.m44168((Character) '\"', true);
        if (iArrM44168 != null) {
            c19129.f60287.m22249(iArrM44168);
        } else {
            c19129.f60287.m22253('&');
        }
    }
}
