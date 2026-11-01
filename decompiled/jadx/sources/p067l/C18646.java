package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18646 implements InterfaceC15963 {

    /* JADX INFO: renamed from: ֫ */
    public final C17304 f55658;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18408 f55659;

    /* JADX WARN: Multi-variable type inference failed */
    public C18646(C17304 c17304, InterfaceC17797 interfaceC17797) {
        this.f55658 = c17304;
        this.f55659 = (AbstractC18408) interfaceC17797;
    }

    @Override // p067l.InterfaceC15963
    public final Iterator iterator() {
        return new C19317(this);
    }
}
