package p067l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12773 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35973 = 1;

    public /* synthetic */ C12773() {
    }

    public /* synthetic */ C12773(C22161 c22161) {
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f35973) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m29331or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35973) {
            case 0:
                return C22161.m49964((InterfaceC18983) obj);
            default:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
        }
    }
}
