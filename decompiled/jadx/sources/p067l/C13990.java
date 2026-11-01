package p067l;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.۫ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13990 implements LongUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongUnaryOperator f39487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LongUnaryOperator f39488c;

    public /* synthetic */ C13990(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int i) {
        this.f39486a = i;
        this.f39487b = longUnaryOperator;
        this.f39488c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.f39486a) {
            case 0:
                break;
        }
        return C20026.$default$andThen(this, longUnaryOperator);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.f39486a) {
            case 0:
                break;
        }
        return C20026.$default$compose(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        switch (this.f39486a) {
            case 0:
                return this.f39488c.applyAsLong(this.f39487b.applyAsLong(j));
            default:
                return this.f39487b.applyAsLong(this.f39488c.applyAsLong(j));
        }
    }
}
