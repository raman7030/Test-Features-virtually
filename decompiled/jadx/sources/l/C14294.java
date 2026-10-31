package l;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9RE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14294 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f43082 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f43083;

    static {
        new HashMap();
        try {
            f43083 = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IBinder m34080(String str) {
        HashMap map = f43082;
        IBinder iBinder = (IBinder) map.get(str);
        if (iBinder == null) {
            try {
                iBinder = (IBinder) f43083.invoke(null, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.getStackTraceString(e);
            }
            map.put(str, iBinder);
        }
        return iBinder;
    }
}
