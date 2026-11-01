package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20534 extends AbstractC3947 {
    public C20534() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        if (!C24414.m53850()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (c4697.m9966() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c4697.m9957().iterator();
            while (it.hasNext()) {
                arrayList.add(new C12073((InterfaceC19370) it.next()));
            }
            c4697.m9970().mo8202(c4697.m9969(), arrayList, new RunnableC4440(0, arrayList, c4697));
            return;
        }
        c4697.m9970().m41979(c4697.m9969(), c4697.m9961(), new C5781(c4697.m9967(), c4697));
    }
}
