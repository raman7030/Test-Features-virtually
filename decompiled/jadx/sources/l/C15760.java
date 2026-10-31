package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15760 extends AbstractC18584 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5178[] f48597;

    public C15760(AbstractC5178 abstractC5178, AbstractC5178 abstractC5179) {
        HashSet hashSet = new HashSet();
        if (abstractC5178 instanceof C15760) {
            hashSet.addAll(Arrays.asList(((C15760) abstractC5178).f48597));
        } else {
            hashSet.add(abstractC5178);
        }
        if (abstractC5179 instanceof C15760) {
            hashSet.addAll(Arrays.asList(((C15760) abstractC5179).f48597));
        } else {
            hashSet.add(abstractC5179);
        }
        List listM14832 = AbstractC5178.m14832(hashSet);
        if (!listM14832.isEmpty()) {
            hashSet.add((C19290) Collections.min(listM14832));
        }
        this.f48597 = (AbstractC5178[]) hashSet.toArray(new AbstractC5178[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15760) {
            return Arrays.equals(this.f48597, ((C15760) obj).f48597);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C15760.class.hashCode();
        AbstractC5178[] abstractC5178Arr = this.f48597;
        for (AbstractC5178 abstractC5178 : abstractC5178Arr) {
            iHashCode = C2093.m6874(iHashCode, abstractC5178);
        }
        return C2093.m6873(iHashCode, abstractC5178Arr.length);
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        for (AbstractC5178 abstractC5178 : this.f48597) {
            if (!abstractC5178.mo1496(abstractC18809, c19515)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        ArrayList arrayList = new ArrayList();
        AbstractC5178[] abstractC5178Arr = this.f48597;
        int length = abstractC5178Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return C2356.f7548;
                }
                AbstractC5178 abstractC5178M14833 = (AbstractC5178) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC5178M14833 = AbstractC5178.m14833(abstractC5178M14833, (AbstractC5178) arrayList.get(i3));
                }
                return abstractC5178M14833;
            }
            AbstractC5178 abstractC5178 = abstractC5178Arr[i];
            AbstractC5178 abstractC5178Mo11420 = abstractC5178.mo11420(abstractC18809, c19515);
            i2 |= abstractC5178Mo11420 == abstractC5178 ? 0 : 1;
            if (abstractC5178Mo11420 == null) {
                return null;
            }
            if (abstractC5178Mo11420 != C2356.f7548) {
                arrayList.add(abstractC5178Mo11420);
            }
            i++;
        }
    }

    public final String toString() {
        return C4303.m12894(Arrays.asList(this.f48597).iterator(), "&&");
    }
}
