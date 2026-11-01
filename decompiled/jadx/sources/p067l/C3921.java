package p067l;

/* JADX INFO: renamed from: l.֫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3921 extends EnumC16660 {
    public /* synthetic */ C3921() {
        this("DoctypeName", 52);
    }

    public C3921(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20335()) {
            c16836.f49852.f15362.append(c8791.m20343());
            return;
        }
        char cM20339 = c8791.m20339();
        if (cM20339 != 0) {
            if (cM20339 != ' ') {
                if (cM20339 == '>') {
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
                if (cM20339 != '\t' && cM20339 != '\n' && cM20339 != '\f' && cM20339 != '\r') {
                    c16836.f49852.f15362.append(cM20339);
                    return;
                }
            }
            c16836.m38191(EnumC16660.f48975);
            return;
        }
        c16836.m38188(this);
        c16836.f49852.f15362.append((char) 65533);
    }
}
