package p067l;

/* JADX INFO: renamed from: l.ܰܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes3.dex */
public class C15559 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f44471;

    public C15559() {
        this.f44471 = new byte[32];
    }

    public C15559(C15559 c15559) {
        byte[] bArr = new byte[32];
        this.f44471 = bArr;
        System.arraycopy(c15559.f44471, 0, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m35407(String str, int i) {
        int iM35404 = m35404(str);
        if (i < 255) {
            this.f44471[iM35404] = (byte) (i + 1);
        } else {
            this.f44471[iM35404] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m35406(int i) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f44471;
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

    /* JADX INFO: renamed from: ֫ */
    public int m35405(Object obj) {
        return (this.f44471[m35404(obj)] & 255) - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m35404(Object obj) {
        return obj.hashCode() & (this.f44471.length - 1);
    }
}
