package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7968 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24611;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24612;

    public /* synthetic */ RunnableC7968(int i, Object obj) {
        this.f24611 = i;
        this.f24612 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24611;
        Object obj = this.f24612;
        switch (i) {
            case 0:
                C21374.m48461((C21374) obj);
                return;
            case 1:
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) obj;
                try {
                    EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
                    if (C17229.isDirectory(interfaceC20758, enumC14406)) {
                        if (C17229.exists(interfaceC20758.resolve("session.lock"), enumC14406)) {
                            C23721.m52302(interfaceC20758);
                            return;
                        }
                        InterfaceC17664 list = C17229.list(interfaceC20758);
                        try {
                            if (list.findAny().isPresent()) {
                                list.close();
                                return;
                            }
                            list.close();
                            C17229.deleteIfExists(interfaceC20758);
                            InterfaceC23015.f74090.mo28630(interfaceC20758.getParent());
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
                    throw new C13452(e);
                }
            case 2:
                ((TextView) obj).setText(R.string.MT_Protector);
                return;
            case 3:
                C0123.m1190((C0123) obj);
                return;
            case 4:
                ((ServiceC8961) obj).m23101();
                return;
            case 5:
                TextureViewSurfaceTextureListenerC22160.m49781((TextureViewSurfaceTextureListenerC22160) obj);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                    if (C3424.m10397() == 3.1d) {
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
