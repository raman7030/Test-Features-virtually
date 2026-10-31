package l;

/* JADX INFO: renamed from: l.ۨ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11345 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11345 f33940 = new C11345();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f33941 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21781 f33942 = new C21781();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11345 m28053() {
        return f33940;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9374 m28054(Class cls) {
        C13997.m33482(cls, "messageType");
        ConcurrentMapC10942 concurrentMapC10942 = this.f33941;
        InterfaceC9374 interfaceC9374M49107 = (InterfaceC9374) concurrentMapC10942.get(cls);
        if (interfaceC9374M49107 == null) {
            interfaceC9374M49107 = this.f33942.m49107(cls);
            InterfaceC9374 interfaceC9374 = (InterfaceC9374) concurrentMapC10942.putIfAbsent(cls, interfaceC9374M49107);
            if (interfaceC9374 != null) {
                return interfaceC9374;
            }
        }
        return interfaceC9374M49107;
    }
}
