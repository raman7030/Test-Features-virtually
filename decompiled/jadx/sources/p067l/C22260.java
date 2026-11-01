package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1L1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22260 implements InterfaceC8848 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4154 f70374;

    public C22260(InterfaceC4154 interfaceC4154) {
        this.f70374 = interfaceC4154;
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܿ */
    public final int mo8424() {
        return this.f70374.mo8424();
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8425() {
        return this.f70374.mo8425();
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ֫ */
    public final C15632 mo8420() {
        return new C15632(this);
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo8422() {
        return this.f70374.mo8422();
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo8421() {
        return new Iterable() { // from class: l.۟ܿۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.mo8423();
            }
        };
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܽ */
    public final Iterator mo8423() {
        return this.f70374.mo8423();
    }
}
