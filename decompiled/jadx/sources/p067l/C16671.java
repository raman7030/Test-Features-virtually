package p067l;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.ܶۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16671 implements DoubleUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DoubleUnaryOperator f49054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DoubleUnaryOperator f49055c;

    public /* synthetic */ C16671(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i) {
        this.f49053a = i;
        this.f49054b = doubleUnaryOperator;
        this.f49055c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f49053a) {
            case 0:
                break;
        }
        return C8626.$default$andThen(this, doubleUnaryOperator);
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f49053a) {
            case 0:
                break;
        }
        return C8626.$default$compose(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        switch (this.f49053a) {
            case 0:
                return this.f49054b.applyAsDouble(this.f49055c.applyAsDouble(d));
            default:
                return this.f49055c.applyAsDouble(this.f49054b.applyAsDouble(d));
        }
    }
}
