package l;

/* JADX INFO: renamed from: l.ܳᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14689 extends AbstractC22744 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC9773 f44866;

    public C14689(String str, InterfaceC9773 interfaceC9773) {
        super(str);
        this.f44866 = interfaceC9773;
    }

    @Override // l.AbstractC22744
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13571 mo34981(byte[] bArr, int i, boolean z) {
        InterfaceC9773 interfaceC9773 = this.f44866;
        if (z) {
            interfaceC9773.reset();
        }
        return interfaceC9773.mo6617(0, i, bArr);
    }
}
