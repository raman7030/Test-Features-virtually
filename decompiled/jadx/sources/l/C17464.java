package l;

import net.engio.mbassy.bus.SyncMessageBus;

/* JADX INFO: renamed from: l.ܿܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17464 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f53375 = C11321.m27961(C17464.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SyncMessageBus f53376 = new SyncMessageBus(new C18170());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40833(AutoCloseable autoCloseable) {
        this.f53376.subscribe(autoCloseable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40834(InterfaceC16758 interfaceC16758) {
        this.f53376.publish(interfaceC16758);
    }
}
