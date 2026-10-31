package l;

/* JADX INFO: renamed from: l.۫ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12341 extends EnumC15038 {
    public /* synthetic */ C12341() {
        this("Comment", 46);
    }

    public C12341(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18390 = c6758.m18390();
        if (cM18390 == 0) {
            c15223.m36027(this);
            c6758.m18384();
            c15223.f46723.f8012.append((char) 65533);
        } else if (cM18390 == '-') {
            c15223.m36021(EnumC15038.f45857);
        } else {
            if (cM18390 == 65535) {
                c15223.m36024(this);
                c15223.m36026();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
            c15223.f46723.f8012.append(c6758.m18383('-', 0));
        }
    }
}
