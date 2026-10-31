package l;

/* JADX INFO: renamed from: l.᩵۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19336 extends EnumC19541 {
    public /* synthetic */ C19336() {
        this("AttributeValue_unquoted", 39);
    }

    public C19336(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        String strM41792 = c17842.m41792(EnumC19541.f63189);
        if (strM41792.length() > 0) {
            c19129.f60287.m22254(strM41792);
        }
        char cM41800 = c17842.m41800();
        if (cM41800 != 0) {
            if (cM41800 != ' ') {
                if (cM41800 != '\"' && cM41800 != '`') {
                    if (cM41800 == 65535) {
                        c19129.m44171(this);
                        c19129.m44177(EnumC19541.f63120);
                        return;
                    }
                    if (cM41800 != '\t' && cM41800 != '\n' && cM41800 != '\f' && cM41800 != '\r') {
                        if (cM41800 == '&') {
                            int[] iArrM44168 = c19129.m44168((Character) '>', true);
                            if (iArrM44168 != null) {
                                c19129.f60287.m22249(iArrM44168);
                                return;
                            } else {
                                c19129.f60287.m22253('&');
                                return;
                            }
                        }
                        if (cM41800 != '\'') {
                            switch (cM41800) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c19129.m44172();
                                    c19129.m44177(EnumC19541.f63120);
                                    break;
                                default:
                                    c19129.f60287.m22253(cM41800);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c19129.m44174(this);
                c19129.f60287.m22253(cM41800);
                return;
            }
            c19129.m44177(EnumC19541.f63142);
            return;
        }
        c19129.m44174(this);
        c19129.f60287.m22253((char) 65533);
    }
}
