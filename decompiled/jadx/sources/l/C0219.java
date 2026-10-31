package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0219 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f1475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5159 f1476;

    public C0219(C5159 c5159) {
        this.f1476 = c5159;
        this.f1475 = new ArrayList();
        C0384 c0384 = c5159.f16125;
        Iterator it = c0384.m1876().iterator();
        while (it.hasNext()) {
            this.f1475.add(new C19271(this, (AbstractC4308) it.next()));
        }
        for (C19271 c19271 : this.f1475) {
            AbstractC4308 abstractC4308 = (AbstractC4308) ((C18837) c19271.f28700).first();
            for (C19271 c19272 : this.f1475) {
                AbstractC4308 abstractC4309 = (AbstractC4308) ((C18837) c19272.f28700).first();
                if (abstractC4308 != abstractC4309 && AbstractC4308.m12903(((C0779) c0384.m1868(abstractC4308)).m2963(EnumC19125.values()), C2609.of((Object) abstractC4309))) {
                    c19271.f60647.add(c19272);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C2609 c2609 : C5226.m15019(this.f1475)) {
            if (c2609.m8245() > 1) {
                C19271 c19273 = (C19271) c2609.f8240;
                C2609<C19271> c26010 = c2609.f8241;
                Object obj = c19273.f28700;
                for (C19271 c19274 : c26010) {
                    C12171.m29641("Attempt to merge a compound node!", ((C18837) c19274.f28700).m43514() == 1);
                    ((C18837) obj).m43513((C18837) c19274.f28700);
                    Iterator it2 = c19274.f60647.iterator();
                    while (it2.hasNext()) {
                        c19273.f60647.add((C19271) it2.next());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C19271 c19275 : c19273.f60647) {
                    if (((C18837) obj).contains(((C18837) c19275.f28700).first())) {
                        linkedHashSet.add(c19273);
                    } else {
                        linkedHashSet.add(c19275);
                    }
                }
                c19273.f60647 = linkedHashSet;
                Iterator it3 = c2609.iterator();
                while (it3.hasNext()) {
                    m1468((C19271) it3.next(), c19273);
                }
            }
            arrayList.add((C19271) c2609.f8240);
        }
        this.f1475 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1468(C19271 c19271, C19271 c19272) {
        for (C19271 c19273 : this.f1475) {
            if (c19273.f60647.remove(c19271) && c19272 != null) {
                c19273.f60647.add(c19272);
            }
        }
    }
}
