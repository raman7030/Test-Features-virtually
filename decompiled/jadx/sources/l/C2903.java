package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K66W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2903 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f9244 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f9243 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f9245 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8841(C4314 c4314, Object obj) {
        if (obj instanceof InterfaceC19837) {
            throw new AssertionError("T extends Context.Factory");
        }
        HashMap map = this.f9244;
        if (map != null) {
            Object objPut = map.put(c4314, obj);
            if (objPut != null && !(objPut instanceof InterfaceC19837) && objPut != obj && obj != null) {
                throw new AssertionError("duplicate context value");
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8837(Class cls) {
        return m8838(m8843(cls));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8839(Class cls, Object obj) {
        m8841(m8843(cls), obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8840(Class cls, InterfaceC19837 interfaceC19837) {
        m8842(m8843(cls), interfaceC19837);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8838(C4314 c4314) {
        HashMap map = this.f9244;
        if (map != null) {
            Object obj = map.get(c4314);
            if (!(obj instanceof InterfaceC19837)) {
                return obj;
            }
            Object objMo12282 = ((InterfaceC19837) obj).mo12282(this);
            if (objMo12282 instanceof InterfaceC19837) {
                throw new AssertionError("T extends Context.Factory");
            }
            C12171.m29642(map.get(c4314) == objMo12282);
            return objMo12282;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8842(C4314 c4314, InterfaceC19837 interfaceC19837) {
        HashMap map = this.f9244;
        if (map != null) {
            if (map.put(c4314, interfaceC19837) != null) {
                throw new AssertionError("duplicate context value");
            }
            HashMap map2 = this.f9243;
            if (map2 != null) {
                map2.put(c4314, interfaceC19837);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4314 m8843(Class cls) {
        HashMap map = this.f9245;
        if (map != null) {
            C4314 c4314 = (C4314) map.get(cls);
            if (c4314 != null) {
                return c4314;
            }
            C4314 c4315 = new C4314();
            map.put(cls, c4315);
            return c4315;
        }
        throw new IllegalStateException();
    }
}
