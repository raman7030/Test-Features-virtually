package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16417 implements Predicate {
    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC15440 abstractC15440 = (AbstractC15440) obj;
        if (!abstractC15440.mo23119()) {
            return false;
        }
        String name = abstractC15440.getName();
        return name.endsWith(".jks") || name.endsWith(".bks") || name.endsWith(".keystore");
    }
}
