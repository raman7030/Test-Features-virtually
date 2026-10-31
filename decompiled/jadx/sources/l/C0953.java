package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0953 implements InterfaceC4469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8009 f3582;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f3583;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f3584;

    public C0953(ViewOnClickListenerC8009 viewOnClickListenerC8009, C22933 c22933, ActivityC17169 activityC17169) {
        this.f3582 = viewOnClickListenerC8009;
        this.f3584 = c22933;
        this.f3583 = activityC17169;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3373() {
        return this.f3584.m51053();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 mo3376() {
        return this.f3583;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3375(int i) {
        this.f3584.m51045(i);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3371(int i) {
        this.f3584.m51040(C4925.m14306(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3372(C0941 c0941) {
        this.f3582.f24734.f46001.m11406(c0941, false);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3374() {
        this.f3584.m51051();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo3377() {
        return new C10114(this.f3583).m25396();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo3378() {
        C21374.m48463(R.string.MT_Protector);
    }
}
