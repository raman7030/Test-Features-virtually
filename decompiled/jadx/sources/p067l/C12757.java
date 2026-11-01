package p067l;

/* JADX INFO: renamed from: l.ۧۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12757 extends EnumC16660 {
    public /* synthetic */ C12757() {
        this("ScriptDataEscapedDash", 22);
    }

    public C12757(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20337()) {
            c16836.m38185(this);
            c16836.m38191(EnumC16660.f48962);
            return;
        }
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            c16836.m38179((char) 65533);
            c16836.m38191(EnumC16660.f49012);
        } else if (cM20339 == '-') {
            c16836.m38179(cM20339);
            c16836.m38191(EnumC16660.f48974);
        } else if (cM20339 == '<') {
            c16836.m38191(EnumC16660.f48963);
        } else {
            c16836.m38179(cM20339);
            c16836.m38191(EnumC16660.f49012);
        }
    }
}
