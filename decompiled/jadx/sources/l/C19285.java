package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19285 {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        C11003.requireNonNull(predicate2);
        return new C10112(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C17022(9, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        C11003.requireNonNull(predicate2);
        return new C10112(predicate, predicate2, 1);
    }
}
