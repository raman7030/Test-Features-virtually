package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C4786 extends AbstractC8891 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4060 f15182;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3375 f15183;

    public C4786(C3375 c3375, InterfaceC4060 interfaceC4060) {
        this.f15183 = c3375;
        this.f15182 = interfaceC4060;
    }

    @Override // l.InterfaceC4060
    public final String getName() {
        return this.f15182.getName();
    }

    @Override // l.InterfaceC4060
    public final int getIndex() {
        return this.f15182.getIndex();
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19583 mo12184() {
        return C21908.m49312(this.f15182.mo12184(), this.f15183.f10670);
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ܺ */
    public final String mo12183() {
        return this.f15182.mo12183();
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC0531 mo12182() {
        return new C1446(this.f15183.f10670.m39233(), this.f15182.mo12182());
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۢ */
    public final List mo12181() {
        return C7470.m20014(this.f15182.mo12181(), new C20309(this));
    }
}
