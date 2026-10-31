package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12021 extends AbstractC13931 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1505 f35974;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12021(InterfaceC1274 interfaceC1274, C1505 c1505) {
        super(interfaceC1274);
        this.f35974 = c1505;
    }

    @Override // l.AbstractC13931, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35974.close();
        super.close();
    }
}
