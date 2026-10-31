package l;

/* JADX INFO: renamed from: l.᩻ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96X */
/* JADX INFO: loaded from: classes.dex */
public class C23437 extends C17793 {
    static {
        ApplicationC12518.m30701(163);
    }

    public native C23437(byte[] bArr, int i, int i2);

    public C23437(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // l.C17087
    /* JADX INFO: renamed from: ۧ */
    public final int mo40100(int i) {
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.f52396;
        if (i >= iArr.length) {
            return -this.f52395;
        }
        int i2 = iArr[(iArr.length - i) - 1];
        return this.f52395 >= 0 ? i2 * 31 : i2 ^ 31;
    }
}
