package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10860 implements InterfaceC14962 {

    /* JADX INFO: renamed from: ֫ */
    public final Iterator f30097;

    /* JADX INFO: renamed from: ۧ */
    public C23600 f30098;

    public C10860(Collection collection) {
        this.f30097 = collection.iterator();
        next();
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10226() {
        return this.f30098 != null;
    }

    @Override // p067l.InterfaceC14962
    public final void next() {
        Iterator it = this.f30097;
        this.f30098 = it.hasNext() ? (C23600) it.next() : null;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10230() {
        return this.f30098.f75123;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ܿ */
    public final int mo10229() {
        return this.f30098.f75124;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ܽ */
    public final int mo10228() {
        return this.f30098.f75121;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ۧ */
    public final int mo10227() {
        return this.f30098.f75122;
    }
}
