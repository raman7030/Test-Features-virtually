package p067l;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۡ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10996 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f30452;

    /* JADX INFO: renamed from: ֫ */
    public synchronized void m25380(C7325 c7325) {
        ((LinkedHashSet) this.f30452).remove(c7325);
    }

    /* JADX INFO: renamed from: ۧ */
    public synchronized void m25382(C7325 c7325) {
        ((LinkedHashSet) this.f30452).add(c7325);
    }

    /* JADX INFO: renamed from: ܽ */
    public synchronized boolean m25383(C7325 c7325) {
        return ((LinkedHashSet) this.f30452).contains(c7325);
    }

    public C10996(int i) {
        switch (i) {
            case 1:
                this.f30452 = new LinkedHashSet();
                break;
            default:
                this.f30452 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m25381(C17978 c17978) {
        Class clsM40921 = c17978.m40921();
        HashMap map = (HashMap) this.f30452;
        C17978 c17979 = (C17978) map.get(clsM40921);
        if (c17979 == null) {
            map.put(c17978.m40921(), c17978);
        } else {
            c17979.m40924(c17978);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m25379(String str) {
        C17978 c17978 = (C17978) ((HashMap) this.f30452).get(C5909.class);
        if (c17978 == null) {
            return null;
        }
        return c17978.m40922(str);
    }
}
