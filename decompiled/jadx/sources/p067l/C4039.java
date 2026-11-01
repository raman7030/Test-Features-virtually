package p067l;

/* JADX INFO: renamed from: l.֫ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C4039 extends EnumC16660 {
    public /* synthetic */ C4039() {
        this("ScriptDataEscaped", 21);
    }

    public C4039(String str, int i) {
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
        char cM20338 = c8791.m20338();
        if (cM20338 == 0) {
            c16836.m38188(this);
            c8791.m20332();
            c16836.m38179((char) 65533);
        } else if (cM20338 == '-') {
            c16836.m38179('-');
            c16836.m38182(EnumC16660.f48969);
        } else if (cM20338 == '<') {
            c16836.m38182(EnumC16660.f48963);
        } else {
            c16836.m38180(c8791.m20331('-', '<', 0));
        }
    }
}
