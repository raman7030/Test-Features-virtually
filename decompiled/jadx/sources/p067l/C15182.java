package p067l;

/* JADX INFO: renamed from: l.ܰ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15182 extends EnumC20940 {
    public /* synthetic */ C15182() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C15182(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44054()) {
            c20548.m46467();
            c20548.f63531.append(c19325.m44045());
            c20548.m46457("<");
            c20548.m46456(c19325.m44045());
            c20548.m46461(EnumC20940.f65790);
            return;
        }
        if (c19325.m44041('/')) {
            c20548.m46467();
            c20548.m46461(EnumC20940.f65798);
        } else {
            c20548.m46456('<');
            c20548.m46471(EnumC20940.f65788);
        }
    }
}
