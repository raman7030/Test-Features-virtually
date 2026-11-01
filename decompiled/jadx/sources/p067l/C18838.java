package p067l;

/* JADX INFO: renamed from: l.ܿۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18838 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C0990 f56260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18838(AbstractActivityC5549 abstractActivityC5549, C0990 c0990) {
        super(abstractActivityC5549, -1);
        this.f56260 = c0990;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        C0990 c0990 = this.f56260;
        c0990.setTag(strTrim);
        c0990.setChecked(!strTrim.isEmpty());
        m33348();
    }
}
