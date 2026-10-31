package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f14285 = new AtomicReference();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC3078 f14286;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3078 m13237() {
        if (f14286 == null) {
            synchronized (C4489.class) {
                if (f14286 == null) {
                    InterfaceC20012 interfaceC20012 = (InterfaceC20012) f14285.get();
                    InterfaceC3078 interfaceC3078M46150 = interfaceC20012 != null ? interfaceC20012.m46150() : null;
                    if (interfaceC3078M46150 == null) {
                        interfaceC3078M46150 = new C8100();
                    }
                    f14286 = interfaceC3078M46150;
                }
            }
        }
        return f14286;
    }
}
