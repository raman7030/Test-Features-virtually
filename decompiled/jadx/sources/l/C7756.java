package l;

/* JADX INFO: renamed from: l.۟᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public class C7756 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21100 f23988;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo6027(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    public C7756(C21100 c21100) {
        this.f23988 = c21100;
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ */
    public final void mo6026(InterfaceC23586 interfaceC23586) {
        if (!this.f23988.f68063 || C21100.f68050 == null) {
            return;
        }
        C21100.f68050.m18918();
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6029(InterfaceC23586 interfaceC23586) {
        float[] fArr = C18340.f56996;
        boolean z = false;
        boolean z2 = ApplicationC20075.f65008.getBoolean("mbp", false);
        C21100 c21100 = this.f23988;
        if (z2 || C21100.f68050 == null) {
            c21100.f68063 = false;
            return;
        }
        if (C21100.f68050.f21573 && (C21100.f68050.f21578.isPlaying() || C21100.f68050.f21578.mo15851() || C21100.f68050.m18908())) {
            z = true;
        }
        c21100.f68063 = z;
        C21100.f68050.m18910();
    }
}
