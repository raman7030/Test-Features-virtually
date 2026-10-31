package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܿ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17587 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short[] f53744;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final short[] f53745;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f53747;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final short[][] f53748;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final short[] f53749;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short[][] f53751;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short[] f53752;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short[][] f53753;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short[] f53754;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final short[][] f53755;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f53746 = new int[4];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0653 f53750 = new C0653();

    public AbstractC17587(int i) {
        Class cls = Short.TYPE;
        this.f53753 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f53752 = new short[12];
        this.f53749 = new short[12];
        this.f53745 = new short[12];
        this.f53754 = new short[12];
        this.f53755 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f53748 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.f53751 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f53744 = new short[16];
        this.f53747 = (1 << i) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8553() {
        int[] iArr = this.f53746;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f53750.m2670();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f53753;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC7070.m19072(sArr[i2]);
            i2++;
        }
        AbstractC7070.m19072(this.f53752);
        AbstractC7070.m19072(this.f53749);
        AbstractC7070.m19072(this.f53745);
        AbstractC7070.m19072(this.f53754);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f53755;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC7070.m19072(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f53748;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC7070.m19072(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f53751;
            if (i < sArr4.length) {
                AbstractC7070.m19072(sArr4[i]);
                i++;
            } else {
                AbstractC7070.m19072(this.f53744);
                return;
            }
        }
    }
}
