package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1L1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20930 implements InterfaceC6818 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 f67689;

    public C20930(InterfaceC1879 interfaceC1879) {
        this.f67689 = interfaceC1879;
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܿ */
    public final int mo6222() {
        return this.f67689.mo6222();
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6223() {
        return this.f67689.mo6223();
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ֫ */
    public final C13956 mo6218() {
        return new C13956(this);
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo6220() {
        return this.f67689.mo6220();
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo6219() {
        return new Iterable() { // from class: l.۟ܿۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.mo6221();
            }
        };
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܽ */
    public final Iterator mo6221() {
        return this.f67689.mo6221();
    }
}
