package l;

import android.app.ActivityManager;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23134 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74381;

    public /* synthetic */ C23134(int i) {
        this.f74381 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f74381) {
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
        switch (this.f74381) {
            case 0:
                return !((String) obj).isEmpty();
            case 1:
                return ActivityC13898.m33308((ActivityManager.AppTask) obj);
            case 2:
                return ((AbstractC5698) obj).f17559 == EnumC1296.f4582;
            case 3:
                return C3267.m10043((C0052) obj);
            default:
                C7814 c7814 = (C7814) obj;
                c7814.mo16101();
                c7814.mo16101();
                return !c7814.f24145.m20480();
        }
    }
}
