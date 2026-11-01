package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19051 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56844;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f56844) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m43287or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f56844) {
            case 0:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            default:
                return ((C22536) obj).m50506();
        }
    }
}
