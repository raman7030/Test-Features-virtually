package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۢ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11708 extends AbstractC13049 {

    /* JADX INFO: renamed from: ܳ */
    public final int[][] f32636;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f32637;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC5002 f32638;

    public C11708(AbstractC5002 abstractC5002, int i, int i2) {
        this.f32638 = abstractC5002;
        int i3 = 1 << i;
        this.f32637 = new int[i3];
        this.f32636 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max(i2 - 1, 16));
    }

    @Override // p067l.AbstractC13049
    /* JADX INFO: renamed from: ֫ */
    public final void mo26910() {
        super.mo26910();
        int i = 0;
        while (true) {
            int[] iArr = this.f32637;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26911(int i, int i2) {
        int i3 = i - 2;
        short[] sArr = this.f36691;
        AbstractC5002 abstractC5002 = this.f32638;
        if (i3 < 8) {
            abstractC5002.f11427.m38716(sArr, 0, 0);
            abstractC5002.f11427.m38715(this.f36693[i2], i3);
        } else {
            abstractC5002.f11427.m38716(sArr, 0, 1);
            int i4 = i - 10;
            if (i4 < 8) {
                abstractC5002.f11427.m38716(sArr, 1, 0);
                abstractC5002.f11427.m38715(this.f36694[i2], i4);
            } else {
                abstractC5002.f11427.m38716(sArr, 1, 1);
                abstractC5002.f11427.m38715(this.f36692, i - 18);
            }
        }
        int[] iArr = this.f32637;
        iArr[i2] = iArr[i2] - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m26912(int i, int i2) {
        return this.f32636[i2][i - 2];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26913() {
        int[][] iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.f32637;
            if (i >= iArr2.length) {
                return;
            }
            if (iArr2[i] <= 0) {
                iArr2[i] = 32;
                short[] sArr = this.f36691;
                int iM38710 = C17070.m38710(sArr[0], 0);
                int i2 = 0;
                while (true) {
                    iArr = this.f32636;
                    if (i2 >= 8) {
                        break;
                    }
                    iArr[i][i2] = C17070.m38709(this.f36693[i], i2) + iM38710;
                    i2++;
                }
                int iM38711 = C17070.m38710(sArr[0], 1);
                int iM38712 = C17070.m38710(sArr[1], 0);
                while (i2 < 16) {
                    iArr[i][i2] = C17070.m38709(this.f36694[i], i2 - 8) + iM38711 + iM38712;
                    i2++;
                }
                int iM38713 = C17070.m38710(sArr[1], 1);
                while (true) {
                    int[] iArr3 = iArr[i];
                    if (i2 < iArr3.length) {
                        iArr3[i2] = C17070.m38709(this.f36692, i2 - 16) + iM38711 + iM38713;
                        i2++;
                    }
                }
            }
            i++;
        }
    }
}
