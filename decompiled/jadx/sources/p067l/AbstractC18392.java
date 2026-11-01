package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18392 extends C3423 {

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC14355 f54918;

    /* JADX INFO: renamed from: ۧ֫ */
    public Map f54919;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C7664 f54920;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18392 mo10549(C4036 c4036, AbstractC14355 abstractC14355);

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC6462 mo20830(C24626 c24626);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC18392(C7664 c7664, AbstractC14355 abstractC14355, C4036 c4036, AbstractC14355 abstractC14356, Map map) {
        this.f54920 = c7664;
        C14152 c14152 = c7664.f20104;
        C12826.requireNonNull(c14152);
        super(c14152, abstractC14355, c4036);
        this.f54918 = abstractC14356;
        this.f54919 = map;
    }

    @Override // p067l.C3423
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo6080(C24626 c24626, C8788 c8788) {
        AbstractC6462 abstractC6462Mo20830;
        if (c8788.f23845 == EnumC15511.SPECULATIVE) {
            if (c24626.f77965 == AbstractC6462.f16699) {
                abstractC6462Mo20830 = super.mo6080(c24626, c8788);
            } else {
                abstractC6462Mo20830 = mo20830(c24626);
            }
            this.f54919.put(c24626, abstractC6462Mo20830);
            return abstractC6462Mo20830;
        }
        if (!((C10545) this.f6820.f8849).f29199.f25979) {
            C7664 c7664 = this.f54920;
            c7664.f20100.remove(new C2969(c7664, this.f6819));
        }
        return super.mo6080(c24626, c8788);
    }

    @Override // p067l.C3423
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo6078(AbstractC7783 abstractC7783, EnumC18298 enumC18298) {
        if (this.f6821.contains(abstractC7783)) {
            return super.mo6078(abstractC7783, enumC18298);
        }
        for (Map.Entry entry : this.f54919.entrySet()) {
            C8788 c8788Mo6101 = ((C24626) entry.getKey()).f77961.mo6101();
            if (c8788Mo6101.f23844 == enumC18298 && c8788Mo6101.f23847 == abstractC7783) {
                return (AbstractC6462) entry.getValue();
            }
        }
        return AbstractC6462.f16700;
    }

    @Override // p067l.C3423
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 mo6081(C8788 c8788) {
        if (this.f6821.contains(c8788.f23847)) {
            return super.mo6081(c8788);
        }
        return this.f54918;
    }
}
