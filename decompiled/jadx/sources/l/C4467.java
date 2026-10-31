package l;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۙۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4467 implements IntUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntUnaryOperator b;
    public final /* synthetic */ IntUnaryOperator c;

    public /* synthetic */ C4467(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i) {
        this.a = i;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return C15755.$default$andThen(this, intUnaryOperator);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return C15755.$default$compose(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                return this.c.applyAsInt(this.b.applyAsInt(i));
            default:
                return this.b.applyAsInt(this.c.applyAsInt(i));
        }
    }
}
