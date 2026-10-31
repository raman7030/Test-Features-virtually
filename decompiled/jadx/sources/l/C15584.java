package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB7U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15584 extends AbstractC1661 {
    public C15584() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (c2450.m7918() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c2450.m7909().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10211((InterfaceC17889) it.next()));
            }
            c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC20553(3, arrayList, c2450));
            return;
        }
        c2450.m7922().m39738(c2450.m7921(), c2450.m7913(), new C18499(c2450.m7919(), c2450));
    }
}
