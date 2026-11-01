package p067l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܽۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17999 extends AbstractC18156 {

    /* JADX INFO: renamed from: ܽ */
    public C4848 f53754;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f53753 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C24293 f53752 = new C24293(null, Integer.MAX_VALUE);

    public AbstractC17999(C4848 c4848) {
        this.f53754 = c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24293 m40977(C20683 c20683) {
        HashMap map = this.f53753;
        C24293 c24293 = (C24293) map.get(c20683);
        if (c24293 == null) {
            LinkedHashSet linkedHashSet = c20683.f63877;
            Object obj = c20683.f31649;
            if (linkedHashSet.isEmpty()) {
                c24293 = new C24293(C4848.m10276of((Object) c20683), Integer.valueOf(((C20271) obj).m45780()));
            } else {
                Iterator it = c20683.f63877.iterator();
                while (it.hasNext()) {
                    if (((C20683) it.next()) != c20683) {
                        c24293 = new C24293(C4848.m10276of((Object) c20683), Integer.valueOf(((C20271) obj).m45780()));
                        for (C20683 c20684 : c20683.f63877) {
                            if (c20684 != c20683) {
                                C24293 c24293M40977 = m40977(c20684);
                                c24293 = new C24293(((C4848) c24293.f76952).m10292((C4848) c24293M40977.f76952), Integer.valueOf(((Integer) c24293M40977.f76953).intValue() + ((Integer) c24293.f76953).intValue()));
                            }
                        }
                    }
                }
                c24293 = new C24293(C4848.m10276of((Object) c20683), Integer.valueOf(((C20271) obj).m45780()));
            }
            map.put(c20683, c24293);
        }
        return c24293;
    }

    @Override // p067l.AbstractC18156, p067l.InterfaceC9953
    /* JADX INFO: renamed from: ֫ */
    public final C20683 mo23270(C2576 c2576) {
        this.f53753.clear();
        C24293 c24293 = this.f53752;
        C24293 c24294 = c24293;
        for (C20683 c20683 : c2576.f4254) {
            if (!Collections.disjoint((Collection) c20683.f31649, this.f53754)) {
                C24293 c24293M40977 = m40977(c20683);
                if (((Integer) c24293M40977.f76953).intValue() < ((Integer) c24294.f76953).intValue()) {
                    c24294 = c24293M40977;
                }
            }
        }
        if (c24294 == c24293) {
            throw new C3247();
        }
        return (C20683) ((C4848) c24294.f76952).f11034;
    }
}
