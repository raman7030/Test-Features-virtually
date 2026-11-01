package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5583 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f13487;

    /* JADX INFO: renamed from: ֫ */
    public static C5583 m12352(ArrayList arrayList, int i) {
        int size = arrayList.size();
        C5583 c5583 = new C5583(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c5583.m43241(i2, (AbstractC6924) arrayList.get(i2));
        }
        c5583.mo22326();
        return c5583;
    }

    public C5583(int i, int i2) {
        super(i);
        this.f13487 = i2;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m12353() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        AbstractC6924 abstractC6924 = (AbstractC6924) m43238(size - 1);
        return abstractC6924.mo4465() + abstractC6924.m15870();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12354(C19705 c19705) {
        int iM44769 = c19705.m44769();
        int size = size();
        if (c19705.m44765()) {
            for (int i = 0; i < size; i++) {
                AbstractC6924 abstractC6924 = (AbstractC6924) m43238(i);
                int iMo4465 = abstractC6924.mo4465() * 2;
                String strM17598 = null;
                if (iMo4465 != 0) {
                    int iM44775 = c19705.m44775();
                    String strMo4466 = abstractC6924.mo4466();
                    if (strMo4466 != null) {
                        String str = EnumC2483.f3919 + abstractC6924.m15864() + ": ";
                        int length = str.length();
                        strM17598 = C7635.m17598(str, length, iM44775 == 0 ? strMo4466.length() : iM44775 - length, strMo4466);
                    }
                }
                if (strM17598 != null) {
                    c19705.m44760(iMo4465, strM17598);
                } else if (iMo4465 != 0) {
                    c19705.m44760(iMo4465, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC6924 abstractC6925 = (AbstractC6924) m43238(i2);
            try {
                abstractC6925.mo4463(c19705);
            } catch (RuntimeException e) {
                throw C10101.m23569("...while writing " + abstractC6925, e);
            }
        }
        int iM447610 = (c19705.m44769() - iM44769) / 2;
        if (iM447610 == m12353()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m12353() + " but actually wrote " + iM447610);
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m12356() {
        return this.f13487;
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m12355() {
        int iM35476;
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC6924 abstractC6924 = (AbstractC6924) m43238(i2);
            if (abstractC6924 instanceof C23018) {
                AbstractC15405 abstractC15405M51402 = ((C23018) abstractC6924).m51402();
                if (abstractC15405M51402 instanceof AbstractC18283) {
                    iM35476 = ((AbstractC18283) abstractC15405M51402).m41621(abstractC6924.m15874().m34266() == 113).m53653().m35476();
                } else {
                    iM35476 = abstractC15405M51402 instanceof C24989 ? ((C24989) abstractC15405M51402).m54889().m53653().m35476() : 0;
                }
            } else {
                if (!(abstractC6924 instanceof C19585)) {
                    continue;
                } else {
                    if (abstractC6924.m15874().m34266() != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM35476 = ((C6884) ((C19585) abstractC6924).m44498(1)).m15778().m53653().m35476() + 1;
                }
            }
            if (iM35476 > i) {
                i = iM35476;
            }
        }
        return i;
    }
}
