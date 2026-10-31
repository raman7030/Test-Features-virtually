package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ܳۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14344 {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C11003.requireNonNull(biPredicate2);
        return new C5173(biPredicate, biPredicate2, 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new C17022(6, biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C11003.requireNonNull(biPredicate2);
        return new C5173(biPredicate, biPredicate2, 0);
    }
}
