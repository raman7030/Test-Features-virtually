package p067l;

/* JADX INFO: renamed from: l.ܺۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17334 extends AbstractC5936 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17334(C8544 c8544) {
        super(new C20018[2], c8544);
        int i = (int) 7000.0f;
        int[] iArr = {i, 10000 - i};
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            i2 += i4;
            this.f14651[i3] = new C20018(this, i4);
        }
        if (i2 != 10000) {
            throw new IllegalArgumentException();
        }
    }
}
