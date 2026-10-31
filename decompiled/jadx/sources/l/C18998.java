package l;

/* JADX INFO: renamed from: l.ᩴ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KARP */
/* JADX INFO: loaded from: classes5.dex */
public class C18998 implements InterfaceC4181 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19515 f59876;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f59877;

    @Override // l.InterfaceC16174
    public final int getChildCount() {
        return 0;
    }

    @Override // l.InterfaceC16174
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16174 mo23040(int i) {
        return null;
    }

    public C18998(InterfaceC0463 interfaceC0463) {
        this.f59877 = interfaceC0463;
    }

    @Override // l.InterfaceC4181
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0463 mo12628() {
        return this.f59877;
    }

    @Override // l.InterfaceC16174
    public final String getText() {
        return this.f59877.getText();
    }

    public final String toString() {
        InterfaceC0463 interfaceC0463 = this.f59877;
        return interfaceC0463.getType() == -1 ? "<EOF>" : interfaceC0463.getText();
    }
}
