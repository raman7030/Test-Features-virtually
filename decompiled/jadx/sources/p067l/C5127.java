package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K66W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5127 {

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f12042 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f12041 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f12043 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m10908(C6468 c6468, Object obj) {
        if (obj instanceof InterfaceC21221) {
            throw new AssertionError("T extends Context.Factory");
        }
        HashMap map = this.f12042;
        if (map != null) {
            Object objPut = map.put(c6468, obj);
            if (objPut != null && !(objPut instanceof InterfaceC21221) && objPut != obj && obj != null) {
                throw new AssertionError("duplicate context value");
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m10904(Class cls) {
        return m10905(m10910(cls));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10906(Class cls, Object obj) {
        m10908(m10910(cls), obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10907(Class cls, InterfaceC21221 interfaceC21221) {
        m10909(m10910(cls), interfaceC21221);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m10905(C6468 c6468) {
        HashMap map = this.f12042;
        if (map != null) {
            Object obj = map.get(c6468);
            if (!(obj instanceof InterfaceC21221)) {
                return obj;
            }
            Object objMo14187 = ((InterfaceC21221) obj).mo14187(this);
            if (objMo14187 instanceof InterfaceC21221) {
                throw new AssertionError("T extends Context.Factory");
            }
            C1446.m31704(map.get(c6468) == objMo14187);
            return objMo14187;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10909(C6468 c6468, InterfaceC21221 interfaceC21221) {
        HashMap map = this.f12042;
        if (map != null) {
            if (map.put(c6468, interfaceC21221) != null) {
                throw new AssertionError("duplicate context value");
            }
            HashMap map2 = this.f12041;
            if (map2 != null) {
                map2.put(c6468, interfaceC21221);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6468 m10910(Class cls) {
        HashMap map = this.f12043;
        if (map != null) {
            C6468 c6468 = (C6468) map.get(cls);
            if (c6468 != null) {
                return c6468;
            }
            C6468 c6469 = new C6468();
            map.put(cls, c6469);
            return c6469;
        }
        throw new IllegalStateException();
    }
}
