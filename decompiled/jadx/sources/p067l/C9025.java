package p067l;

/* JADX INFO: renamed from: l.ۜ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9025 extends AbstractC19754 {

    /* JADX INFO: renamed from: ܽ */
    public final C25118[] f24489;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C22437 f24490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9025(C22437 c22437, int i, int i2) {
        super(i, i2);
        this.f24490 = c22437;
        this.f24489 = new C25118[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            C25118[] c25118Arr = this.f24489;
            if (i3 >= c25118Arr.length) {
                return;
            }
            c25118Arr[i3] = new C25118(this);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20898() {
        int i = 0;
        while (true) {
            C25118[] c25118Arr = this.f24489;
            if (i >= c25118Arr.length) {
                return;
            }
            AbstractC9088.m21030(c25118Arr[i].f54980);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20897() {
        C22437 c22437 = this.f24490;
        C25118 c25118 = this.f24489[m44901(c22437.f70790.m53306(0), c22437.f70790.m53305())];
        short[] sArr = c25118.f54980;
        C22437 c22438 = c25118.f80369.f24490;
        int iM17799 = 1;
        if (c22438.f56944.m5008()) {
            do {
                iM17799 = (iM17799 << 1) | c22438.f70792.m17799(sArr, iM17799);
            } while (iM17799 < 256);
        } else {
            int iM53306 = c22438.f70790.m53306(c22438.f56940[0]);
            int i = 256;
            int i2 = 1;
            do {
                iM53306 <<= 1;
                int i3 = iM53306 & i;
                int iM177910 = c22438.f70792.m17799(sArr, i + i3 + i2);
                i2 = (i2 << 1) | iM177910;
                i &= (~i3) ^ (0 - iM177910);
            } while (i2 < 256);
            iM17799 = i2;
        }
        c22438.f70790.m53308((byte) iM17799);
        c22438.f56944.m5012();
    }
}
