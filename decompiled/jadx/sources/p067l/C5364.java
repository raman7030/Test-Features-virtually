package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5364 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12648;

    public /* synthetic */ C5364(int i) {
        this.f12648 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f12648) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m11625or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f12648) {
            case 0:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            case 1:
                return ((C5738) obj).isDirectory();
            case 2:
                return ((AbstractC21062) obj).m16617(EnumC19998.f60740);
            default:
                return C18743.exists(((InterfaceC22097) obj).resolve("module-info.java"), new EnumC16060[0]);
        }
    }
}
