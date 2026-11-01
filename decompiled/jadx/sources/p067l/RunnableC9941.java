package p067l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9941 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27524;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f27525;

    public /* synthetic */ RunnableC9941(int i, Object obj) {
        this.f27524 = i;
        this.f27525 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f27524;
        Object obj = this.f27525;
        switch (i) {
            case 0:
                C22682.m50797((C22682) obj);
                return;
            case 1:
                InterfaceC22097 interfaceC22097 = (InterfaceC22097) obj;
                try {
                    EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
                    if (C18743.isDirectory(interfaceC22097, enumC16060)) {
                        if (C18743.exists(interfaceC22097.resolve("session.lock"), enumC16060)) {
                            C24913.m54705(interfaceC22097);
                            return;
                        }
                        InterfaceC19157 list = C18743.list(interfaceC22097);
                        try {
                            if (list.findAny().isPresent()) {
                                list.close();
                                return;
                            }
                            list.close();
                            C18743.deleteIfExists(interfaceC22097);
                            InterfaceC24242.f76829.mo30678(interfaceC22097.getParent());
                            return;
                        } catch (Throwable th) {
                            if (list != null) {
                                try {
                                    list.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    }
                    return;
                } catch (IOException e) {
                    throw new C15154(e);
                }
            case 2:
                ((TextView) obj).setText(R.string.MT_Protector);
                return;
            case 3:
                C2485.m3591((C2485) obj);
                return;
            case 4:
                ((ServiceC10885) obj).m25075();
                return;
            case 5:
                TextureViewSurfaceTextureListenerC23429.m52119((TextureViewSurfaceTextureListenerC23429) obj);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                    if (C5623.m12436() == 3.1d) {
                        context.startActivity(intent);
                    } else {
                        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                        context.startActivity(intent);
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = new Intent();
                    intent2.setFlags(268435456);
                    intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
                    context.startActivity(intent2);
                    return;
                } catch (SecurityException unused2) {
                    Intent intent3 = new Intent();
                    intent3.setFlags(268435456);
                    intent3.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                    context.startActivity(intent3);
                    return;
                } catch (Exception unused3) {
                    throw new RuntimeException("intent is not available!");
                }
        }
    }
}
