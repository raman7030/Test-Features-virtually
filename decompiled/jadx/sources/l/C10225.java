package l;

/* JADX INFO: renamed from: l.ۤۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10225 extends EnumC15038 {
    public /* synthetic */ C10225() {
        this("CommentEndDash", 47);
    }

    public C10225(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18391 = c6758.m18391();
        if (cM18391 == 0) {
            c15223.m36027(this);
            StringBuilder sb = c15223.f46723.f8012;
            sb.append('-');
            sb.append((char) 65533);
            c15223.m36030(EnumC15038.f45872);
            return;
        }
        if (cM18391 == '-') {
            c15223.m36030(EnumC15038.f45895);
            return;
        }
        if (cM18391 == 65535) {
            c15223.m36024(this);
            c15223.m36026();
            c15223.m36030(EnumC15038.f45846);
        } else {
            StringBuilder sb2 = c15223.f46723.f8012;
            sb2.append('-');
            sb2.append(cM18391);
            c15223.m36030(EnumC15038.f45872);
        }
    }
}
