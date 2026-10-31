package l;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.ۜۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6584 {
    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C11003.requireNonNull(doubleUnaryOperator2);
        return new C15049(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }

    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C11003.requireNonNull(doubleUnaryOperator2);
        return new C15049(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }
}
