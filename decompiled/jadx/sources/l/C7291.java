package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7291 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22385;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f22386;

    public /* synthetic */ C7291(int i, CharSequence charSequence) {
        this.f22385 = i;
        this.f22386 = charSequence;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f22385) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f22385) {
            case 0:
                return ((String) ((Map.Entry) obj).getKey()).startsWith((String) this.f22386);
            default:
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.mo16083() == ((AbstractC10370) this.f22386);
        }
    }
}
