package p067l;

/* JADX INFO: renamed from: l.ܿۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18673 extends EnumC16660 {
    public /* synthetic */ C18673() {
        this("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    public C18673(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.f49852.f15363.append((char) 65533);
            return;
        }
        if (cM20339 == '\"') {
            c16836.m38191(EnumC16660.f48970);
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
        c16836.f49852.f15363.append(cM20339);
    }
}
