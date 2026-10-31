package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۠۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes3.dex */
public final class C8031 extends AbstractC1661 {
    public C8031() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        List<AbstractC1661> listAsList = Arrays.asList(new C23850(R.string.MT_Protector, -1), new C0587(R.string.MT_Protector, -1), new C21050(R.string.MT_Protector, -1), new C16815(), new C21029(R.string.MT_Protector, -1), new C10424(R.string.MT_Protector, -1), new C6190(R.string.MT_Protector, -1), new C16109(R.string.MT_Protector, -1));
        ArrayList arrayList = new ArrayList(listAsList.size());
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (AbstractC1661 abstractC1661 : listAsList) {
            arrayList.add(C4925.m14327(abstractC1661.m5610()));
            arrayList2.add(Boolean.valueOf(abstractC1661.mo1456(c2450)));
        }
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(m5610());
        c19258BuildDialog.m44423(new C0975(c2450.m7917(), arrayList, arrayList2), new DialogInterfaceOnClickListenerC5209(0, listAsList, c2450));
        c19258BuildDialog.m44438();
    }
}
