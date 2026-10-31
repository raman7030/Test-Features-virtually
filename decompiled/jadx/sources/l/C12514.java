package l;

/* JADX INFO: renamed from: l.۫ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12514 extends AbstractC20276 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21834[] f37605;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5606 f37606;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21834 f37607;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11459 f37608;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8720[] f37609;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f37610;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f37611;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11809[] f37612;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f37613;

    public C12514(C5606 c5606, int[] iArr, C21834[] c21834Arr, C8720[] c8720Arr, C11809[] c11809Arr, boolean z, C21834 c21834) {
        C8720 c8720;
        super(c5606.m15915());
        this.f37606 = c5606;
        C11459 c11459M15913 = c5606.m15913();
        this.f37608 = c11459M15913;
        this.f37611 = iArr;
        this.f37605 = c21834Arr;
        this.f37609 = c8720Arr;
        this.f37612 = c11809Arr;
        this.f37613 = z;
        this.f37607 = c21834;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                for (C11809 c11809 : c11809Arr) {
                    if (c11459M15913.m28263(c11809.f35224)) {
                        break;
                    }
                }
                this.f37610 = z2;
            } else if (c11459M15913.m28263(iArr[i]) || ((c8720 = c8720Arr[i]) != null && (c11459M15913.m28263(c8720.m22539()) || c11459M15913.m28263(c8720.m22535())))) {
                break;
            } else {
                i++;
            }
        }
        z2 = true;
        this.f37610 = z2;
    }
}
