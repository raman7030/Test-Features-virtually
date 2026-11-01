package p067l;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.ۜۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8626 {
    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C12826.requireNonNull(doubleUnaryOperator2);
        return new C16671(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }

    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C12826.requireNonNull(doubleUnaryOperator2);
        return new C16671(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }
}
