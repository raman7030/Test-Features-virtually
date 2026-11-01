package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7247 implements InterfaceC15963 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15963 f18911;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18408 f18912;

    /* JADX WARN: Multi-variable type inference failed */
    public C7247(InterfaceC15963 interfaceC15963, InterfaceC17797 interfaceC17797) {
        this.f18911 = interfaceC15963;
        this.f18912 = (AbstractC18408) interfaceC17797;
    }

    @Override // p067l.InterfaceC15963
    public final Iterator iterator() {
        return new C2552(this);
    }
}
