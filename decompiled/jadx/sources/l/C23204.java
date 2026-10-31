package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23204 extends AbstractC14178 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f74585;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17707 f74586;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23204(C9241 c9241) {
        super(c9241);
        this.f74585 = c9241;
    }

    @Override // l.AbstractC14178
    /* JADX INFO: renamed from: ֫ */
    public final void mo5120(int i, Object obj) {
        C17707 c17707 = new C17707(this.f74585, i);
        this.f74586 = c17707;
        ((Consumer) obj).accept(c17707);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17707 c17707 = new C17707(this.f74585, m33826());
        this.f74586 = c17707;
        return c17707;
    }

    @Override // l.AbstractC14178, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f74586.f54184 = -1;
    }
}
