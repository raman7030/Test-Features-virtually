package p067l;

/* JADX INFO: renamed from: l.۟ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9403 extends EnumC16660 {
    public /* synthetic */ C9403() {
        this("BeforeDoctypeName", 51);
    }

    public C9403(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20335()) {
            c16836.f49852.mo4316();
            c16836.m38191(EnumC16660.f48964);
            return;
        }
        char cM20339 = c8791.m20339();
        if (cM20339 == 0) {
            c16836.m38188(this);
            C6109 c6109 = c16836.f49852;
            c6109.mo4316();
            c6109.f15362.append((char) 65533);
            c16836.m38191(EnumC16660.f48964);
            return;
        }
        if (cM20339 != ' ') {
            if (cM20339 == 65535) {
                c16836.m38185(this);
                C6109 c61010 = c16836.f49852;
                c61010.mo4316();
                c61010.getClass();
                c16836.m38190();
                c16836.m38191(EnumC16660.f48962);
                return;
            }
            if (cM20339 == '\t' || cM20339 == '\n' || cM20339 == '\f' || cM20339 == '\r') {
                return;
            }
            c16836.f49852.mo4316();
            c16836.f49852.f15362.append(cM20339);
            c16836.m38191(EnumC16660.f48964);
        }
    }
}
