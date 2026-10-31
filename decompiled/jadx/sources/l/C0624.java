package l;

import java.io.IOException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0624 implements InterfaceC6975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f2397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19697 f2398;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f2399;

    public C0624(AbstractC15440 abstractC15440, C19697 c19697, IntConsumer intConsumer) {
        this.f2397 = abstractC15440;
        this.f2398 = c19697;
        this.f2399 = intConsumer;
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2555(AbstractC15440 abstractC15440, int i) {
        this.f2398.m45358(this.f2397.mo23544(), abstractC15440.mo23544(), C4925.m14321(), this.f2399);
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2556(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && message.startsWith("Unable to open target file");
    }
}
