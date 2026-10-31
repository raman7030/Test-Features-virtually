package l;

/* JADX INFO: renamed from: l.ۙۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C4586 implements InterfaceC21601 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f14628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14629;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f14630;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14631;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14632 = false;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C4586(boolean z) {
        boolean z2;
        if (C21939.m49417()) {
            z2 = C4925.f15523.getBoolean("def_mov_recycle_bin", true);
        }
        this.f14628 = z2;
        this.f14631 = 0;
        this.f14629 = z;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public void mo13495() {
        this.f14629 = true;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean mo13496() {
        return !this.f14632;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo13492(boolean z) {
        return z || mo13496();
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean mo13494() {
        return this.f14628;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo13491(String str, C22306 c22306, C22306 c22307, boolean z) {
        this.f14630 = !new C21520(this, str, c22306, c22307, z).m21850(new C16015());
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo13490(String str, C22306 c22306, C22306 c22307, boolean z, boolean z2) {
        if (!z2) {
            return C4248.m12788(this, str, c22306, c22307, z, false);
        }
        int[] iArr = {1};
        boolean zM21850 = new C20109(this, str, c22306, c22307, this.f14631, iArr).m21850(new C16015());
        this.f14630 = !zM21850;
        if (zM21850) {
            return iArr[0];
        }
        return 1;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo1526() {
        return this.f14630;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int mo13493() {
        return this.f14631;
    }
}
