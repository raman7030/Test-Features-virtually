package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G9AG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9034 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907(b.k);
        AbstractC3577 abstractC3577M15171 = ((C5259) c2450.m7922()).m15171();
        if (abstractC3577M15171 == null) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        C17534 c17534 = new C17534(abstractC3577M15171, true);
        C17534 c17535 = new C17534(abstractC3577M15171, false);
        final ArrayList arrayList = new ArrayList();
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            arrayList.add(C9068.m23416(interfaceC17889.getPath(), interfaceC17889.isDirectory() ? c17534 : c17535));
        }
        final C9340 c9340M39016 = c2450.m7921().m39016();
        if (arrayList.size() <= 5) {
            C9068.m23405(arrayList, c9340M39016.m24082());
            C1099.m3771(c2450.m7917());
            return;
        }
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܿ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9068.m23405(arrayList, c9340M39016.m24082());
                C1099.m3771(c2450.m7917());
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
