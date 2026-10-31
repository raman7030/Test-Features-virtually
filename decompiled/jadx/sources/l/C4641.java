package l;

/* JADX INFO: renamed from: l.ۙ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4641 extends EnumC15038 {
    public /* synthetic */ C4641() {
        this("RCDATAEndTagName", 12);
    }

    public C4641(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            String strM18395 = c6758.m18395();
            c15223.f46712.m15310(strM18395);
            c15223.f46720.append(strM18395);
            return;
        }
        char cM18391 = c6758.m18391();
        if (cM18391 == '\t' || cM18391 == '\n' || cM18391 == '\f' || cM18391 == '\r' || cM18391 == ' ') {
            if (c15223.m36025()) {
                c15223.m36030(EnumC15038.f45868);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        if (cM18391 == '/') {
            if (c15223.m36025()) {
                c15223.m36030(EnumC15038.f45849);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        if (cM18391 == '>') {
            if (c15223.m36025()) {
                c15223.m36028();
                c15223.m36030(EnumC15038.f45846);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        m13608(c15223, c6758);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13608(C15223 c15223, C6758 c6758) {
        c15223.m36019("</" + c15223.f46720.toString());
        c6758.m18381();
        c15223.m36030(EnumC15038.f45890);
    }
}
