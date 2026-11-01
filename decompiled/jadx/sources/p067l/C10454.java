package p067l;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.۠᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10454 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: ۗ */
    public C17309 f28923;

    /* JADX INFO: renamed from: ۫ */
    public final C17158 f28927;

    /* JADX INFO: renamed from: ۬ */
    public C15080 f28928;

    /* JADX INFO: renamed from: ᩸ */
    public int f28930;

    /* JADX INFO: renamed from: ܰ */
    public static final float[] f28921 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: ۨ */
    public static final String[] f28920 = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: ᩺ */
    public static final FloatBuffer f28922 = C5911.m13286(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: ۛ */
    public final int[] f28925 = new int[3];

    /* JADX INFO: renamed from: ۤ */
    public final int[] f28926 = new int[3];

    /* JADX INFO: renamed from: ۙ */
    public final int[] f28924 = new int[3];

    /* JADX INFO: renamed from: ᩶ */
    public final int[] f28929 = new int[3];

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicReference f28931 = new AtomicReference();

    public C10454(C17158 c17158) {
        this.f28927 = c17158;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f28924;
            this.f28929[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f28926;
        try {
            C17309 c17309 = new C17309("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f28923 = c17309;
            GLES20.glVertexAttribPointer(c17309.m39264("in_pos"), 2, 5126, false, 0, (Buffer) f28922);
            iArr[0] = this.f28923.m39264("in_tc_y");
            iArr[1] = this.f28923.m39264("in_tc_u");
            iArr[2] = this.f28923.m39264("in_tc_v");
            this.f28930 = this.f28923.m39265("mColorConversion");
            C5911.m13287();
            int[] iArr2 = this.f28925;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f28923.m39265(f28920[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C5911.m13288(3553, iArr2[i]);
                }
                C5911.m13287();
            } catch (C4570 unused) {
            }
            C5911.m13287();
        } catch (C4570 unused2) {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        C15080 c15080 = (C15080) this.f28931.getAndSet(null);
        if (c15080 == null && this.f28928 == null) {
            return;
        }
        if (c15080 != null) {
            C15080 c15081 = this.f28928;
            if (c15081 != null) {
                c15081.getClass();
                throw null;
            }
            this.f28928 = c15080;
        }
        this.f28928.getClass();
        GLES20.glUniformMatrix3fv(this.f28930, 1, false, f28921, 0);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24168(C15080 c15080) {
        if (((C15080) this.f28931.getAndSet(c15080)) != null) {
            throw null;
        }
        this.f28927.requestRender();
    }
}
