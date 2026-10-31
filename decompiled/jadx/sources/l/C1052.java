package l;

/* JADX INFO: renamed from: l.֨ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1052 extends EnumC15038 {
    public /* synthetic */ C1052() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C1052(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        String strM18383 = c6758.m18383(EnumC15038.f45909);
        if (strM18383.length() > 0) {
            c15223.f46712.m15308(strM18383);
        } else {
            c15223.f46712.m15311();
        }
        char cM18391 = c6758.m18391();
        if (cM18391 == 0) {
            c15223.m36027(this);
            c15223.f46712.m15307((char) 65533);
            return;
        }
        if (cM18391 == 65535) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
            return;
        }
        if (cM18391 != '&') {
            if (cM18391 == '\'') {
                c15223.m36030(EnumC15038.f45907);
                return;
            } else {
                c15223.f46712.m15307(cM18391);
                return;
            }
        }
        int[] iArrM36022 = c15223.m36022('\'', true);
        if (iArrM36022 != null) {
            c15223.f46712.m15305(iArrM36022);
        } else {
            c15223.f46712.m15307('&');
        }
    }
}
