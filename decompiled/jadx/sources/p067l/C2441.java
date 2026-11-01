package p067l;

/* JADX INFO: renamed from: l.֡֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2441 extends EnumC20940 {
    public /* synthetic */ C2441() {
        this("TagName", 9);
    }

    public C2441(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        c20548.f63519.m24224(c19325.m44036());
        char cM44046 = c19325.m44046();
        if (cM44046 != 0) {
            if (cM44046 != ' ') {
                if (cM44046 == '/') {
                    c20548.m46471(EnumC20940.f65743);
                    return;
                }
                if (cM44046 == '<') {
                    c19325.m44044();
                    c20548.m46468(this);
                } else if (cM44046 != '>') {
                    if (cM44046 == 65535) {
                        c20548.m46465(this);
                        c20548.m46471(EnumC20940.f65740);
                        return;
                    } else if (cM44046 != '\t' && cM44046 != '\n' && cM44046 != '\f' && cM44046 != '\r') {
                        AbstractC10489 abstractC10489 = c20548.f63519;
                        abstractC10489.getClass();
                        abstractC10489.m24224(String.valueOf(cM44046));
                        return;
                    }
                }
                c20548.m46466();
                c20548.m46471(EnumC20940.f65740);
                return;
            }
            c20548.m46471(EnumC20940.f65762);
            return;
        }
        c20548.f63519.m24224(EnumC20940.f65780);
    }
}
