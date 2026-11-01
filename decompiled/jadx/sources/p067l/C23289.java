package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes.dex */
public final class C23289 implements InterfaceC6996 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13901 f73280;

    public C23289(C13901 c13901) {
        this.f73280 = c13901;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Override // p067l.InterfaceC6996
    /* JADX INFO: renamed from: ֫ */
    public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        C23046 c23046 = (C23046) abstractC2555;
        int length = interfaceC5655.length();
        interfaceC5655.mo12594(c23046);
        C13901 c13901 = this.f73280;
        int i = 2;
        if (c13901.f39246 == null) {
            c13901.f39246 = new ArrayList(2);
        }
        List list = c13901.f39246;
        EnumC17009 enumC17009M51424 = c23046.m51424();
        if (enumC17009M51424 == null) {
            i = 0;
        } else {
            int i2 = C22619.f71381[enumC17009M51424.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = 0;
            }
        }
        ((ArrayList) list).add(new C15241(i, interfaceC5655.builder().m43998(length)));
        c13901.f39247 = c23046.m51423();
    }
}
