package p067l;

/* JADX INFO: renamed from: l.ܿۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18791 extends EnumC16660 {
    public /* synthetic */ C18791() {
        this("ScriptDataEscapedEndTagOpen", 25);
    }

    public C18791(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20335()) {
            c16836.m38178(false);
            AbstractC7450 abstractC7450 = c16836.f49836;
            char cM20338 = c8791.m20338();
            abstractC7450.getClass();
            abstractC7450.m17218(String.valueOf(cM20338));
            c16836.f49844.append(c8791.m20338());
            c16836.m38182(EnumC16660.f49020);
            return;
        }
        c16836.m38180("</");
        c16836.m38191(EnumC16660.f49012);
    }
}
