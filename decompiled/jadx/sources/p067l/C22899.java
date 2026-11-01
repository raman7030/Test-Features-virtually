package p067l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C22899 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f72067 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final C21558 m51126() {
        int i = C15444.f44129;
        AbstractC12093 abstractC12093 = C24162.f76622;
        abstractC12093.getClass();
        C19983 c19983 = new C19983(EnumC24833.f79329, abstractC12093);
        ArrayList arrayList = this.f72067;
        Collections.sort(arrayList, c19983);
        C4123 c4123 = new C4123(arrayList.size());
        C4123 c4124 = new C4123(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C15444 c15444 = (C15444) ((Map.Entry) arrayList.get(i2)).getKey();
            if (i2 > 0) {
                C15444 c15445 = (C15444) ((Map.Entry) arrayList.get(i2 - 1)).getKey();
                if (c15444.m35193(c15445) && !c15444.m35191(c15445).m35187()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + c15445 + " overlaps with entry " + c15444);
                }
            }
            c4123.m18182((Object) c15444);
            c4124.m18182(((Map.Entry) arrayList.get(i2)).getValue());
        }
        return new C21558(c4123.m8329(), c4124.m8329());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51127(C15444 c15444, Object obj) {
        c15444.getClass();
        obj.getClass();
        C6194.m14027(c15444, "Range must not be empty, but was %s", !c15444.m35187());
        this.f72067.add(new AbstractMap.SimpleImmutableEntry(c15444, obj));
    }
}
