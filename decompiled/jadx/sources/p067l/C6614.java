package p067l;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۙۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6614 implements IntUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntUnaryOperator f17060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntUnaryOperator f17061c;

    public /* synthetic */ C6614(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i) {
        this.f17059a = i;
        this.f17060b = intUnaryOperator;
        this.f17061c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.f17059a) {
            case 0:
                break;
        }
        return C17342.$default$andThen(this, intUnaryOperator);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.f17059a) {
            case 0:
                break;
        }
        return C17342.$default$compose(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.f17059a) {
            case 0:
                return this.f17061c.applyAsInt(this.f17060b.applyAsInt(i));
            default:
                return this.f17060b.applyAsInt(this.f17061c.applyAsInt(i));
        }
    }
}
