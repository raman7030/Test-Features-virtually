package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 71XR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9023 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("zip");
        C17306 c17306 = new C17306(c4697.m9969());
        List listM9957 = c4697.m9957();
        if (listM9957.size() == 1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                c17306.m39227((C14387) interfaceC19370);
                return;
            } else {
                c17306.m39226((C14387) interfaceC19370);
                return;
            }
        }
        c17306.m39225(listM9957);
    }
}
