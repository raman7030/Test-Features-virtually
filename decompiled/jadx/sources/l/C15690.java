package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15690 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48373;

    public /* synthetic */ C15690(int i) {
        this.f48373 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f48373) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f48373) {
            case 0:
                return ((AbstractC8636) obj).mo3218();
            case 1:
                String lowerCase = ((AbstractC15440) obj).getName().toLowerCase();
                return lowerCase.endsWith(".pk8") || lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc");
            case 2:
                return ((EnumC15657) obj).m36867();
            case 3:
                return ((AbstractC4308) obj).mo12926();
            default:
                return ((AbstractC5144) obj).m14709(EnumC18550.f57578);
        }
    }
}
