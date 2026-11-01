package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2576 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f4254;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C7271 f4255;

    public C2576(C7271 c7271) {
        this.f4255 = c7271;
        this.f4254 = new ArrayList();
        C2733 c2733 = c7271.f18964;
        Iterator it = c2733.m4267().iterator();
        while (it.hasNext()) {
            this.f4254.add(new C20683(this, (AbstractC6462) it.next()));
        }
        for (C20683 c20683 : this.f4254) {
            AbstractC6462 abstractC6462 = (AbstractC6462) ((C20271) c20683.f31649).first();
            for (C20683 c20684 : this.f4254) {
                AbstractC6462 abstractC6463 = (AbstractC6462) ((C20271) c20684.f31649).first();
                if (abstractC6462 != abstractC6463 && AbstractC6462.m14767(((C3108) c2733.m4259(abstractC6462)).m5292(EnumC20544.values()), C4848.m10276of((Object) abstractC6463))) {
                    c20683.f63877.add(c20684);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C4848 c4848 : C7335.m16929(this.f4254)) {
            if (c4848.m10289() > 1) {
                C20683 c20685 = (C20683) c4848.f11034;
                C4848<C20683> c4849 = c4848.f11035;
                Object obj = c20685.f31649;
                for (C20683 c20686 : c4849) {
                    C1446.m31703("Attempt to merge a compound node!", ((C20271) c20686.f31649).m45780() == 1);
                    ((C20271) obj).m45779((C20271) c20686.f31649);
                    Iterator it2 = c20686.f63877.iterator();
                    while (it2.hasNext()) {
                        c20685.f63877.add((C20683) it2.next());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C20683 c20687 : c20685.f63877) {
                    if (((C20271) obj).contains(((C20271) c20687.f31649).first())) {
                        linkedHashSet.add(c20685);
                    } else {
                        linkedHashSet.add(c20687);
                    }
                }
                c20685.f63877 = linkedHashSet;
                Iterator it3 = c4848.iterator();
                while (it3.hasNext()) {
                    m3881((C20683) it3.next(), c20685);
                }
            }
            arrayList.add((C20683) c4848.f11034);
        }
        this.f4254 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3881(C20683 c20683, C20683 c20684) {
        for (C20683 c20685 : this.f4254) {
            if (c20685.f63877.remove(c20683) && c20684 != null) {
                c20685.f63877.add(c20684);
            }
        }
    }
}
