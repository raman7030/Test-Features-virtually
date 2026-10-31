package l;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ᩴۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18579 {
    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        C11003.requireNonNull(longUnaryOperator2);
        return new C12228(longUnaryOperator, longUnaryOperator2, 1);
    }

    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        C11003.requireNonNull(longUnaryOperator2);
        return new C12228(longUnaryOperator, longUnaryOperator2, 0);
    }
}
