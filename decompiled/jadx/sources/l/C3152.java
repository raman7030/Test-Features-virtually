package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3152 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9845;

    public /* synthetic */ C3152(int i) {
        this.f9845 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f9845) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f9845) {
            case 0:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            case 1:
                return ((C3545) obj).isDirectory();
            case 2:
                return ((AbstractC19669) obj).m14709(EnumC18550.f57516);
            default:
                return C17229.exists(((InterfaceC20758) obj).resolve("module-info.java"), new EnumC14406[0]);
        }
    }
}
