package l;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15721 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f48488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9373[] f48489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f48490;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8667[] f48491;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f48492;

    public C15721(String str, String str2) throws C2317 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f48490 = iGlCreateProgram;
        C3728.m11335();
        m37094(iGlCreateProgram, 35633, str);
        m37094(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        C3728.m11337("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f48488 = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f48489 = new C9373[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C9373 c9373M24194 = C9373.m24194(this.f48490, i);
            this.f48489[i] = c9373M24194;
            this.f48488.put(c9373M24194.f28478, c9373M24194);
        }
        this.f48492 = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f48490, 35718, iArr3, 0);
        this.f48491 = new C8667[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C8667 c8667M22424 = C8667.m22424(this.f48490, i2);
            this.f48491[i2] = c8667M22424;
            this.f48492.put(c8667M22424.f26435, c8667M22424);
        }
        C3728.m11335();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37094(int i, int i2, String str) throws C2317 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        C3728.m11337(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        C3728.m11335();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37095(String str) throws C2317 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f48490, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        C3728.m11335();
        return iGlGetAttribLocation;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37096(String str) {
        return GLES20.glGetUniformLocation(this.f48490, str);
    }
}
