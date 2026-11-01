package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9VN */
/* JADX INFO: loaded from: classes2.dex */
public class C5255 extends C20777 implements InterfaceC10620, InterfaceC18666, InterfaceC3124 {
    public static final long serialVersionUID = 484863569441792249L;

    /* JADX INFO: renamed from: ۙ */
    public static final Map f12372;

    /* JADX INFO: renamed from: ᩶ */
    public static final Map f12373;

    /* JADX INFO: renamed from: ᩹ */
    public static final Map f12374;

    /* JADX INFO: renamed from: ᩸ */
    public int f12375;

    public C5255() {
    }

    public C5255(String str, Exception exc) {
        super(str, exc);
        this.f12375 = -1073741823;
    }

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < 71; i++) {
            map.put(Integer.valueOf(InterfaceC10620.f29387[i]), InterfaceC10620.f29388[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < 41; i2++) {
            int[][] iArr = InterfaceC18666.f55735;
            map2.put(Integer.valueOf(iArr[i2][0]), Integer.valueOf(iArr[i2][1]));
            String str = (String) map.get(Integer.valueOf(iArr[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(iArr[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f12373 = C21562.unmodifiableMap(map);
        f12374 = C21562.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            map3.put(Integer.valueOf(InterfaceC3124.f5682[i3]), InterfaceC3124.f5683[i3]);
        }
        f12372 = C21562.unmodifiableMap(map3);
    }

    public C5255(String str) {
        super(str);
        this.f12375 = -1073741823;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11330(int i) {
        String str = (String) f12373.get(Integer.valueOf(i));
        return str == null ? "0x".concat(C13854.m31529(i, 8)) : str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m11332(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(i);
        Map map = f12374;
        if (map.containsKey(numValueOf)) {
            return ((Integer) map.get(Integer.valueOf(i))).intValue();
        }
        return -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5255(int i, boolean z) {
        String strM11330;
        if (z) {
            strM11330 = (String) f12372.get(Integer.valueOf(i));
            if (strM11330 == null) {
                strM11330 = "W".concat(C13854.m31529(i, 8));
            }
        } else {
            strM11330 = m11330(i);
        }
        super(strM11330);
        this.f12375 = z ? i : m11332(i);
    }

    public C5255(int i) {
        super(m11330(i), null);
        this.f12375 = m11332(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11333() {
        return this.f12375;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5255 m11331(C20777 c20777) {
        if (c20777 instanceof C5255) {
            return (C5255) c20777;
        }
        return new C5255(c20777.getMessage(), c20777);
    }
}
