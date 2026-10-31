package l;

/* JADX INFO: renamed from: l.۫ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6136 f37517;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC10370 mo15926(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC10370 mo15927(char[] cArr, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15928();

    public AbstractC12486(C6136 c6136) {
        this.f37517 = c6136;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m30652(String str) {
        char[] charArray = str.toCharArray();
        return mo15927(charArray, charArray.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30651(int i, int i2, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30650(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i + i4] == bArr2[i2 + i4]) {
            i4++;
        }
        return i4 == i3;
    }
}
