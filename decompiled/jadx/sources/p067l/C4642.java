package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4642 extends AbstractC21406 implements InterfaceC2766, LongConsumer {

    /* JADX INFO: renamed from: f */
    public long f10435f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    @Override // p067l.AbstractC23262
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo7434b(InterfaceC16847 interfaceC16847) {
        return new C4642((InterfaceC2766) interfaceC16847, this);
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: g */
    public final void mo9815g(Object obj) {
        ((LongConsumer) obj).accept(this.f10435f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f10435f = j;
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: j */
    public final AbstractC24187 mo9816j(int i) {
        return new C16810(i);
    }
}
