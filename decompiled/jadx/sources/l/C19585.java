package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19585 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC18879 f63277;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f63278;

    public C19585(AbstractC5698 abstractC5698, EnumC18879 enumC18879) {
        this.f63277 = enumC18879;
        this.f63278 = abstractC5698;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19585(AbstractC5698 abstractC5698, final C12364 c12364) {
        EnumC18879 enumC18879;
        int i = C15622.f48100[abstractC5698.f17559.ordinal()];
        if (i == 4 || i == 5) {
            enumC18879 = (EnumC18879) C5378.stream(c12364.f37058).filter(new Predicate() { // from class: l.ܺܽ۠
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

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C13069 c13069 = (C13069) obj;
                    return c13069.m31667() && c13069.f39141 == c12364.f37061;
                }
            }).map(new C2651()).reduce(new C4062()).orElse(EnumC18879.UNDEFINED);
        } else {
            enumC18879 = EnumC18879.UNDEFINED;
        }
        this(abstractC5698, enumC18879);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45024() {
        return this.f63277 != EnumC18879.UNDEFINED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45023(EnumC18879 enumC18879) {
        return this.f63277 == enumC18879;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45022() {
        int[] iArr = C15622.f48100;
        AbstractC5698 abstractC5698 = this.f63278;
        int i = iArr[abstractC5698.f17559.ordinal()];
        if (i != 1) {
            if (i == 3) {
                C6720 c6720 = (C6720) abstractC5698.mo7048();
                String strM48696 = EnumC21537.ARITY_MISMATCH.m48696();
                C7425[] c7425Arr = new C7425[0];
                C16719 c16719 = (C16719) c6720.mo1315().f74208;
                Object[] objArrM39354 = c16719.m39354();
                if (c16719.mo29298().matches(strM48696) && c16719.m39354().length == 0) {
                    for (int i2 = 0; i2 < objArrM39354.length; i2++) {
                        if (c7425Arr[i2].mo19958(objArrM39354[i2])) {
                        }
                    }
                }
            } else if (i == 6) {
                return C8837.m22829(((C8837) abstractC5698.mo7048()).m22831()).isEmpty();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19585 m45021(AbstractC5698 abstractC5698) {
        return new C19585(abstractC5698, EnumC18879.UNDEFINED);
    }
}
