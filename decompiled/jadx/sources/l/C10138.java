package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10138 extends AbstractC8185 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30507;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f30508;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f30509;

    public C10138(C12918 c12918, C18729 c18729) {
        this.f30508 = c12918;
        int iM43368 = c18729.m43368();
        this.f30509 = iM43368;
        this.f30507 = c18729.m43364();
        for (int i = 0; i < iM43368; i++) {
            AbstractC10494.m26391(c18729);
        }
    }

    @Override // l.InterfaceC20288
    public final List getValue() {
        return new C12254(this, this.f30508, this.f30507, this.f30509);
    }
}
