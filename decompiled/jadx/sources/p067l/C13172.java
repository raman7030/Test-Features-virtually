package p067l;

/* JADX INFO: renamed from: l.ۨ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13172 extends EnumC20940 {
    public /* synthetic */ C13172() {
        this("ScriptDataEscapedDash", 22);
    }

    public C13172(String str, int i) {
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
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            c20548.m46456((char) 65533);
            c20548.m46471(EnumC20940.f65788);
        } else if (cM44046 == '-') {
            c20548.m46456(cM44046);
            c20548.m46471(EnumC20940.f65752);
        } else if (cM44046 == '<') {
            c20548.m46471(EnumC20940.f65741);
        } else {
            c20548.m46456(cM44046);
            c20548.m46471(EnumC20940.f65788);
        }
    }
}
