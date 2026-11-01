package p067l;

/* JADX INFO: renamed from: l.۫۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14038 extends EnumC20940 {
    public /* synthetic */ C14038() {
        this("Doctype", 50);
    }

    public C14038(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == '\t' || cM44046 == '\n' || cM44046 == '\f' || cM44046 == '\r' || cM44046 == ' ') {
            c20548.m46471(EnumC20940.f65772);
            return;
        }
        if (cM44046 != '>') {
            if (cM44046 == 65535) {
                c20548.m46465(this);
            } else {
                c20548.m46468(this);
                c20548.m46471(EnumC20940.f65772);
                return;
            }
        }
        c20548.m46468(this);
        C24570 c24570 = c20548.f63518;
        c24570.mo9338();
        c24570.f77787 = true;
        c20548.m46469();
        c20548.m46471(EnumC20940.f65740);
    }
}
