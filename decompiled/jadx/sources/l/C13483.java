package l;

/* JADX INFO: renamed from: l.ܰ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13483 extends EnumC19541 {
    public /* synthetic */ C13483() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C13483(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41808()) {
            c19129.m44173();
            c19129.f60299.append(c17842.m41799());
            c19129.m44163("<");
            c19129.m44162(c17842.m41799());
            c19129.m44167(EnumC19541.f63170);
            return;
        }
        if (c17842.m41795('/')) {
            c19129.m44173();
            c19129.m44167(EnumC19541.f63178);
        } else {
            c19129.m44162('<');
            c19129.m44177(EnumC19541.f63168);
        }
    }
}
