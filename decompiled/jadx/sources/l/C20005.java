package l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩶ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20005 extends GLSurfaceView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64793 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Sensor f64794;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2366 f64795;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f64796;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Surface f64797;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f64798;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final SensorManager f64799;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15064 f64800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f64801;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64802;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64803;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f64804;

    public C20005(Context context) {
        this(context, null);
    }

    public C20005(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64804 = new CopyOnWriteArrayList();
        this.f64801 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService(am.ac);
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f64799 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f64794 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C15064 c15064 = new C15064();
        this.f64800 = c15064;
        C21416 c21416 = new C21416(this, c15064);
        View.OnTouchListener viewOnTouchListenerC3071 = new ViewOnTouchListenerC3071(context, c21416);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f64795 = new C2366(windowManager.getDefaultDisplay(), viewOnTouchListenerC3071, c21416);
        this.f64798 = true;
        setEGLContextClientVersion(2);
        setRenderer(c21416);
        setOnTouchListener(viewOnTouchListenerC3071);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46141(InterfaceC22121 interfaceC22121) {
        this.f64804.add(interfaceC22121);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46143(InterfaceC22121 interfaceC22121) {
        this.f64804.remove(interfaceC22121);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Surface m46144() {
        return this.f64797;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22618 m46142() {
        return this.f64800;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20711 m46140() {
        return this.f64800;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f64803 = true;
        m46139();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f64803 = false;
        m46139();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f64801.post(new RunnableC19009(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46136(C20005 c20005) {
        Surface surface = c20005.f64797;
        if (surface != null) {
            Iterator it = c20005.f64804.iterator();
            while (it.hasNext()) {
                ((InterfaceC22121) it.next()).mo47227();
            }
        }
        SurfaceTexture surfaceTexture = c20005.f64796;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        c20005.f64796 = null;
        c20005.f64797 = null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46139() {
        boolean z = this.f64798 && this.f64803;
        Sensor sensor = this.f64794;
        if (sensor == null || z == this.f64802) {
            return;
        }
        C2366 c2366 = this.f64795;
        SensorManager sensorManager = this.f64799;
        if (z) {
            sensorManager.registerListener(c2366, sensor, 0);
        } else {
            sensorManager.unregisterListener(c2366);
        }
        this.f64802 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46138(C20005 c20005, SurfaceTexture surfaceTexture) {
        c20005.f64801.post(new RunnableC14191(2, c20005, surfaceTexture));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46137(C20005 c20005, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = c20005.f64796;
        Surface surface = c20005.f64797;
        Surface surface2 = new Surface(surfaceTexture);
        c20005.f64796 = surfaceTexture;
        c20005.f64797 = surface2;
        Iterator it = c20005.f64804.iterator();
        while (it.hasNext()) {
            ((InterfaceC22121) it.next()).mo47226(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
