package p067l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2267 */
/* JADX INFO: loaded from: classes.dex */
public final class C23424 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[][] f74624;

    /* JADX INFO: renamed from: ۧ */
    public final int f74625;

    /* JADX INFO: renamed from: ܽ */
    public final int f74626;

    public C23424(int i, int i2) {
        this.f74624 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f74626 = i;
        this.f74625 = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m52111() {
        return this.f74625;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m52112() {
        return this.f74626;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m52106(int i, int i2) {
        return this.f74624[i2][i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[][] m52110() {
        return this.f74624;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52108(int i, int i2, int i3) {
        this.f74624[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52109(int i, int i2, boolean z) {
        this.f74624[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52107() {
        for (byte[] bArr : this.f74624) {
            Arrays.fill(bArr, (byte) -1);
        }
    }

    public final String toString() {
        int i = this.f74626;
        int i2 = this.f74625;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f74624[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append(EnumC2483.f3919);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
