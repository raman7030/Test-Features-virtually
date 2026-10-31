package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23159 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74444;

    public /* synthetic */ C23159(int i) {
        this.f74444 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f74444) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f74444) {
            case 0:
                return C11003.nonNull((C21916) obj);
            case 1:
                return C3643.f11496.matcher((String) obj).matches();
            default:
                return ((AbstractC19669) obj).m14709(EnumC18550.f57566);
        }
    }
}
