package p067l;

/* JADX INFO: renamed from: l.᩶֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21219 extends EnumC20940 {
    public /* synthetic */ C21219() {
        this("ScriptDataLessthanSign", 16);
    }

    public C21219(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == '!') {
            c20548.m46457("<!");
            c20548.m46471(EnumC20940.f65769);
            return;
        }
        if (cM44046 == '/') {
            c20548.m46467();
            c20548.m46471(EnumC20940.f65803);
        } else if (cM44046 == 65535) {
            c20548.m46457("<");
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
        } else {
            c20548.m46457("<");
            c19325.m44044();
            c20548.m46471(EnumC20940.f65745);
        }
    }
}
