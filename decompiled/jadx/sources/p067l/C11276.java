package p067l;

import android.opengl.GLES20;

/* JADX INFO: renamed from: l.ۢۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11276 {

    /* JADX INFO: renamed from: ֫ */
    public final String f31427;

    /* JADX INFO: renamed from: ֫ */
    public static C11276 m26204(int i, int i2) {
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
        return new C11276(str);
    }

    public C11276(String str) {
        this.f31427 = str;
    }
}
