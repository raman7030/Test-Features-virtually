package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.֡ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0564 extends AbstractC11043 implements InterfaceC8160 {
    public final /* synthetic */ C12559 g;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    @Override // l.AbstractC11043
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        C22291.a(((double[]) C11003.requireNonNull(dArr)).length, i, i3);
        return new C6002(dArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0564(C12559 c12559, int i, int i2, int i3, int i4) {
        super(c12559, i, i2, i3, i4);
        this.g = c12559;
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 c(int i, int i2, int i3, int i4) {
        return new C0564(this.g, i, i2, i3, i4);
    }
}
