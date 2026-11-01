package p067l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9298 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25276;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ CharSequence f25277;

    public /* synthetic */ C9298(int i, CharSequence charSequence) {
        this.f25276 = i;
        this.f25277 = charSequence;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f25276) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m21511or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f25276) {
            case 0:
                return ((String) ((Map.Entry) obj).getKey()).startsWith((String) this.f25277);
            default:
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.mo18002() == ((AbstractC12224) this.f25277);
        }
    }
}
