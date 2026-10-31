package l;

/* JADX INFO: renamed from: l.ᩴۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18692 extends EnumC15038 {
    public /* synthetic */ C18692() {
        this("AttributeName", 34);
    }

    public C18692(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        c15223.f46712.m15304(c6758.m18392(EnumC15038.f45917));
        char cM18391 = c6758.m18391();
        if (cM18391 != 0) {
            if (cM18391 != ' ') {
                if (cM18391 != '\"' && cM18391 != '\'') {
                    if (cM18391 == '/') {
                        c15223.m36030(EnumC15038.f45849);
                        return;
                    }
                    if (cM18391 == 65535) {
                        c15223.m36024(this);
                        c15223.m36030(EnumC15038.f45846);
                        return;
                    }
                    if (cM18391 != '\t' && cM18391 != '\n' && cM18391 != '\f' && cM18391 != '\r') {
                        switch (cM18391) {
                            case '<':
                                break;
                            case '=':
                                c15223.m36030(EnumC15038.f45850);
                                break;
                            case '>':
                                c15223.m36028();
                                c15223.m36030(EnumC15038.f45846);
                                break;
                            default:
                                c15223.f46712.m15303(cM18391);
                                break;
                        }
                        return;
                    }
                }
                c15223.m36027(this);
                c15223.f46712.m15303(cM18391);
                return;
            }
            c15223.m36030(EnumC15038.f45915);
            return;
        }
        c15223.m36027(this);
        c15223.f46712.m15303((char) 65533);
    }
}
