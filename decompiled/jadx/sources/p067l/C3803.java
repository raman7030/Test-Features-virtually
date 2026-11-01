package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 465J */
/* JADX INFO: loaded from: classes3.dex */
public final class C3803 extends AbstractC14170 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f8142;

    /* JADX INFO: renamed from: ᩹ */
    public final int f8143;

    public C3803(C14645 c14645, C20168 c20168, int i) {
        this.f8142 = c14645;
        this.f8143 = c20168.m45647(i + 1);
    }

    @Override // p067l.InterfaceC19007
    public final String getValue() {
        return this.f8142.m33508(this.f8143);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7418() {
        return this.f8143;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7420(C23948 c23948) {
        this.f8142.m33471(this.f8143, c23948, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7419(C5636 c5636) throws IOException {
        c5636.write(34);
        this.f8142.m33492(this.f8143, c5636, true);
        c5636.write(34);
    }
}
