package p067l;

/* JADX INFO: renamed from: l.۟᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public class C9740 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22422 f26902;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo8224(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo8225(InterfaceC24784 interfaceC24784) {
    }

    public C9740(C22422 c22422) {
        this.f26902 = c22422;
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final void mo8223(InterfaceC24784 interfaceC24784) {
        if (!this.f26902.f70745 || C22422.f70732 == null) {
            return;
        }
        C22422.f70732.m20872();
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8226(InterfaceC24784 interfaceC24784) {
        float[] fArr = C19799.f60214;
        boolean z = false;
        boolean z2 = ApplicationC21448.f67649.getBoolean("mbp", false);
        C22422 c22422 = this.f26902;
        if (z2 || C22422.f70732 == null) {
            c22422.f70745 = false;
            return;
        }
        if (C22422.f70732.f24453 && (C22422.f70732.f24458.isPlaying() || C22422.f70732.f24458.mo17766() || C22422.f70732.m20862())) {
            z = true;
        }
        c22422.f70745 = z;
        C22422.f70732.m20864();
    }
}
