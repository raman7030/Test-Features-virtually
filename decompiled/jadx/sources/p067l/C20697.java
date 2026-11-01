package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20697 {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        C12826.requireNonNull(predicate2);
        return new C11979(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C18546(9, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        C12826.requireNonNull(predicate2);
        return new C11979(predicate, predicate2, 1);
    }
}
