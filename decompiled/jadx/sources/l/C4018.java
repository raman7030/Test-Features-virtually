package l;

/* JADX INFO: renamed from: l.ۘܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4018 extends EnumC19541 {
    public /* synthetic */ C4018() {
        this("TagOpen", 7);
    }

    public C4018(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41799 = c17842.m41799();
        if (cM41799 == '!') {
            c19129.m44167(EnumC19541.f63134);
            return;
        }
        if (cM41799 == '/') {
            c19129.m44167(EnumC19541.f63180);
            return;
        }
        if (cM41799 != '?') {
            if (c17842.m41808()) {
                c19129.m44161(true);
                c19129.m44177(EnumC19541.f63145);
                return;
            } else {
                c19129.m44174(this);
                c19129.m44162('<');
                c19129.m44177(EnumC19541.f63120);
                return;
            }
        }
        C14188 c14188 = c19129.f60291;
        c14188.mo7259();
        c14188.f42827 = true;
        c19129.m44177(EnumC19541.f63163);
    }
}
