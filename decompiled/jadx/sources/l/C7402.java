package l;

/* JADX INFO: renamed from: l.۟ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7402 extends EnumC15038 {
    public /* synthetic */ C7402() {
        this("BeforeDoctypeName", 51);
    }

    public C7402(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            c15223.f46728.mo1924();
            c15223.m36030(EnumC15038.f45848);
            return;
        }
        char cM18391 = c6758.m18391();
        if (cM18391 == 0) {
            c15223.m36027(this);
            C3936 c3936 = c15223.f46728;
            c3936.mo1924();
            c3936.f12554.append((char) 65533);
            c15223.m36030(EnumC15038.f45848);
            return;
        }
        if (cM18391 != ' ') {
            if (cM18391 == 65535) {
                c15223.m36024(this);
                C3936 c3937 = c15223.f46728;
                c3937.mo1924();
                c3937.getClass();
                c15223.m36029();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
            if (cM18391 == '\t' || cM18391 == '\n' || cM18391 == '\f' || cM18391 == '\r') {
                return;
            }
            c15223.f46728.mo1924();
            c15223.f46728.f12554.append(cM18391);
            c15223.m36030(EnumC15038.f45848);
        }
    }
}
