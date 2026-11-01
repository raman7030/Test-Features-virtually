package p067l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17367 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12004 f51769;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12224 f51772;

    /* JADX INFO: renamed from: ᩸ */
    public C18189 f51771 = C18189.empty();

    /* JADX INFO: renamed from: ᩶ */
    public C4848 f51770 = C4848.m10283();

    public AbstractC17367(C12004 c12004, EnumC19998 enumC19998) {
        this.f51769 = c12004;
        this.f51772 = c12004.m27501(enumC19998);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3088 m39363(Predicate predicate) {
        return (C3088) C18486.m42024of((Object[]) this.f51771.orElseGet(new Supplier() { // from class: l.ۢ۟֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC17367.m39362(this.f31562);
            }
        })).filter(predicate).findFirst().orElse(this.f51769.f33479);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3088[] m39362(AbstractC17367 abstractC17367) {
        C3088[] c3088Arr = (C3088[]) C7480.stream(abstractC17367.f51770).map(new C18117(1)).toArray(new C10663());
        abstractC17367.f51771 = C18189.m41402of(c3088Arr);
        abstractC17367.f51770 = null;
        return c3088Arr;
    }
}
