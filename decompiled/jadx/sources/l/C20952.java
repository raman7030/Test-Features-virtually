package l;

/* JADX INFO: renamed from: l.᩷ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20952 extends EnumC19541 {
    public /* synthetic */ C20952() {
        this("AfterDoctypeSystemIdentifier", 64);
    }

    public C20952(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r' || cM41800 == ' ') {
            return;
        }
        if (cM41800 == '>') {
            c19129.m44175();
            c19129.m44177(EnumC19541.f63120);
        } else {
            if (cM41800 == 65535) {
                c19129.m44171(this);
                c19129.f60286.f75041 = true;
                c19129.m44175();
                c19129.m44177(EnumC19541.f63120);
                return;
            }
            c19129.m44174(this);
            c19129.m44177(EnumC19541.f63192);
        }
    }
}
