package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17346 extends AbstractC20030 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7289[] f51736;

    public C17346(AbstractC7289 abstractC7289, AbstractC7289 abstractC72810) {
        HashSet hashSet = new HashSet();
        if (abstractC7289 instanceof C17346) {
            hashSet.addAll(Arrays.asList(((C17346) abstractC7289).f51736));
        } else {
            hashSet.add(abstractC7289);
        }
        if (abstractC72810 instanceof C17346) {
            hashSet.addAll(Arrays.asList(((C17346) abstractC72810).f51736));
        } else {
            hashSet.add(abstractC72810);
        }
        List listM16742 = AbstractC7289.m16742(hashSet);
        if (!listM16742.isEmpty()) {
            hashSet.add((C20701) Collections.min(listM16742));
        }
        this.f51736 = (AbstractC7289[]) hashSet.toArray(new AbstractC7289[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17346) {
            return Arrays.equals(this.f51736, ((C17346) obj).f51736);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C17346.class.hashCode();
        AbstractC7289[] abstractC7289Arr = this.f51736;
        for (AbstractC7289 abstractC7289 : abstractC7289Arr) {
            iHashCode = C4358.m9000(iHashCode, abstractC7289);
        }
        return C4358.m8999(iHashCode, abstractC7289Arr.length);
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3894(AbstractC20244 abstractC20244, C20915 c20915) {
        for (AbstractC7289 abstractC7289 : this.f51736) {
            if (!abstractC7289.mo3894(abstractC20244, c20915)) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7289 mo13356(AbstractC20244 abstractC20244, C20915 c20915) {
        ArrayList arrayList = new ArrayList();
        AbstractC7289[] abstractC7289Arr = this.f51736;
        int length = abstractC7289Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return C4607.f10339;
                }
                AbstractC7289 abstractC7289M16743 = (AbstractC7289) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC7289M16743 = AbstractC7289.m16743(abstractC7289M16743, (AbstractC7289) arrayList.get(i3));
                }
                return abstractC7289M16743;
            }
            AbstractC7289 abstractC7289 = abstractC7289Arr[i];
            AbstractC7289 abstractC7289Mo13356 = abstractC7289.mo13356(abstractC20244, c20915);
            i2 |= abstractC7289Mo13356 == abstractC7289 ? 0 : 1;
            if (abstractC7289Mo13356 == null) {
                return null;
            }
            if (abstractC7289Mo13356 != C4607.f10339) {
                arrayList.add(abstractC7289Mo13356);
            }
            i++;
        }
    }

    public final String toString() {
        return C6458.m14758(Arrays.asList(this.f51736).iterator(), "&&");
    }
}
