package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܿ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19083 {

    /* JADX INFO: renamed from: ֫ */
    public final short[] f56938;

    /* JADX INFO: renamed from: ۜ */
    public final short[] f56939;

    /* JADX INFO: renamed from: ۢ */
    public final int f56941;

    /* JADX INFO: renamed from: ۧ */
    public final short[][] f56942;

    /* JADX INFO: renamed from: ܳ */
    public final short[] f56943;

    /* JADX INFO: renamed from: ܽ */
    public final short[][] f56945;

    /* JADX INFO: renamed from: ܿ */
    public final short[] f56946;

    /* JADX INFO: renamed from: ᩳ */
    public final short[][] f56947;

    /* JADX INFO: renamed from: ᩷ */
    public final short[] f56948;

    /* JADX INFO: renamed from: ᩻ */
    public final short[][] f56949;

    /* JADX INFO: renamed from: ۡ */
    public final int[] f56940 = new int[4];

    /* JADX INFO: renamed from: ܺ */
    public final C2989 f56944 = new C2989();

    public AbstractC19083(int i) {
        Class cls = Short.TYPE;
        this.f56947 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f56946 = new short[12];
        this.f56943 = new short[12];
        this.f56939 = new short[12];
        this.f56948 = new short[12];
        this.f56949 = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.f56942 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.f56945 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f56938 = new short[16];
        this.f56941 = (1 << i) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10616() {
        int[] iArr = this.f56940;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f56944.m5010();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f56947;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC9088.m21030(sArr[i2]);
            i2++;
        }
        AbstractC9088.m21030(this.f56946);
        AbstractC9088.m21030(this.f56943);
        AbstractC9088.m21030(this.f56939);
        AbstractC9088.m21030(this.f56948);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f56949;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC9088.m21030(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f56942;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC9088.m21030(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f56945;
            if (i < sArr4.length) {
                AbstractC9088.m21030(sArr4[i]);
                i++;
            } else {
                AbstractC9088.m21030(this.f56938);
                return;
            }
        }
    }
}
