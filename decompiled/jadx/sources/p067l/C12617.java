package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۧۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I7U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12617 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20664 f35412;

    /* JADX INFO: renamed from: ۧ */
    public Object f35413;

    /* JADX INFO: renamed from: ܳ */
    public int f35414;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20664 f35415;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC3899 f35416;

    /* JADX INFO: renamed from: ᩳ */
    public Object f35417;

    public C12617(Object obj, Looper looper, Looper looper2, C15849 c15849, InterfaceC3899 interfaceC3899) {
        this.f35412 = c15849.mo35964(looper, null);
        this.f35415 = c15849.mo35964(looper2, null);
        this.f35417 = obj;
        this.f35413 = obj;
        this.f35416 = interfaceC3899;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29031(InterfaceC18263 interfaceC18263, InterfaceC18263 interfaceC18264) {
        C23877.m52960(Looper.myLooper() == this.f35415.mo19711());
        this.f35414++;
        m29030((Runnable) new RunnableC22254(1, this, interfaceC18264));
        Object objApply = interfaceC18263.apply(this.f35417);
        Object obj = this.f35417;
        this.f35417 = objApply;
        if (obj.equals(objApply)) {
            return;
        }
        this.f35416.mo7705(obj, objApply);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29027(C12617 c12617, InterfaceC18263 interfaceC18263) {
        Object objApply = interfaceC18263.apply(c12617.f35413);
        c12617.f35413 = objApply;
        RunnableC8129 runnableC8129 = new RunnableC8129(1, c12617, objApply);
        InterfaceC20664 interfaceC20664 = c12617.f35415;
        if (interfaceC20664.mo19711().getThread().isAlive()) {
            interfaceC20664.mo19707(runnableC8129);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29028(C12617 c12617, Object obj) {
        int i = c12617.f35414 - 1;
        c12617.f35414 = i;
        if (i == 0) {
            Object obj2 = c12617.f35417;
            c12617.f35417 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c12617.f35416.mo7705(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29029(Object obj) {
        this.f35413 = obj;
        RunnableC19642 runnableC19642 = new RunnableC19642(1, this, obj);
        InterfaceC20664 interfaceC20664 = this.f35415;
        if (interfaceC20664.mo19711().getThread().isAlive()) {
            interfaceC20664.mo19707(runnableC19642);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29026(C12617 c12617, Object obj) {
        if (c12617.f35414 == 0) {
            Object obj2 = c12617.f35417;
            c12617.f35417 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c12617.f35416.mo7705(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29030(Runnable runnable) {
        InterfaceC20664 interfaceC20664 = this.f35412;
        if (interfaceC20664.mo19711().getThread().isAlive()) {
            interfaceC20664.mo19707(runnable);
        }
    }
}
