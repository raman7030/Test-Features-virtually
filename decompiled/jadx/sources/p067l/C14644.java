package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 19Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14644 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("payload");
        C16055 c16055 = new C16055(c4697.m9965());
        c16055.m36554();
        List listM9957 = c4697.m9957();
        if (listM9957.size() == 1) {
            C20562 c20562 = (C20562) listM9957.get(0);
            c16055.m36538(c20562.getName(), (ViewOnLongClickListenerC11837) null);
            c16055.m36549(c20562.getSize()).m21096(8);
            c16055.m36530(c20562.m46506());
            c16055.m36551();
            c16055.m36542();
            C8126.m18836(c16055.m36543(), c4697.m9969(), c20562);
            return;
        }
        c16055.m36539(listM9957);
        Iterator it = listM9957.iterator();
        long size = 0;
        long jM46506 = 0;
        while (it.hasNext()) {
            C20562 c20563 = (C20562) ((InterfaceC19370) it.next());
            size += c20563.getSize();
            jM46506 += c20563.m46506();
        }
        c16055.m36549(size).m21096(8);
        c16055.m36530(jM46506);
        c16055.m36542();
    }
}
