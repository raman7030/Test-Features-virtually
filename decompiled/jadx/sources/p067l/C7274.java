package p067l;

/* JADX INFO: renamed from: l.ۚۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7274 extends EnumC16660 {
    public /* synthetic */ C7274() {
        this("PLAINTEXT", 6);
    }

    public C7274(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20338 = c8791.m20338();
        if (cM20338 == 0) {
            c16836.m38188(this);
            c8791.m20332();
            c16836.m38179((char) 65533);
        } else if (cM20338 == 65535) {
            c16836.m38181(new C20191());
        } else {
            c16836.m38180(c8791.m20330((char) 0));
        }
    }
}
