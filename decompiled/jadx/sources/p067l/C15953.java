package p067l;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9RE */
/* JADX INFO: loaded from: classes3.dex */
public final class C15953 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f46174 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static Method f46175;

    static {
        new HashMap();
        try {
            f46175 = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static IBinder m36213(String str) {
        HashMap map = f46174;
        IBinder iBinder = (IBinder) map.get(str);
        if (iBinder == null) {
            try {
                iBinder = (IBinder) f46175.invoke(null, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.getStackTraceString(e);
            }
            map.put(str, iBinder);
        }
        return iBinder;
    }
}
