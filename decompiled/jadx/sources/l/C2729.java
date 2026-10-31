package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2729 extends AbstractC4140 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f8504;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10370 f8505;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f8506;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2729(C18957 c18957, boolean z, AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        super(c18957, z);
        this.f8505 = abstractC10370;
        this.f8504 = predicate;
        this.f8506 = enumC1317;
    }

    @Override // l.AbstractC4140
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterable mo8464(AbstractC19810 abstractC19810) {
        return abstractC19810.mo16064().mo20477(this.f8505, this.f8504, this.f8506);
    }
}
