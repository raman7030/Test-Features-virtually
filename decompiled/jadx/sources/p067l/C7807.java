package p067l;

/* JADX INFO: renamed from: l.ۛ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7807 extends EnumC20940 {
    public /* synthetic */ C7807() {
        this("ScriptDataEscaped", 21);
    }

    public C7807(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44031()) {
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        char cM44045 = c19325.m44045();
        if (cM44045 == 0) {
            c20548.m46468(this);
            c19325.m44028();
            c20548.m46456((char) 65533);
        } else if (cM44045 == '-') {
            c20548.m46456('-');
            c20548.m46461(EnumC20940.f65747);
        } else if (cM44045 == '<') {
            c20548.m46461(EnumC20940.f65741);
        } else {
            c20548.m46457(c19325.m44027('-', '<', 0));
        }
    }
}
