package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VN */
/* JADX INFO: loaded from: classes2.dex */
public class C3037 extends C19369 implements InterfaceC8682, InterfaceC17148, InterfaceC0795 {
    public static final long serialVersionUID = 484863569441792249L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f9570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f9571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Map f9572;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9573;

    public C3037() {
    }

    public C3037(String str, Exception exc) {
        super(str, exc);
        this.f9573 = -1073741823;
    }

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < 71; i++) {
            map.put(Integer.valueOf(InterfaceC8682.f26462[i]), InterfaceC8682.f26463[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < 41; i2++) {
            int[][] iArr = InterfaceC17148.f52552;
            map2.put(Integer.valueOf(iArr[i2][0]), Integer.valueOf(iArr[i2][1]));
            String str = (String) map.get(Integer.valueOf(iArr[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(iArr[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f9571 = C20195.unmodifiableMap(map);
        f9572 = C20195.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            map3.put(Integer.valueOf(InterfaceC0795.f2910[i3]), InterfaceC0795.f2911[i3]);
        }
        f9570 = C20195.unmodifiableMap(map3);
    }

    public C3037(String str) {
        super(str);
        this.f9573 = -1073741823;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9288(int i) {
        String str = (String) f9571.get(Integer.valueOf(i));
        return str == null ? "0x".concat(C12085.m29467(i, 8)) : str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m9290(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(i);
        Map map = f9572;
        if (map.containsKey(numValueOf)) {
            return ((Integer) map.get(Integer.valueOf(i))).intValue();
        }
        return -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3037(int i, boolean z) {
        String strM9288;
        if (z) {
            strM9288 = (String) f9570.get(Integer.valueOf(i));
            if (strM9288 == null) {
                strM9288 = "W".concat(C12085.m29467(i, 8));
            }
        } else {
            strM9288 = m9288(i);
        }
        super(strM9288);
        this.f9573 = z ? i : m9290(i);
    }

    public C3037(int i) {
        super(m9288(i), null);
        this.f9573 = m9290(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9291() {
        return this.f9573;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3037 m9289(C19369 c19369) {
        if (c19369 instanceof C3037) {
            return (C3037) c19369;
        }
        return new C3037(c19369.getMessage(), c19369);
    }
}
