package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18455 extends AbstractC2227 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f57236;

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC2227
    /* JADX INFO: renamed from: ֫ */
    public final void mo7408(int i, Object obj) {
        ((Consumer) obj).accept(this.f57236.f60386[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18455(C19161 c19161) {
        super(c19161);
        this.f57236 = c19161;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18455(C19161 c19161, int i, int i2, boolean z) {
        super(c19161, i, i2, z);
        this.f57236 = c19161;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f7286 ? 0 : 64;
    }

    @Override // l.AbstractC2227
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2227 mo7407(int i, int i2, boolean z) {
        return new C18455(this.f57236, i, i2, z);
    }
}
