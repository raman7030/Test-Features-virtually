package l;

/* JADX INFO: renamed from: l.۠ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7984 extends EnumC15038 {
    public /* synthetic */ C7984() {
        this("EndTagOpen", 8);
    }

    public C7984(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18389()) {
            c15223.m36024(this);
            c15223.m36019("</");
            c15223.m36030(EnumC15038.f45846);
        } else if (c6758.m18387()) {
            c15223.m36017(false);
            c15223.m36030(EnumC15038.f45871);
        } else if (c6758.m18393('>')) {
            c15223.m36027(this);
            c15223.m36021(EnumC15038.f45846);
        } else {
            c15223.m36027(this);
            c15223.m36021(EnumC15038.f45891);
        }
    }
}
