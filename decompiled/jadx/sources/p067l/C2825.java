package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2825 extends AbstractC5746 implements InterfaceC20202 {
    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    @Override // p067l.AbstractC6158
    /* JADX INFO: renamed from: a */
    public final InterfaceC16847 mo4499a(InterfaceC16847 interfaceC16847, long j, long j2, long j3, long j4) {
        return new C2825((InterfaceC20202) interfaceC16847, j, j2, j3, j4);
    }

    @Override // p067l.AbstractC5746
    /* JADX INFO: renamed from: b */
    public final Object mo4500b() {
        return new C13793(1);
    }
}
