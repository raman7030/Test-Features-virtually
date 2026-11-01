package p067l;

/* JADX INFO: renamed from: l.ۙۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6721 extends EnumC16660 {
    public /* synthetic */ C6721() {
        this("MarkupDeclarationOpen", 43);
    }

    public C6721(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20333("--")) {
            c16836.f49847.mo4316();
            c16836.m38191(EnumC16660.f49019);
        } else if (c8791.m20342("DOCTYPE")) {
            c16836.m38191(EnumC16660.f48978);
        } else if (c8791.m20333("[CDATA[")) {
            c16836.m38184();
            c16836.m38191(EnumC16660.f48982);
        } else {
            c16836.m38188(this);
            c16836.m38182(EnumC16660.f49007);
        }
    }
}
