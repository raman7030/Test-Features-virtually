package p067l;

/* JADX INFO: renamed from: l.ܺ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17390 extends EnumC20940 {
    public /* synthetic */ C17390() {
        this("BeforeAttributeValue", 36);
    }

    public C17390(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            c20548.f63519.m24221((char) 65533);
            c20548.m46471(EnumC20940.f65781);
            return;
        }
        if (cM44046 != ' ') {
            if (cM44046 == '\"') {
                c20548.m46471(EnumC20940.f65774);
                return;
            }
            if (cM44046 != '`') {
                if (cM44046 == 65535) {
                    c20548.m46465(this);
                    c20548.m46466();
                    c20548.m46471(EnumC20940.f65740);
                    return;
                }
                if (cM44046 == '\t' || cM44046 == '\n' || cM44046 == '\f' || cM44046 == '\r') {
                    return;
                }
                if (cM44046 == '&') {
                    c19325.m44044();
                    c20548.m46471(EnumC20940.f65781);
                    return;
                }
                if (cM44046 == '\'') {
                    c20548.m46471(EnumC20940.f65810);
                    return;
                }
                switch (cM44046) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c20548.m46468(this);
                        c20548.m46466();
                        c20548.m46471(EnumC20940.f65740);
                        break;
                    default:
                        c19325.m44044();
                        c20548.m46471(EnumC20940.f65781);
                        break;
                }
                return;
            }
            c20548.m46468(this);
            c20548.f63519.m24221(cM44046);
            c20548.m46471(EnumC20940.f65781);
        }
    }
}
