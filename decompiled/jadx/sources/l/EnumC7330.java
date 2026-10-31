package l;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۟۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC7330 {
    public static final EnumC7330 DISTINCT;
    public static final EnumC7330 ORDERED;
    public static final EnumC7330 SHORT_CIRCUIT;
    public static final EnumC7330 SIZED;
    public static final EnumC7330 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77960l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ EnumC7330[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static EnumC7330 valueOf(String str) {
        return (EnumC7330) Enum.valueOf(EnumC7330.class, str);
    }

    public static EnumC7330[] values() {
        return (EnumC7330[]) v.clone();
    }

    static {
        EnumC22147 enumC22147 = EnumC22147.SPLITERATOR;
        C17022 c17022C = C(enumC22147);
        EnumC22147 enumC22148 = EnumC22147.STREAM;
        c17022C.a(enumC22148);
        EnumC22147 enumC22149 = EnumC22147.OP;
        ((EnumMap) ((Map) c17022C.b)).put(enumC22149, 3);
        EnumC7330 enumC7330 = new EnumC7330("DISTINCT", 0, 0, c17022C);
        DISTINCT = enumC7330;
        C17022 c17022C2 = C(enumC22147);
        c17022C2.a(enumC22148);
        ((EnumMap) ((Map) c17022C2.b)).put(enumC22149, 3);
        EnumC7330 enumC7331 = new EnumC7330("SORTED", 1, 1, c17022C2);
        SORTED = enumC7331;
        C17022 c17022C3 = C(enumC22147);
        c17022C3.a(enumC22148);
        ((EnumMap) ((Map) c17022C3.b)).put(enumC22149, 3);
        EnumC22147 enumC221410 = EnumC22147.TERMINAL_OP;
        ((EnumMap) ((Map) c17022C3.b)).put(enumC221410, 2);
        EnumC22147 enumC221411 = EnumC22147.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) c17022C3.b)).put(enumC221411, 2);
        EnumC7330 enumC7332 = new EnumC7330("ORDERED", 2, 2, c17022C3);
        ORDERED = enumC7332;
        C17022 c17022C4 = C(enumC22147);
        c17022C4.a(enumC22148);
        ((EnumMap) ((Map) c17022C4.b)).put(enumC22149, 2);
        EnumC7330 enumC7333 = new EnumC7330("SIZED", 3, 3, c17022C4);
        SIZED = enumC7333;
        C17022 c17022C5 = C(enumC22149);
        c17022C5.a(enumC221410);
        int i2 = 0;
        EnumC7330 enumC7334 = new EnumC7330("SHORT_CIRCUIT", 4, 12, c17022C5);
        SHORT_CIRCUIT = enumC7334;
        v = new EnumC7330[]{enumC7330, enumC7331, enumC7332, enumC7333, enumC7334};
        f = m(enumC22147);
        g = m(enumC22148);
        h = m(enumC22149);
        m(enumC221410);
        m(enumC221411);
        for (EnumC7330 enumC7335 : values()) {
            i2 |= enumC7335.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        f77960l = i3 | i4;
        EnumC7330 enumC7336 = DISTINCT;
        m = enumC7336.c;
        n = enumC7336.d;
        EnumC7330 enumC7337 = SORTED;
        o = enumC7337.c;
        p = enumC7337.d;
        EnumC7330 enumC7338 = ORDERED;
        q = enumC7338.c;
        r = enumC7338.d;
        EnumC7330 enumC7339 = SIZED;
        s = enumC7339.c;
        t = enumC7339.d;
        u = SHORT_CIRCUIT.c;
    }

    public static C17022 C(EnumC22147 enumC22147) {
        C17022 c17022 = new C17022(15, new EnumMap(EnumC22147.class));
        c17022.a(enumC22147);
        return c17022;
    }

    public EnumC7330(String str, int i2, int i3, C17022 c17022) {
        super(str, i2);
        for (EnumC22147 enumC22147 : EnumC22147.values()) {
            C13843.putIfAbsent((Map) c17022.b, enumC22147, 0);
        }
        this.a = (Map) c17022.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public final boolean s(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int m(EnumC22147 enumC22147) {
        int iIntValue = 0;
        for (EnumC7330 enumC7330 : values()) {
            iIntValue |= ((Integer) enumC7330.a.get(enumC22147)).intValue() << enumC7330.b;
        }
        return iIntValue;
    }

    public static int l(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int n(InterfaceC15234 interfaceC15234) {
        int iCharacteristics = interfaceC15234.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || interfaceC15234.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
