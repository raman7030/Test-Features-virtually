package l;

/* JADX INFO: renamed from: l.ۡۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8814 extends EnumC15038 {
    public /* synthetic */ C8814() {
        this("ScriptDataDoubleEscapedDashDash", 30);
    }

    public C8814(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char cM18391 = c6758.m18391();
        if (cM18391 == 0) {
            c15223.m36027(this);
            c15223.m36018((char) 65533);
            c15223.m36030(EnumC15038.f45902);
            return;
        }
        if (cM18391 == '-') {
            c15223.m36018(cM18391);
            return;
        }
        if (cM18391 == '<') {
            c15223.m36018(cM18391);
            c15223.m36030(EnumC15038.f45921);
        } else if (cM18391 == '>') {
            c15223.m36018(cM18391);
            c15223.m36030(EnumC15038.f45851);
        } else if (cM18391 == 65535) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
        } else {
            c15223.m36018(cM18391);
            c15223.m36030(EnumC15038.f45902);
        }
    }
}
