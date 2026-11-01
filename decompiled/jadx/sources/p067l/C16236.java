package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16236 extends AbstractC5746 implements InterfaceC10124 {
    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    @Override // p067l.AbstractC6158
    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 mo4499a(InterfaceC16847 interfaceC16847, long j, long j2, long j3, long j4) {
        return new C16236((InterfaceC10124) interfaceC16847, j, j2, j3, j4);
    }

    @Override // p067l.AbstractC5746
    /* JADX INFO: renamed from: b */
    public final Object mo4500b() {
        return new C22511(1);
    }
}
