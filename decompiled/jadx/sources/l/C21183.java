package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21183 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15869 f68264;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f68265;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15869 f68266;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 6;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C21183(C8331 c8331, C17654 c17654, C16948 c16948) {
        this.f68266 = (C15869) c17654.apply(c8331);
        this.f68264 = c8331.m14014() == null ? null : (C15869) c16948.apply(c8331.m14014());
        this.f68265 = c8331.m4336();
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f68266.f20943);
        c6053.m16889(this.f68265);
        C15869 c15869 = this.f68264;
        c6053.m16889(c15869 == null ? 0 : c15869.f20943);
    }
}
