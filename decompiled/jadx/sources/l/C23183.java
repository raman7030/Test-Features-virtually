package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public final class C23183 extends AbstractC14737 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f74515;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18266 f74516;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23183(C9800 c9800) {
        super(c9800);
        this.f74515 = c9800;
    }

    @Override // l.AbstractC14737
    /* JADX INFO: renamed from: ֫ */
    public final void mo6628(int i, Object obj) {
        C18266 c18266 = new C18266(this.f74515, i);
        this.f74516 = c18266;
        ((Consumer) obj).accept(c18266);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18266 c18266 = new C18266(this.f74515, m35041());
        this.f74516 = c18266;
        return c18266;
    }

    @Override // l.AbstractC14737, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f74516.f56800 = -1;
    }
}
