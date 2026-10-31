package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16133 extends AbstractC4140 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f49705;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f49706;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16133(C18957 c18957, boolean z, Predicate predicate, EnumC1317 enumC1317) {
        super(c18957, z);
        this.f49705 = predicate;
        this.f49706 = enumC1317;
    }

    @Override // l.AbstractC4140
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo8464(AbstractC19810 abstractC19810) {
        return abstractC19810.mo16064().mo20475(this.f49705, this.f49706);
    }
}
