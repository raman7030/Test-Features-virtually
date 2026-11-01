package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20982 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC20311 f65894;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7783 f65895;

    public C20982(AbstractC7783 abstractC7783, EnumC20311 enumC20311) {
        this.f65894 = enumC20311;
        this.f65895 = abstractC7783;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20982(AbstractC7783 abstractC7783, final C14119 c14119) {
        EnumC20311 enumC20311;
        int i = C17215.f51239[abstractC7783.f20405.ordinal()];
        if (i == 4 || i == 5) {
            enumC20311 = (EnumC20311) C7480.stream(c14119.f40074).filter(new Predicate() { // from class: l.ܺܽ۠
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
                public /* synthetic */ Predicate m40150or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C14789 c14789 = (C14789) obj;
                    return c14789.m33755() && c14789.f42189 == c14119.f40077;
                }
            }).map(new C4888()).reduce(new C6229()).orElse(EnumC20311.UNDEFINED);
        } else {
            enumC20311 = EnumC20311.UNDEFINED;
        }
        this(abstractC7783, enumC20311);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47319() {
        return this.f65894 != EnumC20311.UNDEFINED;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47318(EnumC20311 enumC20311) {
        return this.f65894 == enumC20311;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47317() {
        int[] iArr = C17215.f51239;
        AbstractC7783 abstractC7783 = this.f65895;
        int i = iArr[abstractC7783.f20405.ordinal()];
        if (i != 1) {
            if (i == 3) {
                C8755 c8755 = (C8755) abstractC7783.mo9143();
                String strM51041 = EnumC22837.ARITY_MISMATCH.m51041();
                C9425[] c9425Arr = new C9425[0];
                C18258 c18258 = (C18258) c8755.mo3723().f76953;
                Object[] objArrM41590 = c18258.m41590();
                if (c18258.mo31353().matches(strM51041) && c18258.m41590().length == 0) {
                    for (int i2 = 0; i2 < objArrM41590.length; i2++) {
                        if (c9425Arr[i2].mo21932(objArrM41590[i2])) {
                        }
                    }
                }
            } else if (i == 6) {
                return C10767.m24799(((C10767) abstractC7783.mo9143()).m24801()).isEmpty();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20982 m47316(AbstractC7783 abstractC7783) {
        return new C20982(abstractC7783, EnumC20311.UNDEFINED);
    }
}
