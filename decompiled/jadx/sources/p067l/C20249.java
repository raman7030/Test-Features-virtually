package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S6 */
/* JADX INFO: loaded from: classes5.dex */
public class C20249 extends AbstractC17522 implements InterfaceC5815 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC5815 f62592;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C20920 f62593;

    public C20249(C20920 c20920, InterfaceC5815 interfaceC5815) {
        this.f62593 = c20920;
        this.f62592 = interfaceC5815;
    }

    @Override // p067l.InterfaceC20309
    /* JADX INFO: renamed from: ܳ */
    public final String mo10231() {
        return ((InterfaceC20309) this.f62593.f65707.m41473().mo6575(this.f62592)).mo10231();
    }

    @Override // p067l.InterfaceC20309
    public final String getName() {
        return ((InterfaceC20309) this.f62593.f65707.m41473().mo6575(this.f62592)).getName();
    }

    @Override // p067l.InterfaceC20309
    public final String getType() {
        return ((InterfaceC20309) this.f62593.f65707.m41473().mo6575(this.f62592)).getType();
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ܽ */
    public final int mo13086() {
        return this.f62592.mo13086();
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public InterfaceC12262 mo13085() {
        return (InterfaceC12262) C23190.m51662(this.f62593.f65707.m41477(), this.f62592.mo13085());
    }

    @Override // p067l.InterfaceC5815
    public final Set getAnnotations() {
        return new C11120(this.f62592.getAnnotations(), this.f62593.f65707.m41476());
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo13087() {
        return this.f62592.mo13087();
    }
}
