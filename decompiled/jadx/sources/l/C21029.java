package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21029 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if ((c2450.m7916("local") || c2450.m7916(b.k)) && !c2450.m7923() && c2450.m7918() == 2) {
            return c2450.m7911() || c2450.m7904();
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        ArrayList arrayList = new ArrayList(c2450.m7909());
        if (arrayList.size() != 2) {
            return;
        }
        if (c2450.m7916("local")) {
            try {
                C17721.m41503(c2450.m7914(), EnumC16309.MODIFY_DIRECTORY_LINKED);
                ArrayList arrayList2 = new ArrayList(2);
                AbstractC15440 abstractC15440Mo24433 = ((InterfaceC17889) arrayList.get(0)).mo24433();
                AbstractC15440 abstractC15440Mo24434 = ((InterfaceC17889) arrayList.get(1)).mo24433();
                AbstractC15440 abstractC15440M36520 = abstractC15440Mo24433.m36520(".tmp");
                if (abstractC15440Mo24433.mo23551(abstractC15440M36520)) {
                    arrayList2.add(abstractC15440M36520.getName());
                    if (abstractC15440Mo24434.mo23551(abstractC15440Mo24433)) {
                        arrayList2.add(abstractC15440Mo24433.getName());
                        if (abstractC15440M36520.mo23551(abstractC15440Mo24434)) {
                            arrayList2.add(abstractC15440Mo24434.getName());
                            arrayList2.remove(abstractC15440M36520.getName());
                            int i = C14463.f44330;
                            C14463.m34554(abstractC15440Mo24433.mo23554(), true);
                            C14463.m34554(abstractC15440Mo24434.mo23554(), true);
                        } else if (abstractC15440Mo24433.mo23551(abstractC15440Mo24434)) {
                            arrayList2.remove(abstractC15440Mo24433.getName());
                            if (abstractC15440M36520.mo23551(abstractC15440Mo24433)) {
                                arrayList2.remove(abstractC15440M36520.getName());
                            }
                        }
                    } else if (abstractC15440M36520.mo23551(abstractC15440Mo24433)) {
                        arrayList2.remove(abstractC15440M36520.getName());
                    }
                    C21374.m48457(R.string.MT_Protector);
                } else {
                    C21374.m48457(R.string.MT_Protector);
                }
                if (!arrayList2.isEmpty()) {
                    c2450.m7921().m39041();
                    c2450.m7921().m39000((Collection) arrayList2);
                    c2450.m7905();
                }
                C15528.m36596();
                return;
            } catch (C1637 e) {
                c2450.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (c2450.m7916(b.k)) {
            new C6917(this, c2450, (AbstractC3163) c2450.m7922().mo6020(), arrayList).m20274();
        }
    }
}
