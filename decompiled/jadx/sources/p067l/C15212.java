package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15212 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f43397;

    public /* synthetic */ C15212(int i) {
        this.f43397 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f43397) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m34668or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f43397) {
            case 0:
                AbstractC17043 abstractC17043 = (AbstractC17043) obj;
                return abstractC17043.mo25093() && abstractC17043.getName().toLowerCase().endsWith(".mtd");
            default:
                return C12826.nonNull((C12237) obj);
        }
    }
}
