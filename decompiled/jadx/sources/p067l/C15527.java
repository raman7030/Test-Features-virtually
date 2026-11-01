package p067l;

/* JADX INFO: renamed from: l.ܰ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes4.dex */
public final class C15527 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ boolean f44363;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C4110 f44364;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15527(C4110 c4110, AbstractActivityC5549 abstractActivityC5549, boolean z) {
        super(abstractActivityC5549, -1);
        this.f44364 = c4110;
        this.f44363 = z;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        if (m33346().isEmpty()) {
            m33348();
        } else {
            new C24245(this).m22250();
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۖ */
    public final void mo33339() {
        if (this.f44363) {
            this.f44364.f9053.m3862();
        }
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            return;
        }
        ApplicationC21448.f67649.edit().putString("dex_backup_name", strM33346).apply();
    }
}
