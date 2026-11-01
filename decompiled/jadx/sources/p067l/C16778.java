package p067l;

/* JADX INFO: renamed from: l.ܶۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16778 extends EnumC16660 {
    public /* synthetic */ C16778() {
        this("AttributeValue_unquoted", 39);
    }

    public C16778(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        String strM20340 = c8791.m20340(EnumC16660.f48977);
        if (strM20340.length() > 0) {
            c16836.f49836.m17216(strM20340);
        }
        char cM20339 = c8791.m20339();
        if (cM20339 != 0) {
            if (cM20339 != ' ') {
                if (cM20339 != '\"' && cM20339 != '`') {
                    if (cM20339 == 65535) {
                        c16836.m38185(this);
                        c16836.m38191(EnumC16660.f48962);
                        return;
                    }
                    if (cM20339 != '\t' && cM20339 != '\n' && cM20339 != '\f' && cM20339 != '\r') {
                        if (cM20339 == '&') {
                            int[] iArrM38183 = c16836.m38183('>', true);
                            if (iArrM38183 != null) {
                                c16836.f49836.m17213(iArrM38183);
                                return;
                            } else {
                                c16836.f49836.m17215('&');
                                return;
                            }
                        }
                        if (cM20339 != '\'') {
                            switch (cM20339) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c16836.m38189();
                                    c16836.m38191(EnumC16660.f48962);
                                    break;
                                default:
                                    c16836.f49836.m17215(cM20339);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c16836.m38188(this);
                c16836.f49836.m17215(cM20339);
                return;
            }
            c16836.m38191(EnumC16660.f48984);
            return;
        }
        c16836.m38188(this);
        c16836.f49836.m17215((char) 65533);
    }
}
