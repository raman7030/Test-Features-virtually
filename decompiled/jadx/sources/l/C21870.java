package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21870 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70037;

    public /* synthetic */ C21870(int i) {
        this.f70037 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f70037) {
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
        switch (this.f70037) {
            case 0:
                return ((int[]) ((Map.Entry) obj).getValue())[1] != -1;
            case 1:
                return C17315.m40626(((InterfaceC17889) obj).getPath());
            case 2:
                return ((C16719) obj).mo29297() == EnumC6346.ERROR;
            case 3:
                return ((InterfaceC17940) obj) == EnumC9474.OVERRIDE_READ_ONLY;
            default:
                return C11003.nonNull(obj);
        }
    }
}
