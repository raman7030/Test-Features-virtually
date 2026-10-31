package l;

/* JADX INFO: renamed from: l.ۨۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11429 extends AbstractC10494 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28242(C5637 c5637) {
        boolean z = false;
        if (c5637.f17415.size() == 0) {
            return false;
        }
        int[] iArr = new int[C14996.m35534(c5637)];
        C16407 c16407 = c5637.f17411;
        C3708 c3708 = new C3708(iArr);
        for (AbstractC1591 first = c16407.getFirst(); first != null; first = first.m5439()) {
            C14996.m35527(first, c3708, true);
        }
        AbstractC1591 first2 = c5637.f17411.getFirst();
        while (first2 != null) {
            if (first2.f5638 == EnumC7690.ASSIGN && first2.mo5445().f25745 == EnumC1340.LOCAL) {
                C18274 c18274 = (C18274) first2.mo5445();
                if (iArr[c18274.f56817] == 0) {
                    AbstractC8396 abstractC8396Mo5444 = first2.mo5444();
                    if (abstractC8396Mo5444 instanceof AbstractC13397) {
                        c5637.f17415.remove(c18274);
                        C6530 c6530 = new C6530(abstractC8396Mo5444);
                        c5637.f17411.m38668(first2, c6530);
                        first2 = c6530;
                        z = true;
                    }
                }
            }
            first2 = first2.m5439();
        }
        return z;
    }
}
