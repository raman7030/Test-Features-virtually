package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes5.dex */
public final class C21134 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C22549 c22549M33037;
        C18107 c18107M9967 = c4697.m9967();
        if (c18107M9967.m41264()) {
            return false;
        }
        for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
            if ((interfaceC19370 instanceof C14427) && (c22549M33037 = ((C14427) interfaceC19370).m33037()) != null) {
                String lowerCase = c22549M33037.m50534().toLowerCase();
                if (lowerCase.startsWith("android/data/") || lowerCase.startsWith("android/obb/")) {
                    return false;
                }
            }
        }
        return c4697.m9964("trash") && c18107M9967.m41261("local");
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("trash");
        c18107M9967.m41224("local");
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c18107M9967.m41224("local");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C20463.class);
        c3313.m5788(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5777("ARG_MSG_FROM", c4697.m9958());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("sourcePath", c4697.m9973());
        c3313.m5777("targetPath", c18107M9967.m41246());
        c3313.m5772();
    }
}
