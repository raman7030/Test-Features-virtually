package p067l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5298 extends AbstractC17367 implements Predicate {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12004 f12460;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m11456or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C3088 mo11457(AbstractC6462 abstractC6462);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5298(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f12460 = c12004;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11458(final EnumC16696 enumC16696, final EnumC16696 enumC16697, final int... iArr) {
        this.f51770 = this.f51770.m10290(new Supplier() { // from class: l.᩶۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC5298 abstractC5298 = this.f67479;
                return C12004.m27490(abstractC5298.f12460, abstractC5298.f51772, C4848.m10276of((Object) enumC16696), enumC16697, iArr);
            }
        });
    }
}
