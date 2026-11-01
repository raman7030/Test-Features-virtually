package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14788 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f42185;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f42186;

    public /* synthetic */ C14788(int i, Object obj) {
        this.f42185 = i;
        this.f42186 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f42185) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m33754or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f42185) {
            case 0:
                return ((String) obj).startsWith((String) this.f42186);
            case 1:
                return ((String) this.f42186).equals(((C2600) obj).f4299);
            default:
                Predicate predicate = (Predicate) this.f42186;
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return !abstractC7783.f20407.m17989() && (predicate == null || predicate.test(abstractC7783));
        }
    }
}
