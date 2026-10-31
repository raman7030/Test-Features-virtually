package l;

/* JADX INFO: renamed from: l.֨ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0928 extends EnumC15038 {
    public /* synthetic */ C0928() {
        this("TagOpen", 7);
    }

    public C0928(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18390 = c6758.m18390();
        if (cM18390 == '!') {
            c15223.m36021(EnumC15038.f45860);
            return;
        }
        if (cM18390 == '/') {
            c15223.m36021(EnumC15038.f45908);
            return;
        }
        if (cM18390 == '?') {
            c15223.m36021(EnumC15038.f45891);
            return;
        }
        if (c6758.m18387()) {
            c15223.m36017(true);
            c15223.m36030(EnumC15038.f45871);
        } else {
            c15223.m36027(this);
            c15223.m36018('<');
            c15223.m36030(EnumC15038.f45846);
        }
    }
}
