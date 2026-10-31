package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1YM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16436 extends AbstractC1661 {
    public C16436() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (c2450.m7918() == 2) {
            ArrayList arrayList = new ArrayList(4);
            HashSet hashSet = new HashSet();
            for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
                arrayList.add(new C10211(interfaceC17889));
                hashSet.add(interfaceC17889.getParent());
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new C10211("resources.arsc", (String) it.next(), false, true));
            }
            c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC2291(1, arrayList, c2450));
            return;
        }
        final C16560 c16560M7919 = c2450.m7919();
        final ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        InterfaceC17889 interfaceC17889M7913 = c2450.m7913();
        InterfaceC17889 interfaceC17889M39025 = c16560M7919.m39025();
        arrayList2.add(new C10211(interfaceC17889M7913));
        arrayList2.add(new C10211("resources.arsc", interfaceC17889M7913.getParent(), false, true));
        arrayList3.add(new C10211(interfaceC17889M39025));
        arrayList3.add(new C10211("resources.arsc", interfaceC17889M39025.getParent(), false, true));
        c2450.m7922().mo6005(c2450.m7921(), arrayList2, new Runnable() { // from class: l.֫ۚܳ
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList4 = arrayList2;
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((C10211) it2.next()).m25619();
                }
                final C16560 c16560 = c16560M7919;
                AbstractC16891 abstractC16891M39044 = c16560.m39044();
                final C2450 c2451 = c2450;
                final ArrayList arrayList5 = arrayList3;
                abstractC16891M39044.mo6005(c16560, arrayList5, new Runnable() { // from class: l.ۧۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        String name;
                        String name2;
                        ArrayList arrayList6 = arrayList5;
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            ((C10211) it3.next()).m25619();
                        }
                        AbstractC15440 abstractC15440M25622 = ((C10211) arrayList4.get(0)).m25622();
                        AbstractC15440 abstractC15440M25623 = ((C10211) arrayList6.get(0)).m25622();
                        C2450 c2452 = c2451;
                        boolean zM39064 = c2452.m7921().m39064();
                        if (abstractC15440M25622.getName().equals(abstractC15440M25623.getName())) {
                            int i = R.string.MT_Protector;
                            name = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, abstractC15440M25622.getName());
                            if (!zM39064) {
                                i = R.string.MT_Protector;
                            }
                            name2 = C4925.m14306(i, abstractC15440M25623.getName());
                        } else {
                            name = abstractC15440M25622.getName();
                            name2 = abstractC15440M25623.getName();
                        }
                        C7309 c7309 = new C7309(abstractC15440M25622, abstractC15440M25623, name, name2, c2452.m7922(), c16560.m39044());
                        if (!zM39064) {
                            c7309.m19594();
                        }
                        C2079.m6835(c2452.m7917(), c7309);
                    }
                });
            }
        });
    }
}
