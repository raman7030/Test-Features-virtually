package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ᩴ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7NA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18616 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6621 f57721;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6621 f57722;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f57723;

    public C18616() {
        C6621 c6621M18151 = C6621.m18151(C5210.f16320);
        this.f57722 = c6621M18151;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f57723 = arrayDeque;
        this.f57721 = c6621M18151;
        arrayDeque.addLast(c6621M18151);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43159(AbstractC8032 abstractC8032) {
        this.f57723.addLast(C6621.m18151(abstractC8032));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43161() {
        ArrayDeque arrayDeque = this.f57723;
        ((C6621) arrayDeque.peekLast()).m18153((C6621) arrayDeque.removeLast());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43158(AbstractC3799 abstractC3799) {
        this.f57721.m18153(abstractC3799);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43160(C14381 c14381) {
        C6621 c6621 = (C6621) this.f57723.peekLast();
        this.f57721 = c6621;
        c6621.m18153(c14381);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3799 m43157() {
        return this.f57722;
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f57722, "base");
        c8964M37871.m23110(this.f57723, "stack");
        c8964M37871.m23110(this.f57721, "appendLevel");
        return c8964M37871.toString();
    }
}
