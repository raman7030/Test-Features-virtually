package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6635 {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicReference f17112 = new AtomicReference();

    /* JADX INFO: renamed from: ۧ */
    public static volatile InterfaceC5294 f17113;

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC5294 m15119() {
        if (f17113 == null) {
            synchronized (C6635.class) {
                if (f17113 == null) {
                    InterfaceC21388 interfaceC21388 = (InterfaceC21388) f17112.get();
                    InterfaceC5294 interfaceC5294M48465 = interfaceC21388 != null ? interfaceC21388.m48465() : null;
                    if (interfaceC5294M48465 == null) {
                        interfaceC5294M48465 = new C10067();
                    }
                    f17113 = interfaceC5294M48465;
                }
            }
        }
        return f17113;
    }
}
