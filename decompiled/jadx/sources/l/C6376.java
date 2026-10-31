package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6376 implements InterfaceC12975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5508 f19723;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5508 f19724;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f19725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7787 f19726;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13680 f19727;

    public C6376(C7787 c7787, C13680 c13680) {
        this.f19726 = c7787;
        this.f19727 = c13680;
        InterfaceC5508 interfaceC5508M32917 = c13680.m32917(1);
        this.f19724 = interfaceC5508M32917;
        this.f19723 = new C10610(this, interfaceC5508M32917, c13680);
    }

    @Override // l.InterfaceC12975
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17690() {
        synchronized (this.f19726) {
            if (this.f19725) {
                return;
            }
            this.f19725 = true;
            this.f19726.getClass();
            C20032.m46179(this.f19724);
            try {
                this.f19727.m32918();
            } catch (IOException unused) {
            }
        }
    }

    @Override // l.InterfaceC12975
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 mo17691() {
        return this.f19723;
    }
}
