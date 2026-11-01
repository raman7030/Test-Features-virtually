package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17653 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52731;

    public /* synthetic */ C17653(int i) {
        this.f52731 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f52731) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m40174or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f52731) {
            case 0:
                return C12826.nonNull((C20337) obj);
            case 1:
                return ((C10674) obj).m24570();
            default:
                return C9268.m21395((AbstractC7257) ((C20391) obj).f63044.f11034);
        }
    }
}
