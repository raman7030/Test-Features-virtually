package p067l;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.۬ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14660 implements LongPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongPredicate f41842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LongPredicate f41843c;

    public /* synthetic */ C14660(LongPredicate longPredicate, LongPredicate longPredicate2, int i) {
        this.f41841a = i;
        this.f41842b = longPredicate;
        this.f41843c = longPredicate2;
    }

    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        switch (this.f41841a) {
            case 0:
                break;
        }
        return C5944.$default$and(this, longPredicate);
    }

    public final /* synthetic */ LongPredicate negate() {
        switch (this.f41841a) {
            case 0:
                break;
        }
        return C5944.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ LongPredicate m33525or(LongPredicate longPredicate) {
        switch (this.f41841a) {
            case 0:
                break;
        }
        return C5944.$default$or(this, longPredicate);
    }

    @Override // java.util.function.LongPredicate
    public final boolean test(long j) {
        switch (this.f41841a) {
            case 0:
                return this.f41842b.test(j) || this.f41843c.test(j);
            default:
                return this.f41842b.test(j) && this.f41843c.test(j);
        }
    }
}
