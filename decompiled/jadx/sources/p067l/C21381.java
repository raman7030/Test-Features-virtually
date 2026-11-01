package p067l;

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
import com.umeng.analytics.pro.C0655am;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩶ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21381 extends GLSurfaceView {

    /* JADX INFO: renamed from: ܰ */
    public static final /* synthetic */ int f67435 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final Sensor f67436;

    /* JADX INFO: renamed from: ۙ */
    public final C4617 f67437;

    /* JADX INFO: renamed from: ۛ */
    public SurfaceTexture f67438;

    /* JADX INFO: renamed from: ۤ */
    public Surface f67439;

    /* JADX INFO: renamed from: ۨ */
    public boolean f67440;

    /* JADX INFO: renamed from: ۫ */
    public final SensorManager f67441;

    /* JADX INFO: renamed from: ۬ */
    public final C16685 f67442;

    /* JADX INFO: renamed from: ᩶ */
    public final Handler f67443;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f67444;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f67445;

    /* JADX INFO: renamed from: ᩺ */
    public final CopyOnWriteArrayList f67446;

    public C21381(Context context) {
        this(context, null);
    }

    public C21381(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67446 = new CopyOnWriteArrayList();
        this.f67443 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService(C0655am.f2301ac);
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f67441 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f67436 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C16685 c16685 = new C16685();
        this.f67442 = c16685;
        C22722 c22722 = new C22722(this, c16685);
        View.OnTouchListener viewOnTouchListenerC5287 = new ViewOnTouchListenerC5287(context, c22722);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f67437 = new C4617(windowManager.getDefaultDisplay(), viewOnTouchListenerC5287, c22722);
        this.f67440 = true;
        setEGLContextClientVersion(2);
        setRenderer(c22722);
        setOnTouchListener(viewOnTouchListenerC5287);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48456(InterfaceC23392 interfaceC23392) {
        this.f67446.add(interfaceC23392);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48458(InterfaceC23392 interfaceC23392) {
        this.f67446.remove(interfaceC23392);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Surface m48459() {
        return this.f67439;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23865 m48457() {
        return this.f67442;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22052 m48455() {
        return this.f67442;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f67445 = true;
        m48454();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f67445 = false;
        m48454();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f67443.post(new RunnableC20435(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48451(C21381 c21381) {
        Surface surface = c21381.f67439;
        if (surface != null) {
            Iterator it = c21381.f67446.iterator();
            while (it.hasNext()) {
                ((InterfaceC23392) it.next()).mo49554();
            }
        }
        SurfaceTexture surfaceTexture = c21381.f67438;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        c21381.f67438 = null;
        c21381.f67439 = null;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48454() {
        boolean z = this.f67440 && this.f67445;
        Sensor sensor = this.f67436;
        if (sensor == null || z == this.f67444) {
            return;
        }
        C4617 c4617 = this.f67437;
        SensorManager sensorManager = this.f67441;
        if (z) {
            sensorManager.registerListener(c4617, sensor, 0);
        } else {
            sensorManager.unregisterListener(c4617);
        }
        this.f67444 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48453(C21381 c21381, SurfaceTexture surfaceTexture) {
        c21381.f67443.post(new RunnableC15855(2, c21381, surfaceTexture));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48452(C21381 c21381, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = c21381.f67438;
        Surface surface = c21381.f67439;
        Surface surface2 = new Surface(surfaceTexture);
        c21381.f67438 = surfaceTexture;
        c21381.f67439 = surface2;
        Iterator it = c21381.f67446.iterator();
        while (it.hasNext()) {
            ((InterfaceC23392) it.next()).mo49553(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
