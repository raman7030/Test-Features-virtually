package l;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: renamed from: l.۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 922P */
/* JADX INFO: loaded from: classes3.dex */
public class AppComponentFactoryC13393 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m32388(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m32388(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m32388(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m32388(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m32388(super.instantiateService(classLoader, str, intent));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m32388(Object obj) {
        Object objM10713;
        return (!(obj instanceof InterfaceC3516) || (objM10713 = ((InterfaceC3516) obj).m10713()) == null) ? obj : objM10713;
    }
}
