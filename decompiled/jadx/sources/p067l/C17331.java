package p067l;

/* JADX INFO: renamed from: l.ܺۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17331 extends EnumC16660 {
    public /* synthetic */ C17331() {
        this("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    public C17331(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.f49852.f15364.append((char) 65533);
            return;
        }
        if (cM20339 == '\"') {
            c16836.m38191(EnumC16660.f48999);
            return;
        }
        if (cM20339 == '>') {
            c16836.m38188(this);
            c16836.f49852.getClass();
            c16836.m38190();
            c16836.m38191(EnumC16660.f48962);
            return;
        }
        if (cM20339 == 65535) {
            c16836.m38185(this);
            c16836.f49852.getClass();
            c16836.m38190();
            c16836.m38191(EnumC16660.f48962);
            return;
        }
        c16836.f49852.f15364.append(cM20339);
    }
}
