package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15905 extends AbstractC9597 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12918 f49142;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49143;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49144;

    public C15905(C12918 c12918, int i, int i2) {
        this.f49142 = c12918;
        this.f49144 = i;
        this.f49143 = i2;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ֫ */
    public final int mo14555() {
        return this.f49142.m31418().mo11935(this.f49144);
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ܽ */
    public final int mo14557() {
        return this.f49142.m31418().m11936(this.f49144 + 4);
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ۧ */
    public final List mo14556() {
        C12918 c12918 = this.f49142;
        C18729 c18729M11939 = c12918.m31418().m11939(c12918.m31418().m11936(this.f49144 + 6) + this.f49143);
        int iM43362 = c18729M11939.m43362();
        int iM43364 = c18729M11939.m43364();
        c18729M11939.m43359();
        if (iM43362 > 0) {
            return new C9557(this, c12918, iM43364, iM43362);
        }
        int i = (iM43362 * (-1)) + 1;
        return new C8851(this, this.f49142, iM43364, i, i);
    }
}
