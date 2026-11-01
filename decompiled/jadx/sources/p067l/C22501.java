package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22501 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩶ */
    public final C17450 f70946;

    /* JADX INFO: renamed from: ᩸ */
    public final int f70947;

    /* JADX INFO: renamed from: ᩹ */
    public final C17450 f70948;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 6;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C22501(C10286 c10286, C19147 c19147, C18476 c18476) {
        this.f70948 = (C17450) c19147.apply(c10286);
        this.f70946 = c10286.m15894() == null ? null : (C17450) c18476.apply(c10286.m15894());
        this.f70947 = c10286.m6582();
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f70948.f23817);
        c8121.m18818(this.f70947);
        C17450 c17450 = this.f70946;
        c8121.m18818(c17450 == null ? 0 : c17450.f23817);
    }
}
