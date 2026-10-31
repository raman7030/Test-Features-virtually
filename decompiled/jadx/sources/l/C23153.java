package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes.dex */
public final class C23153 extends AbstractC5515 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f74417;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23153(C11139 c11139) {
        super(c11139, EnumC12075.HIERARCHY_PHASE, new C22448(c11139));
        this.f74417 = c11139;
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫ */
    public final void mo6476(C1755 c1755) {
        C5557 c5557 = c1755.f6079;
        if (!c5557.f17186.f17562.isEmpty() || c5557.f17186.m16090()) {
            C11139 c11139 = this.f74417;
            Iterator it = c11139.f33442.m17565(c5557.f17186.f17560).iterator();
            while (it.hasNext()) {
                AbstractC19810 abstractC19810 = ((AbstractC4308) it.next()).f13890;
                if (abstractC19810.f17559 == EnumC1296.f4582) {
                    C14163 c14163 = (C14163) abstractC19810;
                    C1755 c1755M39519 = c11139.f33445.f41160.m39519(c14163);
                    if (c14163.m16100() && !c14163.f42764 && c1755M39519 != null && c1755M39519.f6075 == c1755.f6075) {
                        c14163.f42765 = c14163.f42765.m8242(c5557.f17186);
                    }
                }
            }
        }
    }
}
