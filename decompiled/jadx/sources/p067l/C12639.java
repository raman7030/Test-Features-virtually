package p067l;

/* JADX INFO: renamed from: l.ۧۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12639 extends EnumC16660 {
    public /* synthetic */ C12639() {
        this("AfterDoctypeName", 53);
    }

    public C12639(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20337()) {
            c16836.m38185(this);
            c16836.f49852.getClass();
            c16836.m38190();
            c16836.m38191(EnumC16660.f48962);
            return;
        }
        if (c8791.m20347('\t', '\n', '\r', '\f', ' ')) {
            c8791.m20332();
            return;
        }
        if (c8791.m20341('>')) {
            c16836.m38190();
            c16836.m38182(EnumC16660.f48962);
            return;
        }
        if (c8791.m20342("PUBLIC")) {
            c16836.f49852.getClass();
            c16836.m38191(EnumC16660.f49002);
        } else if (c8791.m20342("SYSTEM")) {
            c16836.f49852.getClass();
            c16836.m38191(EnumC16660.f48992);
        } else {
            c16836.m38188(this);
            c16836.f49852.getClass();
            c16836.m38182(EnumC16660.f49036);
        }
    }
}
