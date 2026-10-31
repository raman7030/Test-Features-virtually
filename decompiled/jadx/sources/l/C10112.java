package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10112 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ C10112(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo4928negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.test(obj) && this.c.test(obj);
            default:
                return this.b.test(obj) || this.c.test(obj);
        }
    }
}
