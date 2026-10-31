package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۨۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11433 extends AbstractC18063 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16696 f34203;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20561 f34204;

    @Override // l.InterfaceC20561
    public final int getVisibility() {
        return this.f34204.getVisibility();
    }

    @Override // l.InterfaceC20561
    public final String getType() {
        return (String) this.f34203.m39233().mo4329(this.f34204.getType());
    }

    @Override // l.InterfaceC20561
    public Set getElements() {
        return C21908.m49311(this.f34204.getElements(), this.f34203.m39234());
    }

    public C11433(C16696 c16696, InterfaceC20561 interfaceC20561) {
        this.f34203 = c16696;
        this.f34204 = interfaceC20561;
    }
}
