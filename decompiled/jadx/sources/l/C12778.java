package l;

/* JADX INFO: renamed from: l.۬֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12778 extends EnumC19541 {
    public /* synthetic */ C12778() {
        this("Data", 0);
    }

    public C12778(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41799 = c17842.m41799();
        if (cM41799 == 0) {
            c19129.m44174(this);
            c19129.m44162(c17842.m41800());
        } else {
            if (cM41799 == '&') {
                c19129.m44167(EnumC19541.f63182);
                return;
            }
            if (cM41799 == '<') {
                c19129.m44167(EnumC19541.f63166);
            } else if (cM41799 == 65535) {
                c19129.m44166(new C6428());
            } else {
                c19129.m44163(c17842.m41805());
            }
        }
    }
}
