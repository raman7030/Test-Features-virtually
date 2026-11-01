package p067l;

/* JADX INFO: renamed from: l.۬ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14984 extends C16232 {

    /* JADX INFO: renamed from: ᩳ */
    public final C17666 f42813;

    public C14984(InterfaceC11799 interfaceC11799, C17666 c17666) {
        super(interfaceC11799);
        this.f42813 = c17666;
    }

    @Override // p067l.C16232
    /* JADX INFO: renamed from: ۧ */
    public final String mo34338(int i, int i2) {
        int i3 = (i2 >>> 24) & 255;
        if (this.f42813.f52753 && i3 != 1) {
            return C15654.m35570(i2);
        }
        String strMo34338 = super.mo34338(i, i2);
        return C15654.m35580(strMo34338) ? C15654.m35570(i2) : strMo34338;
    }
}
