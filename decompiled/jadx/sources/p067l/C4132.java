package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4132 extends C15854 {

    /* JADX INFO: renamed from: ۧ */
    public static final C9755 f9117 = new C9755(C4848.m10283(), C4848.m10283(), false);

    /* JADX INFO: renamed from: ܽ */
    public static final C6468 f9118 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C23623 f9119;

    /* JADX INFO: renamed from: ֫ */
    public final C9755 m8368(C10332 c10332, C9755 c9755, C9755 c9756, C9755 c9757) {
        C9755 c9758 = f9117;
        if (c9755 == c9758 && c9756 == c9758 && c9757 == c9758) {
            return c9758;
        }
        C4848 c4848 = c9755.f26939;
        C4848 c4849 = c9755.f26938;
        C4848 c48410 = c9757.f26939;
        C4848 c48411 = c9757.f26938;
        C4848 c4848M8366 = m8366(c10332, c4848, c48410);
        C4848 c48412 = c9756.f26939;
        C4848 c48413 = c9756.f26938;
        C4848 c4848M8367 = m8366(c10332, c4849, c48412);
        C4848 c4848M8368 = m8366(c10332, c9756.f26939, c9757.f26939);
        C4848 c4848M8369 = m8366(c10332, c9755.f26939, c48411);
        C4848 c4848M83610 = m8366(c10332, c4849, c48413);
        return new C9755(m8367(c10332, c4848M8368, c4848M8366, c4848M8367), m8367(c10332, m8366(c10332, c48413, c48411), c4848M8369, c4848M83610), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9755 m8369(C11003 c11003, C9755 c9755, C9755 c9756) {
        int i = C15789.f45690[c11003.mo3383().ordinal()];
        if (i == 1) {
            return m8370((AbstractC21062) c11003, c9755, c9756);
        }
        if (i != 2) {
            return f9117;
        }
        return new C9755(m8366(c11003, c9755.f26939, c9756.f26939), m8367(c11003, c9755.f26938, c9756.f26938), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9755 m8370(AbstractC21062 abstractC21062, C9755 c9755, C9755 c9756) {
        return new C9755(m8367(abstractC21062, c9755.f26939, c9756.f26939), m8366(abstractC21062, c9755.f26938, c9756.f26938), false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9755 m8371(AbstractC21062 abstractC21062, C9755 c9755, C9755 c9756) {
        if (c9755 == null || c9755.f26940) {
            return c9756;
        }
        return c9756.f26940 ? c9755 : new C9755(m8366(abstractC21062, c9755.f26939, c9756.f26939), m8366(abstractC21062, c9755.f26938, c9756.f26938), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m8366(AbstractC21062 abstractC21062, C4848 c4848, C4848 c4849) {
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C18511 c18511 = (C18511) it.next();
            Iterator it2 = c4849.iterator();
            while (it2.hasNext()) {
                C18511 c18512 = (C18511) it2.next();
                if (c18511.f20408 == c18512.f20408 && (c18511.f20409 & 4398046511104L) == 0 && (c18512.f20409 & 4398046511104L) == 0) {
                    this.f9119.m9352(abstractC21062, C8300.f22091);
                    c18512.f20409 |= 4398046511104L;
                    c4848M10283 = c4848M10283.m10286(c18512);
                }
            }
        }
        return c4848M10283;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    private final C4848 m8367(AbstractC21062 abstractC21062, C4848 c4848, C4848... c4848Arr) {
        for (C4848<C18511> c4849 : c4848Arr) {
            for (C18511 c18511 : c4849) {
                for (C18511 c18512 : c4848) {
                    if (c18512.f20408 == c18511.f20408 && (c18512.f20409 & 4398046511104L) == 0 && (c18511.f20409 & 4398046511104L) == 0) {
                        this.f9119.m9352(abstractC21062, C8300.f22091);
                        c18511.f20409 |= 4398046511104L;
                    }
                }
                c4848 = c4848.m10286(c18511);
            }
        }
        return c4848;
    }

    public C4132(C5127 c5127) {
        this.f9119 = C23623.m52439(c5127);
    }
}
