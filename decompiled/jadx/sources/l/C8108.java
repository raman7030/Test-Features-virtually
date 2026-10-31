package l;

/* JADX INFO: renamed from: l.۠ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8108 extends EnumC15038 {
    public /* synthetic */ C8108() {
        this("Rcdata", 2);
    }

    public C8108(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18390 = c6758.m18390();
        if (cM18390 == 0) {
            c15223.m36027(this);
            c6758.m18384();
            c15223.m36018((char) 65533);
        } else {
            if (cM18390 == '&') {
                c15223.m36021(EnumC15038.f45874);
                return;
            }
            if (cM18390 == '<') {
                c15223.m36021(EnumC15038.f45869);
            } else if (cM18390 == 65535) {
                c15223.m36020(new C18753());
            } else {
                c15223.m36019(c6758.m18383('&', '<', 0));
            }
        }
    }
}
