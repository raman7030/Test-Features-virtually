package l;

import android.os.PowerManager;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11057 implements InterfaceC4469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16700 f33231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f33232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PowerManager.WakeLock f33233;

    public C11057(ViewOnClickListenerC16700 viewOnClickListenerC16700, C22933 c22933, PowerManager.WakeLock wakeLock) {
        this.f33231 = viewOnClickListenerC16700;
        this.f33232 = c22933;
        this.f33233 = wakeLock;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3373() {
        return this.f33232.m51053();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC17169 mo3376() {
        return this.f33231.f51283;
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ */
    public final void mo3375(int i) {
        this.f33232.m51045(i);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final void mo3371(int i) {
        this.f33232.m51040(C4925.m14306(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ֫ */
    public final void mo3372(C0941 c0941) {
        ViewOnClickListenerC16700 viewOnClickListenerC16700 = this.f33231;
        viewOnClickListenerC16700.f51278.m11406(c0941, viewOnClickListenerC16700.f51267);
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ۧ */
    public final void mo3374() {
        this.f33232.m51051();
        PowerManager.WakeLock wakeLock = this.f33233;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo3377() {
        return new C10114(this.f33231.f51283).m25396();
    }

    @Override // l.InterfaceC4469
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3378() {
        C21374.m48463(R.string.MT_Protector);
    }
}
