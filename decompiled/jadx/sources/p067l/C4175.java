package p067l;

/* JADX INFO: renamed from: l.֫ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C4175 extends EnumC20940 {
    public /* synthetic */ C4175() {
        this("DoctypePublicIdentifier_singleQuoted", 57);
    }

    public C4175(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            c20548.f63518.f77788.append((char) 65533);
            return;
        }
        if (cM44046 == '\'') {
            c20548.m46471(EnumC20940.f65748);
            return;
        }
        if (cM44046 == '>') {
            c20548.m46468(this);
            c20548.f63518.f77787 = true;
            c20548.m46469();
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        if (cM44046 == 65535) {
            c20548.m46465(this);
            c20548.f63518.f77787 = true;
            c20548.m46469();
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        c20548.f63518.f77788.append(cM44046);
    }
}
