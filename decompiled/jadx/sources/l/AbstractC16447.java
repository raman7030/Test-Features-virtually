package l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܽۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16447 extends AbstractC16612 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f50575;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f50574 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23069 f50573 = new C23069(null, Integer.MAX_VALUE);

    public AbstractC16447(C2609 c2609) {
        this.f50575 = c2609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23069 m38752(C19271 c19271) {
        HashMap map = this.f50574;
        C23069 c23069 = (C23069) map.get(c19271);
        if (c23069 == null) {
            LinkedHashSet linkedHashSet = c19271.f60647;
            Object obj = c19271.f28700;
            if (linkedHashSet.isEmpty()) {
                c23069 = new C23069(C2609.of((Object) c19271), Integer.valueOf(((C18837) obj).m43514()));
            } else {
                Iterator it = c19271.f60647.iterator();
                while (it.hasNext()) {
                    if (((C19271) it.next()) != c19271) {
                        c23069 = new C23069(C2609.of((Object) c19271), Integer.valueOf(((C18837) obj).m43514()));
                        for (C19271 c19272 : c19271.f60647) {
                            if (c19272 != c19271) {
                                C23069 c23069M38752 = m38752(c19272);
                                c23069 = new C23069(((C2609) c23069.f74207).m8248((C2609) c23069M38752.f74207), Integer.valueOf(((Integer) c23069M38752.f74208).intValue() + ((Integer) c23069.f74208).intValue()));
                            }
                        }
                    }
                }
                c23069 = new C23069(C2609.of((Object) c19271), Integer.valueOf(((C18837) obj).m43514()));
            }
            map.put(c19271, c23069);
        }
        return c23069;
    }

    @Override // l.AbstractC16612, l.InterfaceC7981
    /* JADX INFO: renamed from: ֫ */
    public final C19271 mo21304(C0219 c0219) {
        this.f50574.clear();
        C23069 c23069 = this.f50573;
        C23069 c230610 = c23069;
        for (C19271 c19271 : c0219.f1475) {
            if (!Collections.disjoint((Collection) c19271.f28700, this.f50575)) {
                C23069 c23069M38752 = m38752(c19271);
                if (((Integer) c23069M38752.f74208).intValue() < ((Integer) c230610.f74208).intValue()) {
                    c230610 = c23069M38752;
                }
            }
        }
        if (c230610 == c23069) {
            throw new C0925();
        }
        return (C19271) ((C2609) c230610.f74207).f8240;
    }
}
