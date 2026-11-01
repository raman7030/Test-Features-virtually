package p067l;

/* JADX INFO: renamed from: l.ᩴ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KARP */
/* JADX INFO: loaded from: classes5.dex */
public class C20424 implements InterfaceC6342 {

    /* JADX INFO: renamed from: ֫ */
    public C20915 f63105;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC2808 f63106;

    @Override // p067l.InterfaceC17740
    public final int getChildCount() {
        return 0;
    }

    @Override // p067l.InterfaceC17740
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17740 mo25014(int i) {
        return null;
    }

    public C20424(InterfaceC2808 interfaceC2808) {
        this.f63106 = interfaceC2808;
    }

    @Override // p067l.InterfaceC6342
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2808 mo14503() {
        return this.f63106;
    }

    @Override // p067l.InterfaceC17740
    public final String getText() {
        return this.f63106.getText();
    }

    public final String toString() {
        InterfaceC2808 interfaceC2808 = this.f63106;
        return interfaceC2808.getType() == -1 ? "<EOF>" : interfaceC2808.getText();
    }
}
