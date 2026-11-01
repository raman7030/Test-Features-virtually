package p067l;

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
public final class EnumC9335 {
    public static final EnumC9335 DISTINCT;
    public static final EnumC9335 ORDERED;
    public static final EnumC9335 SHORT_CIRCUIT;
    public static final EnumC9335 SIZED;
    public static final EnumC9335 SORTED;

    /* JADX INFO: renamed from: f */
    public static final int f25411f;

    /* JADX INFO: renamed from: g */
    public static final int f25412g;

    /* JADX INFO: renamed from: h */
    public static final int f25413h;

    /* JADX INFO: renamed from: i */
    public static final int f25414i;

    /* JADX INFO: renamed from: j */
    public static final int f25415j;

    /* JADX INFO: renamed from: k */
    public static final int f25416k;

    /* JADX INFO: renamed from: l */
    public static final int f25417l;

    /* JADX INFO: renamed from: m */
    public static final int f25418m;

    /* JADX INFO: renamed from: n */
    public static final int f25419n;

    /* JADX INFO: renamed from: o */
    public static final int f25420o;

    /* JADX INFO: renamed from: p */
    public static final int f25421p;

    /* JADX INFO: renamed from: q */
    public static final int f25422q;

    /* JADX INFO: renamed from: r */
    public static final int f25423r;

    /* JADX INFO: renamed from: s */
    public static final int f25424s;

    /* JADX INFO: renamed from: t */
    public static final int f25425t;

    /* JADX INFO: renamed from: u */
    public static final int f25426u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC9335[] f25427v;

    /* JADX INFO: renamed from: a */
    public final Map f25428a;

    /* JADX INFO: renamed from: b */
    public final int f25429b;

    /* JADX INFO: renamed from: c */
    public final int f25430c;

    /* JADX INFO: renamed from: d */
    public final int f25431d;

    /* JADX INFO: renamed from: e */
    public final int f25432e;

    public static EnumC9335 valueOf(String str) {
        return (EnumC9335) Enum.valueOf(EnumC9335.class, str);
    }

    public static EnumC9335[] values() {
        return (EnumC9335[]) f25427v.clone();
    }

    static {
        EnumC23417 enumC23417 = EnumC23417.SPLITERATOR;
        C18546 c18546M21656C = m21656C(enumC23417);
        EnumC23417 enumC23418 = EnumC23417.STREAM;
        c18546M21656C.m42228a(enumC23418);
        EnumC23417 enumC23419 = EnumC23417.f74573OP;
        ((EnumMap) ((Map) c18546M21656C.f55375b)).put(enumC23419, 3);
        EnumC9335 enumC9335 = new EnumC9335("DISTINCT", 0, 0, c18546M21656C);
        DISTINCT = enumC9335;
        C18546 c18546M21656C2 = m21656C(enumC23417);
        c18546M21656C2.m42228a(enumC23418);
        ((EnumMap) ((Map) c18546M21656C2.f55375b)).put(enumC23419, 3);
        EnumC9335 enumC9336 = new EnumC9335("SORTED", 1, 1, c18546M21656C2);
        SORTED = enumC9336;
        C18546 c18546M21656C3 = m21656C(enumC23417);
        c18546M21656C3.m42228a(enumC23418);
        ((EnumMap) ((Map) c18546M21656C3.f55375b)).put(enumC23419, 3);
        EnumC23417 enumC234110 = EnumC23417.TERMINAL_OP;
        ((EnumMap) ((Map) c18546M21656C3.f55375b)).put(enumC234110, 2);
        EnumC23417 enumC234111 = EnumC23417.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) c18546M21656C3.f55375b)).put(enumC234111, 2);
        EnumC9335 enumC9337 = new EnumC9335("ORDERED", 2, 2, c18546M21656C3);
        ORDERED = enumC9337;
        C18546 c18546M21656C4 = m21656C(enumC23417);
        c18546M21656C4.m42228a(enumC23418);
        ((EnumMap) ((Map) c18546M21656C4.f55375b)).put(enumC23419, 2);
        EnumC9335 enumC9338 = new EnumC9335("SIZED", 3, 3, c18546M21656C4);
        SIZED = enumC9338;
        C18546 c18546M21656C5 = m21656C(enumC23419);
        c18546M21656C5.m42228a(enumC234110);
        int i = 0;
        EnumC9335 enumC9339 = new EnumC9335("SHORT_CIRCUIT", 4, 12, c18546M21656C5);
        SHORT_CIRCUIT = enumC9339;
        f25427v = new EnumC9335[]{enumC9335, enumC9336, enumC9337, enumC9338, enumC9339};
        f25411f = m21658m(enumC23417);
        f25412g = m21658m(enumC23418);
        f25413h = m21658m(enumC23419);
        m21658m(enumC234110);
        m21658m(enumC234111);
        for (EnumC9335 enumC93310 : values()) {
            i |= enumC93310.f25432e;
        }
        f25414i = i;
        int i2 = f25412g;
        f25415j = i2;
        int i3 = i2 << 1;
        f25416k = i3;
        f25417l = i2 | i3;
        EnumC9335 enumC93311 = DISTINCT;
        f25418m = enumC93311.f25430c;
        f25419n = enumC93311.f25431d;
        EnumC9335 enumC93312 = SORTED;
        f25420o = enumC93312.f25430c;
        f25421p = enumC93312.f25431d;
        EnumC9335 enumC93313 = ORDERED;
        f25422q = enumC93313.f25430c;
        f25423r = enumC93313.f25431d;
        EnumC9335 enumC93314 = SIZED;
        f25424s = enumC93314.f25430c;
        f25425t = enumC93314.f25431d;
        f25426u = SHORT_CIRCUIT.f25430c;
    }

    /* JADX INFO: renamed from: C */
    public static C18546 m21656C(EnumC23417 enumC23417) {
        C18546 c18546 = new C18546(15, new EnumMap(EnumC23417.class));
        c18546.m42228a(enumC23417);
        return c18546;
    }

    public EnumC9335(String str, int i, int i2, C18546 c18546) {
        super(str, i);
        for (EnumC23417 enumC23417 : EnumC23417.values()) {
            C15525.putIfAbsent((Map) c18546.f55375b, enumC23417, 0);
        }
        this.f25428a = (Map) c18546.f55375b;
        int i3 = i2 * 2;
        this.f25429b = i3;
        this.f25430c = 1 << i3;
        this.f25431d = 2 << i3;
        this.f25432e = 3 << i3;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21660s(int i) {
        return (i & this.f25432e) == this.f25430c;
    }

    /* JADX INFO: renamed from: m */
    public static int m21658m(EnumC23417 enumC23417) {
        int iIntValue = 0;
        for (EnumC9335 enumC9335 : values()) {
            iIntValue |= ((Integer) enumC9335.f25428a.get(enumC23417)).intValue() << enumC9335.f25429b;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: l */
    public static int m21657l(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = f25414i;
        } else {
            i3 = ~(((f25415j & i) << 1) | i | ((f25416k & i) >> 1));
        }
        return i | (i2 & i3);
    }

    /* JADX INFO: renamed from: n */
    public static int m21659n(InterfaceC16847 interfaceC16847) {
        int iCharacteristics = interfaceC16847.characteristics();
        int i = iCharacteristics & 4;
        int i2 = f25411f;
        return (i == 0 || interfaceC16847.getComparator() == null) ? iCharacteristics & i2 : iCharacteristics & i2 & (-5);
    }
}
