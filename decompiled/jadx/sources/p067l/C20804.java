package p067l;

/* JADX INFO: renamed from: l.᩵ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20804 extends EnumC16660 {
    public /* synthetic */ C20804() {
        this("AfterAttributeName", 35);
    }

    public C20804(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.f49836.m17211((char) 65533);
            c16836.m38191(EnumC16660.f48980);
            return;
        }
        if (cM20339 != ' ') {
            if (cM20339 != '\"' && cM20339 != '\'') {
                if (cM20339 == '/') {
                    c16836.m38191(EnumC16660.f48965);
                    return;
                }
                if (cM20339 == 65535) {
                    c16836.m38185(this);
                    c16836.m38191(EnumC16660.f48962);
                    return;
                }
                if (cM20339 == '\t' || cM20339 == '\n' || cM20339 == '\f' || cM20339 == '\r') {
                    return;
                }
                switch (cM20339) {
                    case '<':
                        break;
                    case '=':
                        c16836.m38191(EnumC16660.f48966);
                        break;
                    case '>':
                        c16836.m38189();
                        c16836.m38191(EnumC16660.f48962);
                        break;
                    default:
                        c16836.f49836.m17220();
                        c8791.m20329();
                        c16836.m38191(EnumC16660.f48980);
                        break;
                }
                return;
            }
            c16836.m38188(this);
            c16836.f49836.m17220();
            c16836.f49836.m17211(cM20339);
            c16836.m38191(EnumC16660.f48980);
        }
    }
}
