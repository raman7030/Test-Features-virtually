package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۢ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9827 extends AbstractC11238 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[][] f29683;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f29684;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2771 f29685;

    public C9827(AbstractC2771 abstractC2771, int i, int i2) {
        this.f29685 = abstractC2771;
        int i3 = 1 << i;
        this.f29684 = new int[i3];
        this.f29683 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max(i2 - 1, 16));
    }

    @Override // l.AbstractC11238
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24895() {
        super.mo24895();
        int i = 0;
        while (true) {
            int[] iArr = this.f29684;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24896(int i, int i2) {
        int i3 = i - 2;
        short[] sArr = this.f33691;
        AbstractC2771 abstractC2771 = this.f29685;
        if (i3 < 8) {
            abstractC2771.f8633.m36557(sArr, 0, 0);
            abstractC2771.f8633.m36556(this.f33693[i2], i3);
        } else {
            abstractC2771.f8633.m36557(sArr, 0, 1);
            int i4 = i - 10;
            if (i4 < 8) {
                abstractC2771.f8633.m36557(sArr, 1, 0);
                abstractC2771.f8633.m36556(this.f33694[i2], i4);
            } else {
                abstractC2771.f8633.m36557(sArr, 1, 1);
                abstractC2771.f8633.m36556(this.f33692, i - 18);
            }
        }
        int[] iArr = this.f29684;
        iArr[i2] = iArr[i2] - 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24897(int i, int i2) {
        return this.f29683[i2][i - 2];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24898() {
        int[][] iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.f29684;
            if (i >= iArr2.length) {
                return;
            }
            if (iArr2[i] <= 0) {
                iArr2[i] = 32;
                short[] sArr = this.f33691;
                int iM36551 = C15469.m36551(sArr[0], 0);
                int i2 = 0;
                while (true) {
                    iArr = this.f29683;
                    if (i2 >= 8) {
                        break;
                    }
                    iArr[i][i2] = C15469.m36550(this.f33693[i], i2) + iM36551;
                    i2++;
                }
                int iM36552 = C15469.m36551(sArr[0], 1);
                int iM36553 = C15469.m36551(sArr[1], 0);
                while (i2 < 16) {
                    iArr[i][i2] = C15469.m36550(this.f33694[i], i2 - 8) + iM36552 + iM36553;
                    i2++;
                }
                int iM36554 = C15469.m36551(sArr[1], 1);
                while (true) {
                    int[] iArr3 = iArr[i];
                    if (i2 < iArr3.length) {
                        iArr3[i2] = C15469.m36550(this.f33692, i2 - 16) + iM36552 + iM36554;
                        i2++;
                    }
                }
            }
            i++;
        }
    }
}
