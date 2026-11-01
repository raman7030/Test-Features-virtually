package p067l;

/* JADX INFO: renamed from: l.ۘܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6187 extends EnumC20940 {
    public /* synthetic */ C6187() {
        this("TagOpen", 7);
    }

    public C6187(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44045 = c19325.m44045();
        if (cM44045 == '!') {
            c20548.m46461(EnumC20940.f65754);
            return;
        }
        if (cM44045 == '/') {
            c20548.m46461(EnumC20940.f65800);
            return;
        }
        if (cM44045 != '?') {
            if (c19325.m44054()) {
                c20548.m46455(true);
                c20548.m46471(EnumC20940.f65765);
                return;
            } else {
                c20548.m46468(this);
                c20548.m46456('<');
                c20548.m46471(EnumC20940.f65740);
                return;
            }
        }
        C15852 c15852 = c20548.f63523;
        c15852.mo9338();
        c15852.f45914 = true;
        c20548.m46471(EnumC20940.f65783);
    }
}
