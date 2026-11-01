package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֨۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public class C3423 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۛ */
    public EnumC15511 f6818;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC14355 f6819;

    /* JADX INFO: renamed from: ۤ */
    public C4036 f6820;

    /* JADX INFO: renamed from: ۨ */
    public HashSet f6821;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C14152 f6822;

    /* JADX INFO: renamed from: ᩺ */
    public C7447 f6823;

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        return "DeferredType";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3423(C14152 c14152, AbstractC14355 abstractC14355, C4036 c4036) {
        super(null, C22082.f69463);
        this.f6822 = c14152;
        this.f6821 = new HashSet();
        this.f6819 = abstractC14355;
        c14152.f40365.getClass();
        this.f6820 = C11216.m25928(c4036);
        this.f6823 = new C7447();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        throw new AssertionError("Cannot add metadata to a deferred type");
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.DEFERRED;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo6078(AbstractC7783 abstractC7783, EnumC18298 enumC18298) {
        C2752 c2752M17196 = this.f6823.m17196(abstractC7783, enumC18298);
        return c2752M17196 != null ? c2752M17196.f4637.f18925 : AbstractC6462.f16700;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 mo6081(C8788 c8788) {
        C2752 c2752M17196 = this.f6823.m17196(c8788.f23847, c8788.f23844);
        return c2752M17196 != null ? c2752M17196.f4637 : this.f6822.f40369;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo6080(C24626 c24626, C8788 c8788) {
        int iOrdinal = c8788.f23845.ordinal();
        C4036 c4036 = this.f6820;
        AbstractC14355 abstractC14355 = this.f6819;
        C14152 c14152 = this.f6822;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C1446.m31704(this.f6818 != null);
                return c14152.f40365.m25939(abstractC14355, c4036, c24626);
            }
            C1446.m31698();
            throw null;
        }
        EnumC15511 enumC15511 = this.f6818;
        C1446.m31704(enumC15511 == null || enumC15511 == EnumC15511.SPECULATIVE);
        AbstractC7257 abstractC7257M32632 = c14152.m32632(abstractC14355, c4036, c24626, c14152.f40354, null, EnumC9477.SPECULATIVE, null);
        this.f6823.m17197(abstractC7257M32632, c24626);
        return abstractC7257M32632.f18925;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m6079(C24626 c24626) {
        InterfaceC20859 c23540;
        AbstractC6462 abstractC6462 = c24626.f77965;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        boolean zM14777 = abstractC6462.m14777(EnumC11353.NONE);
        C14152 c14152 = this.f6822;
        if (zM14777 || c24626.f77965.mo14812()) {
            c23540 = c14152.f40359;
        } else if (interfaceC6125.mo6101().f23845 != EnumC15511.SPECULATIVE && !interfaceC6125.mo6101().m20325()) {
            c23540 = new C18175(c14152, c24626, this);
        } else {
            c23540 = new C23540(c14152, c24626, this);
        }
        return m6076(c24626, c23540);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 m6076(C24626 c24626, InterfaceC20859 interfaceC20859) {
        C8788 c8788Mo6101 = c24626.f77961.mo6101();
        C1446.m31704(c8788Mo6101 != this.f6822.f40370);
        if (interfaceC20859.mo30640()) {
            c8788Mo6101.mo20324(this, c24626, interfaceC20859);
            EnumC15511 enumC15511 = c8788Mo6101.f23845;
            EnumC15511 enumC15512 = EnumC15511.SPECULATIVE;
            if (enumC15511 == enumC15512) {
                this.f6821.add(c8788Mo6101.f23847);
                this.f6818 = enumC15512;
            }
            return AbstractC6462.f16700;
        }
        try {
            return mo6080(c24626, c8788Mo6101);
        } finally {
            this.f6818 = c8788Mo6101.f23845;
        }
    }
}
