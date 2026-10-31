package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14010 extends AbstractC23910 implements InterfaceC7975 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f42376;

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

    @Override // l.AbstractC23910
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33604(int i, Object obj) {
        ((Consumer) obj).accept(new C18266(this.f42376, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14010(C9800 c9800) {
        super(c9800);
        this.f42376 = c9800;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14010(C9800 c9800, int i, int i2, boolean z) {
        super(c9800, i, i2, z);
        this.f42376 = c9800;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f77308 ? 1 : 65;
    }

    @Override // l.AbstractC23910
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC23910 mo33603(int i, int i2, boolean z) {
        return new C14010(this.f42376, i, i2, z);
    }
}
