package l;

/* JADX INFO: renamed from: l.᩻ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23506 extends EnumC15038 {
    public /* synthetic */ C23506() {
        this("AfterDoctypePublicIdentifier", 58);
    }

    public C23506(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18391 = c6758.m18391();
        if (cM18391 == '\t' || cM18391 == '\n' || cM18391 == '\f' || cM18391 == '\r' || cM18391 == ' ') {
            c15223.m36030(EnumC15038.f45899);
            return;
        }
        if (cM18391 == '\"') {
            c15223.m36027(this);
            c15223.m36030(EnumC15038.f45913);
            return;
        }
        if (cM18391 == '\'') {
            c15223.m36027(this);
            c15223.m36030(EnumC15038.f45916);
            return;
        }
        if (cM18391 == '>') {
            c15223.m36029();
            c15223.m36030(EnumC15038.f45846);
        } else {
            if (cM18391 == 65535) {
                c15223.m36024(this);
                c15223.f46728.getClass();
                c15223.m36029();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
            c15223.m36027(this);
            c15223.f46728.getClass();
            c15223.m36030(EnumC15038.f45920);
        }
    }
}
