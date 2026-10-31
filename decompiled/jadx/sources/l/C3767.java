package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3767 extends AbstractC18584 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5178[] f11880;

    public C3767(AbstractC5178 abstractC5178, AbstractC5178 abstractC5179) {
        HashSet hashSet = new HashSet();
        if (abstractC5178 instanceof C3767) {
            hashSet.addAll(Arrays.asList(((C3767) abstractC5178).f11880));
        } else {
            hashSet.add(abstractC5178);
        }
        if (abstractC5179 instanceof C3767) {
            hashSet.addAll(Arrays.asList(((C3767) abstractC5179).f11880));
        } else {
            hashSet.add(abstractC5179);
        }
        List listM14832 = AbstractC5178.m14832(hashSet);
        if (!listM14832.isEmpty()) {
            hashSet.add((C19290) Collections.max(listM14832));
        }
        this.f11880 = (AbstractC5178[]) hashSet.toArray(new AbstractC5178[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3767) {
            return Arrays.equals(this.f11880, ((C3767) obj).f11880);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C3767.class.hashCode();
        AbstractC5178[] abstractC5178Arr = this.f11880;
        for (AbstractC5178 abstractC5178 : abstractC5178Arr) {
            iHashCode = C2093.m6874(iHashCode, abstractC5178);
        }
        return C2093.m6873(iHashCode, abstractC5178Arr.length);
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        for (AbstractC5178 abstractC5178 : this.f11880) {
            if (abstractC5178.mo1496(abstractC18809, c19515)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f A[PHI: r2
      0x005f: PHI (r2v2 l.ۚۜ֡) = (r2v4 l.ۚۜ֡), (r2v5 l.ۚۜ֡), (r2v6 l.ۚۜ֡) binds: [B:30:0x004d, B:31:0x004f, B:34:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        ArrayList arrayList = new ArrayList();
        AbstractC5178[] abstractC5178Arr = this.f11880;
        int length = abstractC5178Arr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int i2 = 1;
                AbstractC5178 abstractC5178 = (AbstractC5178) arrayList.get(0);
                while (i2 < arrayList.size()) {
                    AbstractC5178 abstractC5179 = (AbstractC5178) arrayList.get(i2);
                    if (abstractC5178 == null) {
                        abstractC5178 = abstractC5179;
                    } else if (abstractC5179 != null) {
                        C2356 c2356 = C2356.f7548;
                        if (abstractC5178 == c2356 || abstractC5179 == c2356) {
                            AbstractC5178 abstractC51710 = c2356;
                            abstractC51710 = c2356;
                            abstractC5178 = abstractC51710;
                        } else {
                            C3767 c3767 = new C3767(abstractC5178, abstractC5179);
                            AbstractC5178[] abstractC5178Arr2 = c3767.f11880;
                            abstractC51710 = c3767;
                            if (abstractC5178Arr2.length == 1) {
                                abstractC5178 = abstractC5178Arr2[0];
                            } else {
                                AbstractC5178 abstractC51711 = c2356;
                                abstractC51711 = c2356;
                                abstractC5178 = abstractC51711;
                            }
                        }
                    }
                    i2++;
                    abstractC5178 = abstractC5178;
                }
                return abstractC5178;
            }
            AbstractC5178 abstractC51712 = abstractC5178Arr[i];
            AbstractC5178 abstractC5178Mo11420 = abstractC51712.mo11420(abstractC18809, c19515);
            z |= abstractC5178Mo11420 != abstractC51712;
            C2356 c2357 = C2356.f7548;
            if (abstractC5178Mo11420 == c2357) {
                return c2357;
            }
            if (abstractC5178Mo11420 != null) {
                arrayList.add(abstractC5178Mo11420);
            }
            i++;
        }
    }

    public final String toString() {
        return C4303.m12894(Arrays.asList(this.f11880).iterator(), "||");
    }
}
