package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17280 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f51511;

    public /* synthetic */ C17280(int i) {
        this.f51511 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f51511) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m39152or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f51511) {
            case 0:
                return ((AbstractC10576) obj).mo5532();
            case 1:
                String lowerCase = ((AbstractC17043) obj).getName().toLowerCase();
                return lowerCase.endsWith(".pk8") || lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc");
            case 2:
                return ((EnumC17248) obj).m39033();
            case 3:
                return ((AbstractC6462) obj).mo14790();
            default:
                return ((AbstractC7257) obj).m16617(EnumC19998.f60802);
        }
    }
}
