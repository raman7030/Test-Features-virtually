package l;

/* JADX INFO: renamed from: l.ܶۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15162 extends EnumC15038 {
    public /* synthetic */ C15162() {
        this("AttributeValue_unquoted", 39);
    }

    public C15162(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        String strM18392 = c6758.m18392(EnumC15038.f45861);
        if (strM18392.length() > 0) {
            c15223.f46712.m15308(strM18392);
        }
        char cM18391 = c6758.m18391();
        if (cM18391 != 0) {
            if (cM18391 != ' ') {
                if (cM18391 != '\"' && cM18391 != '`') {
                    if (cM18391 == 65535) {
                        c15223.m36024(this);
                        c15223.m36030(EnumC15038.f45846);
                        return;
                    }
                    if (cM18391 != '\t' && cM18391 != '\n' && cM18391 != '\f' && cM18391 != '\r') {
                        if (cM18391 == '&') {
                            int[] iArrM36022 = c15223.m36022('>', true);
                            if (iArrM36022 != null) {
                                c15223.f46712.m15305(iArrM36022);
                                return;
                            } else {
                                c15223.f46712.m15307('&');
                                return;
                            }
                        }
                        if (cM18391 != '\'') {
                            switch (cM18391) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c15223.m36028();
                                    c15223.m36030(EnumC15038.f45846);
                                    break;
                                default:
                                    c15223.f46712.m15307(cM18391);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c15223.m36027(this);
                c15223.f46712.m15307(cM18391);
                return;
            }
            c15223.m36030(EnumC15038.f45868);
            return;
        }
        c15223.m36027(this);
        c15223.f46712.m15307((char) 65533);
    }
}
