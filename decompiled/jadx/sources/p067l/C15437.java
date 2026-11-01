package p067l;

/* JADX INFO: renamed from: l.ܰۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15437 extends EnumC16660 {
    public /* synthetic */ C15437() {
        this("Doctype", 50);
    }

    public C15437(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == '\t' || cM20339 == '\n' || cM20339 == '\f' || cM20339 == '\r' || cM20339 == ' ') {
            c16836.m38191(EnumC16660.f48995);
            return;
        }
        if (cM20339 != '>') {
            if (cM20339 == 65535) {
                c16836.m38185(this);
            } else {
                c16836.m38188(this);
                c16836.m38191(EnumC16660.f48995);
                return;
            }
        }
        c16836.m38188(this);
        C6109 c6109 = c16836.f49852;
        c6109.mo4316();
        c6109.getClass();
        c16836.m38190();
        c16836.m38191(EnumC16660.f48962);
    }
}
