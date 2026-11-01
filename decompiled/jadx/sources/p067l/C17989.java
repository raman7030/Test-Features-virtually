package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1YM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17989 extends AbstractC3947 {
    public C17989() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        if (!C24414.m53850()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (c4697.m9966() == 2) {
            ArrayList arrayList = new ArrayList(4);
            HashSet hashSet = new HashSet();
            for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
                arrayList.add(new C12073(interfaceC19370));
                hashSet.add(interfaceC19370.getParent());
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12073("resources.arsc", (String) it.next(), false, true));
            }
            c4697.m9970().mo8202(c4697.m9969(), arrayList, new RunnableC4546(1, arrayList, c4697));
            return;
        }
        final C18107 c18107M9967 = c4697.m9967();
        final ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
        InterfaceC19370 interfaceC19370M41251 = c18107M9967.m41251();
        arrayList2.add(new C12073(interfaceC19370M9961));
        arrayList2.add(new C12073("resources.arsc", interfaceC19370M9961.getParent(), false, true));
        arrayList3.add(new C12073(interfaceC19370M41251));
        arrayList3.add(new C12073("resources.arsc", interfaceC19370M41251.getParent(), false, true));
        c4697.m9970().mo8202(c4697.m9969(), arrayList2, new Runnable() { // from class: l.֫ۚܳ
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList4 = arrayList2;
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((C12073) it2.next()).m27641();
                }
                final C18107 c18107 = c18107M9967;
                AbstractC18422 abstractC18422M41270 = c18107.m41270();
                final C4697 c4698 = c4697;
                final ArrayList arrayList5 = arrayList3;
                abstractC18422M41270.mo8202(c18107, arrayList5, new Runnable() { // from class: l.ۧۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        String name;
                        String name2;
                        ArrayList arrayList6 = arrayList5;
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            ((C12073) it3.next()).m27641();
                        }
                        AbstractC17043 abstractC17043M27644 = ((C12073) arrayList4.get(0)).m27644();
                        AbstractC17043 abstractC17043M27645 = ((C12073) arrayList6.get(0)).m27644();
                        C4697 c4699 = c4698;
                        boolean zM41290 = c4699.m9969().m41290();
                        if (abstractC17043M27644.getName().equals(abstractC17043M27645.getName())) {
                            int i = R.string.MT_Protector;
                            name = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, abstractC17043M27644.getName());
                            if (!zM41290) {
                                i = R.string.MT_Protector;
                            }
                            name2 = C7050.m16203(i, abstractC17043M27645.getName());
                        } else {
                            name = abstractC17043M27644.getName();
                            name2 = abstractC17043M27645.getName();
                        }
                        C9315 c9315 = new C9315(abstractC17043M27644, abstractC17043M27645, name, name2, c4699.m9970(), c18107.m41270());
                        if (!zM41290) {
                            c9315.m21562();
                        }
                        C4345.m8961(c4699.m9965(), c9315);
                    }
                });
            }
        });
    }
}
