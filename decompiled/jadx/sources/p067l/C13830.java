package p067l;

/* JADX INFO: renamed from: l.۫֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public class C13830 extends C7933 {

    /* JADX INFO: renamed from: ۧ */
    public int[] f39088;

    /* JADX INFO: renamed from: ܽ */
    public int[] f39089;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f39090;

    /* JADX INFO: renamed from: ֫ */
    public static C7933 m31504(C7933 c7933) {
        int[] iArr;
        int length;
        if (!(c7933 instanceof C11168) || (length = (iArr = ((C11168) c7933).f10016).length) < 4) {
            return c7933;
        }
        int[] iArr2 = new int[128];
        int[] iArr3 = new int[length];
        int i = 0;
        while (i < length) {
            int i2 = iArr[i] & 127;
            i++;
            iArr2[i2] = i;
        }
        for (int i3 = length; i3 > 0; i3--) {
            int i4 = length - 1;
            while (true) {
                if (i4 < i3) {
                    while (i4 > 0) {
                        i4--;
                        iArr3[i4] = i3;
                    }
                    break;
                }
                if (iArr[i4] != iArr[i4 - i3]) {
                    break;
                }
                iArr3[i4 - 1] = i3;
                i4--;
            }
        }
        iArr3[length - 1] = 1;
        if (!(c7933 instanceof C5803)) {
            return new C13830(iArr, iArr2, iArr3, c7933.f20809);
        }
        C11819 c11819 = new C11819(iArr, iArr2, iArr3, c7933.f20809);
        for (int i5 : c11819.f39088) {
            c11819.f32983 = Character.charCount(i5) + c11819.f32983;
        }
        return c11819;
    }

    public C13830(int[] iArr, int[] iArr2, int[] iArr3, C7933 c7933) {
        this.f39088 = iArr;
        this.f39089 = iArr2;
        this.f39090 = iArr3;
        this.f20809 = c7933;
    }
}
