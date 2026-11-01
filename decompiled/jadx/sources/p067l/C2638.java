package p067l;

/* JADX INFO: renamed from: l.֡۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2638 extends EnumC20940 {
    public /* synthetic */ C2638() {
        this("AfterAttributeValue_quoted", 40);
    }

    public C2638(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == '\t' || cM44046 == '\n' || cM44046 == '\f' || cM44046 == '\r' || cM44046 == ' ') {
            c20548.m46471(EnumC20940.f65762);
            return;
        }
        if (cM44046 == '/') {
            c20548.m46471(EnumC20940.f65743);
            return;
        }
        if (cM44046 == '>') {
            c20548.m46466();
            c20548.m46471(EnumC20940.f65740);
        } else if (cM44046 == 65535) {
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
        } else {
            c19325.m44044();
            c20548.m46468(this);
            c20548.m46471(EnumC20940.f65762);
        }
    }
}
