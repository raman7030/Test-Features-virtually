package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4306 extends AbstractC16375 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11683 f9579;

    @Override // p067l.AbstractC16375
    /* JADX INFO: renamed from: ֫ */
    public final void mo8754(int i, Object obj) {
        ((Consumer) obj).accept(this.f9579.f32577[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4306(C11683 c11683) {
        super(c11683);
        this.f9579 = c11683;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f9579.f32577[m37188()];
    }
}
