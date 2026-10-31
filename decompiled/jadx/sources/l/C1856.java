package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1856 extends C14190 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C7772 f6336 = new C7772(C2609.m8239(), C2609.m8239(), false);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C4314 f6337 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22364 f6338;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6166(C8379 c8379, C7772 c7772, C7772 c7773, C7772 c7774) {
        C7772 c7775 = f6336;
        if (c7772 == c7775 && c7773 == c7775 && c7774 == c7775) {
            return c7775;
        }
        C2609 c2609 = c7772.f24023;
        C2609 c26010 = c7772.f24022;
        C2609 c26011 = c7774.f24023;
        C2609 c26012 = c7774.f24022;
        C2609 c2609M6164 = m6164(c8379, c2609, c26011);
        C2609 c26013 = c7773.f24023;
        C2609 c26014 = c7773.f24022;
        C2609 c2609M6165 = m6164(c8379, c26010, c26013);
        C2609 c2609M6166 = m6164(c8379, c7773.f24023, c7774.f24023);
        C2609 c2609M6167 = m6164(c8379, c7772.f24023, c26012);
        C2609 c2609M6168 = m6164(c8379, c26010, c26014);
        return new C7772(m6165(c8379, c2609M6166, c2609M6164, c2609M6165), m6165(c8379, m6164(c8379, c26014, c26012), c2609M6167, c2609M6168), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6167(C9085 c9085, C7772 c7772, C7772 c7773) {
        int i = C14121.f42604[c9085.mo989().ordinal()];
        if (i == 1) {
            return m6168((AbstractC19669) c9085, c7772, c7773);
        }
        if (i != 2) {
            return f6336;
        }
        return new C7772(m6164(c9085, c7772.f24023, c7773.f24023), m6165(c9085, c7772.f24022, c7773.f24022), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6168(AbstractC19669 abstractC19669, C7772 c7772, C7772 c7773) {
        return new C7772(m6165(abstractC19669, c7772.f24023, c7773.f24023), m6164(abstractC19669, c7772.f24022, c7773.f24022), false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7772 m6169(AbstractC19669 abstractC19669, C7772 c7772, C7772 c7773) {
        if (c7772 == null || c7772.f24024) {
            return c7773;
        }
        return c7773.f24024 ? c7772 : new C7772(m6164(abstractC19669, c7772.f24023, c7773.f24023), m6164(abstractC19669, c7772.f24022, c7773.f24022), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m6164(AbstractC19669 abstractC19669, C2609 c2609, C2609 c26010) {
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16986 c16986 = (C16986) it.next();
            Iterator it2 = c26010.iterator();
            while (it2.hasNext()) {
                C16986 c16987 = (C16986) it2.next();
                if (c16986.f17562 == c16987.f17562 && (c16986.f17563 & 4398046511104L) == 0 && (c16987.f17563 & 4398046511104L) == 0) {
                    this.f6338.m7273(abstractC19669, C6241.f19226);
                    c16987.f17563 |= 4398046511104L;
                    c2609M8239 = c2609M8239.m8242(c16987);
                }
            }
        }
        return c2609M8239;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C2609 m6165(AbstractC19669 abstractC19669, C2609 c2609, C2609... c2609Arr) {
        for (C2609<C16986> c26010 : c2609Arr) {
            for (C16986 c16986 : c26010) {
                for (C16986 c16987 : c2609) {
                    if (c16987.f17562 == c16986.f17562 && (c16987.f17563 & 4398046511104L) == 0 && (c16986.f17563 & 4398046511104L) == 0) {
                        this.f6338.m7273(abstractC19669, C6241.f19226);
                        c16986.f17563 |= 4398046511104L;
                    }
                }
                c2609 = c2609.m8242(c16986);
            }
        }
        return c2609;
    }

    public C1856(C2903 c2903) {
        this.f6338 = C22364.m50099(c2903);
    }
}
