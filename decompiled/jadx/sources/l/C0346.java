package l;

/* JADX INFO: renamed from: l.֡ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0346 extends EnumC15038 {
    public /* synthetic */ C0346() {
        this("BeforeAttributeValue", 36);
    }

    public C0346(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18391 = c6758.m18391();
        if (cM18391 == 0) {
            c15223.m36027(this);
            c15223.f46712.m15307((char) 65533);
            c15223.m36030(EnumC15038.f45889);
            return;
        }
        if (cM18391 != ' ') {
            if (cM18391 == '\"') {
                c15223.m36030(EnumC15038.f45881);
                return;
            }
            if (cM18391 != '`') {
                if (cM18391 == 65535) {
                    c15223.m36024(this);
                    c15223.m36028();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (cM18391 == '\t' || cM18391 == '\n' || cM18391 == '\f' || cM18391 == '\r') {
                    return;
                }
                if (cM18391 == '&') {
                    c6758.m18381();
                    c15223.m36030(EnumC15038.f45889);
                    return;
                }
                if (cM18391 == '\'') {
                    c15223.m36030(EnumC15038.f45918);
                    return;
                }
                switch (cM18391) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c15223.m36027(this);
                        c15223.m36028();
                        c15223.m36030(EnumC15038.f45846);
                        break;
                    default:
                        c6758.m18381();
                        c15223.m36030(EnumC15038.f45889);
                        break;
                }
                return;
            }
            c15223.m36027(this);
            c15223.f46712.m15307(cM18391);
            c15223.m36030(EnumC15038.f45889);
        }
    }
}
