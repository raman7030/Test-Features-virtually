package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۠۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10001 extends AbstractC3947 {
    public C10001() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        List<AbstractC3947> listAsList = Arrays.asList(new C25036(R.string.MT_Protector, -1), new C2927(R.string.MT_Protector, -1), new C22375(R.string.MT_Protector, -1), new C18350(), new C22355(R.string.MT_Protector, -1), new C12276(R.string.MT_Protector, -1), new C8252(R.string.MT_Protector, -1), new C17679(R.string.MT_Protector, -1));
        ArrayList arrayList = new ArrayList(listAsList.size());
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (AbstractC3947 abstractC3947 : listAsList) {
            arrayList.add(C7050.m16224(abstractC3947.m7840()));
            arrayList2.add(Boolean.valueOf(abstractC3947.mo3869(c4697)));
        }
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(m7840());
        c20671BuildDialog.m46717(new C3295(c4697.m9965(), arrayList, arrayList2), new DialogInterfaceOnClickListenerC7319(0, listAsList, c4697));
        c20671BuildDialog.m46732();
    }
}
