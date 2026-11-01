package p067l;

/* JADX INFO: renamed from: l.ܳܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O7II */
/* JADX INFO: loaded from: classes4.dex */
public final class C16259 extends AbstractC8018 {

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f47818 = 0;

    @Override // p067l.AbstractC8018
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo18597() {
        return m18599();
    }

    @Override // p067l.AbstractC8018, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        m18600(i, i2, bArr);
    }
}
