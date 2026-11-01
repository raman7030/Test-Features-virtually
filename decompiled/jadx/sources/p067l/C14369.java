package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14369 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f41078;

    public /* synthetic */ C14369(int i) {
        this.f41078 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f41078) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m32970or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f41078) {
            case 0:
                return !((AbstractC6462) obj).m14777(EnumC11353.BOT);
            default:
                return ((C15828) obj).f20405 == EnumC3600.f7354;
        }
    }
}
