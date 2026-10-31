package l;

/* JADX INFO: renamed from: l.ܿۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17329 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53078;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17329(AbstractActivityC3346 abstractActivityC3346, C2978 c2978) {
        super(abstractActivityC3346, -1);
        this.f53078 = c2978;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        C2978 c2978 = this.f53078;
        c2978.setTag(strTrim);
        c2978.setChecked(!strTrim.isEmpty());
        m31262();
    }
}
