package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6724 {

    /* JADX INFO: renamed from: ܽ */
    public static final Object f17454 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public C7350 f17455 = new C7350();

    /* JADX INFO: renamed from: ۧ */
    public WeakReference f17456 = new WeakReference(null);

    /* JADX INFO: renamed from: ֫ */
    public final void m15372(InterfaceC24784 interfaceC24784, InterfaceC21477 interfaceC21477) {
        C7350 c7350 = this.f17455;
        if (c7350.m4069()) {
            InterfaceC3326 interfaceC3326 = (InterfaceC3326) this.f17456.get();
            if (interfaceC3326 != null) {
                c7350.m4068(interfaceC3326);
                this.f17456.clear();
            }
            if (c7350.m4069()) {
                throw new RuntimeException();
            }
        }
        C23488 c23488 = new C23488(0, interfaceC21477);
        this.f17456 = new WeakReference(c23488);
        c7350.m4066(interfaceC24784, c23488);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15369(InterfaceC21477 interfaceC21477, Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = f17454;
        if (obj != obj2) {
            objArr[0] = obj2;
            interfaceC21477.mo15100(obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15370(Object obj) {
        this.f17455.mo4067(new Object[]{obj});
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15371(C10949 c10949) {
        this.f17455.mo4062(new Object[]{c10949});
    }
}
