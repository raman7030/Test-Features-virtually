package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.֡ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2905 extends AbstractC12864 implements InterfaceC10124 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C14305 f5021g;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: a */
    public final void mo4688a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: b */
    public final InterfaceC3437 mo4689b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        C23554.m52341a(((double[]) C12826.requireNonNull(dArr)).length, i, i3);
        return new C8073(dArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2905(C14305 c14305, int i, int i2, int i3, int i4) {
        super(c14305, i, i2, i3, i4);
        this.f5021g = c14305;
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: c */
    public final InterfaceC3437 mo4690c(int i, int i2, int i3, int i4) {
        return new C2905(this.f5021g, i, i2, i3, i4);
    }
}
