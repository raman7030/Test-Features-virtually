package p067l;

import java.util.HashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7288 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19022;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f19023;

    public /* synthetic */ C7288(int i, Object obj) {
        this.f19022 = i;
        this.f19023 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f19022) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m16740or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f19022) {
            case 0:
                return ((C15419) obj).f44088.equals((String) this.f19023);
            case 1:
                return C4361.m9084((HashMap) this.f19023, (InterfaceC5096) obj);
            default:
                return C9268.m21428(((C22403) obj).f70670) == ((AbstractC12224) this.f19023);
        }
    }
}
