package p067l;

/* JADX INFO: renamed from: l.֨ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3250 extends EnumC16660 {
    public /* synthetic */ C3250() {
        this("TagOpen", 7);
    }

    public C3250(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20338 = c8791.m20338();
        if (cM20338 == '!') {
            c16836.m38182(EnumC16660.f48976);
            return;
        }
        if (cM20338 == '/') {
            c16836.m38182(EnumC16660.f49024);
            return;
        }
        if (cM20338 == '?') {
            c16836.m38182(EnumC16660.f49007);
            return;
        }
        if (c8791.m20335()) {
            c16836.m38178(true);
            c16836.m38191(EnumC16660.f48987);
        } else {
            c16836.m38188(this);
            c16836.m38179('<');
            c16836.m38191(EnumC16660.f48962);
        }
    }
}
