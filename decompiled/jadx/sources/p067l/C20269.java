package p067l;

/* JADX INFO: renamed from: l.ᩴܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20269 extends EnumC20940 {
    public /* synthetic */ C20269() {
        this("EndTagOpen", 8);
    }

    public C20269(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44031()) {
            c20548.m46465(this);
            c20548.m46457("</");
            c20548.m46471(EnumC20940.f65740);
        } else if (c19325.m44054()) {
            c20548.m46455(false);
            c20548.m46471(EnumC20940.f65765);
        } else {
            if (c19325.m44041('>')) {
                c20548.m46468(this);
                c20548.m46461(EnumC20940.f65740);
                return;
            }
            c20548.m46468(this);
            C15852 c15852 = c20548.f63523;
            c15852.mo9338();
            c15852.f45914 = true;
            c15852.m35979('/');
            c20548.m46471(EnumC20940.f65783);
        }
    }
}
