package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962 extends AbstractC6303 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ Predicate f11299;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractC12224 f11300;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ EnumC3620 f11301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4962(C20385 c20385, boolean z, AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        super(c20385, z);
        this.f11300 = abstractC12224;
        this.f11299 = predicate;
        this.f11301 = enumC3620;
    }

    @Override // p067l.AbstractC6303
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo10511(AbstractC21195 abstractC21195) {
        return abstractC21195.mo17983().mo22457(this.f11300, this.f11299, this.f11301);
    }
}
