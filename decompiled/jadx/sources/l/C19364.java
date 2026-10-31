package l;

/* JADX INFO: renamed from: l.᩵ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19364 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 f62687;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13012 f62688;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0312 f62689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f62690;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0312 m44622(C13012 c13012) {
        C19364 c19364 = new C19364(c13012);
        int iM31593 = c19364.f62688.m31593();
        while (true) {
            C0312 c0312 = c19364.f62689;
            if (iM31593 >= 0) {
                int[] iArr = c19364.f62690;
                C13573.m32620(iM31593, iArr);
                C4546 c4546M1722 = c0312.m1722(iM31593);
                C16540 c16540M40535 = c19364.f62687.m40535(iM31593);
                C2430 c2430M38916 = c16540M40535.m38916();
                int size = c2430M38916.size();
                boolean z = c16540M40535.m38917() && c2430M38916.m7865().m37483() != null;
                int i = size - 1;
                C4546 c4546M13351 = c4546M1722;
                for (int i2 = 0; i2 < size; i2++) {
                    if (z && i2 == i) {
                        c4546M13351.mo20349();
                        c4546M13351 = c4546M13351.m13351();
                    }
                    AbstractC15834 abstractC15834M41001get = c2430M38916.m41001get(i2);
                    C21480 c21480M37482 = abstractC15834M41001get.m37482();
                    if (c21480M37482 == null) {
                        C21480 c21480M37483 = abstractC15834M41001get.m37483();
                        if (c21480M37483 != null && c4546M13351.get(c21480M37483.m48652()) != null) {
                            c4546M13351.m13359(c4546M13351.get(c21480M37483.m48652()));
                        }
                    } else {
                        C21480 c21480M48648 = c21480M37482.m48648();
                        c4546M13351.getClass();
                        if (!c21480M48648.equals(c4546M13351.get(c21480M48648.m48652()))) {
                            C21480 c21480M13353 = c4546M13351.m13353(c21480M48648.m48653());
                            if (c21480M13353 != null && c21480M13353.m48652() != c21480M48648.m48652()) {
                                c4546M13351.m13359(c21480M13353);
                            }
                            c0312.m1725(abstractC15834M41001get, c21480M48648);
                            c4546M13351.m13358(c21480M48648);
                        }
                    }
                }
                c4546M13351.mo20349();
                C21064 c21064M38911 = c16540M40535.m38911();
                int size2 = c21064M38911.size();
                int iM38913 = c16540M40535.m38913();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = c21064M38911.get(i3);
                    if (c0312.m1726(i4, i4 == iM38913 ? c4546M13351 : c4546M1722)) {
                        C13573.m32627(i4, iArr);
                    }
                }
                iM31593 = C13573.m32623(0, iArr);
            } else {
                c0312.mo20349();
                return c0312;
            }
        }
    }

    public C19364(C13012 c13012) {
        C17246 c17246M31591 = c13012.m31591();
        int iM38023 = c17246M31591.m38023();
        this.f62688 = c13012;
        this.f62687 = c17246M31591;
        this.f62689 = new C0312(c13012);
        this.f62690 = C13573.m32622(iM38023);
    }
}
