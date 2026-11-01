package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18919 extends AbstractC12864 implements InterfaceC20202 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C20932 f56450g;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: a */
    public final void mo4688a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: b */
    public final InterfaceC3437 mo4689b(Object obj, int i, int i2) {
        return C23554.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18919(C20932 c20932, int i, int i2, int i3, int i4) {
        super(c20932, i, i2, i3, i4);
        this.f56450g = c20932;
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: c */
    public final InterfaceC3437 mo4690c(int i, int i2, int i3, int i4) {
        return new C18919(this.f56450g, i, i2, i3, i4);
    }
}
