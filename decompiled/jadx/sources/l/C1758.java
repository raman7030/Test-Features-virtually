package l;

/* JADX INFO: renamed from: l.֫ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1758 extends EnumC15038 {
    public /* synthetic */ C1758() {
        this("ScriptDataEscaped", 21);
    }

    public C1758(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18389()) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
            return;
        }
        char cM18390 = c6758.m18390();
        if (cM18390 == 0) {
            c15223.m36027(this);
            c6758.m18384();
            c15223.m36018((char) 65533);
        } else if (cM18390 == '-') {
            c15223.m36018('-');
            c15223.m36021(EnumC15038.f45853);
        } else if (cM18390 == '<') {
            c15223.m36021(EnumC15038.f45847);
        } else {
            c15223.m36019(c6758.m18383('-', '<', 0));
        }
    }
}
