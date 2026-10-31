package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0235 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1505;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1506;

    public /* synthetic */ C0235(int i, Object obj) {
        this.f1505 = i;
        this.f1506 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f1505) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1505) {
            case 0:
                return C14336.m34214((String) obj).equals((String) this.f1506);
            default:
                return ((C22719) obj).m50754() == ((EnumC21309) this.f1506);
        }
    }
}
