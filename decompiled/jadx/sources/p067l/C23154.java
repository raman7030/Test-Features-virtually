package p067l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23154 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72747;

    public /* synthetic */ C23154(int i) {
        this.f72747 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f72747) {
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
    public /* synthetic */ Predicate m51606or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f72747) {
            case 0:
                return ((int[]) ((Map.Entry) obj).getValue())[1] != -1;
            case 1:
                return C18825.m42877(((InterfaceC19370) obj).getPath());
            case 2:
                return ((C18258) obj).mo31352() == EnumC8400.ERROR;
            case 3:
                return ((InterfaceC19418) obj) == EnumC11372.OVERRIDE_READ_ONLY;
            default:
                return C12826.nonNull(obj);
        }
    }
}
