package p067l;

/* JADX INFO: renamed from: l.۠۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10015 extends EnumC20940 {
    public /* synthetic */ C10015() {
        this("MarkupDeclarationOpen", 43);
    }

    public C10015(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44042("--")) {
            c20548.f63523.mo9338();
            c20548.m46471(EnumC20940.f65795);
            return;
        }
        if (c19325.m44047("DOCTYPE")) {
            c20548.m46471(EnumC20940.f65756);
            return;
        }
        if (c19325.m44042("[CDATA[")) {
            c20548.m46467();
            c20548.m46471(EnumC20940.f65760);
            return;
        }
        c20548.m46468(this);
        C15852 c15852 = c20548.f63523;
        c15852.mo9338();
        c15852.f45914 = true;
        c20548.m46471(EnumC20940.f65783);
    }
}
