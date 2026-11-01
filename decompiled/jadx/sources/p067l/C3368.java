package p067l;

/* JADX INFO: renamed from: l.֨ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3368 extends EnumC16660 {
    public /* synthetic */ C3368() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C3368(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        String strM20331 = c8791.m20331(EnumC16660.f49025);
        if (strM20331.length() > 0) {
            c16836.f49836.m17216(strM20331);
        } else {
            c16836.f49836.m17219();
        }
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.f49836.m17215((char) 65533);
            return;
        }
        if (cM20339 == 65535) {
            c16836.m38185(this);
            c16836.m38191(EnumC16660.f48962);
            return;
        }
        if (cM20339 != '&') {
            if (cM20339 == '\'') {
                c16836.m38191(EnumC16660.f49023);
                return;
            } else {
                c16836.f49836.m17215(cM20339);
                return;
            }
        }
        int[] iArrM38183 = c16836.m38183('\'', true);
        if (iArrM38183 != null) {
            c16836.f49836.m17213(iArrM38183);
        } else {
            c16836.f49836.m17215('&');
        }
    }
}
