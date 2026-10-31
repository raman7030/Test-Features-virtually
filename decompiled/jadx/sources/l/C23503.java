package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩻ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public class C23503 extends C14330 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f75454;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumSet f75455;

    public C23503(C6735 c6735, C0779 c0779, EnumC19125 enumC19125, EnumC19125... enumC19125Arr) {
        this(c6735, c0779, EnumSet.of(enumC19125, enumC19125Arr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23503(C6735 c6735, C0779 c0779, EnumSet enumSet) {
        super(c6735, c0779, c0779.m2971(), EnumC19125.f60275);
        this.f75454 = c6735;
        this.f75455 = enumSet;
    }

    @Override // l.C14330, l.AbstractC21387
    /* JADX INFO: renamed from: ֫ */
    public AbstractC21387 mo7602(C0779 c0779) {
        return new C23503(this.f75454, c0779, this.f75455);
    }

    @Override // l.C14330
    /* JADX INFO: renamed from: ֫ */
    public final EnumSet mo7601() {
        return this.f75455;
    }

    @Override // l.C14330
    /* JADX INFO: renamed from: ֫ */
    public final void mo34202(EnumC19125 enumC19125, EnumC19125 enumC19126) {
        C5931 c5931 = this.f75454.f20932;
        int i = C1631.f5723[enumC19126.ordinal()];
        C0779 c0779 = this.f68886;
        if (i == 1) {
            AbstractC4308 abstractC4308M2971 = c0779.m2971();
            C2609 c2609M2963 = c0779.m2963(enumC19126);
            C11576 c11576 = C11886.f35440;
            throw C6735.m18338(c5931.m16617(new C11576("compiler", "inferred.do.not.conform.to.eq.bounds", abstractC4308M2971, c2609M2963)));
        }
        if (i == 2) {
            AbstractC4308 abstractC4308M2972 = c0779.m2971();
            C2609 c2609M2964 = c0779.m2963(enumC19126);
            C11576 c11577 = C11886.f35440;
            throw C6735.m18338(c5931.m16617(new C11576("compiler", "inferred.do.not.conform.to.lower.bounds", abstractC4308M2972, c2609M2964)));
        }
        if (i != 3) {
            return;
        }
        AbstractC4308 abstractC4308M2973 = c0779.m2971();
        C2609 c2609M2965 = c0779.m2963(enumC19126);
        C11576 c11578 = C11886.f35440;
        throw C6735.m18338(c5931.m16617(new C11576("compiler", "inferred.do.not.conform.to.upper.bounds", abstractC4308M2973, c2609M2965)));
    }
}
