package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۡۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8701 {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C11003.requireNonNull(intPredicate2);
        return new C19990(intPredicate, intPredicate2, 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new C17022(7, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C11003.requireNonNull(intPredicate2);
        return new C19990(intPredicate, intPredicate2, 0);
    }
}
