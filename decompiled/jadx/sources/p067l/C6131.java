package p067l;

/* JADX INFO: renamed from: l.ۘ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6131 implements InterfaceC10825 {

    /* JADX INFO: renamed from: ֫ */
    public int f15395;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC10825[] f15396;

    public C6131(InterfaceC10825... interfaceC10825Arr) {
        this.f15396 = interfaceC10825Arr;
        this.f15395 = interfaceC10825Arr.length;
    }

    @Override // p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        for (int i = 0; i < this.f15395; i++) {
            this.f15396[i].mo3627(c5187);
        }
    }
}
