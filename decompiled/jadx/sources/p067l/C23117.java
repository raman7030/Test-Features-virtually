package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23117 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72652;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f72652) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m51548or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f72652) {
            case 0:
                return !((InterfaceC19370) obj).mo39147();
            default:
                return ((String) obj).length() <= 2;
        }
    }
}
