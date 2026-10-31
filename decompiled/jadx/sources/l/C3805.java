package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3805 implements InterfaceC4469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC18622 f12003;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f12004;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f12005;

    public C3805(ViewOnClickListenerC18622 viewOnClickListenerC18622, C22933 c22933, ActivityC17169 activityC17169) {
        this.f12003 = viewOnClickListenerC18622;
        this.f12005 = c22933;
        this.f12004 = activityC17169;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3373() {
        return this.f12005.m51053();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC17169 mo3376() {
        return this.f12004;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ */
    public final void mo3375(int i) {
        this.f12005.m51045(i);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final void mo3371(int i) {
        this.f12005.m51040(C4925.m14306(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final void mo3372(C0941 c0941) {
        this.f12003.f57748.f60767.m11385(c0941, false);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ */
    public final void mo3374() {
        this.f12005.m51051();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo3377() {
        return new C10114(this.f12004).m25396();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3378() {
        C21374.m48463(R.string.MT_Protector);
    }
}
