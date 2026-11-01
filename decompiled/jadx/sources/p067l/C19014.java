package p067l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19014 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f56679 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C10968 f56680;

    public C19014(C10968 c10968) {
        this.f56680 = c10968;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16331 m43186(C9566 c9566) {
        HashMap map = this.f56679;
        C16331 c16331 = (C16331) map.get(c9566);
        if (c16331 != null) {
            return c16331;
        }
        C16331 c16332 = new C16331(this.f56680.f30378.mo20691(), c9566);
        map.put(c9566, c16332);
        return c16332;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Collection m43185() {
        return this.f56679.values();
    }
}
