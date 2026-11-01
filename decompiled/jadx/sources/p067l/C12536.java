package p067l;

/* JADX INFO: renamed from: l.ۧۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12536 extends AbstractC13578 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC8213 f35185 = null;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8213[] f35186;

    public C12536(InterfaceC8213[] interfaceC8213Arr) {
        this.f35186 = interfaceC8213Arr;
    }

    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        InterfaceC8213 interfaceC8213 = this.f35185;
        if (interfaceC8213 != null) {
            return interfaceC8213.mo13110(str);
        }
        for (InterfaceC8213 interfaceC8214 : this.f35186) {
            C12237 c12237Mo13110 = interfaceC8214.mo13110(str);
            if (c12237Mo13110 != null) {
                this.f35185 = interfaceC8214;
                return c12237Mo13110;
            }
        }
        return null;
    }
}
