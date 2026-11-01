package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۢᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11644 extends AbstractC13635 implements IntConsumer, InterfaceC20202 {

    /* JADX INFO: renamed from: e */
    public final IntPredicate f32485e;

    /* JADX INFO: renamed from: f */
    public int f32486f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.AbstractC13635, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C6120.$default$forEachRemaining(this, intConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    public AbstractC11644(InterfaceC20202 interfaceC20202, IntPredicate intPredicate) {
        super(interfaceC20202);
        this.f32485e = intPredicate;
    }

    public AbstractC11644(InterfaceC20202 interfaceC20202, AbstractC11644 abstractC11644) {
        super(interfaceC20202, abstractC11644);
        this.f32485e = abstractC11644.f32485e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f38388d = (this.f38388d + 1) & 63;
        this.f32486f = i;
    }

    @Override // p067l.InterfaceC3437
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
