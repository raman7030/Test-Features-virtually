package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C22448 extends AbstractC5515 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f72708;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22448(C11139 c11139) {
        super(c11139, EnumC12075.HEADER_PHASE, new C1966(c11139));
        this.f72708 = c11139;
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫ */
    public final void mo6476(C1755 c1755) {
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        C1755 c1755M15646 = AbstractC5515.m15646(c1755, c5557);
        AbstractC12612 abstractC12612 = c5557.f17184;
        C11139 c11139 = this.f72708;
        if (abstractC12612 != null) {
            c11139.f33441.m32408(c5557.f17184, c1755M15646, c14163, c5557);
        }
        Iterator it = c5557.f17183.iterator();
        while (it.hasNext()) {
            c11139.f33441.m32408((AbstractC12612) it.next(), c1755M15646, c14163, c5557);
        }
        c11139.f33441.m32413();
        m15648(c1755, c1755M15646);
        HashSet hashSet = new HashSet();
        for (AbstractC12612 abstractC12613 : c5557.f17183) {
            AbstractC4308 abstractC4308 = abstractC12613.f16086;
            if (abstractC4308.m12913(EnumC9454.CLASS)) {
                c11139.f33426.m36154(abstractC12613, c11139.f33442.m17519(abstractC4308), hashSet);
            }
        }
        c11139.f33441.m32406(c5557.f17181.f7168, c1755M15646, c14163, c5557);
        c11139.f33427.m23943(c5557.f17185, c1755M15646, false);
        Iterator it2 = c5557.f17185.iterator();
        while (it2.hasNext()) {
            c11139.f33441.m32408((C14315) it2.next(), c1755M15646, c14163, c5557);
        }
        AbstractC5698 abstractC5698 = c14163.f17561;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4579;
        if (enumC1296 == enumC1297 && abstractC5698 != c1755.f6075.f4739.f918 && c11139.f33440.m47268(c1755.f6075.f4739, c14163.f42767)) {
            C22364 c22364 = c11139.f33430;
            int i = c5557.f16085;
            EnumC8352 enumC8352M49076 = C21758.m49076(c14163);
            C12281 c12281 = C6241.f19132;
            c22364.m7269(i, new C12281("compiler", "clash.with.pkg.of.same.name", enumC8352M49076, c14163));
        }
        if (c14163.f17561.f17559 == enumC1297 && (c14163.f17563 & 1) == 0 && !c1755.f6075.f4745.mo21322(c14163.f17562.toString(), EnumC16866.SOURCE)) {
            c14163.f17563 |= 17592186044416L;
        }
    }
}
