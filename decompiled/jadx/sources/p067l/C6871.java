package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6871 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public C13087 f17855;

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("tar");
        List listM9957 = c4697.m9957();
        this.f17855 = new C13087(c4697.m9969(), listM9957);
        if (listM9957.size() == 1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                this.f17855.m29952(interfaceC19370);
                return;
            } else {
                this.f17855.m29951(interfaceC19370);
                return;
            }
        }
        this.f17855.m29950(c4697.m9973());
    }
}
