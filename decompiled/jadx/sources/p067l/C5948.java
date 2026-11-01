package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5948 extends AbstractC20030 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7289[] f14686;

    public C5948(AbstractC7289 abstractC7289, AbstractC7289 abstractC72810) {
        HashSet hashSet = new HashSet();
        if (abstractC7289 instanceof C5948) {
            hashSet.addAll(Arrays.asList(((C5948) abstractC7289).f14686));
        } else {
            hashSet.add(abstractC7289);
        }
        if (abstractC72810 instanceof C5948) {
            hashSet.addAll(Arrays.asList(((C5948) abstractC72810).f14686));
        } else {
            hashSet.add(abstractC72810);
        }
        List listM16742 = AbstractC7289.m16742(hashSet);
        if (!listM16742.isEmpty()) {
            hashSet.add((C20701) Collections.max(listM16742));
        }
        this.f14686 = (AbstractC7289[]) hashSet.toArray(new AbstractC7289[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5948) {
            return Arrays.equals(this.f14686, ((C5948) obj).f14686);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C5948.class.hashCode();
        AbstractC7289[] abstractC7289Arr = this.f14686;
        for (AbstractC7289 abstractC7289 : abstractC7289Arr) {
            iHashCode = C4358.m9000(iHashCode, abstractC7289);
        }
        return C4358.m8999(iHashCode, abstractC7289Arr.length);
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3894(AbstractC20244 abstractC20244, C20915 c20915) {
        for (AbstractC7289 abstractC7289 : this.f14686) {
            if (abstractC7289.mo3894(abstractC20244, c20915)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005f A[PHI: r2
      0x005f: PHI (r2v2 l.ۚۜ֡) = (r2v4 l.ۚۜ֡), (r2v5 l.ۚۜ֡), (r2v6 l.ۚۜ֡) binds: [B:30:0x004d, B:31:0x004f, B:34:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7289 mo13356(AbstractC20244 abstractC20244, C20915 c20915) {
        ArrayList arrayList = new ArrayList();
        AbstractC7289[] abstractC7289Arr = this.f14686;
        int length = abstractC7289Arr.length;
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
                AbstractC7289 abstractC7289 = (AbstractC7289) arrayList.get(0);
                while (i2 < arrayList.size()) {
                    AbstractC7289 abstractC72810 = (AbstractC7289) arrayList.get(i2);
                    if (abstractC7289 == null) {
                        abstractC7289 = abstractC72810;
                    } else if (abstractC72810 != null) {
                        C4607 c4607 = C4607.f10339;
                        if (abstractC7289 == c4607 || abstractC72810 == c4607) {
                            AbstractC7289 abstractC72811 = c4607;
                            abstractC72811 = c4607;
                            abstractC7289 = abstractC72811;
                        } else {
                            C5948 c5948 = new C5948(abstractC7289, abstractC72810);
                            AbstractC7289[] abstractC7289Arr2 = c5948.f14686;
                            abstractC72811 = c5948;
                            if (abstractC7289Arr2.length == 1) {
                                abstractC7289 = abstractC7289Arr2[0];
                            } else {
                                AbstractC7289 abstractC72812 = c4607;
                                abstractC72812 = c4607;
                                abstractC7289 = abstractC72812;
                            }
                        }
                    }
                    i2++;
                    abstractC7289 = abstractC7289;
                }
                return abstractC7289;
            }
            AbstractC7289 abstractC72813 = abstractC7289Arr[i];
            AbstractC7289 abstractC7289Mo13356 = abstractC72813.mo13356(abstractC20244, c20915);
            z |= abstractC7289Mo13356 != abstractC72813;
            C4607 c4608 = C4607.f10339;
            if (abstractC7289Mo13356 == c4608) {
                return c4608;
            }
            if (abstractC7289Mo13356 != null) {
                arrayList.add(abstractC7289Mo13356);
            }
            i++;
        }
    }

    public final String toString() {
        return C6458.m14758(Arrays.asList(this.f14686).iterator(), "||");
    }
}
