package p067l;

/* JADX INFO: renamed from: l.ۙ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6784 implements InterfaceC20816 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8125 f17566;

    public C6784(C8125 c8125) {
        this.f17566 = c8125;
    }

    @Override // p067l.InterfaceC20816
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10002(Object obj, AbstractC20461 abstractC20461) {
        C10027 c10027;
        InterfaceC16136 interfaceC16136 = (InterfaceC16136) obj;
        InterfaceC21537 interfaceC21537 = this.f17566.f21413;
        if (interfaceC21537 == null) {
            c10027 = null;
        } else {
            C16113 c16113 = ((C13490) interfaceC21537).f37902;
            c16113.f47410 = interfaceC16136;
            C24713 c24713 = new C24713();
            c24713.setDuration(300L);
            c24713.setInterpolator(C1240.m23307(0.2f, 0.0f, 0.0f, 1.0f));
            C24870.m54627(c16113, c24713);
            c16113.requestLayout();
            c10027 = C10027.f27775;
        }
        return c10027 == EnumC9061.COROUTINE_SUSPENDED ? c10027 : C10027.f27775;
    }
}
