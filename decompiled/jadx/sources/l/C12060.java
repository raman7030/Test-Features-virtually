package l;

/* JADX INFO: renamed from: l.۫֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public class C12060 extends C5855 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f36077;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f36078;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f36079;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5855 m29442(C5855 c5855) {
        int[] iArr;
        int length;
        if (!(c5855 instanceof C9259) || (length = (iArr = ((C9259) c5855).f7231).length) < 4) {
            return c5855;
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
        if (!(c5855 instanceof C3614)) {
            return new C12060(iArr, iArr2, iArr3, c5855.f17958);
        }
        C9944 c9944 = new C9944(iArr, iArr2, iArr3, c5855.f17958);
        for (int i5 : c9944.f36077) {
            c9944.f30026 = Character.charCount(i5) + c9944.f30026;
        }
        return c9944;
    }

    public C12060(int[] iArr, int[] iArr2, int[] iArr3, C5855 c5855) {
        this.f36077 = iArr;
        this.f36078 = iArr2;
        this.f36079 = iArr3;
        this.f17958 = c5855;
    }
}
