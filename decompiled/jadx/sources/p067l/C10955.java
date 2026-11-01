package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G9AG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10955 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        c4697.m9955(C0168b.f616k);
        AbstractC5769 abstractC5769M17074 = ((C7367) c4697.m9970()).m17074();
        if (abstractC5769M17074 == null) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        C19033 c19033 = new C19033(abstractC5769M17074, true);
        C19033 c19034 = new C19033(abstractC5769M17074, false);
        final ArrayList arrayList = new ArrayList();
        for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
            arrayList.add(C10987.m25362(interfaceC19370.getPath(), interfaceC19370.isDirectory() ? c19033 : c19034));
        }
        final C11245 c11245M41242 = c4697.m9969().m41242();
        if (arrayList.size() <= 5) {
            C10987.m25351(arrayList, c11245M41242.m26091());
            C3413.m6044(c4697.m9965());
            return;
        }
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܿ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10987.m25351(arrayList, c11245M41242.m26091());
                C3413.m6044(c4697.m9965());
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
