package p067l;

/* JADX INFO: renamed from: l.۫ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14235 {

    /* JADX INFO: renamed from: ֫ */
    public final C8200 f40540;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC12224 mo17847(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC12224 mo17848(char[] cArr, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17849();

    public AbstractC14235(C8200 c8200) {
        this.f40540 = c8200;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m32717(String str) {
        char[] charArray = str.toCharArray();
        return mo17848(charArray, charArray.length);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m32716(int i, int i2, byte[] bArr) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = (i4 << 5) - i4;
            i3++;
            i4 = bArr[i] + i5;
            i++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32715(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i + i4] == bArr2[i2 + i4]) {
            i4++;
        }
        return i4 == i3;
    }
}
