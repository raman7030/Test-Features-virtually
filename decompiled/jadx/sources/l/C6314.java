package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۛ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6314 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f19557 = new AtomicReference();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile C6314 f19558;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f19559 = new ConcurrentMapC10942(20);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6314 m17441() {
        if (f19558 == null) {
            synchronized (C6314.class) {
                if (f19558 == null) {
                    f19558 = new C6314();
                }
            }
        }
        return f19558;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11959 m17443(C8806 c8806) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f19559;
        InterfaceC11959 interfaceC11959 = (InterfaceC11959) concurrentMapC10942.get(c8806);
        if (interfaceC11959 != null) {
            return interfaceC11959;
        }
        InterfaceC10548 interfaceC10548 = (InterfaceC10548) f19557.get();
        InterfaceC11959 interfaceC11959M26532 = interfaceC10548 != null ? interfaceC10548.m26532() : null;
        if (interfaceC11959M26532 == null) {
            interfaceC11959M26532 = new C12664(c8806);
        }
        concurrentMapC10942.putIfAbsent(c8806, interfaceC11959M26532);
        return (InterfaceC11959) concurrentMapC10942.get(c8806);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17442(C8806 c8806) {
        this.f19559.remove(c8806);
    }
}
