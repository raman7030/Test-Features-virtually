package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ᩶ */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1013 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: ۛ֨ۘ, reason: not valid java name and contains not printable characters */
    public static int f81940;

    /* JADX INFO: renamed from: ᩶ */
    public final Handler f13724;

    /* JADX INFO: renamed from: ᩹ */
    public final Context f13726;

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f13723 = new HashMap();

    /* JADX INFO: renamed from: ᩸ */
    public Set f13725 = new HashSet();

    /* JADX INFO: renamed from: ֨֫ۜ, reason: not valid java name and contains not printable characters */
    public static int m56149(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ۗܳ֡, reason: not valid java name and contains not printable characters */
    public static void m56150(Object obj, Object obj2, Object obj3) {
        ((C19179) obj).m43672((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۘ۟᩻, reason: not valid java name and contains not printable characters */
    public static boolean m56151(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۘ᩷۟, reason: not valid java name and contains not printable characters */
    public static int m56152(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ۘ᩺۫, reason: not valid java name and contains not printable characters */
    public static boolean m56153(Object obj) {
        return ((C10748) obj).m24763();
    }

    /* JADX INFO: renamed from: ۙ۟ܳ, reason: not valid java name and contains not printable characters */
    public static C5276 m56154(Object obj, Object obj2) {
        return C5276.m11410((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۠ۛۚ, reason: not valid java name and contains not printable characters */
    public static void m56155(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC5549) obj).m12259((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ۤ᩷᩸, reason: not valid java name and contains not printable characters */
    public static String m56156(int i) {
        return C7050.m16224(i);
    }

    /* JADX INFO: renamed from: ۨ۟ۜ, reason: not valid java name and contains not printable characters */
    public static int m56157() {
        return 919794337;
    }

    /* JADX INFO: renamed from: ۬᩶᩹, reason: not valid java name and contains not printable characters */
    public static int m56158(Object obj, int i) {
        return ((AbstractC6086) obj).mo13855(i);
    }

    /* JADX INFO: renamed from: ܰۖ۬, reason: not valid java name and contains not printable characters */
    public static String m56159(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ܳܽ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56160(Object obj) {
        return C17384.m39540((AbstractC17043) obj);
    }

    /* JADX INFO: renamed from: ᩶ܶۡ, reason: not valid java name and contains not printable characters */
    public static String m56161(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷ᩴ۬, reason: not valid java name and contains not printable characters */
    public static boolean m56162(Object obj) {
        return ((AbstractC17043) obj).mo25087();
    }

    /* JADX INFO: renamed from: ᩻ۘ᩻, reason: not valid java name and contains not printable characters */
    public static void m56163(Object obj, Object obj2) {
        ((InterfaceC14936) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܿۜ, reason: not valid java name and contains not printable characters */
    public static void m56164(Object obj) {
        ((Lock) obj).unlock();
    }

    public ServiceConnectionC1013(Context context) {
        this.f13726 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f13724 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12580(C1958 c1958) {
        this.f13724.obtainMessage(0, c1958).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Context context = this.f13726;
        HashMap map = this.f13723;
        if (i == 0) {
            InterfaceC1503 interfaceC1503 = (InterfaceC1503) message.obj;
            Set setM32965 = C1468.m32965(context);
            if (!setM32965.equals(this.f13725)) {
                this.f13725 = setM32965;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (((HashSet) setM32965).contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C12826.toString(componentName2);
                        }
                        map.put(componentName2, new C1083(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C12826.toString(entry.getKey());
                        }
                        C1083 c1083 = (C1083) entry.getValue();
                        if (c1083.f18206) {
                            context.unbindService(this);
                            c1083.f18206 = false;
                        }
                        c1083.f18210 = null;
                        it.remove();
                    }
                }
            }
            for (C1083 c1084 : map.values()) {
                c1084.f18209.add(interfaceC1503);
                m12578(c1084);
            }
        } else if (i == 1) {
            C1853 c1853 = (C1853) message.obj;
            ComponentName componentName3 = c1853.f68462;
            IBinder iBinder = c1853.f68463;
            C1083 c1085 = (C1083) map.get(componentName3);
            if (c1085 != null) {
                c1085.f18210 = AbstractBinderC1369.m28715(iBinder);
                c1085.f18208 = 0;
                m12578(c1085);
                return true;
            }
        } else if (i == 2) {
            C1083 c1086 = (C1083) map.get((ComponentName) message.obj);
            if (c1086 != null) {
                if (c1086.f18206) {
                    context.unbindService(this);
                    c1086.f18206 = false;
                }
                c1086.f18210 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C1083 c1087 = (C1083) map.get((ComponentName) message.obj);
            if (c1087 != null) {
                m12578(c1087);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C12826.toString(componentName);
        }
        this.f13724.obtainMessage(1, new C1853(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C12826.toString(componentName);
        }
        this.f13724.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m12579(C1083 c1083) {
        ComponentName componentName = c1083.f18207;
        ArrayDeque arrayDeque = c1083.f18209;
        Handler handler = this.f13724;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c1083.f18208;
        int i2 = i + 1;
        c1083.f18208 = i2;
        if (i2 > 6) {
            arrayDeque.size();
            C12826.toString(componentName);
            arrayDeque.clear();
        } else {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12578(C1083 c1083) {
        boolean z;
        ArrayDeque arrayDeque = c1083.f18209;
        ComponentName componentName = c1083.f18207;
        if (Log.isLoggable("NotifManCompat", 3)) {
            C12826.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c1083.f18206) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f13726;
            boolean zBindService = context.bindService(component, this, 33);
            c1083.f18206 = zBindService;
            if (zBindService) {
                c1083.f18208 = 0;
            } else {
                C12826.toString(componentName);
                context.unbindService(this);
            }
            z = c1083.f18206;
        }
        if (!z || c1083.f18210 == null) {
            m12579(c1083);
            return;
        }
        while (true) {
            InterfaceC1503 interfaceC1503 = (InterfaceC1503) arrayDeque.peek();
            if (interfaceC1503 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    interfaceC1503.toString();
                }
                interfaceC1503.mo34412(c1083.f18210);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    C12826.toString(componentName);
                }
            } catch (RemoteException unused2) {
                C12826.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m12579(c1083);
    }
}
