package p067l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13132 extends AbstractC20206 implements InterfaceC19897 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC19897 f36892;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18495 f36893;

    public C13132(C18495 c18495, InterfaceC19897 interfaceC19897) {
        this.f36893 = c18495;
        this.f36892 = interfaceC19897;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        return ((InterfaceC7568) this.f36893.f55236.m41471().mo6575(this.f36892)).mo5853();
    }

    @Override // p067l.InterfaceC7568
    public final String getName() {
        return ((InterfaceC7568) this.f36893.f55236.m41471().mo6575(this.f36892)).getName();
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final List mo5852() {
        return ((InterfaceC7568) this.f36893.f55236.m41471().mo6575(this.f36892)).mo5852();
    }

    @Override // p067l.InterfaceC19897
    public final List getParameters() {
        return new C17824(this.f36893.f55236.m41478(), this.f36892.getParameters());
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        return ((InterfaceC7568) this.f36893.f55236.m41471().mo6575(this.f36892)).mo5855();
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ܽ */
    public final int mo5854() {
        return this.f36892.mo5854();
    }

    @Override // p067l.InterfaceC19897
    public final Set getAnnotations() {
        return new C11120(this.f36892.getAnnotations(), this.f36893.f55236.m41476());
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo5856() {
        return this.f36892.mo5856();
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩷ۧ */
    public final InterfaceC20568 mo5857() {
        return (InterfaceC20568) C23190.m51662(this.f36893.f55236.m41474(), this.f36892.mo5857());
    }
}
