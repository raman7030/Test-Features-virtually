package p067l;

/* JADX INFO: renamed from: l.ۨ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C13150 {

    /* JADX INFO: renamed from: ܽ */
    public static final C13150 f36938 = new C13150();

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f36939 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۧ */
    public final C23069 f36940 = new C23069();

    /* JADX INFO: renamed from: ֫ */
    public static C13150 m30098() {
        return f36938;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11277 m30099(Class cls) {
        C15671.m35602(cls, "messageType");
        ConcurrentMapC12768 concurrentMapC12768 = this.f36939;
        InterfaceC11277 interfaceC11277M51457 = (InterfaceC11277) concurrentMapC12768.get(cls);
        if (interfaceC11277M51457 == null) {
            interfaceC11277M51457 = this.f36940.m51457(cls);
            InterfaceC11277 interfaceC11277 = (InterfaceC11277) concurrentMapC12768.putIfAbsent(cls, interfaceC11277M51457);
            if (interfaceC11277 != null) {
                return interfaceC11277;
            }
        }
        return interfaceC11277M51457;
    }
}
