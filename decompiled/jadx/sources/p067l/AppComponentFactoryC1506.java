package p067l;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: renamed from: l.۬᩹ */
/* JADX INFO: compiled from: 922P */
/* JADX INFO: loaded from: classes3.dex */
public class AppComponentFactoryC1506 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m34490(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m34490(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m34490(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m34490(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m34490(super.instantiateService(classLoader, str, intent));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m34490(Object obj) {
        Object objM12709;
        return (!(obj instanceof InterfaceC1016) || (objM12709 = ((InterfaceC1016) obj).m12709()) == null) ? obj : objM12709;
    }
}
