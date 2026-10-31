package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.UMConfigure;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3894 extends C18461 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C5210 f12455;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C13839 f12456;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f12457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13675 f12459;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5210 f12460;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5210 f12462;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f12463;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5210 f12464;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f12458 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f12461 = new ArrayDeque(AbstractC14545.of((Object) Boolean.FALSE));

    public C3894(C13675 c13675, int i) {
        this.f12459 = c13675;
        this.f12463 = i;
        C5210.m14988(-2, i);
        this.f12462 = C5210.m14988(-4, i);
        this.f12464 = C5210.m14988(2, i);
        this.f12460 = C5210.m14988(4, i);
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11779(C0058 c0058, Object obj) {
        m11762("opens", "to", c0058.f946, c0058.f947);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11780(C0617 c0617, Object obj) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11781(C1323 c1323, Object obj) {
        boolean z;
        C2609<InterfaceC22900> c2609M8239;
        AbstractC12612 abstractC12612M4615 = c1323.m4615();
        C13675 c13675 = this.f12459;
        if (abstractC12612M4615 != null) {
            m11855();
            AbstractC12612 abstractC12612M4616 = c1323.m4615();
            C7820 c7820M4619 = c1323.m4619();
            if (c7820M4619 == null) {
                c2609M8239 = C2609.m8239();
            } else {
                c2609M8239 = c7820M4619.f24198;
            }
            if (!c2609M8239.isEmpty()) {
                for (InterfaceC22900 interfaceC22900 : c2609M8239) {
                    c13675.m32914();
                    m11845((InterfaceC13206) interfaceC22900);
                }
                c13675.m32914();
            }
            c13675.m32896(this.f12460);
            m11836("package");
            c13675.m32907();
            m11777(abstractC12612M4616);
            c13675.m32906();
            m11836(l.b);
            c13675.m32914();
            z = true;
        } else {
            z = false;
        }
        m11852();
        if (!c1323.m4617().isEmpty()) {
            if (z) {
                c13675.m32898(AbstractC22848.f73736);
            }
            for (InterfaceC10180 interfaceC10180 : c1323.m4617()) {
                m11855();
                c13675.m32898(AbstractC22848.f73735);
                m11845(interfaceC10180);
                c13675.m32914();
            }
            z = true;
        }
        m11852();
        for (InterfaceC13206 interfaceC13206 : c1323.m4618()) {
            if (interfaceC13206.mo987() != EnumC3329.IMPORT) {
                if (z) {
                    c13675.m32898(AbstractC22848.f73736);
                }
                m11855();
                m11845(interfaceC13206);
                c13675.m32914();
                m11852();
                z = true;
            }
        }
        C3587 c3587M4616 = c1323.m4616();
        if (c3587M4616 != null) {
            if (z) {
                c13675.m32898(AbstractC22848.f73736);
            }
            m11855();
            m11851((InterfaceC20969) c3587M4616);
            c13675.m32914();
        }
        m11855();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11782(C1470 c1470, Object obj) {
        m11854(c1470);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InterfaceC12296 interfaceC12296 = c1470;
        while (true) {
            arrayList.add(interfaceC12296.mo5022());
            arrayList2.add(interfaceC12296.mo5023());
            if (interfaceC12296.mo5021() == null || interfaceC12296.mo5021().mo987() != EnumC3329.IF) {
                break;
            }
            interfaceC12296 = (InterfaceC12296) interfaceC12296.mo5021();
        }
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < size) {
            if (z) {
                if (z2) {
                    c13675.m32907();
                } else {
                    c13675.m32914();
                }
                m11836("else");
                c13675.m32907();
            }
            m11836("if");
            c13675.m32907();
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            m11845((InterfaceC13206) ((InterfaceC19558) ((InterfaceC20058) arrayList.get(i))).getExpression());
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            z = true;
            m11767((InterfaceC15322) arrayList2.get(i), EnumC6716.m18276(size == 1 && interfaceC12296.mo5021() == null), EnumC1777.YES, EnumC10950.m27271(i < size + (-1) || interfaceC12296.mo5021() != null));
            z2 = ((InterfaceC15322) arrayList2.get(i)).mo987() == EnumC3329.BLOCK;
            i++;
        }
        if (interfaceC12296.mo5021() != null) {
            if (z2) {
                c13675.m32907();
            } else {
                c13675.m32914();
            }
            m11836("else");
            m11767(interfaceC12296.mo5021(), EnumC6716.NO, EnumC1777.YES, EnumC10950.NO);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11783(C1616 c1616, Object obj) {
        m11854(c1616);
        m11836("throw");
        this.f12459.m32907();
        m11845((InterfaceC13206) c1616.f5680);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11784(C2176 c2176, Object obj) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11785(C2322 c2322, Object obj) {
        m11854(c2322);
        m11836("yield");
        this.f12459.m32907();
        m11845((InterfaceC13206) c2322.f7456);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11786(C2735 c2735, Object obj) {
        m11848((InterfaceC17235) c2735, EnumC6716.NO, EnumC1777.NO, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11787(C2882 c2882, Object obj) {
        m11854((InterfaceC13206) c2882);
        int[] iArr = C7153.f21955;
        EnumC9454 enumC9454 = c2882.f9190;
        switch (iArr[enumC9454.m24298().ordinal()]) {
            case 1:
                m11836(ClassTransform.BOOLEAN);
                return null;
            case 2:
                m11836(ClassTransform.BYTE);
                return null;
            case 3:
                m11836(ClassTransform.SHORT);
                return null;
            case 4:
                m11836(ClassTransform.INTEGER);
                return null;
            case 5:
                m11836(ClassTransform.LONG);
                return null;
            case 6:
                m11836(ClassTransform.CHARACTER);
                return null;
            case 7:
                m11836(ClassTransform.FLOAT);
                return null;
            case 8:
                m11836(ClassTransform.DOUBLE);
                return null;
            case 9:
                m11836(ClassTransform.VOID);
                return null;
            default:
                throw new AssertionError(enumC9454.m24298());
        }
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo11788(C3587 c3587, Object obj) {
        m11851((InterfaceC20969) c3587);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11789(C4146 c4146, Object obj) {
        m11854(c4146);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("break");
        AbstractC10370 abstractC10370 = c4146.f13545;
        if (abstractC10370 != null) {
            c13675.m32907();
            m11846(abstractC10370);
        }
        c13675.m32906();
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11790(C4851 c4851, Object obj) {
        m11854(c4851);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        m11836("for");
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32896(c5210);
        m11770(EnumC20828.NONE, EnumC15887.HORIZONTAL, c4851.f15325, C16646.of(c4851.f15326), ":", C16646.empty());
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32906();
        m11767(c4851.f15324, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11791(C5557 c5557, Object obj) {
        AbstractC8032 abstractC8032;
        int i = C7153.f21954[c5557.mo987().ordinal()];
        C13675 c13675 = this.f12459;
        AbstractC8032 abstractC8033 = this.f12460;
        AbstractC8032 abstractC8034 = f12455;
        if (i == 1) {
            m11854(c5557);
            c13675.m32896(abstractC8034);
            InterfaceC23790 interfaceC23790 = c5557.f17181;
            for (InterfaceC13206 interfaceC13206 : m11758(m11835(interfaceC23790, (List) interfaceC23790.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC13206);
                c13675.m32914();
            }
            c13675.m32896(abstractC8034);
            m11836("@");
            m11836("interface");
            c13675.m32904();
            m11846(c5557.f17180);
            c13675.m32906();
            c13675.m32906();
            List list = c5557.f17179;
            if (list == null) {
                c13675.m32896(abstractC8033);
                m11836(l.b);
                c13675.m32906();
            } else {
                m11840(list, EnumC14476.YES, EnumC2483.YES);
            }
            c13675.m32905(l.b);
            return null;
        }
        if (i == 2 || i == 3) {
            m11854(c5557);
            InterfaceC23790 interfaceC23791 = c5557.f17181;
            for (InterfaceC13206 interfaceC13207 : m11758(m11835(interfaceC23791, (List) interfaceC23791.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC13207);
                c13675.m32914();
            }
            List list2 = c5557.f17182;
            boolean z = c5557.f17184 != null;
            boolean zIsEmpty = c5557.f17183.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            EnumC3329 enumC3329Mo987 = c5557.mo987();
            EnumC3329 enumC3329 = EnumC3329.INTERFACE;
            m11836(enumC3329Mo987 != enumC3329 ? Name.LABEL : "interface");
            c13675.m32907();
            m11846(c5557.f17180);
            if (!c5557.f17185.isEmpty()) {
                m11836("<");
            }
            c13675.m32896(abstractC8033);
            if (!c5557.f17185.isEmpty()) {
                List list3 = c5557.f17185;
                if (!z && zIsEmpty && zIsEmpty2) {
                    abstractC8033 = abstractC8034;
                }
                m11856(list3, abstractC8033);
            }
            if (z) {
                c13675.m32912();
                m11836("extends");
                c13675.m32907();
                m11845(c5557.f17184);
            }
            m11763(c5557.mo987() == enumC3329 ? "extends" : "implements", c5557.f17183);
            m11763("permits", list2);
            c13675.m32906();
            List list4 = c5557.f17179;
            if (list4 == null) {
                m11836(l.b);
            } else {
                m11840(list4, EnumC14476.YES, EnumC2483.YES);
            }
            m11852();
            return null;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(c5557.mo987());
            }
            m11854(c5557);
            InterfaceC23790 interfaceC23792 = c5557.f17181;
            for (InterfaceC13206 interfaceC13208 : m11758(m11835(interfaceC23792, (List) interfaceC23792.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC13208);
                c13675.m32914();
            }
            if (c5557.f17184 != null) {
                throw new C17619();
            }
            boolean zIsEmpty3 = c5557.f17183.isEmpty();
            m11836("record");
            c13675.m32907();
            m11846(c5557.f17180);
            if (!c5557.f17185.isEmpty()) {
                m11836("<");
            }
            c13675.m32896(abstractC8033);
            if (!c5557.f17185.isEmpty()) {
                m11856(c5557.f17185, !zIsEmpty3 ? abstractC8033 : abstractC8034);
            }
            AbstractC14545 abstractC14545 = (AbstractC14545) C5378.stream(c5557.f17179).filter(new C12797()).map(new C23147(7)).filter(new C4167(1)).collect(AbstractC14545.m34736());
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            abstractC14545.isEmpty();
            m11847(C16646.empty(), abstractC14545);
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            if (!zIsEmpty3) {
                c13675.m32912();
                if (c5557.f17183.m8245() <= 1) {
                    abstractC8033 = abstractC8034;
                }
                c13675.m32896(abstractC8033);
                m11836("implements");
                c13675.m32907();
                boolean z2 = false;
                for (InterfaceC13206 interfaceC13209 : c5557.f17183) {
                    if (z2) {
                        m11836(",");
                        c13675.m32904();
                    }
                    m11845(interfaceC13209);
                    z2 = true;
                }
                c13675.m32906();
            }
            c13675.m32906();
            C2609 c2609 = c5557.f17179;
            if (c2609 == null) {
                m11836(l.b);
            } else {
                m11840((AbstractC14545) C5378.stream(c2609).filter(new C18282(1)).collect(AbstractC14545.m34736()), EnumC14476.YES, EnumC2483.YES);
            }
            m11852();
            return null;
        }
        m11854(c5557);
        c13675.m32896(abstractC8034);
        InterfaceC23790 interfaceC23793 = c5557.f17181;
        for (InterfaceC13206 interfaceC132010 : m11758(m11835(interfaceC23793, (List) interfaceC23793.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
            c13675.m32914();
            m11845(interfaceC132010);
            c13675.m32914();
        }
        c13675.m32896(abstractC8033);
        m11836("enum");
        c13675.m32907();
        m11846(c5557.f17180);
        c13675.m32906();
        c13675.m32906();
        if (!c5557.f17183.isEmpty()) {
            c13675.m32896(abstractC8033);
            c13675.m32904();
            c13675.m32896(abstractC8033);
            m11836("implements");
            c13675.m32904();
            c13675.m32896(abstractC8034);
            boolean z3 = false;
            for (InterfaceC13206 interfaceC132011 : c5557.f17183) {
                if (z3) {
                    m11836(",");
                    c13675.m32912();
                }
                m11845(interfaceC132011);
                z3 = true;
            }
            c13675.m32906();
            c13675.m32906();
            c13675.m32906();
        }
        c13675.m32907();
        AbstractC8032 abstractC8035 = this.f12464;
        m11843(abstractC8035);
        ArrayList<InterfaceC1527> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC13206 interfaceC132012 : c5557.f17179) {
            if (interfaceC132012 instanceof C9378) {
                C9378 c9378 = (C9378) interfaceC132012;
                abstractC8032 = abstractC8035;
                if ((c9378.f28486.f7169 & 16384) == 16384) {
                    arrayList.add(c9378);
                }
                abstractC8035 = abstractC8032;
            } else {
                abstractC8032 = abstractC8035;
            }
            arrayList2.add(interfaceC132012);
            abstractC8035 = abstractC8032;
        }
        AbstractC8032 abstractC8036 = abstractC8035;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            c13675.m32896(abstractC8036);
            c13675.m32898(AbstractC22848.f73734);
            c13675.m32914();
            c13675.m32896(abstractC8034);
            boolean z4 = false;
            for (InterfaceC1527 interfaceC1527 : arrayList) {
                if (z4) {
                    m11836(",");
                    c13675.m32914();
                    c13675.m32898(AbstractC22848.f73735);
                }
                m11855();
                Iterator it = interfaceC1527.mo5211().f7168.iterator();
                while (it.hasNext()) {
                    m11845((InterfaceC13206) it.next());
                    c13675.m32914();
                }
                m11846(interfaceC1527.getName());
                InterfaceC8974 interfaceC8974 = (InterfaceC8974) interfaceC1527.mo5210();
                if (interfaceC8974.mo23183().isEmpty()) {
                    c13675.m32905(MotionUtils.EASING_TYPE_FORMAT_START);
                    c13675.m32905(MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    m11839(interfaceC8974.mo23183(), abstractC8033);
                }
                if (interfaceC8974.mo23182() != null) {
                    m11840(interfaceC8974.mo23182().f17179, EnumC14476.YES, EnumC2483.YES);
                }
                z4 = true;
            }
            if (((String) c13675.m32908(0).orElse("")).equals(",")) {
                m11836(",");
                c13675.m32914();
            }
            c13675.m32906();
            c13675.m32906();
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                c13675.m32896(abstractC8036);
                m11836(l.b);
                c13675.m32914();
                m11852();
                c13675.m32906();
            }
            c13675.m32896(abstractC8034);
            m11840(arrayList2, EnumC14476.NO, EnumC2483.NO);
            c13675.m32914();
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, abstractC8036);
            c13675.m32906();
        } else if (c13675.m32908(0).equals(C16646.of(l.b))) {
            c13675.m32896(abstractC8036);
            c13675.m32914();
            m11836(l.b);
            c13675.m32914();
            m11852();
            c13675.m32906();
            c13675.m32896(abstractC8034);
            c13675.m32914();
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, abstractC8036);
            c13675.m32906();
        } else {
            c13675.m32896(abstractC8034);
            c13675.m32898(AbstractC22848.f73734);
            m11836(l.d);
            c13675.m32906();
        }
        c13675.m32905(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11792(C5704 c5704, Object obj) {
        m11854(c5704);
        m11852();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5305(C6262 c6262, Object obj) {
        m11854((InterfaceC13206) c6262);
        m11844((AbstractC12612) c6262);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11793(C6555 c6555, Object obj) {
        EnumC18550 enumC18550Mo989;
        m11854((InterfaceC13206) c6555);
        String strM9807 = C3188.m9807((InterfaceC20058) c6555);
        if (c6555.mo989().m43094()) {
            m11845((InterfaceC13206) c6555.f20226);
            m11773(strM9807);
            return null;
        }
        m11773(strM9807);
        int i = C7153.f21954[c6555.mo987().ordinal()];
        if (i == 6 || i == 7) {
            AbstractC12612 abstractC12612 = c6555.f20226;
            if (abstractC12612 instanceof InterfaceC23084) {
                enumC18550Mo989 = abstractC12612.mo989();
            } else if (abstractC12612 instanceof InterfaceC1918) {
                if (C3188.m9806((InterfaceC1918) abstractC12612, m42940()).startsWith("-")) {
                    enumC18550Mo989 = EnumC18550.f57485;
                } else {
                    enumC18550Mo989 = null;
                }
            } else {
                enumC18550Mo989 = null;
            }
            if (enumC18550Mo989 != null && !enumC18550Mo989.m43094() && C3188.m9807((InterfaceC20058) c6555).startsWith(strM9807)) {
                this.f12459.m32907();
            }
        }
        m11845((InterfaceC13206) c6555.f20226);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11794(C6968 c6968, Object obj) {
        m11854(c6968);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        m11836("assert");
        c13675.m32907();
        if (c6968.f21476 != null) {
            c5210 = this.f12460;
        }
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c6968.f21475);
        if (c6968.f21476 != null) {
            c13675.m32904();
            m11836(":");
            c13675.m32907();
            m11845((InterfaceC13206) c6968.f21476);
        }
        c13675.m32906();
        c13675.m32906();
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11795(C7115 c7115, Object obj) {
        m11854(c7115);
        m11836(MessageHandler.Properties.IsSynchronized);
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32896(this.f12460);
        c13675.m32892();
        m11845((InterfaceC13206) ((InterfaceC19558) c7115.f21831).getExpression());
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        m11845(c7115.f21830);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5306(C7673 c7673, Object obj) {
        m11854((InterfaceC13206) c7673);
        m11836(c7673.f23696.toString());
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11796(C8379 c8379, Object obj) {
        m11854((InterfaceC13206) c8379);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c8379.f25701);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32907();
        }
        m11836("?");
        c13675.m32907();
        m11845((InterfaceC13206) c8379.f25699);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32907();
        }
        m11836(":");
        c13675.m32907();
        m11845((InterfaceC13206) c8379.f25700);
        c13675.m32906();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [l.ۘۧۖ] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11797(C8526 c8526, Object obj) {
        InterfaceC13206 interfaceC13206;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        AbstractC12612 abstractC12612 = c8526.f26049;
        m11854(c8526);
        ?? SubList = c8526.f26046.f7168;
        List listOf = AbstractC14545.of();
        boolean z3 = false;
        boolean z4 = (c8526.f26046.f7169 & 2251799813685248L) == 2251799813685248L;
        if (!c8526.f26047.isEmpty() && !SubList.isEmpty()) {
            int iM9805 = C3188.m9805((InterfaceC13206) c8526.f26047.get(0));
            for (int i = 0; i < SubList.m8245(); i++) {
                if (C3188.m9805((InterfaceC13206) SubList.get(i)) > iM9805) {
                    listOf = SubList.subList(i, SubList.m8245());
                    SubList = SubList.subList(0, i);
                    break;
                }
            }
        }
        AbstractC14545<InterfaceC22900> abstractC14545M11758 = m11758(m11835(c8526.f26046, SubList), EnumC15887.VERTICAL, C16646.empty());
        if (c8526.f26047.isEmpty() && c8526.f26051 != null) {
            listOf = abstractC14545M11758;
            abstractC14545M11758 = AbstractC14545.of();
        }
        AbstractC12612 abstractC12613 = c8526.f26051;
        C13675 c13675 = this.f12459;
        if (abstractC12613 != null) {
            C9270 c9270M22277 = C8564.m22277(abstractC12613, EnumC20559.YES);
            interfaceC13206 = c9270M22277.f28080;
            arrayDeque = new ArrayDeque(c9270M22277.f28079);
        } else {
            for (InterfaceC22900 interfaceC22900 : abstractC14545M11758) {
                c13675.m32914();
                m11845(interfaceC22900);
                c13675.m32914();
            }
            abstractC14545M11758 = AbstractC14545.of();
            interfaceC13206 = null;
            arrayDeque = null;
        }
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        C7326 c7326 = new C7326();
        C7326 c7327 = new C7326();
        C5210 c5211 = f12455;
        c13675.m32896(c5211);
        if (abstractC14545M11758.isEmpty()) {
            z = false;
        } else {
            EnumC23649 enumC23649 = EnumC23649.NO;
            m11842(abstractC14545M11758, enumC23649, enumC23649);
            z = true;
        }
        if (!c8526.f26047.isEmpty()) {
            if (z) {
                c13675.m32912();
            }
            m11836("<");
            m11856(c8526.f26047, c5210);
            z = true;
        }
        if (interfaceC13206 != null) {
            if (z) {
                c13675.m32907();
            } else {
                z = true;
            }
            c13675.m32896(C0976.m3441(c7327, c5210, c5211));
            c13675.m32896(c5211);
            if (!listOf.isEmpty()) {
                EnumC23649 enumC236410 = EnumC23649.NO;
                m11842(listOf, enumC236410, enumC236410);
                c13675.m32907();
            }
            m11845(interfaceC13206);
            m11776(arrayDeque);
            c13675.m32906();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            c13675.m32907();
        }
        if (!z2) {
            c13675.m32896(c5211);
        }
        String string = c8526.f26044.toString();
        if (string.equals("<init>")) {
            string = (String) c13675.m32908(0).get();
        }
        m11836(string);
        if (!z4) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        c13675.m32906();
        c13675.m32906();
        c13675.m32896(C0976.m3441(c7326, c5210, c5211));
        c13675.m32896(C0976.m3441(c7327, c5210, c5211));
        c13675.m32896(c5211);
        if (!z4) {
            if (!c8526.f26048.isEmpty() || c8526.f26052 != null) {
                m11847(C16646.ofNullable(c8526.f26052), c8526.f26048);
            }
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (arrayDeque != null) {
            m11776(arrayDeque);
        }
        if (!c8526.f26042.isEmpty()) {
            c13675.m32912();
            c13675.m32896(c5210);
            C2609<InterfaceC20058> c2609 = c8526.f26042;
            m11836("throws");
            c13675.m32912();
            for (InterfaceC20058 interfaceC20058 : c2609) {
                if (z3) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845(interfaceC20058);
                z3 = true;
            }
            c13675.m32906();
        }
        if (abstractC12612 != null) {
            c13675.m32907();
            m11836("default");
            if (abstractC12612.mo987() == EnumC3329.NEW_ARRAY) {
                c13675.m32896(this.f12462);
                c13675.m32907();
                m11845(abstractC12612);
                c13675.m32906();
            } else {
                c13675.m32896(c5211);
                c13675.m32912();
                m11845(abstractC12612);
                c13675.m32906();
            }
        }
        c13675.m32906();
        c13675.m32906();
        c13675.m32906();
        C2735 c2735 = c8526.f26043;
        C5210 c5212 = this.f12464;
        if (c2735 == null) {
            m11836(l.b);
        } else {
            c13675.m32907();
            c13675.m32894("{", EnumC15792.REAL, c5212, C16646.of(c5212));
        }
        c13675.m32906();
        C2735 c2736 = c8526.f26043;
        if (c2736 != null) {
            if (c2736.f8521.isEmpty()) {
                c13675.m32898(AbstractC22848.f73734);
            } else {
                c13675.m32896(c5212);
                c13675.m32914();
                c13675.m32898(AbstractC22848.f73735);
                m11838(c8526.f26043.f8521);
                c13675.m32906();
                c13675.m32914();
                c13675.m32898(AbstractC22848.f73734);
                m11855();
            }
            m11837(l.d, c5212);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11798(C8672 c8672, Object obj) {
        m11854(c8672);
        m11836("while");
        this.f12459.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) c8672.f26445).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11767(c8672.f26444, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11799(C9085 c9085, Object obj) {
        m11854((InterfaceC13206) c9085);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m11761(C7260.m19433(c9085.mo989()), c9085, arrayList, arrayList2);
        EnumC23554 enumC23554 = EnumC23554.UNIFIED;
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        int i = 0;
        m11845((InterfaceC13206) arrayList.get(0));
        int size = arrayList2.size();
        while (i < size) {
            if (m11778()) {
                c13675.m32914();
            } else {
                c13675.m32907();
            }
            c13675.m32910((String) arrayList2.get(i));
            if (m11778()) {
                c13675.m32914();
            } else {
                c13675.m32907();
            }
            i++;
            m11845((InterfaceC13206) arrayList.get(i));
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11800(C9232 c9232, Object obj) {
        C13675 c13675 = this.f12459;
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c9232.f27945);
        c13675.m32892();
        c13675.m32910("::");
        m11853(c9232.f27947, c5210);
        int[] iArr = C7153.f21953;
        EnumC11091 enumC11091 = c9232.f27940;
        int i = iArr[enumC11091.ordinal()];
        if (i == 1) {
            m11846(c9232.f27944);
        } else if (i == 2) {
            m11836("new");
        } else {
            throw new AssertionError(enumC11091);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8689(C9378 c9378, Object obj) {
        m11854(c9378);
        m11841(AbstractC14545.of((Object) c9378), EnumC20828.NONE, m11759((InterfaceC23790) c9378.f28486));
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11801(C9791 c9791, Object obj) {
        m11854((InterfaceC13206) c9791);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c9791.f29619);
        c13675.m32907();
        m11773(C3188.m9807((InterfaceC20058) c9791));
        c13675.m32904();
        m11845((InterfaceC13206) c9791.f29618);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11802(C9938 c9938, Object obj) {
        m11854(c9938);
        m11836("return");
        if (c9938.f30017 != null) {
            this.f12459.m32907();
            m11845((InterfaceC13206) c9938.f30017);
        }
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11803(C10496 c10496, Object obj) {
        m11854(c10496);
        m11845((InterfaceC13206) c10496.f31483);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11804(C10643 c10643, Object obj) {
        AbstractC10370 abstractC10370Mo17273;
        Cloneable cloneable = c10643.f32021;
        if (cloneable instanceof InterfaceC13001) {
            abstractC10370Mo17273 = ((InterfaceC13001) cloneable).getName();
        } else {
            abstractC10370Mo17273 = ((InterfaceC18146) cloneable).mo17273();
        }
        AbstractC6079 abstractC6079 = f12456.get((Object) abstractC10370Mo17273.toString());
        if (!abstractC6079.isEmpty() && abstractC6079.contains(c10643.f32021.toString())) {
            this.f12458.add(abstractC10370Mo17273);
        }
        m11854(c10643);
        m11836("import");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        if (c10643.f32020) {
            m11836("static");
            c13675.m32907();
        }
        m11777(c10643.f32021);
        m11836(l.b);
        m11852();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11805(C10789 c10789, Object obj) {
        C5210 c5210;
        C5210 c5211;
        String str;
        C5210 c5212;
        C10789 c107810 = c10789;
        m11854(c10789);
        C13675 c13675 = this.f12459;
        C5210 c5213 = f12455;
        c13675.m32896(c5213);
        m11836("try");
        c13675.m32907();
        boolean zIsEmpty = c107810.f32446.isEmpty();
        C5210 c5214 = this.f12460;
        String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
        if (zIsEmpty) {
            c5210 = c5214;
            c5211 = c5213;
            str = MotionUtils.EASING_TYPE_FORMAT_START;
        } else {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            c13675.m32896(c107810.f32446.m8245() > 1 ? c5214 : c5213);
            boolean z = false;
            for (InterfaceC13206 interfaceC13206 : c107810.f32446) {
                if (z) {
                    c13675.m32914();
                }
                if (interfaceC13206 instanceof InterfaceC1527) {
                    InterfaceC1527 interfaceC1527 = (InterfaceC1527) interfaceC13206;
                    m11850(EnumC20828.PARAMETER, m11759((InterfaceC23790) interfaceC1527.mo5211()), C16646.of(interfaceC1527.mo5211()), interfaceC1527.getType(), interfaceC1527.getName(), "=", C16646.ofNullable(interfaceC1527.mo5210()), C16646.empty(), C16646.empty(), C16646.empty());
                } else {
                    m11845(interfaceC13206);
                }
                if (c13675.m32908(0).equals(C16646.of(r8))) {
                    m11836(l.b);
                    c13675.m32907();
                }
                z = true;
                str2 = str2;
                c5213 = c5213;
                c5214 = c5214;
            }
            c5210 = c5214;
            c5211 = c5213;
            str = str2;
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                m11836(l.b);
                c13675.m32907();
            }
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            c13675.m32906();
            c13675.m32907();
        }
        boolean z2 = (c107810.f32449.isEmpty() && c107810.f32448 == null) ? false : true;
        m11848(c107810.f32445, EnumC6716.m18276(!z2), EnumC1777.YES, EnumC10950.m27271(z2));
        int i = 0;
        while (i < c107810.f32449.m8245()) {
            InterfaceC9475 interfaceC9475 = (InterfaceC9475) c107810.f32449.get(i);
            EnumC10950 enumC10950M27271 = EnumC10950.m27271(i < c107810.f32449.m8245() + (-1) || c107810.f32448 != null);
            m11854(interfaceC9475);
            c13675.m32907();
            m11836("catch");
            c13675.m32907();
            m11836(str);
            C5210 c5215 = c5210;
            c13675.m32896(c5215);
            C9378 c9378Mo2550 = interfaceC9475.mo2550();
            if (c9378Mo2550.f28488.mo987() == EnumC3329.UNION_TYPE) {
                C5210 c5216 = c5211;
                c13675.m32896(c5216);
                InterfaceC13911 interfaceC13911 = (InterfaceC13911) c9378Mo2550.f28488;
                c13675.m32896(c5216);
                m11854(c9378Mo2550);
                InterfaceC23790 interfaceC23790 = c9378Mo2550.f28486;
                m11842(m11758(m11835(interfaceC23790, (List) interfaceC23790.getAnnotations()), EnumC15887.HORIZONTAL, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
                C2609 c2609Mo33321 = interfaceC13911.mo33321();
                boolean z3 = false;
                for (int i2 = 0; i2 < c2609Mo33321.m8245() - 1; i2++) {
                    if (z3) {
                        c13675.m32904();
                        m11836("|");
                        c13675.m32907();
                    } else {
                        z3 = true;
                    }
                    m11845((InterfaceC13206) c2609Mo33321.get(i2));
                }
                c13675.m32904();
                m11836("|");
                c13675.m32907();
                c5212 = c5216;
                m11850(EnumC20828.NONE, EnumC15887.HORIZONTAL, C16646.empty(), (InterfaceC13206) c2609Mo33321.get(c2609Mo33321.m8245() - 1), c9378Mo2550.f28484, "=", C16646.ofNullable(c9378Mo2550.f28487), C16646.empty(), C16646.empty(), C16646.empty());
                c13675.m32906();
                c13675.m32906();
            } else {
                c5212 = c5211;
                c13675.m32909();
                c13675.m32896(c5212);
                m11845(c9378Mo2550);
                c13675.m32906();
            }
            c13675.m32906();
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            c13675.m32907();
            m11848(interfaceC9475.mo2551(), EnumC6716.NO, EnumC1777.YES, enumC10950M27271);
            i++;
            c107810 = c10789;
            c5211 = c5212;
            c5210 = c5215;
            str = str;
        }
        C10789 c107811 = c107810;
        if (c107811.f32448 != null) {
            c13675.m32907();
            m11836("finally");
            c13675.m32907();
            m11848(c107811.f32448, EnumC6716.NO, EnumC1777.YES, EnumC10950.NO);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11806(C11907 c11907, Object obj) {
        m11854(c11907);
        m11836("for");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        int iM8245 = c11907.f35587.m8245();
        C5210 c5211 = f12455;
        boolean z = true;
        c13675.m32896((iM8245 <= 1 || ((InterfaceC15322) c11907.f35587.get(0)).mo987() != EnumC3329.EXPRESSION_STATEMENT) ? c5211 : c5210);
        if (c11907.f35587.isEmpty()) {
            m11836(l.b);
        } else if (((InterfaceC15322) c11907.f35587.get(0)).mo987() == EnumC3329.VARIABLE) {
            InterfaceC5998 interfaceC5998M13612 = C4648.m13612(c11907.f35587.iterator());
            m11841(m11756(interfaceC5998M13612, (InterfaceC13206) interfaceC5998M13612.next()), EnumC20828.NONE, EnumC15887.HORIZONTAL);
        } else {
            c13675.m32896(c5211);
            boolean z2 = false;
            for (InterfaceC15322 interfaceC15322 : c11907.f35587) {
                if (z2) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845((InterfaceC13206) ((InterfaceC22174) interfaceC15322).getExpression());
                z2 = true;
            }
            m11836(l.b);
            c13675.m32906();
        }
        c13675.m32906();
        c13675.m32904();
        AbstractC12612 abstractC12612 = c11907.f35588;
        if (abstractC12612 != null) {
            m11845((InterfaceC13206) abstractC12612);
        }
        m11836(l.b);
        if (c11907.f35586.isEmpty()) {
            c13675.m32907();
        } else {
            c13675.m32904();
            if (c11907.f35586.m8245() <= 1) {
                c5210 = c5211;
            }
            c13675.m32896(c5210);
            for (InterfaceC22174 interfaceC22174 : c11907.f35586) {
                if (!z) {
                    m11836(",");
                    c13675.m32912();
                }
                m11845((InterfaceC13206) interfaceC22174.getExpression());
                z = false;
            }
            c13675.m32905(l.b);
            c13675.m32906();
        }
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11767(c11907.f35585, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11807(C12054 c12054, Object obj) {
        m11836("requires");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        while (true) {
            if (c13675.m32908(0).equals(C16646.of("static"))) {
                m11836("static");
                c13675.m32907();
            } else if (c13675.m32908(0).equals(C16646.of("transitive"))) {
                m11836("transitive");
                c13675.m32907();
            } else {
                m11845((InterfaceC13206) c12054.f36052);
                m11836(l.b);
                return null;
            }
        }
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11808(C12759 c12759, Object obj) {
        m11762("provides", "with", c12759.f38349, c12759.f38348);
        return null;
    }

    @Override // l.C18461, l.C19167
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo11809(InterfaceC13206 interfaceC13206, Object obj) {
        m11845(interfaceC13206);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11810(C13317 c13317, Object obj) {
        m11762("exports", "to", c13317.f39865, c13317.f39866);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11811(C13464 c13464, Object obj) {
        m11854((InterfaceC13206) c13464);
        m11849((InterfaceC20058) c13464.f40197, (List) c13464.f40199);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6992(C14169 c14169, Object obj) {
        m11854((InterfaceC13206) c14169);
        c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.EXPRESSION;
        C13675 c13675 = this.f12459;
        boolean zEquals = c13675.m32908(0).equals(C16646.of(MotionUtils.EASING_TYPE_FORMAT_START));
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        if (zEquals) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        boolean z = false;
        for (InterfaceC1527 interfaceC1527 : c14169.f42775) {
            if (z) {
                m11836(",");
                c13675.m32907();
            }
            m11841(AbstractC14545.of((Object) interfaceC1527), EnumC20828.NONE, m11759((InterfaceC23790) interfaceC1527.mo5211()));
            z = true;
        }
        if (zEquals) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c13675.m32906();
        c13675.m32907();
        c13675.m32910("->");
        if (m11772(c13675.m32903(-1), c13675.m32903(0))) {
            c13675.m32896(this.f12460);
            c13675.m32914();
        } else {
            c13675.m32896(c5210);
            c13675.m32907();
        }
        if (c14169.f42776.mo987() == EnumC3329.BLOCK) {
            m11848((InterfaceC17235) c14169.f42776, EnumC6716.YES, EnumC1777.NO, EnumC10950.NO);
        } else {
            m11845(c14169.f42776);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11812(C14315 c14315, Object obj) {
        m11854(c14315);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11842(c14315.f43168, EnumC23649.NO, EnumC23649.YES);
        m11846(c14315.f43169);
        if (!c14315.f43170.isEmpty()) {
            c13675.m32907();
            m11836("extends");
            C5210 c5211 = this.f12460;
            c13675.m32896(c5211);
            c13675.m32904();
            c13675.m32896(c5211);
            boolean z = false;
            for (InterfaceC13206 interfaceC13206 : c14315.f43170) {
                if (z) {
                    c13675.m32912();
                    m11836(a.p);
                    c13675.m32907();
                }
                m11845(interfaceC13206);
                z = true;
            }
            c13675.m32906();
            c13675.m32906();
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11813(C14728 c14728, Object obj) {
        m11854((InterfaceC13206) c14728);
        m11844((AbstractC12612) c14728);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11814(C14875 c14875, Object obj) {
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) c14875.f45392);
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11815(C15433 c15433, Object obj) {
        m11854(c15433);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("continue");
        AbstractC10370 abstractC10370 = c15433.f47247;
        if (abstractC10370 != null) {
            c13675.m32907();
            m11846(abstractC10370);
        }
        m11836(l.b);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11816(C15580 c15580, Object obj) {
        m11854((InterfaceC13206) c15580);
        if (((AbstractC10370) C3188.m9808((InterfaceC17440) c15580)).mo26175("log")) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Object expression = c15580;
            while (expression instanceof InterfaceC17440) {
                InterfaceC17440 interfaceC17440 = (InterfaceC17440) expression;
                arrayDeque.addFirst(interfaceC17440);
                if (f12457.contains(C3188.m9808(interfaceC17440).toString())) {
                    InterfaceC20058 interfaceC20058Mo36749 = interfaceC17440.mo36749();
                    expression = interfaceC20058Mo36749 instanceof InterfaceC18146 ? ((InterfaceC18146) interfaceC20058Mo36749).getExpression() : null;
                }
            }
            if (expression instanceof InterfaceC13001) {
                arrayDeque.addFirst(expression);
                m11766((List) AbstractC14545.copyOf((Collection) arrayDeque), false, (AbstractCollection) AbstractC14545.of((Object) Integer.valueOf(arrayDeque.size() - 1)), EnumC23554.INDEPENDENT);
                return null;
            }
        }
        m11844((AbstractC12612) c15580);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11817(C15726 c15726, Object obj) {
        m11854((InterfaceC13206) c15726);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("?");
        if (c15726.f48501 != null) {
            c13675.m32896(this.f12460);
            c13675.m32907();
            m11836(c15726.mo987() == EnumC3329.EXTENDS_WILDCARD ? "extends" : "super");
            c13675.m32904();
            m11845(c15726.f48501);
            c13675.m32906();
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11818(C16139 c16139, Object obj) {
        m11854(c16139);
        C9378 c9378 = c16139.f49721;
        m11850(EnumC20828.PARAMETER, EnumC15887.HORIZONTAL, C16646.of(c9378.f28486), c9378.f28488, c9378.f28484, "", C16646.empty(), C16646.empty(), C16646.empty(), C16646.empty());
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11819(C16286 c16286, Object obj) {
        m11854((InterfaceC13206) c16286);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c16286.f50075);
        c13675.m32904();
        c13675.m32896(f12455);
        m11836("instanceof");
        c13675.m32904();
        if (c16286.m38309() != null) {
            m11845(c16286.m38309());
        } else {
            m11845(c16286.getType());
        }
        c13675.m32906();
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11820(C16432 c16432, Object obj) {
        m11854((InterfaceC13206) c16432);
        if (c16432.f50541.isEmpty()) {
            m11845((InterfaceC13206) c16432.f50542);
            m11836("<");
            m11836(">");
            return null;
        }
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c16432.f50542);
        m11836("<");
        c13675.m32892();
        c13675.m32896(f12455);
        boolean z = false;
        for (InterfaceC13206 interfaceC13206 : c16432.f50541) {
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        c13675.m32906();
        m11836(">");
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11821(C17138 c17138, Object obj) {
        m11854((InterfaceC13206) c17138);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        boolean z = false;
        for (InterfaceC13206 interfaceC13206 : c17138.f52525) {
            if (z) {
                c13675.m32912();
                m11836(a.p);
                c13675.m32907();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11822(C17551 c17551, Object obj) {
        m11854((InterfaceC13206) c17551);
        int iM8245 = c17551.f53653.m8245();
        C5210 c5210 = this.f12460;
        C5210 c5211 = f12455;
        C13675 c13675 = this.f12459;
        if (iM8245 == 1) {
            InterfaceC13206 interfaceC13206 = (InterfaceC20058) C8882.m22950((Collection) c17551.f53653);
            if (interfaceC13206.mo987() != EnumC3329.ASSIGNMENT) {
                boolean z = interfaceC13206.mo987() == EnumC3329.NEW_ARRAY;
                if (z) {
                    c5210 = c5211;
                }
                c13675.m32896(c5210);
                m11836("@");
                m11845(c17551.f53650);
                m11836(MotionUtils.EASING_TYPE_FORMAT_START);
                if (!z) {
                    c13675.m32892();
                }
                m11845(interfaceC13206);
                c13675.m32906();
                m11836(MotionUtils.EASING_TYPE_FORMAT_END);
                return null;
            }
        }
        c13675.m32896(c5211);
        m11836("@");
        m11845(c17551.f53650);
        if (c17551.f53653.isEmpty()) {
            if (c13675.m32908(0).equals(C16646.of(MotionUtils.EASING_TYPE_FORMAT_START))) {
                m11836(MotionUtils.EASING_TYPE_FORMAT_START);
                m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            c13675.m32906();
            return null;
        }
        c13675.m32896(c5210);
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32892();
        boolean zM22952 = C8882.m22952(c17551.f53653, new C12092());
        boolean z2 = false;
        for (InterfaceC13206 interfaceC13207 : c17551.f53653) {
            if (z2) {
                m11836(",");
                if (zM22952) {
                    c13675.m32914();
                } else {
                    c13675.m32904();
                }
            }
            if (interfaceC13207 instanceof InterfaceC10886) {
                InterfaceC10886 interfaceC10886 = (InterfaceC10886) interfaceC13207;
                boolean z3 = interfaceC10886.getExpression().mo987() == EnumC3329.NEW_ARRAY;
                m11854(interfaceC10886);
                c13675.m32896(z3 ? c5211 : c5210);
                m11845(interfaceC10886.mo27182());
                c13675.m32907();
                m11836("=");
                if (z3) {
                    c13675.m32907();
                } else {
                    c13675.m32904();
                }
                m11845(interfaceC10886.getExpression());
                c13675.m32906();
            } else {
                m11845(interfaceC13207);
            }
            z2 = true;
        }
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32906();
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11823(C17698 c17698, Object obj) {
        m11854(c17698);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11846(c17698.f54160);
        m11836(":");
        c13675.m32914();
        c13675.m32906();
        m11845(c17698.f54159);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11824(C17844 c17844, Object obj) {
        m11854((InterfaceC13206) c17844);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845(c17844.f54511);
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        m11845((InterfaceC13206) c17844.f54512);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11825(C18257 c18257, Object obj) {
        m11854((InterfaceC13206) c18257);
        InterfaceC13206 interfaceC13206 = c18257.f56779;
        boolean z = interfaceC13206 instanceof InterfaceC18146;
        C13675 c13675 = this.f12459;
        if (z) {
            InterfaceC18146 interfaceC18146 = (InterfaceC18146) interfaceC13206;
            m11845((InterfaceC13206) interfaceC18146.getExpression());
            m11836(".");
            C2609 c2609 = c18257.f56778;
            EnumC23649 enumC23649 = EnumC23649.NO;
            m11842(c2609, enumC23649, enumC23649);
            c13675.m32912();
            m11846(interfaceC18146.mo17273());
            return null;
        }
        if (interfaceC13206 instanceof InterfaceC7378) {
            m11775((AbstractC12612) c18257);
            return null;
        }
        C2609 c26010 = c18257.f56778;
        EnumC23649 enumC236410 = EnumC23649.NO;
        m11842(c26010, enumC236410, enumC236410);
        c13675.m32912();
        m11845(interfaceC13206);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11826(C18404 c18404, Object obj) {
        AbstractC12612 abstractC12612 = c18404.f57138;
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        if (abstractC12612 != null) {
            c13675.m32896(c5210);
            m11836("new");
            c13675.m32907();
            C9270 c9270M22277 = C8564.m22277(c18404.f57138, EnumC20559.YES);
            InterfaceC13206 interfaceC13206 = c9270M22277.f28080;
            ArrayDeque arrayDeque = new ArrayDeque(c18404.f57140);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(AbstractC14545.copyOf((Collection) c18404.f57137));
            arrayDeque2.addAll(c18404.f57141);
            arrayDeque2.addAll(c9270M22277.f28079);
            m11845(interfaceC13206);
            c13675.m32896(f12455);
            m11765(arrayDeque, (Deque) arrayDeque2);
            c13675.m32906();
            c13675.m32906();
        }
        C2609 c2609 = c18404.f57139;
        if (c2609 != null) {
            if (c2609.isEmpty()) {
                AbstractC8032 abstractC8032 = this.f12464;
                m11843(abstractC8032);
                if (c13675.m32908(0).equals(C16646.of(","))) {
                    m11836(",");
                }
                m11837(l.d, abstractC8032);
                return null;
            }
            c13675.m32896(c5210);
            m11836("{");
            int iM8245 = c2609.m8245();
            boolean z = true;
            for (int i = 0; i < iM8245; i++) {
                InterfaceC13206 interfaceC13207 = (InterfaceC20058) c2609.get(i);
                if (m11778()) {
                    c13675.m32914();
                    z = false;
                }
                m11845(interfaceC13207);
                if (((String) c13675.m32908(0).orElseThrow()).equals(",")) {
                    if (m11778()) {
                        c13675.m32914();
                        z = false;
                    }
                    m11836(",");
                    if (i != iM8245 - 1) {
                        c13675.m32907();
                    }
                }
            }
            c13675.m32906();
            if (!((z && m11778()) ? false : z)) {
                c13675.m32914();
            }
            m11836(l.d);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11827(C18963 c18963, Object obj) {
        EnumC6652 enumC6652 = c18963.f59817;
        InterfaceC13206 interfaceC13206 = c18963.f59813;
        m11854(c18963);
        m11855();
        C13675 c13675 = this.f12459;
        c13675.m32914();
        C2609<InterfaceC13206> c2609 = c18963.f59815;
        boolean z = false;
        boolean z2 = c2609.m8245() == 1 && ((InterfaceC23585) C8882.m22950((Collection) c2609)).mo987().name().equals("DEFAULT_CASE_LABEL");
        boolean zEquals = enumC6652.equals(EnumC6652.RULE);
        C5210 c5210 = f12455;
        c13675.m32896(zEquals ? this.f12460 : c5210);
        if (z2) {
            m11837("default", c5210);
        } else {
            m11837("case", c5210);
            c13675.m32896(c5210);
            c13675.m32907();
            for (InterfaceC13206 interfaceC13207 : c2609) {
                if (z) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845(interfaceC13207);
                z = true;
            }
            c13675.m32906();
        }
        int i = C7153.f21952[enumC6652.ordinal()];
        if (i == 1) {
            m11836(":");
            c13675.m32896(this.f12464);
            m11838(c18963.m43778());
            c13675.m32906();
            c13675.m32906();
            return null;
        }
        if (i != 2) {
            return null;
        }
        c13675.m32907();
        m11836("-");
        m11836(">");
        if (interfaceC13206.mo987() == EnumC3329.BLOCK) {
            c13675.m32906();
            c13675.m32907();
            m11848((InterfaceC17235) interfaceC13206, EnumC6716.YES, EnumC1777.NO, EnumC10950.NO);
        } else {
            c13675.m32904();
            m11845(interfaceC13206);
            c13675.m32906();
        }
        c13675.m32905(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6993(C19110 c19110, Object obj) {
        m11854((InterfaceC13206) c19110);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        AbstractC12612 abstractC12612 = c19110.f60199;
        if (abstractC12612 != null) {
            m11845((InterfaceC13206) abstractC12612);
            c13675.m32892();
            m11836(".");
        }
        m11836("new");
        c13675.m32907();
        m11853(c19110.f60198, this.f12460);
        C5557 c5557 = c19110.f60195;
        if (c5557 != null) {
            C2176 c2176 = c5557.f17181;
            m11842(m11758(m11835((InterfaceC23790) c2176, (List) c2176.getAnnotations()), EnumC15887.HORIZONTAL, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
        }
        m11845((InterfaceC13206) c19110.f60196);
        m11839((List) c19110.f60197, (AbstractC8032) c5210);
        c13675.m32906();
        C5557 c5558 = c19110.f60195;
        if (c5558 != null) {
            m11840(c5558.f17179, EnumC14476.YES, EnumC2483.YES);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11828(C20374 c20374, Object obj) {
        m11854(c20374);
        m11836("do");
        m11767(c20374.f65770, EnumC6716.YES, EnumC1777.YES, EnumC10950.YES);
        EnumC3329 enumC3329Mo987 = c20374.f65770.mo987();
        EnumC3329 enumC3329 = EnumC3329.BLOCK;
        C13675 c13675 = this.f12459;
        if (enumC3329Mo987 == enumC3329) {
            c13675.m32907();
        } else {
            c13675.m32904();
        }
        m11836("while");
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) c20374.f65771).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11829(C20667 c20667, Object obj) {
        m11836("uses");
        this.f12459.m32907();
        m11845((InterfaceC13206) c20667.f66557);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11830(C21080 c21080, Object obj) {
        m11854((InterfaceC13206) c21080);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c21080.f67987);
        c13675.m32907();
        m11773(C3188.m9807((InterfaceC20058) c21080));
        c13675.m32907();
        m11845((InterfaceC13206) c21080.f67988);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11831(C22637 c22637, Object obj) {
        m11854(c22637);
        m11849((InterfaceC20058) c22637.f73103, (List) c22637.f73102);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11832(C23342 c23342, Object obj) {
        m11854((InterfaceC13206) c23342);
        String strM9806 = C3188.m9806(c23342, m42940());
        if (!strM9806.startsWith("\"\"\"")) {
            if (strM9806.startsWith("-")) {
                m11836("-");
                strM9806 = strM9806.substring(1).trim();
            }
            m11836(strM9806);
            return null;
        }
        String strM31534 = C12970.m31534(strM9806);
        ArrayList arrayListM28001 = C11337.m28001(strM9806);
        String strM28002 = C11337.m28002((String) C5378.stream(arrayListM28001).skip(1L).collect(C22976.joining(strM31534)));
        String str = (String) C8882.m22955(arrayListM28001);
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        int length2 = str.substring(0, length).length();
        String str2 = (String) C20857.m47674(C5378.stream(C11337.m28001(strM28002))).orElseThrow();
        int length3 = str2.length();
        while (length3 > 0) {
            int iCodePointBefore2 = Character.codePointBefore(str2, length3);
            if (!Character.isWhitespace(iCodePointBefore2)) {
                break;
            }
            length3 -= Character.charCount(iCodePointBefore2);
        }
        if (length2 == str2.substring(0, length3).length()) {
            int i = this.f12463;
            C5210 c5210M14988 = C5210.m14988(Integer.MIN_VALUE / i, i);
            C13675 c13675 = this.f12459;
            c13675.getClass();
            c13675.m32899(EnumC23554.UNIFIED, "", c5210M14988);
        }
        m11836(strM9806);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11833(C23488 c23488, Object obj) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11834(C23901 c23901, Object obj) {
        m11854((InterfaceC13206) c23901);
        m11775((AbstractC12612) c23901);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C11724 c11724 = new C11724();
        AbstractC4628 abstractC4628ListIterator = AbstractC14545.of((Object) "org.jspecify.annotations.NonNull", (Object) "org.jspecify.annotations.Nullable", (Object) "org.jspecify.annotations.Nullable", (Object) "org.checkerframework.checker.nullness.qual.NonNull", (Object) "org.checkerframework.checker.nullness.qual.Nullable").listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            String str = (String) abstractC4628ListIterator.next();
            c11724.m28619(str.substring(str.lastIndexOf(46) + 1), str);
        }
        f12456 = c11724.m28618();
        f12455 = C5210.f16320;
        f12457 = AbstractC6079.m16988("at", "atConfig", "atDebug", "atFine", "atFiner", "atFinest", "atInfo", "atMostEvery", "atSevere", "atWarning", "every", "log", "logVarargs", "perUnique", "withCause", "withStackTrace");
        Pattern.compile("%|\\{[0-9]\\}");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11765(ArrayDeque arrayDeque, Deque deque) {
        while (true) {
            boolean z = false;
            while (true) {
                C13675 c13675 = this.f12459;
                if (c13675.m32908(0).isPresent()) {
                    String str = (String) c13675.m32908(0).get();
                    str.getClass();
                    switch (str) {
                        case ".":
                            if (((String) c13675.m32908(0).get()).equals(".") && ((String) c13675.m32908(1).get()).equals(".")) {
                                if (z) {
                                    c13675.m32912();
                                } else {
                                    c13675.m32909();
                                }
                                c13675.m32910("...");
                                break;
                            }
                            return;
                        case "@":
                            if (!deque.isEmpty()) {
                                List list = (List) deque.removeFirst();
                                if (!list.isEmpty()) {
                                    c13675.m32912();
                                    EnumC23649 enumC23649 = EnumC23649.NO;
                                    m11842(list, enumC23649, enumC23649);
                                    z = true;
                                }
                                break;
                            } else {
                                return;
                            }
                            break;
                        case "[":
                            if (z) {
                                c13675.m32912();
                            }
                            m11836("[");
                            if (!((String) c13675.m32908(0).get()).equals("]")) {
                                m11845((InterfaceC13206) arrayDeque.removeFirst());
                            }
                            m11836("]");
                            break;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11852() {
        C13675 c13675 = this.f12459;
        if (c13675.m32908(0).equals(C16646.of(l.b))) {
            while (c13675.m32908(0).equals(C16646.of(l.b))) {
                c13675.m32914();
                m11855();
                m11836(l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11771(AbstractC14545 abstractC14545) {
        if (abstractC14545 != null) {
            AbstractC4628 abstractC4628ListIterator = abstractC14545.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                String strMo35701 = ((InterfaceC15086) abstractC4628ListIterator.next()).mo35701();
                for (int i = 0; i < strMo35701.length(); i++) {
                    char cCharAt = strMo35701.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\n') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11855() {
        if (((Boolean) this.f12461.peekLast()).booleanValue()) {
            return;
        }
        this.f12459.m32901();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11845(InterfaceC13206 interfaceC13206) {
        boolean z = interfaceC13206 instanceof InterfaceC20058;
        ArrayDeque arrayDeque = this.f12461;
        arrayDeque.addLast(Boolean.valueOf(z || ((Boolean) arrayDeque.peekLast()).booleanValue()));
        C13675 c13675 = this.f12459;
        int iM32915 = c13675.m32915();
        try {
            try {
                super.mo11809(interfaceC13206, (Object) null);
                arrayDeque.removeLast();
                c13675.m32893(iM32915);
            } catch (Throwable th) {
                arrayDeque.removeLast();
                throw th;
            }
        } catch (C0270 e) {
            throw e;
        } catch (Throwable th2) {
            int i = C11270.f33770;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            throw new C0270(c13675.m32891(stringWriter.toString()));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11775(AbstractC12612 abstractC12612) {
        C9270 c9270M22277 = C8564.m22277(abstractC12612, EnumC20559.YES);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845(c9270M22277.f28080);
        ArrayDeque arrayDeque = new ArrayDeque(c9270M22277.f28079);
        m11776(arrayDeque);
        if (!arrayDeque.isEmpty()) {
            throw new C17619();
        }
        c13675.m32906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11841(List list, EnumC20828 enumC20828, EnumC15887 enumC15887) {
        boolean z = false;
        if (list.size() == 1) {
            InterfaceC1527 interfaceC1527 = (InterfaceC1527) list.get(0);
            m11850(enumC20828, enumC15887, C16646.of(interfaceC1527.mo5211()), interfaceC1527.getType(), interfaceC1527.getName(), "=", C16646.ofNullable(interfaceC1527.mo5210()), C16646.of(l.b), C16646.empty(), C16646.ofNullable(m11757(false, 0, interfaceC1527.getType())));
            return;
        }
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        C2176 c2176Mo5211 = ((InterfaceC1527) list.get(0)).mo5211();
        InterfaceC13206 type = ((InterfaceC1527) list.get(0)).getType();
        m11842(m11758(m11835((InterfaceC23790) c2176Mo5211, (List) c2176Mo5211.getAnnotations()), enumC15887, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
        C5210 c5211 = this.f12460;
        c13675.m32896(c5211);
        c13675.m32896(c5210);
        C9270 c9270M22277 = C8564.m22277(type, EnumC20559.YES);
        ArrayDeque arrayDeque = new ArrayDeque(c9270M22277.f28079);
        m11845(c9270M22277.f28080);
        int size = arrayDeque.size();
        m11776(arrayDeque);
        int size2 = size - arrayDeque.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1527 interfaceC1528 = (InterfaceC1527) it.next();
            if (z) {
                m11836(",");
            }
            ArrayDeque arrayDeque2 = new ArrayDeque(m11757(z, size2, interfaceC1528.getType()).f28079);
            c13675.m32904();
            c13675.m32896(c5210);
            m11776(arrayDeque2);
            m11846(interfaceC1528.getName());
            m11776(arrayDeque2);
            AbstractC12612 abstractC12612Mo5210 = interfaceC1528.mo5210();
            if (abstractC12612Mo5210 != null) {
                c13675.m32907();
                m11836("=");
                c13675.m32896(c5211);
                c13675.m32904();
                m11845((InterfaceC13206) abstractC12612Mo5210);
                c13675.m32906();
            }
            c13675.m32906();
            if (!z) {
                c13675.m32906();
            }
            z = true;
        }
        c13675.m32906();
        m11836(l.b);
        c13675.m32906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9270 m11757(boolean z, int i, InterfaceC13206 interfaceC13206) {
        if (interfaceC13206 == null) {
            return null;
        }
        if (!z) {
            return C8564.m22277(interfaceC13206, EnumC20559.YES);
        }
        AbstractC14545 abstractC14545SubList = C8564.m22277(interfaceC13206, EnumC20559.NO).f28079;
        if (i > 0) {
            abstractC14545SubList = abstractC14545SubList.subList(0, abstractC14545SubList.size() - i);
        }
        return new C9270(null, abstractC14545SubList);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11773(String str) {
        for (int i = 0; i < str.length(); i++) {
            m11836(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11846(InterfaceC14812 interfaceC14812) {
        m11836(interfaceC14812.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11849(InterfaceC20058 interfaceC20058, List list) {
        m11836("switch");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) interfaceC20058).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        C5210 c5210 = this.f12464;
        m11843(c5210);
        c13675.m32898(AbstractC22848.f73734);
        c13675.m32896(c5210);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC20764 interfaceC20764 = (InterfaceC20764) it.next();
            if (z) {
                c13675.m32898(AbstractC22848.f73735);
            }
            m11845(interfaceC20764);
            z = true;
        }
        c13675.m32906();
        c13675.m32914();
        c13675.m32898(AbstractC22848.f73734);
        m11837(l.d, this.f12460);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11842(List list, EnumC23649 enumC23649, EnumC23649 enumC236410) {
        if (list.isEmpty()) {
            return;
        }
        boolean zM52143 = enumC23649.m52143();
        C13675 c13675 = this.f12459;
        if (zM52143) {
            c13675.m32912();
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC22900 interfaceC22900 = (InterfaceC22900) it.next();
            if (z) {
                c13675.m32912();
            }
            m11845((InterfaceC13206) interfaceC22900);
            z = true;
        }
        if (enumC236410.m52143()) {
            c13675.m32912();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11848(InterfaceC17235 interfaceC17235, EnumC6716 enumC6716, EnumC1777 enumC1777, EnumC10950 enumC10950) {
        m11854(interfaceC17235);
        boolean zMo8481 = interfaceC17235.mo8481();
        C13675 c13675 = this.f12459;
        if (zMo8481) {
            m11836("static");
            c13675.m32907();
        }
        boolean zM18278 = enumC6716.m18278();
        C5210 c5210 = this.f12464;
        if (zM18278 && interfaceC17235.mo8482().isEmpty()) {
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                m11836(l.b);
                return;
            }
            m11843(c5210);
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, c5210);
            return;
        }
        c13675.m32896(f12455);
        c13675.m32896(c5210);
        m11843(c5210);
        if (enumC1777 == EnumC1777.NO) {
            c13675.m32898(AbstractC22848.f73734);
        } else {
            c13675.m32898(AbstractC22848.f73735);
        }
        m11838(interfaceC17235.mo8482());
        c13675.m32906();
        c13675.m32914();
        c13675.m32906();
        if (enumC10950 == EnumC10950.NO) {
            c13675.m32898(AbstractC22848.f73734);
        } else {
            c13675.m32898(AbstractC22848.f73735);
        }
        m11855();
        m11837(l.d, c5210);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11767(InterfaceC15322 interfaceC15322, EnumC6716 enumC6716, EnumC1777 enumC1777, EnumC10950 enumC10950) {
        m11854(interfaceC15322);
        int i = C7153.f21954[interfaceC15322.mo987().ordinal()];
        C13675 c13675 = this.f12459;
        if (i == 8) {
            c13675.m32907();
            m11848((InterfaceC17235) interfaceC15322, enumC6716, enumC1777, enumC10950);
            return;
        }
        c13675.m32896(this.f12464);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32904();
        }
        m11845(interfaceC15322);
        c13675.m32906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11838(List list) {
        EnumC15887 enumC15887;
        InterfaceC5998 interfaceC5998M13612 = C4648.m13612(list.iterator());
        m11852();
        boolean z = false;
        while (interfaceC5998M13612.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC15322) interfaceC5998M13612.next();
            C13675 c13675 = this.f12459;
            c13675.m32914();
            if (z) {
                c13675.m32898(AbstractC22848.f73735);
            }
            m11855();
            ArrayList arrayListM11756 = m11756(interfaceC5998M13612, interfaceC13206);
            if (!arrayListM11756.isEmpty()) {
                EnumC20828 enumC20828 = EnumC20828.NONE;
                C2176 c2176Mo5211 = ((InterfaceC1527) arrayListM11756.get(0)).mo5211();
                Iterator it = c2176Mo5211.f7168.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((InterfaceC22900) it.next()).mo41040().isEmpty()) {
                        i++;
                    }
                }
                if (i <= 1 && i == c2176Mo5211.f7168.m8245()) {
                    enumC15887 = EnumC15887.HORIZONTAL;
                } else {
                    enumC15887 = EnumC15887.VERTICAL;
                }
                m11841(arrayListM11756, enumC20828, enumC15887);
            } else {
                m11845(interfaceC13206);
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC14545 m11758(AbstractC8833 abstractC8833, EnumC15887 enumC15887, C16646 c16646) {
        AbstractC14545 abstractC14545Of;
        AbstractC14545 abstractC14545Of2;
        if (abstractC8833.mo22826().isEmpty()) {
            return abstractC8833.mo22828();
        }
        ArrayDeque arrayDeque = new ArrayDeque(abstractC8833.mo22826());
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!arrayDeque.isEmpty() && !((AbstractC17299) arrayDeque.peekFirst()).mo26812().equals(EnumC18005.MODIFIER)) {
            if (z2) {
                if (!enumC15887.m37654()) {
                    abstractC14545Of2 = AbstractC14545.of((Object) C14381.m34345(EnumC23554.UNIFIED, " ", c5210, c16646));
                } else {
                    abstractC14545Of2 = AbstractC14545.of((Object) C14381.m34345(EnumC23554.FORCED, "", C5210.f16320, c16646));
                }
                c13675.m32895(abstractC14545Of2);
            }
            m11764(arrayDeque);
            z2 = true;
            z3 = true;
        }
        c13675.m32906();
        if (!enumC15887.m37654()) {
            abstractC14545Of = AbstractC14545.of((Object) C14381.m34345(EnumC23554.UNIFIED, " ", c5210, c16646));
        } else {
            abstractC14545Of = AbstractC14545.of((Object) C14381.m34345(EnumC23554.FORCED, "", C5210.f16320, c16646));
        }
        if (arrayDeque.isEmpty()) {
            c13675.m32895(abstractC14545Of);
            return abstractC8833.mo22828();
        }
        if (z3) {
            c13675.m32895(abstractC14545Of);
        }
        c13675.m32896(c5210);
        while (!arrayDeque.isEmpty()) {
            if (z) {
                c13675.m32907();
            }
            m11764(arrayDeque);
            z = true;
        }
        c13675.m32906();
        c13675.m32907();
        return abstractC8833.mo22828();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23380 m11835(InterfaceC23790 interfaceC23790, List list) {
        boolean zIsEmpty = list.isEmpty();
        int i = 1;
        C13675 c13675 = this.f12459;
        if (zIsEmpty) {
            String str = (String) c13675.m32908(0).get();
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1888027236:
                    if (str.equals("volatile")) {
                        b = 0;
                    }
                    break;
                case -1466596076:
                    if (str.equals(MessageHandler.Properties.IsSynchronized)) {
                        b = 1;
                    }
                    break;
                case -1052618729:
                    if (str.equals(UMConfigure.WRAPER_TYPE_NATIVE)) {
                        b = 2;
                    }
                    break;
                case -977423767:
                    if (str.equals("public")) {
                        b = 3;
                    }
                    break;
                case -906342564:
                    if (str.equals("sealed")) {
                        b = 4;
                    }
                    break;
                case -892481938:
                    if (str.equals("static")) {
                        b = 5;
                    }
                    break;
                case -608539730:
                    if (str.equals("protected")) {
                        b = 6;
                    }
                    break;
                case -314497661:
                    if (str.equals("private")) {
                        b = 7;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    if (str.equals("-")) {
                        b = 8;
                    }
                    break;
                case 109261:
                    if (str.equals("non")) {
                        b = 9;
                    }
                    break;
                case 97436022:
                    if (str.equals("final")) {
                        b = 10;
                    }
                    break;
                case 1052746378:
                    if (str.equals("transient")) {
                        b = 11;
                    }
                    break;
                case 1544803905:
                    if (str.equals("default")) {
                        b = 12;
                    }
                    break;
                case 1732898850:
                    if (str.equals("abstract")) {
                        b = cb.k;
                    }
                    break;
                case 1794694483:
                    if (str.equals("strictfp")) {
                        b = cb.f77931l;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    return new C23380(AbstractC14545.of(), AbstractC14545.of());
            }
        }
        C22267 c22267M49988 = C22267.m49988();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC22900) it.next();
            Integer numValueOf = Integer.valueOf(C3188.m9805(interfaceC13206));
            AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC13206;
            AbstractC12117 abstractC12117 = ((C1323) m42940().m11138()).f4743;
            abstractC5144.getClass();
            c22267M49988.mo3773(C13758.m33067(numValueOf, Integer.valueOf(C7260.m19431(abstractC5144, abstractC12117))));
        }
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) C20857.m47676(C5378.stream(c13675.m32890(C3188.m9805(interfaceC23790), new C9976(c22267M49988))).filter(new C15448(i, c22267M49988)).map(new C5742()), C5378.stream(list).map(new C11387())).sorted().collect(C22976.toList()));
        C1846 c1846 = new C1846();
        for (int size = abstractC14545CopyOf.size() - 1; size >= 0; size--) {
            AbstractC17299 abstractC17299 = (AbstractC17299) abstractC14545CopyOf.get(size);
            if (abstractC17299.mo26812().equals(EnumC18005.ANNOTATION)) {
                Cloneable cloneableMo41041 = abstractC17299.mo26811().mo41041();
                if (!(cloneableMo41041 instanceof InterfaceC13001) ? false : this.f12458.contains(((InterfaceC13001) cloneableMo41041).getName())) {
                    c1846.m16264(abstractC17299.mo26811());
                }
            }
            return new C23380(abstractC14545CopyOf.subList(0, size + 1), c1846.m6131().mo34737());
        }
        return new C23380(abstractC14545CopyOf.subList(0, size + 1), c1846.m6131().mo34737());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11764(ArrayDeque arrayDeque) {
        AbstractC17299 abstractC17299 = (AbstractC17299) arrayDeque.removeFirst();
        int iOrdinal = abstractC17299.mo26812().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            m11845((InterfaceC13206) abstractC17299.mo26811());
        } else {
            m11836(abstractC17299.mo38472().getText());
            if (abstractC17299.mo38472().getText().equals("non")) {
                m11836(((AbstractC17299) arrayDeque.removeFirst()).mo38472().getText());
                m11836(((AbstractC17299) arrayDeque.removeFirst()).mo38472().getText());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11761(int i, InterfaceC20058 interfaceC20058, ArrayList arrayList, ArrayList arrayList2) {
        if (interfaceC20058 instanceof InterfaceC16529) {
            InterfaceC16529 interfaceC16529 = (InterfaceC16529) interfaceC20058;
            if (C7260.m19433(((AbstractC5144) interfaceC16529).mo989()) == i) {
                m11761(i, interfaceC16529.mo23444(), arrayList, arrayList2);
                arrayList2.add(C3188.m9807(interfaceC20058));
                m11761(i, interfaceC16529.mo23443(), arrayList, arrayList2);
                return;
            }
            arrayList.add(interfaceC20058);
            return;
        }
        arrayList.add(interfaceC20058);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11847(l.C16646 r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3894.m11847(l.ܽ۫ᩴ, java.util.List):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11851(InterfaceC20969 interfaceC20969) {
        C13675 c13675;
        AbstractC22848 abstractC22848;
        Iterator it = interfaceC20969.getAnnotations().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c13675 = this.f12459;
            if (!zHasNext) {
                break;
            }
            m11845((InterfaceC13206) it.next());
            c13675.m32914();
        }
        if (interfaceC20969.mo10982() == EnumC6857.OPEN) {
            m11836("open");
            c13675.m32907();
        }
        m11836(am.e);
        c13675.m32907();
        m11845((InterfaceC13206) interfaceC20969.getName());
        c13675.m32907();
        boolean zIsEmpty = interfaceC20969.mo10983().isEmpty();
        C5210 c5210 = this.f12464;
        if (zIsEmpty) {
            m11843(c5210);
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, c5210);
            return;
        }
        c13675.m32896(c5210);
        m11836("{");
        c13675.m32914();
        C16646 c16646Empty = C16646.empty();
        for (InterfaceC0301 interfaceC0301 : interfaceC20969.mo10983()) {
            m11855();
            if (((Boolean) c16646Empty.map(new C4331(0, interfaceC0301)).orElse(Boolean.FALSE)).booleanValue()) {
                abstractC22848 = AbstractC22848.f73736;
            } else {
                abstractC22848 = AbstractC22848.f73734;
            }
            c13675.m32898(abstractC22848);
            c13675.m32914();
            m11845(interfaceC0301);
            c16646Empty = C16646.of(interfaceC0301.mo987());
        }
        c13675.m32906();
        c13675.m32914();
        m11836(l.d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11762(String str, String str2, InterfaceC20058 interfaceC20058, List list) {
        m11836(str);
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11845((InterfaceC13206) interfaceC20058);
        if (list != null) {
            c13675.m32896(this.f12460);
            c13675.m32907();
            m11836(str2);
            c13675.m32914();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC20058 interfaceC20059 = (InterfaceC20058) it.next();
                if (z) {
                    m11836(",");
                    c13675.m32914();
                }
                m11845((InterfaceC13206) interfaceC20059);
                z = true;
            }
            m11836(l.b);
            c13675.m32906();
            return;
        }
        m11836(l.b);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11777(InterfaceC13206 interfaceC13206) {
        ArrayDeque<InterfaceC14812> arrayDeque = new ArrayDeque();
        while (interfaceC13206 instanceof InterfaceC18146) {
            InterfaceC18146 interfaceC18146 = (InterfaceC18146) interfaceC13206;
            arrayDeque.addFirst(interfaceC18146.mo17273());
            interfaceC13206 = interfaceC18146.getExpression();
        }
        arrayDeque.addFirst(((InterfaceC13001) interfaceC13206).getName());
        boolean z = false;
        for (InterfaceC14812 interfaceC14812 : arrayDeque) {
            if (z) {
                m11836(".");
            }
            m11836(interfaceC14812.toString());
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11770(EnumC20828 enumC20828, EnumC15887 enumC15887, InterfaceC1527 interfaceC1527, C16646 c16646, String str, C16646 c16647) {
        C16646 c16646Empty;
        InterfaceC13206 interfaceC13206;
        m11854(interfaceC1527);
        if (interfaceC1527.getType() != null) {
            C9270 c9270M22277 = C8564.m22277(interfaceC1527.getType(), EnumC20559.YES);
            C16646 c16646Of = C16646.of(c9270M22277);
            interfaceC13206 = c9270M22277.f28080;
            c16646Empty = c16646Of;
        } else {
            c16646Empty = C16646.empty();
            interfaceC13206 = null;
        }
        m11850(enumC20828, enumC15887, C16646.of(interfaceC1527.mo5211()), interfaceC13206, interfaceC1527.getName(), str, c16646, c16647, C16646.empty(), c16646Empty);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11856(List list, AbstractC8032 abstractC8032) {
        C13675 c13675 = this.f12459;
        c13675.m32896(abstractC8032);
        c13675.m32896(f12455);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC11796 interfaceC11796 = (InterfaceC11796) it.next();
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC11796);
            z = true;
        }
        m11836(">");
        c13675.m32906();
        c13675.m32906();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0221  */
    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x026f  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0280  */
    /* JADX WARN: Code duplicated, block: B:127:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x034a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0350  */
    /* JADX WARN: Code duplicated, block: B:171:0x037a  */
    /* JADX WARN: Code duplicated, block: B:175:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[LOOP:0: B:3:0x0009->B:178:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:2: B:34:0x00bd->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11844(AbstractC12612 abstractC12612) {
        InterfaceC20058 interfaceC20058;
        boolean z;
        AbstractC14545 abstractC14545M6131;
        EnumC7421 enumC7421Mo16823;
        C16646 c16646Empty;
        int i;
        int i2;
        int i3;
        int i4;
        List list;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        boolean z5;
        InterfaceC20058 interfaceC20059;
        boolean z6;
        Iterator it2;
        boolean zM11772;
        boolean zM11773;
        boolean z7;
        AbstractC8032 abstractC8032;
        InterfaceC17440 interfaceC17440;
        InterfaceC14812 interfaceC14812M9808;
        String str;
        AbstractC10370 abstractC10370;
        boolean z8;
        AbstractC8032 abstractC8033;
        boolean z9;
        Object obj;
        InterfaceC21438 interfaceC21438M32903;
        Object obj2;
        EnumC23554 enumC23554;
        String string;
        ArrayDeque<InterfaceC20058> arrayDeque = new ArrayDeque();
        InterfaceC20058 expression = abstractC12612;
        while (true) {
            arrayDeque.addFirst(expression);
            if (expression.mo987() == EnumC3329.ARRAY_ACCESS) {
                expression = m11760(expression);
            }
            interfaceC20058 = null;
            switch (C7153.f21954[expression.mo987().ordinal()]) {
                case 9:
                    expression = ((InterfaceC18146) expression).getExpression();
                    if (expression == null) {
                        interfaceC20058 = expression;
                    }
                    break;
                case 10:
                    InterfaceC20058 interfaceC20058Mo36749 = ((InterfaceC17440) expression).mo36749();
                    expression = interfaceC20058Mo36749 instanceof InterfaceC18146 ? ((InterfaceC18146) interfaceC20058Mo36749).getExpression() : null;
                    if (expression == null) {
                        interfaceC20058 = expression;
                    }
                    break;
                case 11:
                    break;
                default:
                    interfaceC20058 = (InterfaceC20058) arrayDeque.removeFirst();
                    break;
            }
        }
        ArrayList arrayList = new ArrayList(arrayDeque);
        AbstractC8032 abstractC8034 = this.f12460;
        String str2 = ".";
        AbstractC8032 abstractC8035 = f12455;
        C13675 c13675 = this.f12459;
        int i5 = 0;
        if (interfaceC20058 != null) {
            if (interfaceC20058.mo987() == EnumC3329.NEW_CLASS && ((InterfaceC8974) interfaceC20058).mo23182() != null) {
                c13675.m32896(abstractC8035);
                m11845(m11760(interfaceC20058));
                m11836(".");
                z = false;
            } else {
                m11845(m11760(interfaceC20058));
                c13675.m32896(abstractC8034);
                z = true;
            }
            ArrayDeque arrayDeque2 = new ArrayDeque();
            InterfaceC20058 expression2 = interfaceC20058;
            while (expression2 instanceof InterfaceC13727) {
                InterfaceC13727 interfaceC13727 = (InterfaceC13727) expression2;
                arrayDeque2.addLast(interfaceC13727.getIndex());
                expression2 = interfaceC13727.getExpression();
            }
            m11774(arrayDeque2);
            if (arrayDeque.isEmpty()) {
                c13675.m32906();
                return;
            }
        } else {
            z = false;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i6 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        for (InterfaceC20058 interfaceC200510 : arrayDeque) {
            boolean z10 = interfaceC200510.mo987() == EnumC3329.ARRAY_ACCESS;
            InterfaceC20058 interfaceC20058M11760 = m11760(interfaceC200510);
            switch (C7153.f21954[interfaceC20058M11760.mo987().ordinal()]) {
                case 9:
                    c1846.m16264(((InterfaceC18146) interfaceC20058M11760).mo17273().toString());
                    if (z10) {
                    }
                    break;
                case 10:
                    c1846.m16264(C3188.m9808((InterfaceC17440) interfaceC20058M11760).toString());
                    break;
                case 11:
                    c1846.m16264(((InterfaceC13001) interfaceC20058M11760).getName().toString());
                    if (z10) {
                    }
                    break;
            }
            abstractC14545M6131 = c1846.m6131();
            enumC7421Mo16823 = EnumC7421.f22806;
            c16646Empty = C16646.empty();
            for (i = 0; i < abstractC14545M6131.size() && (enumC7421Mo16823 = enumC7421Mo16823.mo16823(EnumC12360.m29991((String) abstractC14545M6131.get(i)))) != EnumC7421.f22803; i++) {
                if (enumC7421Mo16823.m19947()) {
                    c16646Empty = C16646.of(Integer.valueOf(i));
                }
            }
            c16646Empty.ifPresent(new Consumer() { // from class: l.᩺֫ۖ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj3) {
                    linkedHashSet.add((Integer) obj3);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
            i3 = 0;
            i4 = -1;
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                if (((InterfaceC20058) arrayList.get(i2)).mo987() != EnumC3329.METHOD_INVOCATION) {
                    if (i2 <= 0 || interfaceC20058 != null) {
                        i3++;
                    }
                    if (i4 < 0) {
                        i4 = i2;
                    }
                }
            }
            if (i3 == 1 && i4 > 0) {
                linkedHashSet.add(Integer.valueOf(i4));
            }
            if (linkedHashSet.isEmpty() && (arrayList.get(0) instanceof InterfaceC13001)) {
                string = ((InterfaceC13001) arrayList.get(0)).getName().toString();
                if (!string.equals("this") || string.equals("super")) {
                    linkedHashSet.add(1);
                }
            }
            list = (List) C20857.m47675(C5378.stream(arrayList), new C2144(new C2920())).filter(new C13768(1)).collect(C22976.toList());
            C19846.forEach(list, new C17831(1, linkedHashSet));
            if (!linkedHashSet.isEmpty()) {
                if (list.isEmpty()) {
                    enumC23554 = EnumC23554.INDEPENDENT;
                } else {
                    enumC23554 = EnumC23554.UNIFIED;
                }
                m11766(arrayList, z, linkedHashSet, enumC23554);
            } else {
                if (arrayList.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = !z;
                if (arrayList.size() == 1) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                it = arrayList.iterator();
                z5 = false;
                while (it.hasNext()) {
                    interfaceC20059 = (InterfaceC20058) it.next();
                    if (z5) {
                        c13675.m32896(abstractC8034);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        it2 = it;
                        zM11772 = false;
                        zM11773 = false;
                        z7 = false;
                    } else {
                        z9 = z3;
                        it2 = it;
                        obj = interfaceC20059;
                        while (!(obj instanceof C6262)) {
                            if (obj instanceof C15580) {
                                obj2 = ((C15580) obj).f48011;
                            } else if (obj instanceof C14728) {
                                obj2 = ((C14728) obj).f44980;
                            } else {
                                throw new RuntimeException("Unexpected tree type: " + obj);
                            }
                            obj = obj2;
                            i5 = 0;
                        }
                        interfaceC21438M32903 = c13675.m32903(i5);
                        C11003.requireNonNull(interfaceC21438M32903);
                        if (((C21265) interfaceC21438M32903.mo48557()).mo35701().equals(str2)) {
                            throw new AssertionError(interfaceC21438M32903.toString());
                        }
                        InterfaceC21438 interfaceC21438M32904 = c13675.m32903(-1);
                        InterfaceC21438 interfaceC21438M32905 = c13675.m32903(1);
                        zM11773 = m11772(interfaceC21438M32904, interfaceC21438M32903);
                        zM11772 = m11772(interfaceC21438M32903, interfaceC21438M32905);
                        if (!z6 && z4 && (zM11773 || zM11772)) {
                            c13675.m32896(abstractC8034);
                            z6 = true;
                        }
                        if (z4 || z5 || !(zM11773 || zM11772)) {
                            z7 = z9;
                        } else {
                            z7 = z9;
                            z5 = true;
                        }
                    }
                    if (z) {
                        if (zM11773) {
                            c13675.m32914();
                        }
                        m11836(str2);
                        if (zM11772) {
                            c13675.m32914();
                        }
                    }
                    if (z2) {
                        abstractC8032 = abstractC8035;
                    } else {
                        abstractC8032 = this.f12462;
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList.size() >= 2 && interfaceC20059.mo987() == EnumC3329.METHOD_INVOCATION) {
                        interfaceC17440 = (InterfaceC17440) interfaceC20059;
                        interfaceC14812M9808 = C3188.m9808(interfaceC17440);
                        str = str2;
                        if (interfaceC17440.mo36749() instanceof InterfaceC13001) {
                            abstractC10370 = (AbstractC10370) interfaceC14812M9808;
                            z8 = z4;
                            if (abstractC10370.length() > 4 && interfaceC17440.mo36748().isEmpty() && interfaceC17440.mo36750().m8245() == 1) {
                                c13675.m32896(abstractC8035);
                                c13675.m32896(abstractC8032);
                                m11836(abstractC10370.toString());
                                m11836(MotionUtils.EASING_TYPE_FORMAT_START);
                                m11845((InterfaceC13206) C8882.m22950((Collection) interfaceC17440.mo36750()));
                                c13675.m32906();
                                m11836(MotionUtils.EASING_TYPE_FORMAT_END);
                                c13675.m32906();
                            }
                            if (z6) {
                                c13675.m32906();
                            }
                            AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC20059;
                            AbstractC12117 abstractC12117 = ((C1323) m42940().m11138()).f4743;
                            abstractC5144.getClass();
                            C7260.m19431(abstractC5144, abstractC12117);
                            C3188.m9805((InterfaceC13206) interfaceC20059);
                            i5 = 0;
                            z = true;
                            arrayList = arrayList2;
                            z3 = z7;
                            it = it2;
                            str2 = str;
                            z4 = z8;
                        }
                        C7326 c7326 = new C7326();
                        m11769(interfaceC20059, C16646.of(c7326));
                        C0976 c0976M3441 = C0976.m3441(c7326, abstractC8034, abstractC8035);
                        if (!z2 || z) {
                            abstractC8033 = abstractC8034;
                        } else {
                            abstractC8033 = abstractC8035;
                        }
                        m11768(interfaceC20059, c0976M3441, abstractC8033);
                        if (z6) {
                            c13675.m32906();
                        }
                        AbstractC5144 abstractC5145 = (AbstractC5144) interfaceC20059;
                        AbstractC12117 abstractC12118 = ((C1323) m42940().m11138()).f4743;
                        abstractC5145.getClass();
                        C7260.m19431(abstractC5145, abstractC12118);
                        C3188.m9805((InterfaceC13206) interfaceC20059);
                        i5 = 0;
                        z = true;
                        arrayList = arrayList2;
                        z3 = z7;
                        it = it2;
                        str2 = str;
                        z4 = z8;
                    } else {
                        str = str2;
                    }
                    z8 = z4;
                    C7326 c7327 = new C7326();
                    m11769(interfaceC20059, C16646.of(c7327));
                    C0976 c0976M3442 = C0976.m3441(c7327, abstractC8034, abstractC8035);
                    if (z2) {
                        abstractC8033 = abstractC8034;
                    } else {
                        abstractC8033 = abstractC8034;
                    }
                    m11768(interfaceC20059, c0976M3442, abstractC8033);
                    if (z6) {
                        c13675.m32906();
                    }
                    AbstractC5144 abstractC5146 = (AbstractC5144) interfaceC20059;
                    AbstractC12117 abstractC12119 = ((C1323) m42940().m11138()).f4743;
                    abstractC5146.getClass();
                    C7260.m19431(abstractC5146, abstractC12119);
                    C3188.m9805((InterfaceC13206) interfaceC20059);
                    i5 = 0;
                    z = true;
                    arrayList = arrayList2;
                    z3 = z7;
                    it = it2;
                    str2 = str;
                    z4 = z8;
                }
            }
            if (interfaceC20058 != null) {
                c13675.m32906();
            }
        }
        abstractC14545M6131 = c1846.m6131();
        enumC7421Mo16823 = EnumC7421.f22806;
        c16646Empty = C16646.empty();
        while (i < abstractC14545M6131.size()) {
            if (enumC7421Mo16823.m19947()) {
                c16646Empty = C16646.of(Integer.valueOf(i));
            }
        }
        c16646Empty.ifPresent(new Consumer() { // from class: l.᩺֫ۖ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj3) {
                linkedHashSet.add((Integer) obj3);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        i3 = 0;
        i4 = -1;
        while (i2 < arrayList.size()) {
            if (((InterfaceC20058) arrayList.get(i2)).mo987() != EnumC3329.METHOD_INVOCATION) {
                if (i2 <= 0) {
                    i3++;
                } else {
                    i3++;
                }
                if (i4 < 0) {
                    i4 = i2;
                }
            }
        }
        if (i3 == 1) {
            linkedHashSet.add(Integer.valueOf(i4));
        }
        if (linkedHashSet.isEmpty()) {
            string = ((InterfaceC13001) arrayList.get(0)).getName().toString();
            if (!string.equals("this")) {
                linkedHashSet.add(1);
            } else {
                linkedHashSet.add(1);
            }
        }
        list = (List) C20857.m47675(C5378.stream(arrayList), new C2144(new C2920())).filter(new C13768(1)).collect(C22976.toList());
        C19846.forEach(list, new C17831(1, linkedHashSet));
        if (!linkedHashSet.isEmpty()) {
            if (list.isEmpty()) {
                enumC23554 = EnumC23554.INDEPENDENT;
            } else {
                enumC23554 = EnumC23554.UNIFIED;
            }
            m11766(arrayList, z, linkedHashSet, enumC23554);
        } else {
            if (arrayList.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = !z;
            if (arrayList.size() == 1) {
                z4 = false;
            } else {
                z4 = z3;
            }
            it = arrayList.iterator();
            z5 = false;
            while (it.hasNext()) {
                interfaceC20059 = (InterfaceC20058) it.next();
                if (z5) {
                    c13675.m32896(abstractC8034);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z9 = z3;
                    it2 = it;
                    obj = interfaceC20059;
                    while (!(obj instanceof C6262)) {
                        if (obj instanceof C15580) {
                            obj2 = ((C15580) obj).f48011;
                        } else if (obj instanceof C14728) {
                            obj2 = ((C14728) obj).f44980;
                        } else {
                            throw new RuntimeException("Unexpected tree type: " + obj);
                        }
                        obj = obj2;
                        i5 = 0;
                    }
                    interfaceC21438M32903 = c13675.m32903(i5);
                    C11003.requireNonNull(interfaceC21438M32903);
                    if (((C21265) interfaceC21438M32903.mo48557()).mo35701().equals(str2)) {
                        throw new AssertionError(interfaceC21438M32903.toString());
                    }
                    InterfaceC21438 interfaceC21438M32906 = c13675.m32903(-1);
                    InterfaceC21438 interfaceC21438M32907 = c13675.m32903(1);
                    zM11773 = m11772(interfaceC21438M32906, interfaceC21438M32903);
                    zM11772 = m11772(interfaceC21438M32903, interfaceC21438M32907);
                    if (!z6) {
                        c13675.m32896(abstractC8034);
                        z6 = true;
                    }
                    if (z4) {
                        z7 = z9;
                    } else {
                        z7 = z9;
                    }
                } else {
                    it2 = it;
                    zM11772 = false;
                    zM11773 = false;
                    z7 = false;
                }
                if (z) {
                    if (zM11773) {
                        c13675.m32914();
                    }
                    m11836(str2);
                    if (zM11772) {
                        c13675.m32914();
                    }
                }
                if (z2) {
                    abstractC8032 = abstractC8035;
                } else {
                    abstractC8032 = this.f12462;
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList.size() >= 2) {
                    interfaceC17440 = (InterfaceC17440) interfaceC20059;
                    interfaceC14812M9808 = C3188.m9808(interfaceC17440);
                    str = str2;
                    if (interfaceC17440.mo36749() instanceof InterfaceC13001) {
                        abstractC10370 = (AbstractC10370) interfaceC14812M9808;
                        z8 = z4;
                        if (abstractC10370.length() > 4) {
                        }
                    } else {
                        z8 = z4;
                    }
                    C7326 c7328 = new C7326();
                    m11769(interfaceC20059, C16646.of(c7328));
                    C0976 c0976M3443 = C0976.m3441(c7328, abstractC8034, abstractC8035);
                    if (z2) {
                        abstractC8033 = abstractC8034;
                    } else {
                        abstractC8033 = abstractC8034;
                    }
                    m11768(interfaceC20059, c0976M3443, abstractC8033);
                } else {
                    str = str2;
                    z8 = z4;
                    C7326 c7329 = new C7326();
                    m11769(interfaceC20059, C16646.of(c7329));
                    C0976 c0976M3444 = C0976.m3441(c7329, abstractC8034, abstractC8035);
                    if (z2) {
                        abstractC8033 = abstractC8034;
                    } else {
                        abstractC8033 = abstractC8034;
                    }
                    m11768(interfaceC20059, c0976M3444, abstractC8033);
                }
                if (z6) {
                    c13675.m32906();
                }
                AbstractC5144 abstractC5147 = (AbstractC5144) interfaceC20059;
                AbstractC12117 abstractC121110 = ((C1323) m42940().m11138()).f4743;
                abstractC5147.getClass();
                C7260.m19431(abstractC5147, abstractC121110);
                C3188.m9805((InterfaceC13206) interfaceC20059);
                i5 = 0;
                z = true;
                arrayList = arrayList3;
                z3 = z7;
                it = it2;
                str2 = str;
                z4 = z8;
            }
        }
        if (interfaceC20058 != null) {
            c13675.m32906();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11766(List list, boolean z, AbstractCollection abstractCollection, EnumC23554 enumC23554) {
        C5210 c5210;
        C13675 c13675;
        boolean z2;
        if (!abstractCollection.isEmpty()) {
            ((Integer) C8882.m22955(abstractCollection)).intValue();
            list.size();
        }
        int i = 0;
        while (true) {
            int size = abstractCollection.size();
            c5210 = f12455;
            c13675 = this.f12459;
            if (i >= size) {
                break;
            }
            c13675.m32896(c5210);
            i++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(AbstractC23698.copyOf((Collection) abstractCollection));
        C7326 c7326 = new C7326();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < list.size()) {
            InterfaceC20058 interfaceC20058 = (InterfaceC20058) list.get(i2);
            C5210 c5211 = this.f12460;
            if (z3) {
                c13675.m32896(c5211);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 0 && m11778()) {
                if (!z2) {
                    c13675.m32896(c5211);
                    z2 = true;
                }
                c13675.m32914();
                z3 = true;
            }
            if (z) {
                m11836(".");
            } else if (z) {
                EnumC23554 enumC23555 = (arrayDeque.isEmpty() || i2 > ((Integer) arrayDeque.peekFirst()).intValue()) ? EnumC23554.UNIFIED : enumC23554;
                C16646 c16646Of = C16646.of(c7326);
                c13675.getClass();
                c13675.m32897(C14381.m34345(enumC23555, "", c5210, c16646Of));
                m11836(".");
            }
            C7326 c7327 = new C7326();
            m11769(interfaceC20058, C16646.of(c7327));
            if (!arrayDeque.isEmpty() && i2 == ((Integer) arrayDeque.peekFirst()).intValue()) {
                c13675.m32906();
                arrayDeque.removeFirst();
            }
            m11768(interfaceC20058, C0976.m3441(c7327, c5211, c5210), c5211);
            if (z2) {
                c13675.m32906();
            }
            i2++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11769(InterfaceC20058 interfaceC20058, C16646 c16646) {
        InterfaceC20058 interfaceC20058M11760 = m11760(interfaceC20058);
        switch (C7153.f21954[interfaceC20058M11760.mo987().ordinal()]) {
            case 9:
                m11846(((InterfaceC18146) interfaceC20058M11760).mo17273());
                break;
            case 10:
                InterfaceC17440 interfaceC17440 = (InterfaceC17440) interfaceC20058M11760;
                if (!interfaceC17440.mo36748().isEmpty()) {
                    C5210 c5210 = this.f12460;
                    C13675 c13675 = this.f12459;
                    c13675.m32896(c5210);
                    C2609 c2609Mo36748 = interfaceC17440.mo36748();
                    C5210 c5211 = f12455;
                    m11853(c2609Mo36748, c5211);
                    c13675.m32897(C14381.m34345(EnumC23554.UNIFIED, "", c5211, c16646));
                    c13675.m32906();
                }
                m11846(C3188.m9808(interfaceC17440));
                break;
            case 11:
                m11846(((InterfaceC13001) interfaceC20058M11760).getName());
                break;
            default:
                m11845((InterfaceC13206) interfaceC20058M11760);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20058 m11760(InterfaceC20058 interfaceC20058) {
        while (interfaceC20058 instanceof InterfaceC13727) {
            interfaceC20058 = ((InterfaceC13727) interfaceC20058).getExpression();
        }
        return interfaceC20058;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11774(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        do {
            m11836("[");
            c13675.m32909();
            m11845((InterfaceC13206) arrayDeque.removeLast());
            m11836("]");
        } while (!arrayDeque.isEmpty());
        c13675.m32906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11768(InterfaceC20058 interfaceC20058, C0976 c0976, AbstractC8032 abstractC8032) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC20058 expression = interfaceC20058;
        while (expression instanceof InterfaceC13727) {
            InterfaceC13727 interfaceC13727 = (InterfaceC13727) expression;
            arrayDeque.addLast(interfaceC13727.getIndex());
            expression = interfaceC13727.getExpression();
        }
        InterfaceC20058 interfaceC20058M11760 = m11760(interfaceC20058);
        if (C7153.f21954[interfaceC20058M11760.mo987().ordinal()] == 10) {
            C13675 c13675 = this.f12459;
            c13675.m32896(c0976);
            m11839((List) ((InterfaceC17440) interfaceC20058M11760).mo36750(), abstractC8032);
            c13675.m32906();
        }
        m11774(arrayDeque);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11853(List list, AbstractC8032 abstractC8032) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m11836("<");
        C13675 c13675 = this.f12459;
        c13675.m32896(abstractC8032);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                m11836(",");
                c13675.m32912();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        m11836(">");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11839(List list, AbstractC8032 abstractC8032) {
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        boolean zIsEmpty = list.isEmpty();
        C13675 c13675 = this.f12459;
        boolean z = false;
        if (!zIsEmpty) {
            Iterator it = list.iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                InterfaceC20058 interfaceC20058 = (InterfaceC20058) it.next();
                InterfaceC21438 interfaceC21438M32903 = c13675.m32903(i);
                C11003.requireNonNull(interfaceC21438M32903);
                InterfaceC21438 interfaceC21438M32904 = c13675.m32903(i != 0 ? 0 : -1);
                C11003.requireNonNull(interfaceC21438M32904);
                InterfaceC21438 interfaceC21438M32905 = c13675.m32903(i == 0 ? -2 : -1);
                if (i != 0) {
                    if ((interfaceC21438M32905 != null && m11771(interfaceC21438M32905.mo48559())) || m11771(interfaceC21438M32904.mo48558())) {
                        if (!z) {
                            c13675.m32896(abstractC8032);
                            z = true;
                        }
                        c13675.m32914();
                    }
                    m11836(",");
                }
                if (m11771(interfaceC21438M32904.mo48559()) || m11771(interfaceC21438M32903.mo48558())) {
                    if (!z) {
                        c13675.m32896(abstractC8032);
                        z = true;
                    }
                    c13675.m32914();
                } else if (i != 0) {
                    c13675.m32907();
                }
                m11845((InterfaceC13206) interfaceC20058);
                i = 1;
            }
        }
        if (z) {
            c13675.m32906();
        }
        if (!list.isEmpty() && m11778()) {
            c13675.m32914();
        }
        m11837(MotionUtils.EASING_TYPE_FORMAT_END, abstractC8032);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11776(ArrayDeque arrayDeque) {
        m11765(new ArrayDeque(), (Deque) arrayDeque);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11840(List list, EnumC14476 enumC14476, EnumC2483 enumC2483) {
        boolean z;
        boolean zIsEmpty = list.isEmpty();
        C5210 c5210 = f12455;
        C5210 c5211 = this.f12464;
        C13675 c13675 = this.f12459;
        if (zIsEmpty) {
            if (enumC14476.m34575()) {
                c13675.m32907();
                m11843(c5211);
                c13675.m32898(AbstractC22848.f73734);
                c13675.m32896(c5210);
                if (c13675.m32908(0).equals(C16646.of(l.b))) {
                    c13675.m32896(c5211);
                    m11852();
                    c13675.m32906();
                    c13675.m32914();
                }
                m11837(l.d, c5211);
                c13675.m32906();
                return;
            }
            return;
        }
        if (enumC14476.m34575()) {
            c13675.m32907();
            m11843(c5211);
            c13675.m32896(c5210);
        }
        c13675.m32896(c5211);
        boolean zM7972 = enumC2483.m7972();
        InterfaceC5998 interfaceC5998M13612 = C4648.m13612(list.iterator());
        boolean z2 = false;
        while (interfaceC5998M13612.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) interfaceC5998M13612.next();
            m11852();
            c13675.m32914();
            if (interfaceC13206.mo987() == EnumC3329.VARIABLE) {
                InterfaceC21438 interfaceC21438 = (InterfaceC21438) c13675.m32902().mo45661().mo11960(Integer.valueOf(C7260.m19455((AbstractC5144) interfaceC13206)));
                if (interfaceC21438 != null) {
                    AbstractC4628 abstractC4628ListIterator = interfaceC21438.mo48558().listIterator(0);
                    while (true) {
                        if (abstractC4628ListIterator.hasNext()) {
                            if (((InterfaceC15086) abstractC4628ListIterator.next()).getText().startsWith("/**")) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (zM7972) {
                c13675.m32898(AbstractC22848.f73735);
            } else if (!zM7972 && (z || z2)) {
                c13675.m32898(AbstractC22848.f73736);
            }
            m11855();
            if (interfaceC13206.mo987() == EnumC3329.VARIABLE) {
                m11841(m11756(interfaceC5998M13612, interfaceC13206), EnumC20828.FIELD, m11759((InterfaceC23790) ((InterfaceC1527) interfaceC13206).mo5211()));
            } else {
                m11845(interfaceC13206);
            }
            zM7972 = false;
            z2 = z;
        }
        m11852();
        c13675.m32914();
        c13675.m32906();
        c13675.m32914();
        m11855();
        if (enumC14476.m34575()) {
            c13675.m32898(AbstractC22848.f73735);
            m11837(l.d, c5211);
            c13675.m32906();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11763(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        C13675 c13675 = this.f12459;
        c13675.m32912();
        c13675.m32896(list.size() > 1 ? this.f12460 : f12455);
        m11836(str);
        c13675.m32907();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m11756(InterfaceC5998 interfaceC5998, InterfaceC13206 interfaceC13206) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC13206.mo987() == EnumC3329.VARIABLE) {
            int iM9805 = C3188.m9805(interfaceC13206);
            arrayList.add((InterfaceC1527) interfaceC13206);
            while (interfaceC5998.hasNext() && ((InterfaceC13206) interfaceC5998.peek()).mo987() == EnumC3329.VARIABLE && C3188.m9805((InterfaceC13206) interfaceC5998.peek()) == iM9805) {
                arrayList.add((InterfaceC1527) interfaceC5998.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15887 m11759(InterfaceC23790 interfaceC23790) {
        Iterator it = interfaceC23790.getAnnotations().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC22900) it.next()).mo41040().isEmpty()) {
                return EnumC15887.VERTICAL;
            }
        }
        return EnumC15887.HORIZONTAL;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11836(String str) {
        this.f12459.m32894(str, EnumC15792.REAL, f12455, C16646.empty());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11837(String str, AbstractC8032 abstractC8032) {
        this.f12459.m32894(str, EnumC15792.REAL, abstractC8032, C16646.empty());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11843(AbstractC8032 abstractC8032) {
        this.f12459.m32894("{", EnumC15792.REAL, f12455, C16646.of(abstractC8032));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11854(InterfaceC13206 interfaceC13206) {
        AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC13206;
        abstractC5144.getClass();
        this.f12459.m32913(C7260.m19455(abstractC5144));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11850(EnumC20828 enumC20828, EnumC15887 enumC15887, C16646 c16646, InterfaceC13206 interfaceC13206, InterfaceC14812 interfaceC14812, String str, C16646 c16647, C16646 c16648, C16646 c16649, C16646 c166410) {
        C7326 c7326 = new C7326();
        C7326 c7327 = new C7326();
        boolean z = true;
        boolean z2 = enumC20828 == EnumC20828.FIELD;
        C13675 c13675 = this.f12459;
        if (z2) {
            c13675.m32898(AbstractC22848.m50960(c7327));
        }
        ArrayDeque arrayDeque = new ArrayDeque(c166410.isPresent() ? ((C9270) c166410.get()).f28079 : AbstractC14545.of());
        AbstractC8833 abstractC8833 = (AbstractC8833) c16646.map(new Function() { // from class: l.ܰ֫ۖ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC23790 interfaceC23790 = (InterfaceC23790) obj;
                return this.f40313.m11835(interfaceC23790, (List) interfaceC23790.getAnnotations());
            }
        }).orElse(new C23380(AbstractC14545.of(), AbstractC14545.of()));
        EnumC20828 enumC20829 = EnumC20828.PARAMETER;
        C5210 c5210 = f12455;
        C5210 c5211 = this.f12460;
        c13675.m32896((enumC20828 == enumC20829 && abstractC8833.m22827()) ? c5211 : c5210);
        AbstractC14545 abstractC14545M11758 = m11758(abstractC8833, enumC15887, C16646.of(c7327));
        boolean z3 = ((String) c13675.m32908(0).get()).equals("var") && (!interfaceC14812.mo26175("var") || ((String) c13675.m32908(1).get()).equals("var"));
        if (interfaceC13206 == null && !z3) {
            z = false;
        }
        c13675.m32896(c5210);
        c13675.m32896(c5210);
        c13675.m32896(c5210);
        m11842(abstractC14545M11758, EnumC23649.NO, EnumC23649.YES);
        if (c166410.isPresent() && ((C9270) c166410.get()).f28080 != null) {
            m11845(((C9270) c166410.get()).f28080);
            arrayDeque.size();
            c13675.m32896(c5211);
            m11776(arrayDeque);
            c13675.m32906();
            arrayDeque.size();
        } else if (z3) {
            m11836("var");
        } else {
            m11845(interfaceC13206);
        }
        c13675.m32906();
        if (z) {
            c13675.m32907();
        }
        c13675.m32896(C0976.m3441(c7326, c5211, c5210));
        if (c16649.isPresent()) {
            m11845((InterfaceC13206) c16649.get());
        } else {
            m11846(interfaceC14812);
        }
        c13675.m32910("");
        m11776(arrayDeque);
        c13675.m32906();
        c13675.m32906();
        if (c16647.isPresent()) {
            c13675.m32907();
            m11836(str);
            if (((InterfaceC20058) c16647.get()).mo987() == EnumC3329.NEW_ARRAY && ((InterfaceC9680) c16647.get()).getType() == null) {
                c13675.m32907();
                ((InterfaceC20058) c16647.get()).mo986(this, null);
            } else {
                c13675.m32896(C0976.m3441(c7326, c5211, c5210));
                c13675.m32907();
                m11845((InterfaceC13206) c16647.get());
                c13675.m32906();
            }
        }
        if (c16648.isPresent() && c13675.m32908(0).equals(c16648)) {
            c13675.m32905((String) c16648.get());
        }
        c13675.m32906();
        c13675.m32906();
        if (z2) {
            c13675.m32898(AbstractC22848.m50960(c7327));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m11778() {
        C13675 c13675 = this.f12459;
        return m11772(c13675.m32903(-1), c13675.m32903(0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11772(InterfaceC21438 interfaceC21438, InterfaceC21438 interfaceC21439) {
        if (interfaceC21438 == null || !m11771(interfaceC21438.mo48559())) {
            return interfaceC21439 != null && m11771(interfaceC21439.mo48558());
        }
        return true;
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f12459, "builder");
        return c8964M37871.toString();
    }
}
