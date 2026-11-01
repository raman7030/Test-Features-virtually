package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7722 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("trash") && c4697.m9974().length() <= 1;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("trash");
        int iM9966 = c4697.m9966();
        m7832(c4697, R.string.MT_Protector, iM9966 == 1 ? C7050.m16203(R.string.MT_Protector, c4697.m9961().mo39151()) : C7050.m16203(R.string.MT_Protector, Integer.valueOf(iM9966)));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        List listM9957 = c4697.m9957();
        ArrayList arrayList = new ArrayList(listM9957.size());
        Iterator it = listM9957.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14427) ((InterfaceC19370) it.next())).m33036());
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C3027.class);
        c3313.m5787(c4697);
        c3313.m5776("infos", arrayList);
        c3313.m5772();
    }
}
