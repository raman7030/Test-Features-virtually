package l;

/* JADX INFO: renamed from: l.۟֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7134 extends EnumC19541 {
    public /* synthetic */ C7134() {
        this("ScriptDataEscapedEndTagOpen", 25);
    }

    public C7134(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41808()) {
            c19129.m44161(false);
            AbstractC8545 abstractC8545 = c19129.f60287;
            char cM41799 = c17842.m41799();
            abstractC8545.getClass();
            abstractC8545.m22256(String.valueOf(cM41799));
            c19129.f60299.append(c17842.m41799());
            c19129.m44167(EnumC19541.f63176);
            return;
        }
        c19129.m44163("</");
        c19129.m44177(EnumC19541.f63168);
    }
}
