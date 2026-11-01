package p067l;

/* JADX INFO: renamed from: l.۫ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14097 extends EnumC16660 {
    public /* synthetic */ C14097() {
        this("Comment", 46);
    }

    public C14097(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20338 = c8791.m20338();
        if (cM20338 == 0) {
            c16836.m38188(this);
            c8791.m20332();
            c16836.f49847.f10803.append((char) 65533);
        } else if (cM20338 == '-') {
            c16836.m38182(EnumC16660.f48973);
        } else {
            if (cM20338 == 65535) {
                c16836.m38185(this);
                c16836.m38187();
                c16836.m38191(EnumC16660.f48962);
                return;
            }
            c16836.f49847.f10803.append(c8791.m20331('-', 0));
        }
    }
}
