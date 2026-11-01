package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B6A */
/* JADX INFO: loaded from: classes2.dex */
public final class C3256 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("archive");
        C9409 c9409 = new C9409(c4697.m9969());
        List listM9957 = c4697.m9957();
        if (listM9957.size() == 1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                c9409.m21909((C12092) interfaceC19370);
                return;
            } else {
                c9409.m21908((C12092) interfaceC19370);
                return;
            }
        }
        c9409.m21907(listM9957);
    }
}
