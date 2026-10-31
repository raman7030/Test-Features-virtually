package l;

/* JADX INFO: renamed from: l.۫۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12279 extends EnumC19541 {
    public /* synthetic */ C12279() {
        this("Doctype", 50);
    }

    public C12279(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r' || cM41800 == ' ') {
            c19129.m44177(EnumC19541.f63152);
            return;
        }
        if (cM41800 != '>') {
            if (cM41800 == 65535) {
                c19129.m44171(this);
            } else {
                c19129.m44174(this);
                c19129.m44177(EnumC19541.f63152);
                return;
            }
        }
        c19129.m44174(this);
        C23361 c23361 = c19129.f60286;
        c23361.mo7259();
        c23361.f75041 = true;
        c19129.m44175();
        c19129.m44177(EnumC19541.f63120);
    }
}
