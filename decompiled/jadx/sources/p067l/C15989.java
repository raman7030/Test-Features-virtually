package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C15989 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f46315;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f46316;

    static {
        HashMap map = new HashMap();
        f46316 = map;
        HashMap map2 = new HashMap();
        f46315 = map2;
        map2.put(C15023.class, new C14096());
        map2.put(C22187.class, new C13426());
        map2.put(C0932.class, new C24154());
        C15436 c15436 = new C15436();
        map2.put(C18790.class, c15436);
        map.put(C18790.class, c15436);
        C9402 c9402 = new C9402();
        map2.put(C16107.class, c9402);
        map.put(C16107.class, c9402);
        map.put(C11415.class, new C3920());
        map2.put(C24550.class, new C12638());
        map2.put(C6112.class, new C18001());
        map.put(C10744.class, new C19343());
        map2.put(C18882.class, new C7391());
        C3367 c3367 = new C3367();
        map2.put(C8614.class, c3367);
        map.put(C8614.class, c3367);
        map2.put(C4007.class, new C10073());
        map2.put(C23669.class, new C16777());
        map2.put(C24825.class, new C22814());
        map2.put(C8732.class, new C23484());
        map2.put(C17448.class, new C21473());
        map2.put(C4709.class, new C6720());
        map2.put(C6050.class, new C5379());
        map2.put(C22026.class, new C14766());
        map.put(C11297.class, new C12085());
        map.put(C24707.class, new C8061());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC20803 m36338(InterfaceC10626 interfaceC10626) {
        Class<?> cls = interfaceC10626.getClass();
        InterfaceC20803 interfaceC20803 = (InterfaceC20803) f46316.get(cls);
        if (interfaceC20803 != null) {
            return interfaceC20803;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC20132 m36337() {
        InterfaceC20132 interfaceC20132 = (InterfaceC20132) f46315.get(C4709.class);
        if (interfaceC20132 != null) {
            return interfaceC20132;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + C4709.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m36336(byte[] bArr, InterfaceC20132 interfaceC20132) {
        return new C18672(bArr, interfaceC20132);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36339(C11297 c11297, C2460 c2460) {
        c2460.m28100((byte) 0);
        c2460.m28102(7, new byte[]{0, 0, 0, 0, 0, 0, 0});
        c2460.m28118(0L);
        c2460.m28113(((long) c11297.m26238()) * 2);
        byte[] bytes = c11297.m26237().getBytes(C10169.f28135);
        c2460.m28102(bytes.length, bytes);
    }
}
