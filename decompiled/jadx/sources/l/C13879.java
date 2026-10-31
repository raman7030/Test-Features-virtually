package l;

/* JADX INFO: renamed from: l.ܰܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes3.dex */
public class C13879 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f41390;

    public C13879() {
        this.f41390 = new byte[32];
    }

    public C13879(C13879 c13879) {
        byte[] bArr = new byte[32];
        this.f41390 = bArr;
        System.arraycopy(c13879.f41390, 0, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m33288(String str, int i) {
        int iM33285 = m33285(str);
        if (i < 255) {
            this.f41390[iM33285] = (byte) (i + 1);
        } else {
            this.f41390[iM33285] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m33287(int i) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f41390;
            if (i2 >= bArr.length) {
                return;
            }
            byte b = bArr[i2];
            int i3 = i + 1;
            if ((b & 255) == i3) {
                bArr[i2] = 0;
            } else if ((b & 255) > i3) {
                bArr[i2] = (byte) (b - 1);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m33286(Object obj) {
        return (this.f41390[m33285(obj)] & 255) - 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m33285(Object obj) {
        return obj.hashCode() & (this.f41390.length - 1);
    }
}
