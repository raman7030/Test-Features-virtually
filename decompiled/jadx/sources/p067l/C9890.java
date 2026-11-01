package p067l;

/* JADX INFO: renamed from: l.۠ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9890 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AbstractActivityC5549 f27416;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C21291 f27417;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ DialogInterfaceC2564 f27418;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C9662 f27419;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9890(C21291 c21291, AbstractActivityC5549 abstractActivityC5549, C9662 c9662, AbstractActivityC5549 abstractActivityC55410, DialogInterfaceC2564 dialogInterfaceC2564) {
        super(abstractActivityC5549, -1);
        this.f27417 = c21291;
        this.f27419 = c9662;
        this.f27416 = abstractActivityC55410;
        this.f27418 = dialogInterfaceC2564;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (strTrim.equals(this.f27419.m22508())) {
            m33348();
        } else {
            new C3184(this, strTrim).m22250();
        }
    }
}
