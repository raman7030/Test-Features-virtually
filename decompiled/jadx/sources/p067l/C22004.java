package p067l;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩷ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C22004 {

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC6462 f69127;

    /* JADX INFO: renamed from: ֡֫ */
    public final AbstractC6462 f69128;

    /* JADX INFO: renamed from: ֡ۧ */
    public final C2417 f69129;

    /* JADX INFO: renamed from: ֨ */
    public final AbstractC6462 f69130;

    /* JADX INFO: renamed from: ֨֫ */
    public final AbstractC6462 f69131;

    /* JADX INFO: renamed from: ֨ۧ */
    public final AbstractC6462 f69132;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 f69133;

    /* JADX INFO: renamed from: ֫֫ */
    public final C9262 f69134;

    /* JADX INFO: renamed from: ֫ۧ */
    public final AbstractC6462 f69135;

    /* JADX INFO: renamed from: ۖ */
    public final C9262 f69136;

    /* JADX INFO: renamed from: ۖ֫ */
    public final AbstractC6462 f69137;

    /* JADX INFO: renamed from: ۖۧ */
    public final AbstractC6462 f69138;

    /* JADX INFO: renamed from: ۗ */
    public final C13956 f69139;

    /* JADX INFO: renamed from: ۗ֫ */
    public final C15828 f69140;

    /* JADX INFO: renamed from: ۘ */
    public final HashMap f69141;

    /* JADX INFO: renamed from: ۘ֫ */
    public final InterfaceC8453 f69142;

    /* JADX INFO: renamed from: ۘۧ */
    public final AbstractC6462[] f69143;

    /* JADX INFO: renamed from: ۙ */
    public final C15828 f69144;

    /* JADX INFO: renamed from: ۙ֫ */
    public final HashMap f69145;

    /* JADX INFO: renamed from: ۚ */
    public final AbstractC6462 f69146;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C2417 f69147;

    /* JADX INFO: renamed from: ۚۧ */
    public final C21333 f69148;

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC6462 f69149;

    /* JADX INFO: renamed from: ۛ֫ */
    public final C21333 f69150;

    /* JADX INFO: renamed from: ۜ */
    public final C9262 f69151;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C9262 f69152;

    /* JADX INFO: renamed from: ۜۧ */
    public final AbstractC6462 f69153;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC8453 f69154;

    /* JADX INFO: renamed from: ۟֫ */
    public final C23206 f69155;

    /* JADX INFO: renamed from: ۠ */
    public final AbstractC6462 f69156;

    /* JADX INFO: renamed from: ۠֫ */
    public final AbstractC21195 f69157;

    /* JADX INFO: renamed from: ۠ۧ */
    public final AbstractC6462 f69158;

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC12224[] f69159;

    /* JADX INFO: renamed from: ۡ֫ */
    public final AbstractC6462 f69160;

    /* JADX INFO: renamed from: ۡۧ */
    public final AbstractC6462 f69161;

    /* JADX INFO: renamed from: ۢ */
    public final C15828 f69162;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C15828 f69163;

    /* JADX INFO: renamed from: ۢۧ */
    public final AbstractC6462 f69164;

    /* JADX INFO: renamed from: ۤ */
    public final C9262 f69165;

    /* JADX INFO: renamed from: ۤ֫ */
    public final C21333 f69166;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 f69167;

    /* JADX INFO: renamed from: ۧ֫ */
    public final AbstractC6462 f69168;

    /* JADX INFO: renamed from: ۧۧ */
    public final AbstractC6462 f69169;

    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6462 f69170;

    /* JADX INFO: renamed from: ۨ֫ */
    public final AbstractC6462 f69171;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC6462 f69172;

    /* JADX INFO: renamed from: ۫֫ */
    public final AbstractC6462 f69173;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC6462 f69174;

    /* JADX INFO: renamed from: ۬֫ */
    public final C21333 f69175;

    /* JADX INFO: renamed from: ܰ */
    public final AbstractC6462 f69176;

    /* JADX INFO: renamed from: ܰ֫ */
    public final AbstractC6462 f69177;

    /* JADX INFO: renamed from: ܳ */
    public final C5771 f69178;

    /* JADX INFO: renamed from: ܳ֫ */
    public final AbstractC6462 f69179;

    /* JADX INFO: renamed from: ܳۧ */
    public final AbstractC6462 f69180;

    /* JADX INFO: renamed from: ܶ */
    public final C9262 f69181;

    /* JADX INFO: renamed from: ܶ֫ */
    public final AbstractC6462 f69182;

    /* JADX INFO: renamed from: ܶۧ */
    public final C3779 f69183;

    /* JADX INFO: renamed from: ܺ */
    public final C9262 f69184;

    /* JADX INFO: renamed from: ܺ֫ */
    public final AbstractC6462 f69185;

    /* JADX INFO: renamed from: ܺۧ */
    public final AbstractC6462 f69186;

    /* JADX INFO: renamed from: ܽ */
    public final C15828 f69187;

    /* JADX INFO: renamed from: ܽ֫ */
    public final AbstractC6462 f69188;

    /* JADX INFO: renamed from: ܽۧ */
    public final AbstractC6462 f69189;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC6462 f69190;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C2417 f69191;

    /* JADX INFO: renamed from: ܿۧ */
    public final AbstractC6462 f69192;

    /* JADX INFO: renamed from: ᩳ */
    public final C5771 f69193;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final AbstractC6462 f69194;

    /* JADX INFO: renamed from: ᩳۧ */
    public final C9262 f69195;

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC6462 f69196;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final LinkedHashMap f69197;

    /* JADX INFO: renamed from: ᩴۧ */
    public final C15828 f69198;

    /* JADX INFO: renamed from: ᩵ */
    public final HashMap f69199;

    /* JADX INFO: renamed from: ᩵֫ */
    public final C8200 f69200;

    /* JADX INFO: renamed from: ᩵ۧ */
    public final C16519 f69201;

    /* JADX INFO: renamed from: ᩶ */
    public final C2417 f69202;

    /* JADX INFO: renamed from: ᩶֫ */
    public final AbstractC6462 f69203;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC6462 f69204;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C16246 f69205;

    /* JADX INFO: renamed from: ᩷ۧ */
    public final AbstractC6462 f69206;

    /* JADX INFO: renamed from: ᩸ */
    public final C5771 f69207;

    /* JADX INFO: renamed from: ᩸֫ */
    public final AbstractC6462 f69208;

    /* JADX INFO: renamed from: ᩹ */
    public final C15828 f69209;

    /* JADX INFO: renamed from: ᩹֫ */
    public final AbstractC6462 f69210;

    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC6462 f69211;

    /* JADX INFO: renamed from: ᩺֫ */
    public final AbstractC6462 f69212;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC6462 f69213;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C13818 f69214;

    /* JADX INFO: renamed from: ᩻ۧ */
    public final AbstractC6462 f69215;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final C6468 f69126 = new C6468();

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final HashMap f69125 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static C22004 m49577(C5127 c5127) {
        C22004 c22004 = (C22004) c5127.m10905(f69126);
        return c22004 == null ? new C22004(c5127) : c22004;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13818 m49586(final AbstractC6462 abstractC6462, final C8374 c8374) {
        return (C13818) C15525.computeIfAbsent(this.f69141, new C12398(abstractC6462, c8374), new Function() { // from class: l.᩺֡֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C22004.m49576(c8374, this, abstractC6462);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C13818 m49576(C8374 c8374, C22004 c22004, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M19459;
        AbstractC6462 abstractC6463 = c22004.f69196;
        if (abstractC6462.mo5577() == EnumC11353.ARRAY || abstractC6462.mo5577() == EnumC11353.CLASS) {
            abstractC6462M19459 = c8374.m19459(abstractC6462);
        } else if (abstractC6462.mo14771()) {
            abstractC6462M19459 = c8374.m19436(abstractC6462).f20406;
        } else {
            throw new AssertionError(abstractC6462);
        }
        return new C13818(25L, c22004.f69200.f21752, new C21333(abstractC6463.f16705, abstractC6463.mo7201(), C4848.m10276of((Object) abstractC6462M19459)), abstractC6462.f16705);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49591(AbstractC6462 abstractC6462, String str, String str2) {
        C8200 c8200 = this.f69200;
        AbstractC14235 abstractC14235 = c8200.f21738;
        abstractC14235.getClass();
        char[] charArray = str.toCharArray();
        abstractC6462.f16705 = new C15828(1L, abstractC14235.mo17848(charArray, charArray.length), abstractC6462, this.f69155);
        this.f69143[abstractC6462.mo5577().ordinal()] = abstractC6462;
        this.f69159[abstractC6462.mo5577().ordinal()] = c8200.f21738.m32717("java.lang.".concat(str2));
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6462 m49574(String str) {
        AbstractC14235 abstractC14235 = this.f69200.f21738;
        abstractC14235.getClass();
        char[] charArray = str.toCharArray();
        return m49587(this.f69191, abstractC14235.mo17848(charArray, charArray.length)).f20406;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49594(AbstractC6462 abstractC6462) {
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        abstractC21195.f20410 = new C12616(this, abstractC21195.f20410);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49590(AbstractC6462 abstractC6462) {
        C15828 c15828M49587 = m49587(this.f69191, this.f69159[abstractC6462.mo5577().ordinal()]);
        c15828M49587.f20410 = new C17979(this, c15828M49587.f20410, abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    private C21333 m49581(String str) {
        AbstractC14235 abstractC14235 = this.f69200.f21738;
        abstractC14235.getClass();
        char[] charArray = str.toCharArray();
        C21333 c21333 = (C21333) m49587(this.f69191, abstractC14235.mo17848(charArray, charArray.length)).f20406;
        C15828 c15828 = (C15828) c21333.f16705;
        c15828.f20410 = InterfaceC8453.f22683;
        c15828.f20409 = 1073750529L;
        c15828.f20411 = c21333;
        c15828.f45850 = new C12338(c15828);
        c21333.f67257 = C4848.m10283();
        c21333.f67258 = C4848.m10283();
        c21333.f67259 = this.f69167;
        c21333.f67261 = C4848.m10283();
        return c21333;
    }

    public C22004(C5127 c5127) {
        C2417 c2417;
        C9262 c9262 = new C9262(EnumC11353.BYTE);
        this.f69184 = c9262;
        C9262 c9263 = new C9262(EnumC11353.CHAR);
        this.f69136 = c9263;
        C9262 c9264 = new C9262(EnumC11353.SHORT);
        this.f69195 = c9264;
        C9262 c9265 = new C9262(EnumC11353.INT);
        this.f69134 = c9265;
        C9262 c9266 = new C9262(EnumC11353.LONG);
        this.f69152 = c9266;
        C9262 c9267 = new C9262(EnumC11353.FLOAT);
        this.f69165 = c9267;
        C9262 c9268 = new C9262(EnumC11353.DOUBLE);
        this.f69181 = c9268;
        C9262 c9269 = new C9262(EnumC11353.BOOLEAN);
        this.f69151 = c9269;
        C22082 c22082 = C22082.f69463;
        C3227 c3227 = new C3227(null, c22082);
        this.f69204 = c3227;
        C3779 c3779 = new C3779(null, c22082);
        this.f69183 = c3779;
        AbstractC6462[] abstractC6462Arr = new AbstractC6462[EnumC11353.m26304()];
        this.f69143 = abstractC6462Arr;
        this.f69159 = new AbstractC12224[EnumC11353.m26304()];
        this.f69199 = new HashMap();
        this.f69145 = new HashMap();
        this.f69197 = new LinkedHashMap();
        this.f69141 = new HashMap();
        c5127.m10908(f69126, this);
        C8200 c8200M18988 = C8200.m18988(c5127);
        AbstractC14235 abstractC14235 = c8200M18988.f21738;
        AbstractC12224 abstractC12224 = c8200M18988.f21725;
        this.f69200 = c8200M18988;
        C16519 c16519 = new C16519(null, c22082);
        this.f69201 = c16519;
        this.f69205 = C16246.m37002(c5127);
        C6468 c6468 = C5612.f13595;
        C5612 c5612 = (C5612) c5127.m10905(c6468);
        if (c5612 == null) {
            c5612 = new C5612();
            c5127.m10908(c6468, c5612);
            C8200.m18988(c5127);
        }
        C23206 c23206 = new C23206(abstractC12224, c5612, EnumC12720.m29246(c5127).m29247());
        this.f69155 = c23206;
        C2417 c19321 = new C19321(this, abstractC12224);
        this.f69129 = c19321;
        m49578(c19321);
        c19321.f3704 = c19321.f3704.m10290(c19321.f3694);
        C2417 c18650 = new C18650(abstractC12224);
        c18650.f3696 = C4848.m10283();
        c18650.f3697 = C4848.m10283();
        c18650.f3701 = C4848.m10283();
        c18650.f3693 = C4848.m10283();
        c18650.f3705 = C4848.m10276of((Object) new C11648(m49585(this.f69200.f21668), EnumSet.of(EnumC10977.MANDATED)));
        this.f69202 = c18650;
        m49578(c18650);
        C2417 c15967 = new C15967(abstractC12224);
        this.f69147 = c15967;
        m49578(c15967);
        EnumC3600 enumC3600 = EnumC3600.f7349;
        AbstractC12224 abstractC12225 = c8200M18988.f21725;
        C13286 c13286 = AbstractC6462.f16700;
        C24685 c24685 = new C24685(enumC3600, 0L, abstractC12225, c13286, c23206);
        this.f69157 = c24685;
        C15828 c15828 = new C15828(1073741833L, c8200M18988.f21706, null, c23206);
        this.f69144 = c15828;
        C13956 c13956 = new C13956(c15828, c13286);
        this.f69139 = c13956;
        abstractC14235.getClass();
        char[] charArray = "<any?>".toCharArray();
        C15828 c15829 = new C15828(1073741833L, abstractC14235.mo17848(charArray, charArray.length), null, c23206);
        this.f69198 = c15829;
        c15829.f45850 = new C25078((AbstractC7783) c15829);
        c15829.f20406 = c16519;
        m49591(c9262, ClassTransform.BYTE, "Byte");
        m49591(c9264, ClassTransform.SHORT, "Short");
        m49591(c9263, ClassTransform.CHARACTER, "Character");
        m49591(c9265, ClassTransform.INTEGER, "Integer");
        m49591(c9266, ClassTransform.LONG, "Long");
        m49591(c9267, ClassTransform.FLOAT, "Float");
        m49591(c9268, ClassTransform.DOUBLE, "Double");
        m49591(c9269, ClassTransform.BOOLEAN, "Boolean");
        m49591(c3779, ClassTransform.VOID, "Void");
        abstractC14235.getClass();
        char[] charArray2 = "<nulltype>".toCharArray();
        c3227.f16705 = new C15828(1L, abstractC14235.mo17848(charArray2, charArray2.length), c3227, c23206);
        abstractC6462Arr[c3227.mo5577().ordinal()] = c3227;
        c13956.f16705 = c15828;
        abstractC6462Arr[c13956.mo5577().ordinal()] = c13956;
        c16519.f16705 = c15829;
        abstractC6462Arr[c16519.mo5577().ordinal()] = c16519;
        C15828 c158210 = new C15828(1073741825L, c8200M18988.f21731, c24685);
        this.f69187 = c158210;
        C15828 c158211 = new C15828(1073741825L, c8200M18988.f21711, c24685);
        this.f69162 = c158211;
        c158211.f45850 = new C25078((AbstractC7783) c158211);
        C15828 c158212 = new C15828(1073741825L, c8200M18988.f21654, c24685);
        this.f69163 = c158212;
        c158212.f45850 = new C25078((AbstractC7783) c158211);
        C15828 c158213 = new C15828(1073741825L, abstractC12224, c23206);
        this.f69140 = c158213;
        C12338 c12338 = new C12338(c158213);
        c158213.f45850 = c12338;
        this.f69154 = C21294.m48132(c5127).m48140();
        c23206.f27061 = new C12338(c23206);
        c12338.mo28415(c9262.f16705);
        c12338.mo28415(c9264.f16705);
        c12338.mo28415(c9263.f16705);
        c12338.mo28415(c9265.f16705);
        c12338.mo28415(c9266.f16705);
        c12338.mo28415(c9267.f16705);
        c12338.mo28415(c9268.f16705);
        c12338.mo28415(c9269.f16705);
        c12338.mo28415(c13956.f16705);
        c12338.mo28415(c15828);
        if (EnumC12477.f34980.m28726(EnumC17840.m40515(c5127))) {
            C2417 c2417M49585 = m49585(c8200M18988.f21668);
            this.f69191 = c2417M49585;
            c2417M49585.f20410 = InterfaceC8453.f22683;
            c2417M49585.f3689 = Collections.EMPTY_MAP;
            c2417 = c15967;
        } else {
            c2417 = c15967;
            this.f69191 = c2417;
        }
        InterfaceC8453 interfaceC8453M12096 = C5473.m12055(c5127).m12096();
        this.f69142 = interfaceC8453M12096;
        AbstractC6462 abstractC6462M49574 = m49574("java.lang.Object");
        this.f69208 = abstractC6462M49574;
        this.f69182 = m49574("java.lang.runtime.ObjectMethods");
        this.f69210 = m49574("java.util.Objects");
        this.f69196 = m49574("java.lang.Class");
        this.f69215 = m49574("java.lang.String");
        m49574("java.lang.StringBuffer");
        this.f69192 = m49574("java.lang.StringBuilder");
        AbstractC6462 abstractC6462M49575 = m49574("java.lang.Cloneable");
        this.f69127 = abstractC6462M49575;
        this.f69161 = m49574("java.lang.Throwable");
        AbstractC6462 abstractC6462M49576 = m49574("java.io.Serializable");
        this.f69169 = abstractC6462M49576;
        AbstractC6462 abstractC6462M49577 = m49574("java.lang.invoke.SerializedLambda");
        this.f69189 = abstractC6462M49577;
        this.f69158 = m49574("java.lang.invoke.VarHandle");
        this.f69185 = m49574("java.lang.invoke.MethodHandle");
        this.f69160 = m49574("java.lang.invoke.MethodHandles$Lookup");
        this.f69137 = m49574("java.lang.invoke.MethodType");
        this.f69174 = m49574("java.lang.Error");
        this.f69170 = m49574("java.lang.IllegalArgumentException");
        this.f69168 = m49574("java.lang.InterruptedException");
        AbstractC6462 abstractC6462M49578 = m49574("java.lang.Exception");
        this.f69172 = abstractC6462M49578;
        this.f69135 = m49574("java.lang.RuntimeException");
        m49574("java.lang.ClassNotFoundException");
        m49574("java.lang.NoClassDefFoundError");
        this.f69131 = m49574("java.lang.NoSuchFieldError");
        this.f69190 = m49574("java.lang.AssertionError");
        this.f69211 = m49574("java.lang.IncompatibleClassChangeError");
        m49574("java.lang.CloneNotSupportedException");
        this.f69167 = m49574("java.lang.annotation.Annotation");
        m49574("java.lang.ClassLoader");
        C15828 c15828M49587 = m49587(this.f69191, c8200M18988.f21757);
        this.f69209 = c15828M49587;
        C2417 c2418 = c2417;
        this.f69207 = new C5771(137438953492L, c8200M18988.f21749, new C12497(C4848.m10283(), c3779, C4848.m10283(), c158212), c15828M49587);
        m49574("java.util.List");
        m49574("java.util.Collections");
        m49574("java.lang.Comparable");
        this.f69146 = m49574("java.util.Comparator");
        m49574("java.util.Arrays");
        this.f69188 = m49574("java.lang.Iterable");
        this.f69194 = m49574("java.util.Iterator");
        this.f69133 = m49574("java.lang.annotation.Target");
        this.f69203 = m49574("java.lang.Override");
        this.f69177 = m49574("java.lang.annotation.Retention");
        this.f69130 = m49574("java.lang.Deprecated");
        this.f69153 = m49574("java.lang.SuppressWarnings");
        m49574("java.util.function.Supplier");
        this.f69176 = m49574("java.lang.annotation.Inherited");
        this.f69212 = m49574("java.lang.annotation.Repeatable");
        this.f69156 = m49574("java.lang.annotation.Documented");
        m49574("java.lang.annotation.ElementType");
        this.f69164 = m49574("java.lang.System");
        AbstractC6462 abstractC6462M49579 = m49574("java.lang.AutoCloseable");
        this.f69213 = abstractC6462M49579;
        this.f69178 = new C5771(1L, c8200M18988.f21709, new C12497(C4848.m10283(), c3779, C4848.m10276of((Object) abstractC6462M49578), c158212), abstractC6462M49579.f16705);
        this.f69186 = m49574("java.lang.SafeVarargs");
        this.f69128 = m49574("java.lang.annotation.Native");
        AbstractC6462 abstractC6462M495710 = m49574("java.lang.invoke.LambdaMetafactory");
        this.f69179 = abstractC6462M495710;
        AbstractC6462 abstractC6462M495711 = m49574("java.lang.invoke.StringConcatFactory");
        this.f69180 = abstractC6462M495711;
        this.f69149 = m49574("java.lang.FunctionalInterface");
        this.f69173 = m49574("jdk.internal.javac.PreviewFeature");
        this.f69175 = m49581("jdk.internal.PreviewFeature+Annotation");
        this.f69138 = m49574("java.lang.invoke.TypeDescriptor");
        this.f69171 = m49574("java.lang.Record");
        this.f69206 = m49574("java.lang.runtime.SwitchBootstraps");
        this.f69132 = m49574("jdk.internal.ValueBased");
        this.f69148 = m49581("jdk.internal.ValueBased+Annotation");
        m49594(abstractC6462M49579);
        m49594(abstractC6462M49575);
        m49594(abstractC6462M49576);
        m49594(abstractC6462M495710);
        m49594(abstractC6462M49577);
        m49594(abstractC6462M495711);
        m49590(c9268);
        m49590(c9267);
        m49590(c3779);
        this.f69150 = m49581("sun.Proprietary+Annotation");
        C21333 c21333M49581 = m49581("jdk.Profile+Annotation");
        this.f69166 = c21333M49581;
        c21333M49581.f16705.mo17983().mo28415(new C5771(1025L, c8200M18988.f21718, c9265, c21333M49581.f16705));
        C21333 c21333 = (C21333) c158210.f20406;
        c21333.f67259 = abstractC6462M49574;
        c21333.f67261 = C4848.m10277of((Object) abstractC6462M49575, (Object) abstractC6462M49576);
        c158210.f45850 = new C12338(c158210);
        C13818 c13818 = new C13818(17L, c8200M18988.f21656, c9265, c158210);
        this.f69214 = c13818;
        c158210.mo18020();
        c158210.f45850.mo28415(c13818);
        C5771 c5771 = new C5771(1L, c8200M18988.f21760, new C12497(C4848.m10283(), abstractC6462M49574, C4848.m10283(), c158212), c158210);
        this.f69193 = c5771;
        c158210.mo18020();
        c158210.f45850.mo28415(c5771);
        C2417 c2419 = this.f69191;
        if (c2419 != c2418) {
            C12826.requireNonNull(interfaceC8453M12096);
            c2419.f20410 = new C18758(5, interfaceC8453M12096);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m49589(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        C15828 c15828 = new C15828(0L, abstractC12224, abstractC7783);
        c15828.f20410 = this.f69154;
        return c15828;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m49588(C2417 c2417, AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        C1446.m31699(c2417);
        C15828 c15828M49597 = m49597(c2417, AbstractC21195.m47863(abstractC12224, abstractC21195));
        if (c15828M49597 == null) {
            C15828 c15828M49589 = m49589(abstractC12224, abstractC21195);
            ((Map) C15525.computeIfAbsent(this.f69199, c15828M49589.f45859, new C8224(2))).put(c2417, c15828M49589);
            return c15828M49589;
        }
        if ((c15828M49597.f20408 != abstractC12224 || c15828M49597.f20407 != abstractC21195) && abstractC21195.f20405 == EnumC3600.f7354) {
            AbstractC7783 abstractC7783 = c15828M49597.f20407;
            if (abstractC7783.f20405 == EnumC3600.f7351) {
                abstractC7783.mo17983().mo28417(c15828M49597);
                c15828M49597.f20408 = abstractC12224;
                c15828M49597.f20407 = abstractC21195;
                c15828M49597.f45855 = AbstractC21195.m47864(abstractC12224, abstractC21195);
            }
        }
        return c15828M49597;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C15828 m49597(C2417 c2417, final AbstractC12224 abstractC12224) {
        C12826.requireNonNull(abstractC12224);
        C1446.m31700(c2417, new Supplier() { // from class: l.ܰ֡֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC12224.toString();
            }
        });
        return (C15828) ((Map) C15525.getOrDefault(this.f69199, abstractC12224, Collections.EMPTY_MAP)).get(c2417);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9794 m49599(C2417 c2417, AbstractC12224 abstractC12224) {
        return m49575(c2417, abstractC12224, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C9794 m49575(C2417 c2417, AbstractC12224 abstractC12224, boolean z) {
        C1446.m31699(c2417);
        if (abstractC12224.isEmpty()) {
            return c2417.f3694;
        }
        if (c2417 == this.f69147) {
            return m49593(c2417, abstractC12224);
        }
        c2417.mo18020();
        C9794 c9794 = (C9794) c2417.f3689.get(abstractC12224);
        if (c9794 != null) {
            return c9794;
        }
        C9794 c9794M49601 = m49601(c2417, abstractC12224);
        if ((c9794M49601 != null && c9794M49601.mo17485()) || z) {
            return c9794M49601;
        }
        C4848 c4848 = c2417.f3705;
        if (c4848 != null && C7480.stream(c4848).map(new C24367(10)).anyMatch(new Predicate() { // from class: l.۟֡֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m21066or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C2417) obj) == this.f24697.f69129;
            }
        })) {
            C2417 c2418 = this.f69129;
            C9794 c9794M49602 = m49601(c2418, abstractC12224);
            if (c9794M49602 != null && c9794M49602.mo17485()) {
                c2417.f3689.put(c9794M49602.f27059, c9794M49602);
                return c9794M49602;
            }
            C9794 c9794M49593 = m49593(c2417, abstractC12224);
            c9794M49593.mo18020();
            if (!c9794M49593.mo17485()) {
                C9794 c9794M49594 = m49593(c2418, abstractC12224);
                c9794M49594.mo18020();
                if (c9794M49594.mo17485()) {
                    c2417.f3689.put(c9794M49594.f27059, c9794M49594);
                    return c9794M49594;
                }
            }
            return c9794M49593;
        }
        return m49593(c2417, abstractC12224);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m49602(C2417 c2417, AbstractC12224 abstractC12224) {
        ((Map) C15525.getOrDefault(this.f69199, abstractC12224, f69125)).remove(c2417);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m49587(C2417 c2417, AbstractC12224 abstractC12224) {
        C1446.m31699(c2417);
        C9794 c9794M49575 = m49575(c2417, abstractC12224.m28201(0, abstractC12224.m28199((byte) 46)), false);
        C1446.m31699(c9794M49575);
        C1446.m31699(c9794M49575.f27063);
        C15828 c15828M49597 = m49597(c9794M49575.f27063, abstractC12224);
        if (c15828M49597 != null) {
            return c15828M49597;
        }
        C15828 c15828M49589 = m49589(C14514.m33177(abstractC12224), c9794M49575);
        ((Map) C15525.computeIfAbsent(this.f69199, c15828M49589.f45859, new C8224(2))).put(c9794M49575.f27063, c15828M49589);
        return c15828M49589;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m49595(C2417 c2417, AbstractC12224 abstractC12224) {
        C1446.m31699(c2417);
        C9794 c9794M49575 = m49575(c2417, abstractC12224, true);
        return c9794M49575 != null && c9794M49575.mo17485();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9794 m49593(final C2417 c2417, AbstractC12224 abstractC12224) {
        C1446.m31699(c2417);
        C9794 c9794M49601 = m49601(c2417, abstractC12224);
        if (c9794M49601 != null) {
            return c9794M49601;
        }
        C1446.m31705(!abstractC12224.isEmpty(), new Supplier() { // from class: l.֫ۚ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return "rootPackage missing!; currModule: " + c2417;
            }
        });
        C9794 c9794 = new C9794(C14514.m33177(abstractC12224), m49593(c2417, abstractC12224.m28201(0, abstractC12224.m28199((byte) 46))));
        c9794.f20410 = this.f69154;
        c9794.f27063 = c2417;
        ((Map) C15525.computeIfAbsent(this.f69145, c9794.f27059, new C5631(6))).put(c2417, c9794);
        c2417.f3704 = c2417.f3704.m10290(c9794);
        return c9794;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49578(C2417 c2417) {
        C23206 c23206 = this.f69155;
        ((Map) C15525.computeIfAbsent(this.f69145, c23206.f27059, new C5631(6))).put(c2417, c23206);
        c2417.f3704 = c2417.f3704.m10290(c23206);
        C8592 c8592 = new C8592(this, this.f69200.f21725, c23206);
        c8592.f27063 = c2417;
        c8592.f20410 = new C4407(this);
        c8592.f20409 |= X931RNG.BLOCK128_RESEED_MAX;
        c2417.f3694 = c8592;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9794 m49601(C2417 c2417, AbstractC12224 abstractC12224) {
        return (C9794) ((Map) C15525.getOrDefault(this.f69145, abstractC12224, Collections.EMPTY_MAP)).get(c2417);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2417 m49585(AbstractC12224 abstractC12224) {
        LinkedHashMap linkedHashMap = this.f69197;
        C2417 c2417 = (C2417) linkedHashMap.get(abstractC12224);
        if (c2417 != null) {
            return c2417;
        }
        AbstractC12224 abstractC12225 = this.f69200.f21701;
        C2417 c2418 = new C2417(abstractC12224);
        C15828 c15828 = new C15828(2251799813685248L, abstractC12225, c2418);
        AbstractC12224 abstractC12224M47864 = AbstractC21195.m47864(abstractC12225, c2418);
        c15828.f45855 = abstractC12224M47864;
        c15828.f45859 = abstractC12224M47864;
        c15828.f45850 = new C12338(c15828);
        c2418.f3687 = c15828;
        m49578(c2418);
        c2418.f20410 = new C24975(7, this);
        linkedHashMap.put(abstractC12224, c2418);
        return c2418;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2417 m49596(AbstractC12224 abstractC12224) {
        return (C2417) this.f69197.get(abstractC12224);
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m49598(AbstractC12224 abstractC12224) {
        if (abstractC12224.isEmpty()) {
            return C4848.m10283();
        }
        C4848 c4848M10283 = C4848.m10283();
        Map map = (Map) this.f69145.get(abstractC12224);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C9794 c9794 = (C9794) entry.getValue();
                c9794.mo18020();
                if (!c9794.f27061.m22460()) {
                    c4848M10283 = c4848M10283.m10290((C2417) entry.getKey());
                }
            }
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Collection m49584() {
        return this.f69197.values();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Collection m49592(AbstractC12224 abstractC12224) {
        return ((Map) C15525.getOrDefault(this.f69199, abstractC12224, Collections.EMPTY_MAP)).values();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Collection m49600(AbstractC12224 abstractC12224) {
        return ((Map) C15525.getOrDefault(this.f69145, abstractC12224, Collections.EMPTY_MAP)).values();
    }
}
