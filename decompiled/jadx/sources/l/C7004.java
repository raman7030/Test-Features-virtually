package l;

/* JADX INFO: renamed from: l.ۜ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7004 extends AbstractC18293 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23937[] f21608;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21116 f21609;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7004(C21116 c21116, int i, int i2) {
        super(i, i2);
        this.f21609 = c21116;
        this.f21608 = new C23937[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            C23937[] c23937Arr = this.f21608;
            if (i3 >= c23937Arr.length) {
                return;
            }
            c23937Arr[i3] = new C23937(this);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18941() {
        int i = 0;
        while (true) {
            C23937[] c23937Arr = this.f21608;
            if (i >= c23937Arr.length) {
                return;
            }
            AbstractC7070.m19072(c23937Arr[i].f51799);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18940() {
        C21116 c21116 = this.f21609;
        C23937 c23937 = this.f21608[m42641(c21116.f68108.m50916(0), c21116.f68108.m50915())];
        short[] sArr = c23937.f51799;
        C21116 c21117 = c23937.f77617.f21609;
        int iM15878 = 1;
        if (c21117.f53750.m2668()) {
            do {
                iM15878 = (iM15878 << 1) | c21117.f68110.m15878(sArr, iM15878);
            } while (iM15878 < 256);
        } else {
            int iM50916 = c21117.f68108.m50916(c21117.f53746[0]);
            int i = 256;
            int i2 = 1;
            do {
                iM50916 <<= 1;
                int i3 = iM50916 & i;
                int iM15879 = c21117.f68110.m15878(sArr, i + i3 + i2);
                i2 = (i2 << 1) | iM15879;
                i &= (~i3) ^ (0 - iM15879);
            } while (i2 < 256);
            iM15878 = i2;
        }
        c21117.f68108.m50918((byte) iM15878);
        c21117.f53750.m2672();
    }
}
