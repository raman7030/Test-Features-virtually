package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17127 implements InterfaceC14304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15715 f52475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC16876 f52476;

    /* JADX WARN: Multi-variable type inference failed */
    public C17127(C15715 c15715, InterfaceC16233 interfaceC16233) {
        this.f52475 = c15715;
        this.f52476 = (AbstractC16876) interfaceC16233;
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        return new C17833(this);
    }
}
