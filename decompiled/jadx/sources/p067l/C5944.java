package p067l;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۘۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5944 {
    public static LongPredicate $default$and(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C12826.requireNonNull(longPredicate2);
        return new C14660(longPredicate, longPredicate2, 1);
    }

    public static LongPredicate $default$negate(LongPredicate longPredicate) {
        return new C18546(8, longPredicate);
    }

    public static LongPredicate $default$or(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C12826.requireNonNull(longPredicate2);
        return new C14660(longPredicate, longPredicate2, 0);
    }
}
