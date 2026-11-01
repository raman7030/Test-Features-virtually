package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۛ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes2.dex */
public final class C8370 {

    /* JADX INFO: renamed from: ۧ */
    public static final AtomicReference f22428 = new AtomicReference();

    /* JADX INFO: renamed from: ܽ */
    public static volatile C8370 f22429;

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f22430 = new ConcurrentMapC12768(20);

    /* JADX INFO: renamed from: ֫ */
    public static C8370 m19381() {
        if (f22429 == null) {
            synchronized (C8370.class) {
                if (f22429 == null) {
                    f22429 = new C8370();
                }
            }
        }
        return f22429;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13735 m19383(C10738 c10738) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f22430;
        InterfaceC13735 interfaceC13735 = (InterfaceC13735) concurrentMapC12768.get(c10738);
        if (interfaceC13735 != null) {
            return interfaceC13735;
        }
        InterfaceC12394 interfaceC12394 = (InterfaceC12394) f22428.get();
        InterfaceC13735 interfaceC13735M28565 = interfaceC12394 != null ? interfaceC12394.m28565() : null;
        if (interfaceC13735M28565 == null) {
            interfaceC13735M28565 = new C14405(c10738);
        }
        concurrentMapC12768.putIfAbsent(c10738, interfaceC13735M28565);
        return (InterfaceC13735) concurrentMapC12768.get(c10738);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19382(C10738 c10738) {
        this.f22430.remove(c10738);
    }
}
