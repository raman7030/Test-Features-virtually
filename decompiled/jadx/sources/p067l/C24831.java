package p067l;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bin.p000mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1F */
/* JADX INFO: loaded from: classes.dex */
public final class C24831 {

    /* JADX INFO: renamed from: ܿ */
    public static final Object f79320 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public static volatile C24831 f79321;

    /* JADX INFO: renamed from: ֫ */
    public final Context f79322;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f79323 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f79324 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final Object m54534() {
        Object objM54532;
        synchronized (f79320) {
            objM54532 = this.f79324.get(C16736.class);
            if (objM54532 == null) {
                objM54532 = m54532(C16736.class, new HashSet());
            }
        }
        return objM54532;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m54536() {
        return this.f79323.contains(C16736.class);
    }

    public C24831(Context context) {
        this.f79322 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24831 m54533(Context context) {
        if (f79321 == null) {
            synchronized (f79320) {
                if (f79321 == null) {
                    f79321 = new C24831(context);
                }
            }
        }
        return f79321;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m54532(Class cls, HashSet hashSet) {
        Object objMo37970;
        HashMap map = this.f79324;
        if (C12091.m27880()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (!map.containsKey(cls)) {
            hashSet.add(cls);
            try {
                InterfaceC22150 interfaceC22150 = (InterfaceC22150) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo37971 = interfaceC22150.mo37971();
                if (!listMo37971.isEmpty()) {
                    for (Class cls2 : listMo37971) {
                        if (!map.containsKey(cls2)) {
                            m54532(cls2, hashSet);
                        }
                    }
                }
                objMo37970 = interfaceC22150.mo37970(this.f79322);
                hashSet.remove(cls);
                map.put(cls, objMo37970);
            } catch (Throwable th2) {
                throw new C11421(th2);
            }
        } else {
            objMo37970 = map.get(cls);
        }
        Trace.endSection();
        return objMo37970;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54535(Bundle bundle) {
        HashSet hashSet;
        String string = this.f79322.getString(R.string.MT_Protector);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f79323;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC22150.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m54532((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C11421(e);
            }
        }
    }
}
