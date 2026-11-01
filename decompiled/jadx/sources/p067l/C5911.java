package p067l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import com.google.android.material.internal.ManufacturerUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: l.ۘۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5911 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m13291(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i < 26 && (ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return m13292("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m13294() {
        return m13292("EGL_KHR_surfaceless_context");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13290(int i) {
        if (i == 6) {
            return m13293();
        }
        if (i == 7) {
            return m13292("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m13293() {
        return Build.VERSION.SDK_INT >= 33 && m13292("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13292(String str) throws C4570 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        m13289("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        m13289("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        m13287();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13287() throws C4570 {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = C1514.m34687(new StringBuilder("error code: 0x"), iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C4570(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static FloatBuffer m13286(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13288(int i, int i2) throws C4570 {
        GLES20.glBindTexture(i, i2);
        m13287();
        GLES20.glTexParameteri(i, 10240, 9729);
        m13287();
        GLES20.glTexParameteri(i, 10241, 9729);
        m13287();
        GLES20.glTexParameteri(i, 10242, 33071);
        m13287();
        GLES20.glTexParameteri(i, 10243, 33071);
        m13287();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13289(String str, boolean z) throws C4570 {
        if (!z) {
            throw new C4570(str);
        }
    }
}
