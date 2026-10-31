package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20572 extends AbstractC2227 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f66252;

    @Override // l.AbstractC2227, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC2227, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC2227
    /* JADX INFO: renamed from: ֫ */
    public final void mo7408(int i, Object obj) {
        ((InterfaceC23662) obj).mo18328(this.f66252.f60376[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20572(C19161 c19161) {
        super(c19161);
        this.f66252 = c19161;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20572(C19161 c19161, int i, int i2, boolean z) {
        super(c19161, i, i2, z);
        this.f66252 = c19161;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f7286 ? 257 : 321;
    }

    @Override // l.AbstractC2227
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2227 mo7407(int i, int i2, boolean z) {
        return new C20572(this.f66252, i, i2, z);
    }
}
