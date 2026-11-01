package p067l;

/* JADX INFO: renamed from: l.᩸۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C22873 extends EnumC16660 {
    public /* synthetic */ C22873() {
        this("TagName", 9);
    }

    public C22873(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        c16836.f49836.m17218(c8791.m20336());
        char cM20339 = c8791.m20339();
        if (cM20339 != 0) {
            if (cM20339 != ' ') {
                if (cM20339 == '/') {
                    c16836.m38191(EnumC16660.f48965);
                    return;
                }
                if (cM20339 == '>') {
                    c16836.m38189();
                    c16836.m38191(EnumC16660.f48962);
                    return;
                }
                if (cM20339 == 65535) {
                    c16836.m38185(this);
                    c16836.m38191(EnumC16660.f48962);
                    return;
                } else if (cM20339 != '\t' && cM20339 != '\n' && cM20339 != '\f' && cM20339 != '\r') {
                    AbstractC7450 abstractC7450 = c16836.f49836;
                    abstractC7450.getClass();
                    abstractC7450.m17218(String.valueOf(cM20339));
                    return;
                }
            }
            c16836.m38191(EnumC16660.f48984);
            return;
        }
        c16836.f49836.m17218(EnumC16660.f48994);
    }
}
