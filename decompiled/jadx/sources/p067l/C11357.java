package p067l;

/* JADX INFO: renamed from: l.ۢ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C11357 extends EnumC20940 {
    public /* synthetic */ C11357() {
        this("AttributeName", 34);
    }

    public C11357(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        c20548.f63519.m24216(c19325.m44038(EnumC20940.f65806));
        char cM44046 = c19325.m44046();
        if (cM44046 == '\t' || cM44046 == '\n' || cM44046 == '\f' || cM44046 == '\r' || cM44046 == ' ') {
            c20548.m46471(EnumC20940.f65807);
            return;
        }
        if (cM44046 != '\"' && cM44046 != '\'') {
            if (cM44046 == '/') {
                c20548.m46471(EnumC20940.f65743);
                return;
            }
            if (cM44046 != 65535) {
                switch (cM44046) {
                    case '<':
                        break;
                    case '=':
                        c20548.m46471(EnumC20940.f65744);
                        break;
                    case '>':
                        c20548.m46466();
                        c20548.m46471(EnumC20940.f65740);
                        break;
                    default:
                        c20548.f63519.m24215(cM44046);
                        break;
                }
                return;
            }
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        c20548.m46468(this);
        c20548.f63519.m24215(cM44046);
    }
}
