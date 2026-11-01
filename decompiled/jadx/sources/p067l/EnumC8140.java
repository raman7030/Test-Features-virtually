package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.UMConfigure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.IntPredicate;
import net.engio.mbassy.listener.MessageHandler;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩻֫' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۛ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EI */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8140 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumC8140 f21447;

    /* JADX INFO: renamed from: ֨֫ */
    public static final EnumC8140 f21448;

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC8140 f21449;

    /* JADX INFO: renamed from: ֫ۧ */
    public static String f21450;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final EnumC8140 f21451;

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ EnumC8140[] f21452;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final EnumC8140[] f21453;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC8140 f21454;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final EnumC8140[] f21455;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final EnumC8140 f21456;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC8140 f21457;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final EnumC8140[] f21458;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC8140 f21459;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC8140 f21460;

    /* JADX INFO: renamed from: ۟֫ */
    public static String f21461;

    /* JADX INFO: renamed from: ۠֫ */
    public static String f21462;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC8140 f21463;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC8140 f21464;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC8140 f21465;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final EnumC8140[] f21466;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC8140 f21467;

    /* JADX INFO: renamed from: ۧۧ */
    public static final EnumC8140 f21468;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC8140 f21469;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final EnumC8140[] f21470;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC8140 f21471;

    /* JADX INFO: renamed from: ۫֫ */
    public static final EnumC8140[] f21472;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC8140 f21473;

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC8140[] f21474;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC8140 f21475;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final EnumC8140[] f21476;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC8140 f21477;

    /* JADX INFO: renamed from: ܶ֫ */
    public static String f21478;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC8140 f21479;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC8140 f21480 = new EnumC8140("ACC_NONE", 0, 0, "", EnumC21552.NONE);

    /* JADX INFO: renamed from: ܽۧ */
    public static final EnumC8140 f21481;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC8140 f21482;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC8140 f21483;

    /* JADX INFO: renamed from: ᩳۧ */
    public static EnumC21552 f21484;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC8140 f21485;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC8140 f21486;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final EnumC8140[] f21487;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC8140 f21488;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final EnumC8140[] f21489;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final EnumC8140[] f21490;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC8140 f21491;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final EnumC8140[] f21492;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC8140 f21493;

    /* JADX INFO: renamed from: ۙ */
    public final String f21494;

    /* JADX INFO: renamed from: ᩶ */
    public final int f21495;

    /* JADX INFO: renamed from: ᩸ */
    public int f21496;

    /* JADX INFO: renamed from: ᩹ */
    public final Set f21497;

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ boolean m18891(int i, int i2) {
        return (i | i2) == i2;
    }

    public static EnumC8140 valueOf(String str) {
        return (EnumC8140) Enum.valueOf(EnumC8140.class, str);
    }

    public static EnumC8140[] values() {
        return (EnumC8140[]) f21452.clone();
    }

    /* JADX INFO: renamed from: ۡ */
    public static /* synthetic */ EnumC8140[] m18876() {
        return new EnumC8140[]{f21480, f21493, f21482, f21477, f21459, f21469, f21463, f21491, f21486, f21485, f21479, f21483, f21456, f21465, f21488, f21454, f21447, f21467, f21475, f21473, f21464, f21451, f21471, f21457, f21449, f21460, f21468, f21448, f21481};
    }

    static {
        EnumC21552 enumC21552 = EnumC21552.CLASS;
        EnumC21552 enumC21553 = EnumC21552.INNER_CLASS;
        EnumC21552 enumC21554 = EnumC21552.FIELD;
        EnumC21552 enumC21555 = EnumC21552.METHOD;
        EnumC8140 enumC8140 = new EnumC8140("ACC_PUBLIC", 1, 1, "public", enumC21552, enumC21553, enumC21554, enumC21555);
        f21493 = enumC8140;
        EnumC8140 enumC8141 = new EnumC8140("ACC_PRIVATE", 2, 2, "private", enumC21553, enumC21554, enumC21555);
        f21482 = enumC8141;
        EnumC8140 enumC8142 = new EnumC8140("ACC_PROTECTED", 3, 4, "protected", enumC21553, enumC21554, enumC21555);
        f21477 = enumC8142;
        EnumC8140 enumC8143 = new EnumC8140("ACC_STATIC", 4, 8, "static", enumC21553, enumC21554, enumC21555);
        f21459 = enumC8143;
        EnumC21552 enumC21556 = EnumC21552.METHOD_PARAMETERS;
        EnumC8140 enumC8144 = new EnumC8140("ACC_FINAL", 5, 16, "final", enumC21552, enumC21553, enumC21554, enumC21555, enumC21556);
        f21469 = enumC8144;
        EnumC8140 enumC8145 = new EnumC8140("ACC_SUPER", 6, 32, "super", enumC21552);
        f21463 = enumC8145;
        EnumC21552 enumC21557 = EnumC21552.VALUE_OBJECTS;
        EnumC8140 enumC8146 = new EnumC8140("ACC_IDENTITY", 7, 32, "identity", enumC21552, enumC21553, enumC21557);
        f21491 = enumC8146;
        f21486 = new EnumC8140("ACC_VALUE", 8, 0, C0226b.f1011d, enumC21552, enumC21553, enumC21557);
        EnumC21552 enumC21558 = EnumC21552.REQUIRES;
        EnumC8140 enumC8147 = new EnumC8140("ACC_TRANSITIVE", 9, 32, "transitive", enumC21558);
        f21485 = enumC8147;
        EnumC8140 enumC8148 = new EnumC8140("ACC_SYNCHRONIZED", 10, 32, MessageHandler.Properties.IsSynchronized, enumC21555);
        f21479 = enumC8148;
        EnumC21552 enumC21559 = EnumC21552.MODULE;
        EnumC8140 enumC8149 = new EnumC8140("ACC_OPEN", 11, 32, "open", enumC21559);
        f21483 = enumC8149;
        EnumC8140 enumC81410 = new EnumC8140("ACC_VOLATILE", 12, 64, "volatile", enumC21554);
        f21456 = enumC81410;
        EnumC8140 enumC81411 = new EnumC8140("ACC_BRIDGE", 13, 64, "bridge", enumC21555);
        f21465 = enumC81411;
        EnumC8140 enumC81412 = new EnumC8140("ACC_STATIC_PHASE", 14, 64, "static", enumC21558);
        f21488 = enumC81412;
        EnumC8140 enumC81413 = new EnumC8140("ACC_TRANSIENT", 15, 128, "transient", enumC21554);
        f21454 = enumC81413;
        EnumC8140 enumC81414 = new EnumC8140("ACC_VARARGS", 16, 128, "varargs", enumC21555);
        f21447 = enumC81414;
        EnumC8140 enumC81415 = new EnumC8140("ACC_NATIVE", 17, 256, UMConfigure.WRAPER_TYPE_NATIVE, enumC21555);
        f21467 = enumC81415;
        EnumC8140 enumC81416 = new EnumC8140("ACC_INTERFACE", 18, 512, "interface", enumC21552, enumC21553);
        f21475 = enumC81416;
        EnumC8140 enumC81417 = new EnumC8140("ACC_ABSTRACT", 19, 1024, "abstract", enumC21552, enumC21553, enumC21555);
        f21473 = enumC81417;
        EnumC8140 enumC81418 = new EnumC8140("ACC_STRICT", 20, 2048, "strict", enumC21555, enumC21554, enumC21557);
        f21464 = enumC81418;
        EnumC21552 enumC215510 = EnumC21552.EXPORTS;
        EnumC21552 enumC215511 = EnumC21552.OPENS;
        EnumC8140 enumC81419 = new EnumC8140("ACC_SYNTHETIC", 21, 4096, "synthetic", enumC21552, enumC21553, enumC21554, enumC21555, enumC21559, enumC21558, enumC215510, enumC215511, enumC21556);
        f21451 = enumC81419;
        EnumC8140 enumC81420 = new EnumC8140("ACC_ANNOTATION", 22, 8192, "annotation", enumC21552, enumC21553);
        f21471 = enumC81420;
        EnumC8140 enumC81421 = new EnumC8140("ACC_ENUM", 23, 16384, "enum", enumC21552, enumC21553, enumC21554);
        f21457 = enumC81421;
        EnumC8140 enumC81422 = new EnumC8140("ACC_MODULE", 24, 32768, C0655am.f2344e, enumC21552);
        f21449 = enumC81422;
        EnumC8140 enumC81423 = new EnumC8140("ACC_MANDATED", 25, 32768, "mandated", enumC21559, enumC21558, enumC215510, enumC215511, enumC21556);
        f21460 = enumC81423;
        f21468 = new EnumC8140("SYNTHETIC_ATTRIBUTE", 26, 65536, "Synthetic(Pseudo)", enumC21552, enumC21553, enumC21554, enumC21555);
        f21448 = new EnumC8140("DEPRECATED_ATTRIBUTE", 27, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "Deprecated(Pseudo)", enumC21552, enumC21553, enumC21554, enumC21555);
        f21481 = new EnumC8140("VALUE_OBJECTS_ATTRIBUTE", 28, 268435456, "ValueObjects(Pseudo)", enumC21552, enumC21553, enumC21554);
        f21452 = m18876();
        f21472 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC8143, enumC8144, enumC8148, enumC81411, enumC81414, enumC81415, enumC81417, enumC81419, enumC81418};
        f21490 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC8144, enumC8145, enumC8146, enumC81416, enumC81417, enumC81419, enumC81420, enumC81421, enumC81422};
        f21453 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC81416, enumC81417, enumC81419, enumC81420};
        f21487 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC8143, enumC8144, enumC81410, enumC81413, enumC81419, enumC81421, enumC81418};
        f21489 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC81411, enumC81414, enumC81417, enumC81419};
        f21455 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC81414, enumC81419, enumC81418, enumC8143};
        f21476 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC8143, enumC8144, enumC81416, enumC81417, enumC81419, enumC81420, enumC81421};
        f21474 = new EnumC8140[]{enumC8140, enumC8141, enumC8142, enumC8143, enumC81411, enumC81414, enumC81417, enumC81418, enumC81419};
        f21466 = new EnumC8140[]{enumC8149, enumC81419, enumC81423};
        f21492 = new EnumC8140[]{enumC8147, enumC81412, enumC81419, enumC81423};
        f21458 = new EnumC8140[]{enumC81419, enumC81423};
        f21470 = new EnumC8140[]{enumC81419, enumC81423};
        f21461 = ", ";
        f21450 = "";
        f21462 = " ";
        f21478 = " ";
        f21484 = EnumC21552.ORDINARY;
    }

    public EnumC8140(String str, int i, int i2, String str2, EnumC21552... enumC21552Arr) {
        super(str, i);
        this.f21496 = 0;
        this.f21495 = i2;
        this.f21494 = str2;
        this.f21497 = new HashSet(10);
        if (enumC21552Arr != null) {
            for (EnumC21552 enumC21552 : enumC21552Arr) {
                this.f21497.add(enumC21552);
                this.f21496 = enumC21552.m48740() | this.f21496;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18864(EnumC21552 enumC21552) {
        f21484 = enumC21552;
    }

    /* JADX INFO: renamed from: ܺ */
    public static EnumC21552 m18889() {
        return f21484;
    }

    /* JADX INFO: renamed from: ֨ */
    public static boolean m18857(int i) {
        return (i & f21493.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public static boolean m18897(int i) {
        return (i & f21482.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public static boolean m18871(int i) {
        return (i & f21477.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۠ */
    public static boolean m18874(int i) {
        return (i & f21459.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m18873(int i) {
        return (i & f21469.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۫ */
    public static boolean m18884(int i) {
        return m18873(i);
    }

    /* JADX INFO: renamed from: ᩹ */
    public static boolean m18901(int i) {
        return (i & f21463.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩶ */
    public static boolean m18898(int i) {
        return m18901(i);
    }

    /* JADX INFO: renamed from: ۨ */
    public static boolean m18883(int i) {
        return (i & f21456.f21495) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m18892(int i) {
        return m18883(i);
    }

    /* JADX INFO: renamed from: ܶ */
    public static boolean m18888(int i) {
        return m18883(i);
    }

    /* JADX INFO: renamed from: ۬ */
    public static boolean m18885(int i) {
        return (i & f21454.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۛ */
    public static boolean m18872(int i) {
        return m18885(i);
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m18896(int i) {
        return (i & f21467.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m18877(int i) {
        return (i & f21475.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m18881(int i) {
        return (i & f21473.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩸ */
    public static boolean m18900(int i) {
        return (i & f21464.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m18894(int i, EnumC8140[] enumC8140Arr) {
        int i2 = 0;
        for (EnumC8140 enumC8140 : enumC8140Arr) {
            int i3 = enumC8140.f21495;
            if ((i & i3) != 0) {
                i &= ~i3;
                EnumC21552 enumC21552M18908 = enumC8140.m18908();
                if (f21484 != enumC21552M18908 && enumC21552M18908 != EnumC21552.ORDINARY) {
                    i2 |= enumC8140.f21495;
                }
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public EnumC21552 m18908() {
        for (EnumC21552 enumC21552 : this.f21497) {
            if (enumC21552.m48743()) {
                return enumC21552;
            }
        }
        return EnumC21552.ORDINARY;
    }

    /* JADX INFO: renamed from: ۙ */
    public static boolean m18870(int i) {
        return (i & f21451.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m18895(int i) {
        return (i & f21471.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m18902(int i) {
        return (i & f21457.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public static boolean m18868(int i) {
        return (i & f21449.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m18875(int i) {
        return m18868(i);
    }

    /* JADX INFO: renamed from: ۗ */
    public static boolean m18869(int i) {
        return (i & f21468.f21495) != 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m18886(int i) {
        return (i & f21448.f21495) != 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public static boolean m18878(int i) {
        return (i & f21481.f21495) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m18899(int i) {
        return (i & f21491.f21495) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18865(int i) {
        return m18869(i) || m18886(i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m18903(int i, EnumC8140... enumC8140Arr) {
        if (enumC8140Arr.length < 2) {
            return enumC8140Arr.length != 0 && i == enumC8140Arr[0].m18907();
        }
        final int iM18860 = i & m18860(enumC8140Arr);
        return C23573.stream(enumC8140Arr).mapToInt(new C14845()).anyMatch(new IntPredicate() { // from class: l.۫۬ۚ
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C10638.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C10638.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ IntPredicate m32655or(IntPredicate intPredicate) {
                return C10638.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return EnumC8140.m18891(iM18860, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18867(int i, EnumC8140... enumC8140Arr) {
        return enumC8140Arr.length > 0 && (i & m18860(enumC8140Arr)) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m18879(int i, EnumC8140... enumC8140Arr) {
        if (enumC8140Arr.length > 0) {
            for (EnumC8140 enumC8140 : enumC8140Arr) {
                i &= ~enumC8140.f21495;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18866(int i, EnumC8140 enumC8140, EnumC8140 enumC8141) {
        int iM18907 = enumC8140.m18907() | enumC8141.m18907();
        return (i & iM18907) == iM18907;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m18893(int i, EnumC8140... enumC8140Arr) {
        int i2 = 0;
        for (EnumC8140 enumC8140 : enumC8140Arr) {
            if ((enumC8140.f21495 & i) != 0) {
                i2++;
            }
        }
        return i2 > 1;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m18887(int i, EnumC8140... enumC8140Arr) {
        return (m18860(enumC8140Arr) & i) == i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18860(EnumC8140... enumC8140Arr) {
        if (enumC8140Arr.length <= 0) {
            return 0;
        }
        int i = 0;
        for (EnumC8140 enumC8140 : enumC8140Arr) {
            i |= enumC8140.f21495;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18859(EnumC21552 enumC21552, EnumC8140... enumC8140Arr) {
        if (enumC8140Arr.length == 0) {
            enumC8140Arr = values();
        }
        int i = 0;
        for (EnumC8140 enumC8140 : enumC8140Arr) {
            if (enumC8140.f21497.contains(enumC21552)) {
                i |= enumC8140.f21495;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18858(ArrayList arrayList, int i, boolean z, EnumC8140 enumC8140) {
        arrayList.add(z ? enumC8140.m18909() : enumC8140.m18905());
        return m18890(i, enumC8140);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m18861(int i, EnumC21552 enumC21552) {
        return m18862(i, false, enumC21552, f21462, f21478);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m18880(int i, EnumC21552 enumC21552) {
        return m18862(i, true, enumC21552, f21461, f21450);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m18862(int i, boolean z, EnumC21552 enumC21552, String str, String str2) {
        ArrayList arrayListM18863 = m18863(i, z, enumC21552);
        if (str == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayListM18863.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) str);
            }
        }
        String string = sb.toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C17588.m40053(string, str2);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return "";
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m18863(int i, boolean z, EnumC21552 enumC21552) {
        ArrayList arrayList = new ArrayList();
        if (m18857(i)) {
            EnumC8140 enumC8140 = f21493;
            if (enumC21552.m48741(enumC8140)) {
                i = m18858(arrayList, i, z, enumC8140);
            }
        }
        if (m18897(i)) {
            EnumC8140 enumC8141 = f21482;
            if (enumC21552.m48741(enumC8141)) {
                i = m18858(arrayList, i, z, enumC8141);
            }
        }
        if (m18871(i)) {
            EnumC8140 enumC8142 = f21477;
            if (enumC21552.m48741(enumC8142)) {
                i = m18858(arrayList, i, z, enumC8142);
            }
        }
        if (m18874(i)) {
            EnumC8140 enumC8143 = f21459;
            if (enumC21552.m48741(enumC8143)) {
                i = m18858(arrayList, i, z, enumC8143);
            }
        }
        if (m18873(i) && enumC21552.m48742(EnumC21552.CLASS, EnumC21552.INNER_CLASS, EnumC21552.FIELD, EnumC21552.METHOD, EnumC21552.METHOD_PARAMETERS)) {
            i = m18858(arrayList, i, z, f21469);
        }
        if (m18901(i)) {
            int i2 = C12164.f34004[enumC21552.ordinal()];
            if (i2 == 1) {
                i = m18858(arrayList, i, z, f21484 == EnumC21552.VALUE_OBJECTS ? f21491 : f21463);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i = m18858(arrayList, i, z, f21485);
                } else if (i2 == 4) {
                    i = m18858(arrayList, i, z, f21479);
                } else if (i2 == 5) {
                    i = m18858(arrayList, i, z, f21483);
                }
            } else if (f21484 == EnumC21552.VALUE_OBJECTS) {
                i = m18858(arrayList, i, z, f21491);
            }
        }
        if (m18883(i)) {
            int i3 = C12164.f34004[enumC21552.ordinal()];
            if (i3 == 3) {
                i = m18858(arrayList, i, z, f21488);
            } else if (i3 == 4) {
                i = m18858(arrayList, i, z, f21465);
            } else if (i3 == 6) {
                i = m18858(arrayList, i, z, f21456);
            }
        }
        if (m18885(i)) {
            int i4 = C12164.f34004[enumC21552.ordinal()];
            if (i4 == 4) {
                i = m18858(arrayList, i, z, f21447);
            } else if (i4 == 6) {
                i = m18858(arrayList, i, z, f21454);
            }
        }
        if (m18896(i) && C12164.f34004[enumC21552.ordinal()] == 4) {
            i = m18858(arrayList, i, z, f21467);
        }
        if (m18877(i) && enumC21552.m48742(EnumC21552.CLASS, EnumC21552.INNER_CLASS)) {
            i = z ? m18858(arrayList, i, true, f21475) : m18890(i, f21475);
        }
        if (m18881(i) && enumC21552.m48742(EnumC21552.CLASS, EnumC21552.INNER_CLASS, EnumC21552.METHOD)) {
            i = m18858(arrayList, i, z, f21473);
        }
        if (m18900(i)) {
            int i5 = C12164.f34004[enumC21552.ordinal()];
            if (i5 == 4) {
                i = m18858(arrayList, i, z, f21464);
            } else if (i5 == 6 && f21484 == EnumC21552.VALUE_OBJECTS) {
                i = m18858(arrayList, i, z, f21464);
            }
        }
        if (m18870(i)) {
            EnumC8140 enumC8144 = f21451;
            if (enumC21552.m48741(enumC8144)) {
                i = m18858(arrayList, i, z, enumC8144);
            }
        }
        if (m18895(i) && enumC21552.m48742(EnumC21552.CLASS, EnumC21552.INNER_CLASS)) {
            i = m18858(arrayList, i, z, f21471);
        }
        if (m18902(i) && enumC21552.m48742(EnumC21552.CLASS, EnumC21552.INNER_CLASS, EnumC21552.FIELD)) {
            i = m18858(arrayList, i, z, f21457);
        }
        if (m18868(i)) {
            if (enumC21552 == EnumC21552.CLASS) {
                i = z ? m18858(arrayList, i, true, f21449) : m18890(i, f21449);
            } else if (enumC21552.m48742(EnumC21552.MODULE, EnumC21552.REQUIRES, EnumC21552.EXPORTS, EnumC21552.OPENS, EnumC21552.METHOD_PARAMETERS)) {
                i = m18858(arrayList, i, z, f21460);
            }
        }
        if (i != 0) {
            arrayList.add(String.format("0x%04X", Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m18890(int i, EnumC8140... enumC8140Arr) {
        for (EnumC8140 enumC8140 : enumC8140Arr) {
            int i2 = enumC8140.f21495;
            if ((i & i2) != 0) {
                i &= ~i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public Set m18906() {
        return this.f21497;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m18904() {
        return this.f21496;
    }

    /* JADX INFO: renamed from: ܿ */
    public int m18907() {
        return this.f21495;
    }

    /* JADX INFO: renamed from: ۢ */
    public String m18905() {
        return this.f21494;
    }

    /* JADX INFO: renamed from: ᩻ */
    public String m18909() {
        return toString();
    }
}
