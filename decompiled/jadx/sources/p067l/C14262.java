package p067l;

/* JADX INFO: renamed from: l.۫ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14262 extends AbstractC21639 {

    /* JADX INFO: renamed from: ۜ */
    public final C23120[] f40629;

    /* JADX INFO: renamed from: ۢ */
    public final C7697 f40630;

    /* JADX INFO: renamed from: ۧ */
    public final C23120 f40631;

    /* JADX INFO: renamed from: ܳ */
    public final C13259 f40632;

    /* JADX INFO: renamed from: ܽ */
    public final C10656[] f40633;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f40634;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f40635;

    /* JADX INFO: renamed from: ᩷ */
    public final C13592[] f40636;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f40637;

    public C14262(C7697 c7697, int[] iArr, C23120[] c23120Arr, C10656[] c10656Arr, C13592[] c13592Arr, boolean z, C23120 c23120) {
        C10656 c10656;
        super(c7697.m17836());
        this.f40630 = c7697;
        C13259 c13259M17834 = c7697.m17834();
        this.f40632 = c13259M17834;
        this.f40635 = iArr;
        this.f40629 = c23120Arr;
        this.f40633 = c10656Arr;
        this.f40636 = c13592Arr;
        this.f40637 = z;
        this.f40631 = c23120;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                for (C13592 c13592 : c13592Arr) {
                    if (c13259M17834.m30307(c13592.f38226)) {
                        break;
                    }
                }
                this.f40634 = z2;
            } else if (c13259M17834.m30307(iArr[i]) || ((c10656 = c10656Arr[i]) != null && (c13259M17834.m30307(c10656.m24508()) || c13259M17834.m30307(c10656.m24504())))) {
                break;
            } else {
                i++;
            }
        }
        z2 = true;
        this.f40634 = z2;
    }
}
