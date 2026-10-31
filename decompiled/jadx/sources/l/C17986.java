package l;

/* JADX INFO: renamed from: l.ᩳۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17986 extends EnumC15038 {
    public /* synthetic */ C17986() {
        this("ScriptDataEscapedLessthanSign", 24);
    }

    public C17986(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* JADX INFO: renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            c15223.m36023();
            c15223.f46720.append(c6758.m18390());
            c15223.m36019("<" + c6758.m18390());
            c15223.m36021(EnumC15038.f45898);
            return;
        }
        if (c6758.m18393('/')) {
            c15223.m36023();
            c15223.m36021(EnumC15038.f45906);
        } else {
            c15223.m36018('<');
            c15223.m36030(EnumC15038.f45896);
        }
    }
}
