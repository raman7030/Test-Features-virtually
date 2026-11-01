package p067l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14795 implements InterfaceC9176 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f42198;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC15210 f42199;

    /* JADX INFO: renamed from: ܽ */
    public final SidecarInterface f42200;

    /* JADX INFO: renamed from: ܿ */
    public final LinkedHashMap f42201;

    /* JADX INFO: renamed from: ᩳ */
    public final C10102 f42202;

    @Override // p067l.InterfaceC9176
    /* JADX INFO: renamed from: ۧ */
    public final void mo21129(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        C13045.m29867(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f42200;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f42198;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f42201;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f42200) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final SidecarInterface m33776() {
        return this.f42200;
    }

    public C14795(Context context) {
        SidecarInterface sidecarInterfaceM38083 = C16806.m38083(context);
        C10102 c10102 = new C10102(0);
        this.f42200 = sidecarInterfaceM38083;
        this.f42202 = c10102;
        this.f42201 = new LinkedHashMap();
        this.f42198 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33778(C14125 c14125) {
        this.f42199 = new C22843(c14125);
        SidecarInterface sidecarInterface = this.f42200;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new C23513(this.f42202, new C6749(this)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33777(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f42201;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f42200;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f42200) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC15210 interfaceC15210 = this.f42199;
        if (interfaceC15210 != null) {
            ((C22843) interfaceC15210).m51047(activity, m33780(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f42198;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacksC5408 componentCallbacksC5408 = new ComponentCallbacksC5408(this, activity);
            linkedHashMap2.put(activity, componentCallbacksC5408);
            activity.registerComponentCallbacks(componentCallbacksC5408);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m33779() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f42200;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!C13045.m29864(returnType, cls5)) {
                throw new NoSuchMethodException(C13045.m29868(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.f42200;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f42200;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f42200;
            Method method2 = (sidecarInterface4 == null || (cls4 = sidecarInterface4.getClass()) == null) ? null : cls4.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!C13045.m29864(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(C13045.m29868(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.f42200;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!C13045.m29864(returnType3, cls5)) {
                throw new NoSuchMethodException(C13045.m29868(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.f42200;
            Method method4 = (sidecarInterface6 == null || (cls3 = sidecarInterface6.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!C13045.m29864(returnType4, cls5)) {
                throw new NoSuchMethodException(C13045.m29868(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            C13045.m29865(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 != null) {
                    if (!arrayList.equals((List) objInvoke2)) {
                        throw new Exception("Invalid display feature getter/setter");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    @Override // p067l.InterfaceC9176
    /* JADX INFO: renamed from: ֫ */
    public final void mo21128(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            m33777(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC21502(this, activity));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18975 m33780(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C18975(C10893.f30179);
        }
        SidecarInterface sidecarInterface = this.f42200;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.f42200;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f42202.m23576(windowLayoutInfo, deviceState);
    }
}
