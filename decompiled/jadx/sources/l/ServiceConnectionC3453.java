package l;

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

/* JADX INFO: renamed from: l.ۗ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC3453 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: ۛ֨ۘ, reason: not valid java name and contains not printable characters */
    public static int f10921;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f10923;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Context f10925;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f10922 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f10924 = new HashSet();

    /* JADX INFO: renamed from: ֨֫ۜ, reason: not valid java name and contains not printable characters */
    public static int m10554(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ۗܳ֡, reason: not valid java name and contains not printable characters */
    public static void m10556(Object obj, Object obj2, Object obj3) {
        ((C17687) obj).m41426((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۘ۟᩻, reason: not valid java name and contains not printable characters */
    public static boolean m10557(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۘ᩷۟, reason: not valid java name and contains not printable characters */
    public static int m10558(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ۘ᩺۫, reason: not valid java name and contains not printable characters */
    public static boolean m10559(Object obj) {
        return ((C8817) obj).m22793();
    }

    /* JADX INFO: renamed from: ۙ۟ܳ, reason: not valid java name and contains not printable characters */
    public static C3059 m10560(Object obj, Object obj2) {
        return C3059.m9368((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۠ۛۚ, reason: not valid java name and contains not printable characters */
    public static void m10561(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC3346) obj).m10223((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ۤ᩷᩸, reason: not valid java name and contains not printable characters */
    public static String m10562(int i) {
        return C4925.m14327(i);
    }

    /* JADX INFO: renamed from: ۨ۟ۜ, reason: not valid java name and contains not printable characters */
    public static int m10564() {
        return 919794337;
    }

    /* JADX INFO: renamed from: ۬᩶᩹, reason: not valid java name and contains not printable characters */
    public static int m10565(Object obj, int i) {
        return ((AbstractC3912) obj).mo11935(i);
    }

    /* JADX INFO: renamed from: ܰۖ۬, reason: not valid java name and contains not printable characters */
    public static String m10566(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ܳܽ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m10567(Object obj) {
        return C15799.m37369((AbstractC15440) obj);
    }

    /* JADX INFO: renamed from: ᩶ܶۡ, reason: not valid java name and contains not printable characters */
    public static String m10568(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷ᩴ۬, reason: not valid java name and contains not printable characters */
    public static boolean m10569(Object obj) {
        return ((AbstractC15440) obj).mo23113();
    }

    /* JADX INFO: renamed from: ᩻ۘ᩻, reason: not valid java name and contains not printable characters */
    public static void m10570(Object obj, Object obj2) {
        ((InterfaceC13223) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܿۜ, reason: not valid java name and contains not printable characters */
    public static void m10571(Object obj) {
        ((Lock) obj).unlock();
    }

    public ServiceConnectionC3453(Context context) {
        this.f10925 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f10923 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10572(C22503 c22503) {
        this.f10923.obtainMessage(0, c22503).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Context context = this.f10925;
        HashMap map = this.f10922;
        if (i == 0) {
            InterfaceC13330 interfaceC13330 = (InterfaceC13330) message.obj;
            Set setM30888 = C12625.m30888(context);
            if (!setM30888.equals(this.f10924)) {
                this.f10924 = setM30888;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (((HashSet) setM30888).contains(resolveInfo.serviceInfo.packageName)) {
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
                            C11003.toString(componentName2);
                        }
                        map.put(componentName2, new C4864(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            C11003.toString(entry.getKey());
                        }
                        C4864 c4864 = (C4864) entry.getValue();
                        if (c4864.f15375) {
                            context.unbindService(this);
                            c4864.f15375 = false;
                        }
                        c4864.f15379 = null;
                        it.remove();
                    }
                }
            }
            for (C4864 c4865 : map.values()) {
                c4865.f15378.add(interfaceC13330);
                m10555(c4865);
            }
        } else if (i == 1) {
            C20387 c20387 = (C20387) message.obj;
            ComponentName componentName3 = c20387.f65786;
            IBinder iBinder = c20387.f65787;
            C4864 c4866 = (C4864) map.get(componentName3);
            if (c4866 != null) {
                c4866.f15379 = AbstractBinderC10634.m26675(iBinder);
                c4866.f15377 = 0;
                m10555(c4866);
                return true;
            }
        } else if (i == 2) {
            C4864 c4867 = (C4864) map.get((ComponentName) message.obj);
            if (c4867 != null) {
                if (c4867.f15375) {
                    context.unbindService(this);
                    c4867.f15375 = false;
                }
                c4867.f15379 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C4864 c4868 = (C4864) map.get((ComponentName) message.obj);
            if (c4868 != null) {
                m10555(c4868);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C11003.toString(componentName);
        }
        this.f10923.obtainMessage(1, new C20387(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            C11003.toString(componentName);
        }
        this.f10923.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m10563(C4864 c4864) {
        ComponentName componentName = c4864.f15376;
        ArrayDeque arrayDeque = c4864.f15378;
        Handler handler = this.f10923;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c4864.f15377;
        int i2 = i + 1;
        c4864.f15377 = i2;
        if (i2 > 6) {
            arrayDeque.size();
            C11003.toString(componentName);
            arrayDeque.clear();
        } else {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10555(C4864 c4864) {
        boolean z;
        ArrayDeque arrayDeque = c4864.f15378;
        ComponentName componentName = c4864.f15376;
        if (Log.isLoggable("NotifManCompat", 3)) {
            C11003.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c4864.f15375) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f10925;
            boolean zBindService = context.bindService(component, this, 33);
            c4864.f15375 = zBindService;
            if (zBindService) {
                c4864.f15377 = 0;
            } else {
                C11003.toString(componentName);
                context.unbindService(this);
            }
            z = c4864.f15375;
        }
        if (!z || c4864.f15379 == null) {
            m10563(c4864);
            return;
        }
        while (true) {
            InterfaceC13330 interfaceC13330 = (InterfaceC13330) arrayDeque.peek();
            if (interfaceC13330 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    interfaceC13330.toString();
                }
                interfaceC13330.mo32312(c4864.f15379);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    C11003.toString(componentName);
                }
            } catch (RemoteException unused2) {
                C11003.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m10563(c4864);
    }
}
