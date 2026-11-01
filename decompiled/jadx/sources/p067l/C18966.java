package p067l;

import net.engio.mbassy.bus.SyncMessageBus;

/* JADX INFO: renamed from: l.ܿܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18966 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC4410 f56562 = C13128.m30022(C18966.class);

    /* JADX INFO: renamed from: ֫ */
    public SyncMessageBus f56563 = new SyncMessageBus(new C19637());

    /* JADX INFO: renamed from: ֫ */
    public final void m43091(AutoCloseable autoCloseable) {
        this.f56563.subscribe(autoCloseable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43092(InterfaceC18295 interfaceC18295) {
        this.f56563.publish(interfaceC18295);
    }
}
