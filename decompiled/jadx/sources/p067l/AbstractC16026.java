package p067l;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16026 extends AbstractC17367 implements BiPredicate {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12004 f46405;

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C16001.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C16001.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ BiPredicate m36471or(BiPredicate biPredicate) {
        return C16001.$default$or(this, biPredicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16026(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f46405 = c12004;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36472(final EnumC16696 enumC16696, final EnumC16696 enumC16697, final EnumC16696 enumC16698, final int... iArr) {
        this.f51770 = this.f51770.m10290(new Supplier() { // from class: l.ᩳ۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC16026 abstractC16026 = this.f57864;
                return C12004.m27490(abstractC16026.f46405, abstractC16026.f51772, C4848.m10277of((Object) enumC16696, (Object) enumC16697), enumC16698, iArr);
            }
        });
    }
}
