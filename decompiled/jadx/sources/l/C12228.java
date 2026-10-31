package l;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.۫ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12228 implements LongUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongUnaryOperator b;
    public final /* synthetic */ LongUnaryOperator c;

    public /* synthetic */ C12228(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int i) {
        this.a = i;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return C18579.$default$andThen(this, longUnaryOperator);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return C18579.$default$compose(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        switch (this.a) {
            case 0:
                return this.c.applyAsLong(this.b.applyAsLong(j));
            default:
                return this.b.applyAsLong(this.c.applyAsLong(j));
        }
    }
}
