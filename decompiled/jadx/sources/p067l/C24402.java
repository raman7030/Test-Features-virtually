package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public final class C24402 extends AbstractC16375 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C11683 f77259;

    /* JADX INFO: renamed from: ۫ */
    public C19729 f77260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24402(C11683 c11683) {
        super(c11683);
        this.f77259 = c11683;
    }

    @Override // p067l.AbstractC16375
    /* JADX INFO: renamed from: ֫ */
    public final void mo8754(int i, Object obj) {
        C19729 c19729 = new C19729(this.f77259, i);
        this.f77260 = c19729;
        ((Consumer) obj).accept(c19729);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19729 c19729 = new C19729(this.f77259, m37188());
        this.f77260 = c19729;
        return c19729;
    }

    @Override // p067l.AbstractC16375, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f77260.f60017 = -1;
    }
}
