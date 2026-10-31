package l;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14371 extends AbstractC15782 implements BiPredicate {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f43314;

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C14344.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C14344.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C14344.$default$or(this, biPredicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC14371(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f43314 = c10139;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34338(final EnumC15076 enumC15076, final EnumC15076 enumC15077, final EnumC15076 enumC15078, final int... iArr) {
        this.f48631 = this.f48631.m8246(new Supplier() { // from class: l.ᩳ۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC14371 abstractC14371 = this.f54667;
                return C10139.m25471(abstractC14371.f43314, abstractC14371.f48633, C2609.of((Object) enumC15076, (Object) enumC15077), enumC15078, iArr);
            }
        });
    }
}
