package l;

/* JADX INFO: renamed from: l.᩸۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21575 extends EnumC15038 {
    public /* synthetic */ C21575() {
        this("TagName", 9);
    }

    public C21575(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        c15223.f46712.m15310(c6758.m18388());
        char cM18391 = c6758.m18391();
        if (cM18391 != 0) {
            if (cM18391 != ' ') {
                if (cM18391 == '/') {
                    c15223.m36030(EnumC15038.f45849);
                    return;
                }
                if (cM18391 == '>') {
                    c15223.m36028();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (cM18391 == 65535) {
                    c15223.m36024(this);
                    c15223.m36030(EnumC15038.f45846);
                    return;
                } else if (cM18391 != '\t' && cM18391 != '\n' && cM18391 != '\f' && cM18391 != '\r') {
                    AbstractC5347 abstractC5347 = c15223.f46712;
                    abstractC5347.getClass();
                    abstractC5347.m15310(String.valueOf(cM18391));
                    return;
                }
            }
            c15223.m36030(EnumC15038.f45868);
            return;
        }
        c15223.f46712.m15310(EnumC15038.f45878);
    }
}
