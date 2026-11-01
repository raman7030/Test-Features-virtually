package p067l;

/* JADX INFO: renamed from: l.᩻ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96X */
/* JADX INFO: loaded from: classes.dex */
public class C24643 extends C19279 {
    static {
        ApplicationC14266.m56479(163);
    }

    public native C24643(byte[] bArr, int i, int i2);

    public C24643(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // p067l.C18608
    /* JADX INFO: renamed from: ۧ */
    public final int mo42345(int i) {
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.f55579;
        if (i >= iArr.length) {
            return -this.f55578;
        }
        int i2 = iArr[(iArr.length - i) - 1];
        return this.f55578 >= 0 ? i2 * 31 : i2 ^ 31;
    }
}
