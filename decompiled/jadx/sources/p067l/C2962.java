package p067l;

import java.io.IOException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962 implements InterfaceC8998 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC17043 f5170;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C21089 f5171;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ IntConsumer f5172;

    public C2962(AbstractC17043 abstractC17043, C21089 c21089, IntConsumer intConsumer) {
        this.f5170 = abstractC17043;
        this.f5171 = c21089;
        this.f5172 = intConsumer;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final void mo4911(AbstractC17043 abstractC17043, int i) {
        this.f5171.m47655(this.f5170.mo25495(), abstractC17043.mo25495(), C7050.m16218(), this.f5172);
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4912(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && message.startsWith("Unable to open target file");
    }
}
