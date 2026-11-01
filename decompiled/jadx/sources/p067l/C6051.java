package p067l;

/* JADX INFO: renamed from: l.ۘۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6051 extends EnumC16660 {
    public /* synthetic */ C6051() {
        this("BeforeAttributeName", 33);
    }

    public C6051(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.f49836.m17220();
            c8791.m20329();
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
                    case '=':
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
