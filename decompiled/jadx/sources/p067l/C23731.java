package p067l;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23731 {

    /* JADX INFO: renamed from: ܳ */
    public static final HashMap f75508 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f75509 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 f75510;

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 f75511 = new FutureC5767();

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 f75512;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f75513;

    public C23731(InterfaceC22097 interfaceC22097, FutureC5767 futureC5767) {
        this.f75510 = interfaceC22097;
        this.f75512 = futureC5767;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23731 m52765(InterfaceC22097 interfaceC22097) {
        C23731 c23731;
        InterfaceC22097 interfaceC22097Normalize = interfaceC22097.toAbsolutePath().normalize();
        HashMap map = f75508;
        synchronized (map) {
            C23731 c23732 = (C23731) map.get(interfaceC22097Normalize);
            c23731 = new C23731(interfaceC22097Normalize, c23732 == null ? FutureC5767.m12882(null) : c23732.f75511);
            map.put(interfaceC22097Normalize, c23731);
        }
        return c23731;
    }

    /* JADX INFO: renamed from: ۧ */
    public static FutureC5767 m52767(InterfaceC22097 interfaceC22097) {
        FutureC5767 futureC5767M12875;
        final InterfaceC22097 interfaceC22097Normalize = interfaceC22097.toAbsolutePath().normalize();
        HashMap map = f75508;
        synchronized (map) {
            futureC5767M12875 = FutureC5767.m12875((FutureC5767[]) C7480.stream(map.entrySet()).filter(new Predicate() { // from class: l.۠ᩴᩳ
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
                public /* synthetic */ Predicate m23933or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC22097) ((Map.Entry) obj).getKey()).startsWith(interfaceC22097Normalize);
                }
            }).map(new C17024(0)).toArray(new C23061()));
        }
        return futureC5767M12875;
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m52768() {
        return this.f75512.m12898((InterfaceC22729) new C17520(8));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52769(Throwable th) {
        synchronized (this) {
            if (this.f75513) {
                return;
            }
            this.f75513 = true;
            this.f75512.m12887((InterfaceC9988) new C8463(this, th));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52766(C23731 c23731, Throwable th, Throwable th2) {
        HashMap map = f75508;
        synchronized (map) {
            C15525.remove(map, c23731.f75510, c23731);
        }
        if (th2 != null) {
            th = th2;
        }
        if (th == null) {
            c23731.f75511.m12889((Object) null);
        } else {
            c23731.f75511.m12891(th);
        }
    }
}
