package p067l;

/* JADX INFO: renamed from: l.ۛۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8062 extends EnumC16660 {
    public /* synthetic */ C8062() {
        this("CommentEnd", 48);
    }

    public C8062(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            StringBuilder sb = c16836.f49847.f10803;
            sb.append("--");
            sb.append((char) 65533);
            c16836.m38191(EnumC16660.f48988);
            return;
        }
        if (cM20339 == '!') {
            c16836.m38188(this);
            c16836.m38191(EnumC16660.f48968);
            return;
        }
        if (cM20339 == '-') {
            c16836.m38188(this);
            c16836.f49847.f10803.append('-');
            return;
        }
        if (cM20339 == '>') {
            c16836.m38187();
            c16836.m38191(EnumC16660.f48962);
        } else if (cM20339 == 65535) {
            c16836.m38185(this);
            c16836.m38187();
            c16836.m38191(EnumC16660.f48962);
        } else {
            c16836.m38188(this);
            StringBuilder sb2 = c16836.f49847.f10803;
            sb2.append("--");
            sb2.append(cM20339);
            c16836.m38191(EnumC16660.f48988);
        }
    }
}
