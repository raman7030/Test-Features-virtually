package l;

/* JADX INFO: renamed from: l.۬ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13274 extends C14587 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16096 f39748;

    public C13274(InterfaceC9922 interfaceC9922, C16096 c16096) {
        super(interfaceC9922);
        this.f39748 = c16096;
    }

    @Override // l.C14587
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo32239(int i, int i2) {
        int i3 = (i2 >>> 24) & 255;
        if (this.f39748.f49590 && i3 != 1) {
            return C13979.m33450(i2);
        }
        String strMo32239 = super.mo32239(i, i2);
        return C13979.m33460(strMo32239) ? C13979.m33450(i2) : strMo32239;
    }
}
