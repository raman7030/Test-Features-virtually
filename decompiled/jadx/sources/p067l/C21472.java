package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩶ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21472 implements InterfaceC22871 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6719 f67738;

    public C21472(C6719 c6719) {
        this.f67738 = c6719;
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ᩳ */
    public final void mo48672() {
        this.f67738.m15347();
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48661() {
        this.f67738.f17444 = true;
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48663(long j) {
        this.f67738.f17443.m4303(j);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48664(long j, int i, long j2) {
        this.f67738.f17443.m4304(j, i, j2);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48667(boolean z) {
        this.f67738.f17443.m4311(z);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ܿ */
    public final void mo48671() {
        InterfaceC9205 interfaceC9205M39398 = this.f67738.m39398();
        if (interfaceC9205M39398 != null) {
            interfaceC9205M39398.mo3725();
        }
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ۧ */
    public final void mo48668() {
        InterfaceC9205 interfaceC9205M39398 = this.f67738.m39398();
        if (interfaceC9205M39398 != null) {
            interfaceC9205M39398.mo3724();
        }
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48665(Exception exc) {
        C21334.m48348("Audio sink error", exc);
        this.f67738.f17443.m4312(exc);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ܽ */
    public final void mo48670() {
        this.f67738.m16261();
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48666(C3424 c3424) {
        this.f67738.f17443.m4308(c3424);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ۧ */
    public final void mo48669(C3424 c3424) {
        this.f67738.f17443.m4313(c3424);
    }

    @Override // p067l.InterfaceC22871
    /* JADX INFO: renamed from: ֫ */
    public final void mo48662(int i) {
        int i2 = Build.VERSION.SDK_INT;
        C6719 c6719 = this.f67738;
        if (i2 >= 35 && c6719.f17432 != null) {
            c6719.f17432.m30684(i);
        }
        c6719.f17443.m4302(i);
    }
}
