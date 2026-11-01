package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13794 extends AbstractC15608 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3798 f38985;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13794(InterfaceC3579 interfaceC3579, C3798 c3798) {
        super(interfaceC3579);
        this.f38985 = c3798;
    }

    @Override // p067l.AbstractC15608, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38985.close();
        super.close();
    }
}
