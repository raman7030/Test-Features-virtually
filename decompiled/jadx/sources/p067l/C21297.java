package p067l;

/* JADX INFO: renamed from: l.᩶ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77W6 */
/* JADX INFO: loaded from: classes4.dex */
public class C21297 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21967 f66990 = new C24648();

    /* JADX INFO: renamed from: ۜ */
    public int f66991;

    /* JADX INFO: renamed from: ۡ */
    public long f66992;

    /* JADX INFO: renamed from: ۢ */
    public int f66993;

    /* JADX INFO: renamed from: ۧ */
    public int f66994;

    /* JADX INFO: renamed from: ܳ */
    public String f66995;

    /* JADX INFO: renamed from: ܺ */
    public long f66996;

    /* JADX INFO: renamed from: ܽ */
    public int f66997;

    /* JADX INFO: renamed from: ܿ */
    public C9896 f66998;

    /* JADX INFO: renamed from: ᩳ */
    public C17271 f66999;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f67000;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f67001;

    /* JADX INFO: renamed from: ֫ */
    public final void m48148() {
        C17271 c17271 = this.f66999;
        int i = c17271.f51438;
        int i2 = this.f66997;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c17271.f51436;
        int length = bArr.length;
        int i3 = c17271.f51421;
        if (length > i3) {
            byte[] bArr2 = this.f67000;
            if (bArr2.length > this.f66993 && bArr.length >= i3 + i) {
                int length2 = bArr2.length;
            }
        }
        System.arraycopy(bArr, i3, this.f67000, this.f66993, i);
        this.f66993 += i;
        C17271 c17272 = this.f66999;
        c17272.f51421 += i;
        this.f66996 += (long) i;
        this.f66997 -= i;
        int i4 = c17272.f51438 - i;
        c17272.f51438 = i4;
        if (i4 == 0) {
            c17272.f51421 = 0;
        }
    }
}
