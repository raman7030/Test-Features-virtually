package l;

/* JADX INFO: renamed from: l.ᩴܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18835 extends EnumC19541 {
    public /* synthetic */ C18835() {
        this("EndTagOpen", 8);
    }

    public C18835(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41785()) {
            c19129.m44171(this);
            c19129.m44163("</");
            c19129.m44177(EnumC19541.f63120);
        } else if (c17842.m41808()) {
            c19129.m44161(false);
            c19129.m44177(EnumC19541.f63145);
        } else {
            if (c17842.m41795('>')) {
                c19129.m44174(this);
                c19129.m44167(EnumC19541.f63120);
                return;
            }
            c19129.m44174(this);
            C14188 c14188 = c19129.f60291;
            c14188.mo7259();
            c14188.f42827 = true;
            c14188.m33847('/');
            c19129.m44177(EnumC19541.f63163);
        }
    }
}
