package p067l;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17309 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f51628;

    /* JADX INFO: renamed from: ۧ */
    public final C11276[] f51629;

    /* JADX INFO: renamed from: ܽ */
    public final int f51630;

    /* JADX INFO: renamed from: ܿ */
    public final C10605[] f51631;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f51632;

    public C17309(String str, String str2) throws C4570 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f51630 = iGlCreateProgram;
        C5911.m13287();
        m39263(iGlCreateProgram, 35633, str);
        m39263(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        C5911.m13289("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f51628 = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f51629 = new C11276[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C11276 c11276M26204 = C11276.m26204(this.f51630, i);
            this.f51629[i] = c11276M26204;
            this.f51628.put(c11276M26204.f31427, c11276M26204);
        }
        this.f51632 = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f51630, 35718, iArr3, 0);
        this.f51631 = new C10605[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C10605 c10605M24393 = C10605.m24393(this.f51630, i2);
            this.f51631[i2] = c10605M24393;
            this.f51632.put(c10605M24393.f29360, c10605M24393);
        }
        C5911.m13287();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39263(int i, int i2, String str) throws C4570 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        C5911.m13289(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        C5911.m13287();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39264(String str) throws C4570 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f51630, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        C5911.m13287();
        return iGlGetAttribLocation;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m39265(String str) {
        return GLES20.glGetUniformLocation(this.f51630, str);
    }
}
