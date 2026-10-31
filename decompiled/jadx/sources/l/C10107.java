package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8EC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10107 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14401 f30430;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16560 f30431;

    public C10107(C16560 c16560) {
        this.f30431 = c16560;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        c14401.m34417();
        this.f30430 = c14401;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25391(C12223 c12223) {
        String name = c12223.getName();
        C14401 c14401 = this.f30430;
        c14401.m34404(name, (ViewOnLongClickListenerC9963) null);
        c14401.m34394(R.string.MT_Protector, c12223.m29722().getName());
        if (c12223.getSize() != -1) {
            c14401.m34415(c12223.getSize()).m19153(8);
        }
        c14401.m34396(c12223.m29721());
        c14401.m34408();
        C6058.m16907(c14401.m34409(), this.f30431, c12223);
    }
}
