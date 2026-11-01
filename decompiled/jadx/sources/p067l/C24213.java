package p067l;

/* JADX INFO: renamed from: l.᩺۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C24213 extends EnumC16660 {
    public /* synthetic */ C24213() {
        this("Data", 0);
    }

    public C24213(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20338 = c8791.m20338();
        if (cM20338 == 0) {
            c16836.m38188(this);
            c16836.m38179(c8791.m20339());
        } else {
            if (cM20338 == '&') {
                c16836.m38182(EnumC16660.f49026);
                return;
            }
            if (cM20338 == '<') {
                c16836.m38182(EnumC16660.f49010);
            } else if (cM20338 == 65535) {
                c16836.m38181(new C20191());
            } else {
                c16836.m38180(c8791.m20346());
            }
        }
    }
}
