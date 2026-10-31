package l;

import android.opengl.GLES20;

/* JADX INFO: renamed from: l.ۢۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9373 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f28478;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9373 m24194(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35722, iArr, 0);
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] == 0) {
                i3 = i4;
                break;
            }
        }
        String str = new String(bArr, 0, i3);
        GLES20.glGetAttribLocation(i, str);
        return new C9373(str);
    }

    public C9373(String str) {
        this.f28478 = str;
    }
}
