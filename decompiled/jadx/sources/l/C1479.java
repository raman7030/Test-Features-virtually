package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1479 extends AbstractC14178 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f5309;

    @Override // l.AbstractC14178
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5120(int i, Object obj) {
        ((Consumer) obj).accept(this.f5309.f27976[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1479(C9241 c9241) {
        super(c9241);
        this.f5309 = c9241;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f5309.f27976[m33826()];
    }
}
