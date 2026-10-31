package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1966 extends AbstractC1281 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f6592;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1966(C11139 c11139) {
        super(c11139, EnumC12075.RECORD_PHASE, new C11865(c11139));
        this.f6592 = c11139;
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6476(C1755 c1755) {
        C11139 c11139;
        C2609 c2609M46040;
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        if ((c14163.f17563 & 2305843009213693952L) != 0) {
            Iterator it = C7260.m19436(c5557).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c11139 = this.f6592;
                if (!zHasNext) {
                    break;
                }
                C9378 c9378 = (C9378) it.next();
                C21221 c21221M33802 = c14163.m33802(c9378);
                if (c21221M33802 != null && c21221M33802.m48176().m8245() != c9378.f28486.f7168.m8245()) {
                    C17013 c17013 = c11139.f33425;
                    c17013.f52172 = c9378.f16085;
                    c9378.f28486.f7168 = new C19961(c17013).m46040((Object) null, c21221M33802.m48176());
                }
                c11139.f33432.m39197((AbstractC5144) c9378, c1755);
                if (!c9378.f28486.f7168.isEmpty()) {
                    C17013 c17014 = c11139.f33425;
                    c17014.f52172 = c9378.f16085;
                    c2609M46040 = new C19961(c17014).m46040((Object) null, c9378.f28486.f7168);
                } else {
                    c2609M46040 = C2609.m8239();
                }
                c14163.m33804(c21221M33802, c9378, c2609M46040);
            }
            m4344(c14163, c1755);
            for (AbstractC5144 abstractC5144 : c5557.f17179) {
                if (C7260.m19463(abstractC5144)) {
                    c11139.f33432.m39197(abstractC5144, c1755);
                }
            }
        }
    }
}
