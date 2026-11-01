package p067l;

/* JADX INFO: renamed from: l.۠֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9818 extends EnumC20940 {
    public /* synthetic */ C9818() {
        this("RCDATAEndTagName", 12);
    }

    public C9818(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44054()) {
            String strM44057 = c19325.m44057();
            c20548.f63519.m24224(strM44057);
            c20548.f63531.append(strM44057);
            return;
        }
        char cM44046 = c19325.m44046();
        if (cM44046 == '\t' || cM44046 == '\n' || cM44046 == '\f' || cM44046 == '\r' || cM44046 == ' ') {
            if (c20548.m46472()) {
                c20548.m46471(EnumC20940.f65762);
                return;
            } else {
                m22897(c20548, c19325);
                return;
            }
        }
        if (cM44046 == '/') {
            if (c20548.m46472()) {
                c20548.m46471(EnumC20940.f65743);
                return;
            } else {
                m22897(c20548, c19325);
                return;
            }
        }
        if (cM44046 == '>') {
            if (c20548.m46472()) {
                c20548.m46466();
                c20548.m46471(EnumC20940.f65740);
                return;
            } else {
                m22897(c20548, c19325);
                return;
            }
        }
        m22897(c20548, c19325);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22897(C20548 c20548, C19325 c19325) {
        c20548.m46457("</");
        c20548.m46459(c20548.f63531);
        c19325.m44044();
        c20548.m46471(EnumC20940.f65782);
    }
}
