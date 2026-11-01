package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۡۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10638 {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C12826.requireNonNull(intPredicate2);
        return new C21367(intPredicate, intPredicate2, 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new C18546(7, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C12826.requireNonNull(intPredicate2);
        return new C21367(intPredicate, intPredicate2, 0);
    }
}
