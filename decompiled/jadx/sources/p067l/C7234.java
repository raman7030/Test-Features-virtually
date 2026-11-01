package p067l;

/* JADX INFO: renamed from: l.ۚۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C7234 implements InterfaceC6996 {
    @Override // p067l.InterfaceC6996
    /* JADX INFO: renamed from: ֫ */
    public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        C10603 c10603 = (C10603) abstractC2555;
        InterfaceC3881 interfaceC3881Mo23970 = interfaceC5655.mo12595().m46079().mo23970(C10603.class);
        if (interfaceC3881Mo23970 == null) {
            interfaceC5655.mo12594(c10603);
            return;
        }
        int length = interfaceC5655.length();
        interfaceC5655.mo12594(c10603);
        if (length == interfaceC5655.length()) {
            interfaceC5655.builder().append((char) 65532);
        }
        C20408 c20408Mo12595 = interfaceC5655.mo12595();
        boolean z = c10603.mo3768() instanceof C4568;
        AbstractC13112 abstractC13112M46076 = c20408Mo12595.m46076();
        String strM24392 = c10603.m24392();
        abstractC13112M46076.getClass();
        InterfaceC15712 interfaceC15712Mo12591 = interfaceC5655.mo12591();
        AbstractC16817.f49560.m31139(interfaceC15712Mo12591, strM24392);
        AbstractC16817.f49562.m31139(interfaceC15712Mo12591, Boolean.valueOf(z));
        AbstractC16817.f49561.m31139(interfaceC15712Mo12591, null);
        interfaceC5655.mo12592(length, interfaceC3881Mo23970.mo7539(c20408Mo12595, interfaceC15712Mo12591));
    }
}
