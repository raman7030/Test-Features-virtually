package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17971 implements Predicate {
    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m40905or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC17043 abstractC17043 = (AbstractC17043) obj;
        if (!abstractC17043.mo25093()) {
            return false;
        }
        String name = abstractC17043.getName();
        return name.endsWith(".jks") || name.endsWith(".bks") || name.endsWith(".keystore");
    }
}
