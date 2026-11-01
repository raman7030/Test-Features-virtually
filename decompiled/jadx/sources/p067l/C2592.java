package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2592 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4284;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f4285;

    public /* synthetic */ C2592(int i, Object obj) {
        this.f4284 = i;
        this.f4285 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f4284) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m3893or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4284) {
            case 0:
                return C15993.m36347((String) obj).equals((String) this.f4285);
            default:
                return ((C23960) obj).m53080() == ((EnumC22620) this.f4285);
        }
    }
}
