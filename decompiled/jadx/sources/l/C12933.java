package l;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.۬ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12933 implements LongPredicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongPredicate b;
    public final /* synthetic */ LongPredicate c;

    public /* synthetic */ C12933(LongPredicate longPredicate, LongPredicate longPredicate2, int i) {
        this.a = i;
        this.b = longPredicate;
        this.c = longPredicate2;
    }

    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C3762.$default$and(this, longPredicate);
    }

    public final /* synthetic */ LongPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return C3762.$default$negate(this);
    }

    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C3762.$default$or(this, longPredicate);
    }

    @Override // java.util.function.LongPredicate
    public final boolean test(long j) {
        switch (this.a) {
            case 0:
                return this.b.test(j) || this.c.test(j);
            default:
                return this.b.test(j) && this.c.test(j);
        }
    }
}
