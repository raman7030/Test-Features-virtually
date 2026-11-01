package p067l;

/* JADX INFO: renamed from: l.ܽ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C18061 extends EnumC20940 {
    public /* synthetic */ C18061() {
        this("ScriptDataDoubleEscaped", 28);
    }

    public C18061(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44045 = c19325.m44045();
        if (cM44045 == 0) {
            c20548.m46468(this);
            c19325.m44028();
            c20548.m46456((char) 65533);
        } else if (cM44045 == '-') {
            c20548.m46456(cM44045);
            c20548.m46461(EnumC20940.f65792);
        } else if (cM44045 == '<') {
            c20548.m46456(cM44045);
            c20548.m46461(EnumC20940.f65813);
        } else if (cM44045 == 65535) {
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
        } else {
            c20548.m46457(c19325.m44027('-', '<', 0));
        }
    }
}
