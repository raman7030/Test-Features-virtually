package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C19341 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public C2733 f57742;

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
    public /* synthetic */ Predicate m44082or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        return (abstractC6462.mo14812() || abstractC6462.m14792(this.f57742.f4594) || abstractC6462.m14777(EnumC11353.BOT)) ? false : true;
    }

    public C19341(C2733 c2733) {
        this.f57742 = c2733;
    }
}
