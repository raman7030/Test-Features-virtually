package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11979 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Predicate f33414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Predicate f33415c;

    public /* synthetic */ C11979(Predicate predicate, Predicate predicate2, int i) {
        this.f33413a = i;
        this.f33414b = predicate;
        this.f33415c = predicate2;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f33413a) {
            case 0:
                break;
        }
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo55838negate() {
        switch (this.f33413a) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m27413or(Predicate predicate) {
        switch (this.f33413a) {
            case 0:
                break;
        }
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f33413a) {
            case 0:
                return this.f33414b.test(obj) && this.f33415c.test(obj);
            default:
                return this.f33414b.test(obj) || this.f33415c.test(obj);
        }
    }
}
