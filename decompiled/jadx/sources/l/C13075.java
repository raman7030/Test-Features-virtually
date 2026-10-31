package l;

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
public final class C13075 implements InterfaceC7163 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39150;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13512 f39151;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface f39152;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39153;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8137 f39154;

    @Override // l.InterfaceC7163
    /* JADX INFO: renamed from: ۧ */
    public final void mo19186(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        C11233.m27805(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f39152;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f39150;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f39153;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f39152) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SidecarInterface m31688() {
        return this.f39152;
    }

    public C13075(Context context) {
        SidecarInterface sidecarInterfaceM35923 = C15191.m35923(context);
        C8137 c8137 = new C8137(0);
        this.f39152 = sidecarInterfaceM35923;
        this.f39154 = c8137;
        this.f39153 = new LinkedHashMap();
        this.f39150 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31690(C12370 c12370) {
        this.f39151 = new C21543(c12370);
        SidecarInterface sidecarInterface = this.f39152;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new C22248(this.f39154, new C4609(this)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31689(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f39153;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f39152;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f39152) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC13512 interfaceC13512 = this.f39151;
        if (interfaceC13512 != null) {
            ((C21543) interfaceC13512).m48702(activity, m31692(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f39150;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacksC3198 componentCallbacksC3198 = new ComponentCallbacksC3198(this, activity);
            linkedHashMap2.put(activity, componentCallbacksC3198);
            activity.registerComponentCallbacks(componentCallbacksC3198);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31691() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f39152;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!C11233.m27802(returnType, cls5)) {
                throw new NoSuchMethodException(C11233.m27806(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.f39152;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f39152;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f39152;
            Method method2 = (sidecarInterface4 == null || (cls4 = sidecarInterface4.getClass()) == null) ? null : cls4.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!C11233.m27802(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(C11233.m27806(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.f39152;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!C11233.m27802(returnType3, cls5)) {
                throw new NoSuchMethodException(C11233.m27806(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.f39152;
            Method method4 = (sidecarInterface6 == null || (cls3 = sidecarInterface6.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!C11233.m27802(returnType4, cls5)) {
                throw new NoSuchMethodException(C11233.m27806(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
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
            C11233.m27803(rect, "displayFeature.rect");
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

    @Override // l.InterfaceC7163
    /* JADX INFO: renamed from: ֫ */
    public final void mo19185(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            m31689(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC20132(this, activity));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17473 m31692(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C17473(C8969.f27244);
        }
        SidecarInterface sidecarInterface = this.f39152;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.f39152;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f39154.m21608(windowLayoutInfo, deviceState);
    }
}
