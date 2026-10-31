package l;

/* JADX INFO: renamed from: l.ۧۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10807 extends EnumC15038 {
    public /* synthetic */ C10807() {
        this("AfterDoctypeName", 53);
    }

    public C10807(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18389()) {
            c15223.m36024(this);
            c15223.f46728.getClass();
            c15223.m36029();
            c15223.m36030(EnumC15038.f45846);
            return;
        }
        if (c6758.m18399('\t', '\n', '\r', '\f', ' ')) {
            c6758.m18384();
            return;
        }
        if (c6758.m18393('>')) {
            c15223.m36029();
            c15223.m36021(EnumC15038.f45846);
            return;
        }
        if (c6758.m18394("PUBLIC")) {
            c15223.f46728.getClass();
            c15223.m36030(EnumC15038.f45886);
        } else if (c6758.m18394("SYSTEM")) {
            c15223.f46728.getClass();
            c15223.m36030(EnumC15038.f45876);
        } else {
            c15223.m36027(this);
            c15223.f46728.getClass();
            c15223.m36021(EnumC15038.f45920);
        }
    }
}
