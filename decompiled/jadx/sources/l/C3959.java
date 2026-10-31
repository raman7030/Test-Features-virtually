package l;

/* JADX INFO: renamed from: l.ۘ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3959 implements InterfaceC8898 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12587;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8898[] f12588;

    public C3959(InterfaceC8898... interfaceC8898Arr) {
        this.f12588 = interfaceC8898Arr;
        this.f12587 = interfaceC8898Arr.length;
    }

    @Override // l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        for (int i = 0; i < this.f12587; i++) {
            this.f12588[i].mo1225(c2966);
        }
    }
}
