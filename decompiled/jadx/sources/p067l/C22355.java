package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22355 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        if ((c4697.m9964("local") || c4697.m9964(C0168b.f616k)) && !c4697.m9971() && c4697.m9966() == 2) {
            return c4697.m9959() || c4697.m9952();
        }
        return false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        ArrayList arrayList = new ArrayList(c4697.m9957());
        if (arrayList.size() != 2) {
            return;
        }
        if (c4697.m9964("local")) {
            try {
                C19210.m43749(c4697.m9962(), EnumC17868.MODIFY_DIRECTORY_LINKED);
                ArrayList arrayList2 = new ArrayList(2);
                AbstractC17043 abstractC17043Mo26445 = ((InterfaceC19370) arrayList.get(0)).mo26445();
                AbstractC17043 abstractC17043Mo26446 = ((InterfaceC19370) arrayList.get(1)).mo26445();
                AbstractC17043 abstractC17043M38678 = abstractC17043Mo26445.m38678(".tmp");
                if (abstractC17043Mo26445.mo25502(abstractC17043M38678)) {
                    arrayList2.add(abstractC17043M38678.getName());
                    if (abstractC17043Mo26446.mo25502(abstractC17043Mo26445)) {
                        arrayList2.add(abstractC17043Mo26445.getName());
                        if (abstractC17043M38678.mo25502(abstractC17043Mo26446)) {
                            arrayList2.add(abstractC17043Mo26446.getName());
                            arrayList2.remove(abstractC17043M38678.getName());
                            int i = C16114.f47424;
                            C16114.m36688(abstractC17043Mo26445.mo25505(), true);
                            C16114.m36688(abstractC17043Mo26446.mo25505(), true);
                        } else if (abstractC17043Mo26445.mo25502(abstractC17043Mo26446)) {
                            arrayList2.remove(abstractC17043Mo26445.getName());
                            if (abstractC17043M38678.mo25502(abstractC17043Mo26445)) {
                                arrayList2.remove(abstractC17043M38678.getName());
                            }
                        }
                    } else if (abstractC17043M38678.mo25502(abstractC17043Mo26445)) {
                        arrayList2.remove(abstractC17043M38678.getName());
                    }
                    C22682.m50793(R.string.MT_Protector);
                } else {
                    C22682.m50793(R.string.MT_Protector);
                }
                if (!arrayList2.isEmpty()) {
                    c4697.m9969().m41267();
                    c4697.m9969().m41226((Collection) arrayList2);
                    c4697.m9953();
                }
                C17127.m38756();
                return;
            } catch (C3924 e) {
                c4697.m9965().m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (c4697.m9964(C0168b.f616k)) {
            new C8943(this, c4697, (AbstractC5375) c4697.m9970().mo8217(), arrayList).m22250();
        }
    }
}
