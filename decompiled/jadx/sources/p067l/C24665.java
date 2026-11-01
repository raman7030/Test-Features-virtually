package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24665 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78039;

    public /* synthetic */ C24665(int i) {
        this.f78039 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f78039) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m54305or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f78039) {
            case 0:
                return ((AbstractC21062) obj).mo32949();
            case 1:
                String str = (String) obj;
                return C18524.m42130(str) || C18524.m42120(str);
            case 2:
                return (((C22536) obj).f71074.f20409 & 16777216) != 0;
            default:
                return ((AbstractC21062) obj).m47512();
        }
    }
}
