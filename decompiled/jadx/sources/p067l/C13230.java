package p067l;

/* JADX INFO: renamed from: l.ۨۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13230 extends AbstractC12342 {
    /* JADX INFO: renamed from: ֫ */
    public final boolean m30286(C7726 c7726) {
        boolean z = false;
        if (c7726.f20261.size() == 0) {
            return false;
        }
        int[] iArr = new int[C16620.m37690(c7726)];
        C17961 c17961 = c7726.f20257;
        C5892 c5892 = new C5892(iArr);
        for (AbstractC3880 first = c17961.getFirst(); first != null; first = first.m7669()) {
            C16620.m37683(first, c5892, true);
        }
        AbstractC3880 first2 = c7726.f20257.getFirst();
        while (first2 != null) {
            if (first2.f8417 == EnumC9677.ASSIGN && first2.mo7675().f28658 == EnumC3642.LOCAL) {
                C19736 c19736 = (C19736) first2.mo7675();
                if (iArr[c19736.f60034] == 0) {
                    AbstractC10348 abstractC10348Mo7674 = first2.mo7674();
                    if (abstractC10348Mo7674 instanceof AbstractC15101) {
                        c7726.f20261.remove(c19736);
                        C8574 c8574 = new C8574(abstractC10348Mo7674);
                        c7726.f20257.m40884(first2, c8574);
                        first2 = c8574;
                        z = true;
                    }
                }
            }
            first2 = first2.m7669();
        }
        return z;
    }
}
