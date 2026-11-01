package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes.dex */
public final class C25212 extends AbstractC19177 implements InterfaceC3595, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C22531 f80620;

    @Override // p067l.AbstractC19177, p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7619.m17576(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // p067l.AbstractC19177
    /* JADX INFO: renamed from: ֫ */
    public final void mo22195(int i, Object obj) {
        ((InterfaceC6278) obj).mo14251(this.f80620.f71032[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25212(C22531 c22531) {
        super(c22531);
        this.f80620 = c22531;
    }

    @Override // p067l.InterfaceC3595
    public final float nextFloat() {
        return this.f80620.f71032[m43665()];
    }
}
