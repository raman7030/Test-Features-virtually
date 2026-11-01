package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6417 extends AbstractC12864 implements InterfaceC2766 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C7087 f16614g;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: a */
    public final void mo4688a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: b */
    public final InterfaceC3437 mo4689b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        C23554.m52341a(((long[]) C12826.requireNonNull(jArr)).length, i, i3);
        return new C22195(jArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6417(C7087 c7087, int i, int i2, int i3, int i4) {
        super(c7087, i, i2, i3, i4);
        this.f16614g = c7087;
    }

    @Override // p067l.AbstractC12864
    /* JADX INFO: renamed from: c */
    public final InterfaceC3437 mo4690c(int i, int i2, int i3, int i4) {
        return new C6417(this.f16614g, i, i2, i3, i4);
    }
}
