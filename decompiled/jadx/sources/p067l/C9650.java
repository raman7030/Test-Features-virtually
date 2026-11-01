package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9650 extends AbstractC16375 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C19729 f26564;

    public C9650(C11683 c11683) {
        super(c11683);
        this.f26564 = new C19729(c11683);
    }

    @Override // p067l.AbstractC16375
    /* JADX INFO: renamed from: ֫ */
    public final void mo8754(int i, Object obj) {
        C19729 c19729 = this.f26564;
        c19729.f60017 = i;
        ((Consumer) obj).accept(c19729);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM37188 = m37188();
        C19729 c19729 = this.f26564;
        c19729.f60017 = iM37188;
        return c19729;
    }
}
