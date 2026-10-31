package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7682 extends AbstractC14178 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17707 f23727;

    public C7682(C9241 c9241) {
        super(c9241);
        this.f23727 = new C17707(c9241);
    }

    @Override // l.AbstractC14178
    /* JADX INFO: renamed from: ֫ */
    public final void mo5120(int i, Object obj) {
        C17707 c17707 = this.f23727;
        c17707.f54184 = i;
        ((Consumer) obj).accept(c17707);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM33826 = m33826();
        C17707 c17707 = this.f23727;
        c17707.f54184 = iM33826;
        return c17707;
    }
}
