package p067l;

import android.os.PowerManager;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12877 implements InterfaceC6616 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC18240 f36232;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24164 f36233;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ PowerManager.WakeLock f36234;

    public C12877(ViewOnClickListenerC18240 viewOnClickListenerC18240, C24164 c24164, PowerManager.WakeLock wakeLock) {
        this.f36232 = viewOnClickListenerC18240;
        this.f36233 = c24164;
        this.f36234 = wakeLock;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5692() {
        return this.f36233.m53444();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo5695() {
        return this.f36232.f54468;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5694(int i) {
        this.f36233.m53436(i);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5690(int i) {
        this.f36233.m53431(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5691(C3263 c3263) {
        ViewOnClickListenerC18240 viewOnClickListenerC18240 = this.f36232;
        viewOnClickListenerC18240.f54463.m13342(c3263, viewOnClickListenerC18240.f54452);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5693() {
        this.f36233.m53442();
        PowerManager.WakeLock wakeLock = this.f36234;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo5696() {
        return new C11981(this.f36232.f54468).m27416();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5697() {
        C22682.m50799(R.string.MT_Protector);
    }
}
