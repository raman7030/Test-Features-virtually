package p067l;

/* JADX INFO: renamed from: l.۠ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9956 extends EnumC16660 {
    public /* synthetic */ C9956() {
        this("EndTagOpen", 8);
    }

    public C9956(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20337()) {
            c16836.m38185(this);
            c16836.m38180("</");
            c16836.m38191(EnumC16660.f48962);
        } else if (c8791.m20335()) {
            c16836.m38178(false);
            c16836.m38191(EnumC16660.f48987);
        } else if (c8791.m20341('>')) {
            c16836.m38188(this);
            c16836.m38182(EnumC16660.f48962);
        } else {
            c16836.m38188(this);
            c16836.m38182(EnumC16660.f49007);
        }
    }
}
