package p067l;

/* JADX INFO: renamed from: l.ۨ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13368 extends EnumC20940 {
    public /* synthetic */ C13368() {
        this("AfterDoctypeName", 53);
    }

    public C13368(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        if (c19325.m44031()) {
            c20548.m46465(this);
            c20548.f63518.f77787 = true;
            c20548.m46469();
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        if (c19325.m44048('\t', '\n', '\r', '\f', ' ')) {
            c19325.m44028();
            return;
        }
        if (c19325.m44041('>')) {
            c20548.m46469();
            c20548.m46461(EnumC20940.f65740);
            return;
        }
        if (c19325.m44047("PUBLIC")) {
            c20548.f63518.f77785 = "PUBLIC";
            c20548.m46471(EnumC20940.f65778);
        } else if (c19325.m44047("SYSTEM")) {
            c20548.f63518.f77785 = "SYSTEM";
            c20548.m46471(EnumC20940.f65770);
        } else {
            c20548.m46468(this);
            c20548.f63518.f77787 = true;
            c20548.m46461(EnumC20940.f65812);
        }
    }
}
