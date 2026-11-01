package p067l;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: renamed from: l.֨ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3275 {

    /* JADX INFO: renamed from: ۡ */
    public static final float[] f6362 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ۢ */
    public static final float[] f6363 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: ᩷ */
    public static final float[] f6364 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ֫ */
    public C7299 f6365;

    /* JADX INFO: renamed from: ۜ */
    public int f6366;

    /* JADX INFO: renamed from: ۧ */
    public int f6367;

    /* JADX INFO: renamed from: ܳ */
    public int f6368;

    /* JADX INFO: renamed from: ܽ */
    public int f6369;

    /* JADX INFO: renamed from: ܿ */
    public int f6370;

    /* JADX INFO: renamed from: ᩳ */
    public C17309 f6371;

    /* JADX INFO: renamed from: ᩻ */
    public int f6372;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m5698(C20711 c20711) {
        C5958 c5958 = c20711.f63938;
        C5958 c5959 = c20711.f63939;
        return c5958.m13369() == 1 && c5958.m13368().f60897 == 0 && c5959.m13369() == 1 && c5959.m13368().f60897 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5701(C20711 c20711) {
        if (m5698(c20711)) {
            this.f6370 = c20711.f63941;
            this.f6365 = new C7299(c20711.f63938.m13368());
            if (c20711.f63940) {
                return;
            }
            new C7299(c20711.f63939.m13368());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5699() {
        try {
            C17309 c17309 = new C17309("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f6371 = c17309;
            this.f6367 = c17309.m39265("uMvpMatrix");
            this.f6366 = this.f6371.m39265("uTexMatrix");
            this.f6369 = this.f6371.m39264("aPosition");
            this.f6368 = this.f6371.m39264("aTexCoords");
            this.f6372 = this.f6371.m39265("uTexture");
        } catch (C4570 unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5700(int i, float[] fArr) {
        float[] fArr2;
        C7299 c7299 = this.f6365;
        if (c7299 == null) {
            return;
        }
        int i2 = this.f6370;
        if (i2 == 1) {
            fArr2 = f6363;
        } else if (i2 == 2) {
            fArr2 = f6364;
        } else {
            fArr2 = f6362;
        }
        GLES20.glUniformMatrix3fv(this.f6366, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f6367, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f6372, 0);
        try {
            C5911.m13287();
        } catch (C4570 unused) {
        }
        GLES20.glVertexAttribPointer(this.f6369, 3, 5126, false, 12, (Buffer) c7299.f19106);
        try {
            C5911.m13287();
        } catch (C4570 unused2) {
        }
        GLES20.glVertexAttribPointer(this.f6368, 2, 5126, false, 8, (Buffer) c7299.f19105);
        try {
            C5911.m13287();
        } catch (C4570 unused3) {
        }
        GLES20.glDrawArrays(c7299.f19104, 0, c7299.f19107);
        try {
            C5911.m13287();
        } catch (C4570 unused4) {
        }
    }
}
