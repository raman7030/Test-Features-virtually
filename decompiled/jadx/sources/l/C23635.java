package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bin.mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1F */
/* JADX INFO: loaded from: classes.dex */
public final class C23635 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f76576 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile C23635 f76577;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f76578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f76579 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f76580 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m52131() {
        Object objM52129;
        synchronized (f76576) {
            objM52129 = this.f76580.get(C15118.class);
            if (objM52129 == null) {
                objM52129 = m52129(C15118.class, new HashSet());
            }
        }
        return objM52129;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52133() {
        return this.f76579.contains(C15118.class);
    }

    public C23635(Context context) {
        this.f76578 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23635 m52130(Context context) {
        if (f76577 == null) {
            synchronized (f76576) {
                if (f76577 == null) {
                    f76577 = new C23635(context);
                }
            }
        }
        return f76577;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m52129(Class cls, HashSet hashSet) {
        Object objMo35812;
        HashMap map = this.f76580;
        if (C10230.m25858()) {
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
                InterfaceC20814 interfaceC20814 = (InterfaceC20814) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo35813 = interfaceC20814.mo35813();
                if (!listMo35813.isEmpty()) {
                    for (Class cls2 : listMo35813) {
                        if (!map.containsKey(cls2)) {
                            m52129(cls2, hashSet);
                        }
                    }
                }
                objMo35812 = interfaceC20814.mo35812(this.f76578);
                hashSet.remove(cls);
                map.put(cls, objMo35812);
            } catch (Throwable th2) {
                throw new C9525(th2);
            }
        } else {
            objMo35812 = map.get(cls);
        }
        Trace.endSection();
        return objMo35812;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52132(Bundle bundle) {
        HashSet hashSet;
        String string = this.f76578.getString(R.string.MT_Protector);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f76579;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC20814.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m52129((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C9525(e);
            }
        }
    }
}
