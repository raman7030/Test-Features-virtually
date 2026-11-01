package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9000 extends AbstractC16375 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11683 f24384;

    @Override // p067l.AbstractC16375, p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // p067l.AbstractC16375
    /* JADX INFO: renamed from: ֫ */
    public final void mo8754(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f24384.f32587[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9000(C11683 c11683) {
        super(c11683);
        this.f24384 = c11683;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f24384.f32587[m37188()];
    }
}
