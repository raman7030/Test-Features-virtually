package p067l;

/* JADX INFO: renamed from: l.ᩴᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20357 implements InterfaceC5093 {

    /* JADX INFO: renamed from: ᩸ */
    public int f62873;

    /* JADX INFO: renamed from: ᩹ */
    public C17441 f62874;

    public AbstractC20357(int i, C17441 c17441) {
        this.f62873 = i;
        this.f62874 = c17441;
    }

    @Override // p067l.InterfaceC5093
    /* JADX INFO: renamed from: ܺ */
    public final int mo10843() {
        return this.f62873;
    }

    @Override // p067l.InterfaceC5093
    /* JADX INFO: renamed from: ۙ֫ */
    public final InterfaceC3340 mo10842() {
        return this.f62874;
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC5093 interfaceC5093 = (InterfaceC5093) interfaceC10457;
        if (this.f62873 != interfaceC5093.mo10843()) {
            throw new RuntimeException();
        }
        InterfaceC3340 interfaceC3340Mo10842 = interfaceC5093.mo10842();
        C17441 c17441 = this.f62874;
        if (c17441.size() != interfaceC3340Mo10842.size()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c17441.size(); i++) {
            if (c17441.getInt(i) != interfaceC3340Mo10842.getInt(i)) {
                throw new RuntimeException();
            }
        }
    }
}
