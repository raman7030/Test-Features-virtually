package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0479 extends AbstractC18825 implements InterfaceC1859 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f2078;

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC18825, l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC20476 c4953;
        if (consumer instanceof InterfaceC20476) {
            c4953 = (InterfaceC20476) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c4953 = new C4953(consumer);
        }
        return tryAdvance((Object) c4953);
    }

    @Override // l.AbstractC18825, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC20476 c4953;
        if (consumer instanceof InterfaceC20476) {
            c4953 = (InterfaceC20476) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c4953 = new C4953(consumer);
        }
        forEachRemaining((Object) c4953);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2117(int i, Object obj) {
        ((InterfaceC20476) obj).mo14392(this.f2078.f16903[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479(C5419 c5419) {
        super(c5419);
        this.f2078 = c5419;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479(C5419 c5419, int i, int i2, boolean z) {
        super(c5419, i, i2, z);
        this.f2078 = c5419;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f59387 ? 256 : 320;
    }

    @Override // l.AbstractC18825
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18825 mo2116(int i, int i2, boolean z) {
        return new C0479(this.f2078, i, i2, z);
    }
}
