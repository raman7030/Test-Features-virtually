package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3083 extends AbstractC15782 implements Predicate {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f9657;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C0758 mo9414(AbstractC4308 abstractC4308);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3083(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f9657 = c10139;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9415(final EnumC15076 enumC15076, final EnumC15076 enumC15077, final int... iArr) {
        this.f48631 = this.f48631.m8246(new Supplier() { // from class: l.᩶۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC3083 abstractC3083 = this.f64837;
                return C10139.m25471(abstractC3083.f9657, abstractC3083.f48633, C2609.of((Object) enumC15076), enumC15077, iArr);
            }
        });
    }
}
