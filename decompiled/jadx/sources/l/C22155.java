package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2267 */
/* JADX INFO: loaded from: classes.dex */
public final class C22155 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[][] f71902;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f71903;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f71904;

    public C22155(int i, int i2) {
        this.f71902 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f71904 = i;
        this.f71903 = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49773() {
        return this.f71903;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49774() {
        return this.f71904;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m49768(int i, int i2) {
        return this.f71902[i2][i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[][] m49772() {
        return this.f71902;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49770(int i, int i2, int i3) {
        this.f71902[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49771(int i, int i2, boolean z) {
        this.f71902[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49769() {
        for (byte[] bArr : this.f71902) {
            Arrays.fill(bArr, (byte) -1);
        }
    }

    public final String toString() {
        int i = this.f71904;
        int i2 = this.f71903;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f71902[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append(EnumC0121.f1143);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
