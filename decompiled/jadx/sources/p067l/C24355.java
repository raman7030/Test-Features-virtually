package p067l;

import android.app.ActivityManager;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24355 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f77127;

    public /* synthetic */ C24355(int i) {
        this.f77127 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f77127) {
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
    public /* synthetic */ Predicate m53707or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f77127) {
            case 0:
                return !((String) obj).isEmpty();
            case 1:
                return ActivityC15577.m35427((ActivityManager.AppTask) obj);
            case 2:
                return ((AbstractC7783) obj).f20405 == EnumC3600.f7354;
            case 3:
                return C5473.m12076((C2417) obj);
            default:
                C9794 c9794 = (C9794) obj;
                c9794.mo18020();
                c9794.mo18020();
                return !c9794.f27061.m22460();
        }
    }
}
