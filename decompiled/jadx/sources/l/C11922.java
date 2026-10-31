package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11922 implements Predicate {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35639;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35640;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35641;

    public /* synthetic */ C11922(int i, Object obj, Object obj2) {
        this.f35640 = i;
        this.f35641 = obj;
        this.f35639 = obj2;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f35640) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35640) {
            case 0:
                C9310 c9310 = (C9310) this.f35641;
                AbstractC4308 abstractC4308 = (AbstractC4308) this.f35639;
                AbstractC4308 abstractC4309 = (AbstractC4308) obj;
                c9310.getClass();
                if (abstractC4309.m12913(EnumC9454.INT)) {
                    C6319 c6319 = c9310.f28251;
                    if (c6319.m17531(abstractC4309, abstractC4308, c6319.f19598)) {
                        return true;
                    }
                }
                return false;
            default:
                C11659 c11659 = (C11659) this.f35641;
                return c11659.f34763.test(obj, (C2609) this.f35639);
        }
    }
}
