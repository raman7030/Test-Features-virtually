package p067l;

/* JADX INFO: renamed from: l.ۙ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6779 extends EnumC16660 {
    public /* synthetic */ C6779() {
        this("RCDATAEndTagName", 12);
    }

    public C6779(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20335()) {
            String strM20343 = c8791.m20343();
            c16836.f49836.m17218(strM20343);
            c16836.f49844.append(strM20343);
            return;
        }
        char cM20339 = c8791.m20339();
        if (cM20339 == '\t' || cM20339 == '\n' || cM20339 == '\f' || cM20339 == '\r' || cM20339 == ' ') {
            if (c16836.m38186()) {
                c16836.m38191(EnumC16660.f48984);
                return;
            } else {
                m15483(c16836, c8791);
                return;
            }
        }
        if (cM20339 == '/') {
            if (c16836.m38186()) {
                c16836.m38191(EnumC16660.f48965);
                return;
            } else {
                m15483(c16836, c8791);
                return;
            }
        }
        if (cM20339 == '>') {
            if (c16836.m38186()) {
                c16836.m38189();
                c16836.m38191(EnumC16660.f48962);
                return;
            } else {
                m15483(c16836, c8791);
                return;
            }
        }
        m15483(c16836, c8791);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15483(C16836 c16836, C8791 c8791) {
        c16836.m38180("</" + c16836.f49844.toString());
        c8791.m20329();
        c16836.m38191(EnumC16660.f49006);
    }
}
