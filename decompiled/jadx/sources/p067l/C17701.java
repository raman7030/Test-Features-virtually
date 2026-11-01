package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17701 extends AbstractC6303 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ Predicate f52871;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ EnumC3620 f52872;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17701(C20385 c20385, boolean z, Predicate predicate, EnumC3620 enumC3620) {
        super(c20385, z);
        this.f52871 = predicate;
        this.f52872 = enumC3620;
    }

    @Override // p067l.AbstractC6303
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo10511(AbstractC21195 abstractC21195) {
        return abstractC21195.mo17983().mo22455(this.f52871, this.f52872);
    }
}
