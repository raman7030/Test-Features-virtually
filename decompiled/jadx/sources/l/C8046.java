package l;

/* JADX INFO: renamed from: l.۠۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8046 extends EnumC19541 {
    public /* synthetic */ C8046() {
        this("MarkupDeclarationOpen", 43);
    }

    public C8046(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41796("--")) {
            c19129.f60291.mo7259();
            c19129.m44177(EnumC19541.f63175);
            return;
        }
        if (c17842.m41801("DOCTYPE")) {
            c19129.m44177(EnumC19541.f63136);
            return;
        }
        if (c17842.m41796("[CDATA[")) {
            c19129.m44173();
            c19129.m44177(EnumC19541.f63140);
            return;
        }
        c19129.m44174(this);
        C14188 c14188 = c19129.f60291;
        c14188.mo7259();
        c14188.f42827 = true;
        c19129.m44177(EnumC19541.f63163);
    }
}
