package l;

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
public final class C8507 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15721 f26008;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15561 f26012;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13375 f26013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final float[] f26006 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f26005 = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final FloatBuffer f26007 = C3728.m11334(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int[] f26010 = new int[3];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f26011 = new int[3];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f26009 = new int[3];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f26014 = new int[3];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicReference f26016 = new AtomicReference();

    public C8507(C15561 c15561) {
        this.f26012 = c15561;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f26009;
            this.f26014[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f26011;
        try {
            C15721 c15721 = new C15721("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f26008 = c15721;
            GLES20.glVertexAttribPointer(c15721.m37095("in_pos"), 2, 5126, false, 0, (Buffer) f26007);
            iArr[0] = this.f26008.m37095("in_tc_y");
            iArr[1] = this.f26008.m37095("in_tc_u");
            iArr[2] = this.f26008.m37095("in_tc_v");
            this.f26015 = this.f26008.m37096("mColorConversion");
            C3728.m11335();
            int[] iArr2 = this.f26010;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f26008.m37096(f26005[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C3728.m11336(3553, iArr2[i]);
                }
                C3728.m11335();
            } catch (C2317 unused) {
            }
            C3728.m11335();
        } catch (C2317 unused2) {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        C13375 c13375 = (C13375) this.f26016.getAndSet(null);
        if (c13375 == null && this.f26013 == null) {
            return;
        }
        if (c13375 != null) {
            C13375 c13376 = this.f26013;
            if (c13376 != null) {
                c13376.getClass();
                throw null;
            }
            this.f26013 = c13375;
        }
        this.f26013.getClass();
        GLES20.glUniformMatrix3fv(this.f26015, 1, false, f26006, 0);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22200(C13375 c13375) {
        if (((C13375) this.f26016.getAndSet(c13375)) != null) {
            throw null;
        }
        this.f26012.requestRender();
    }
}
