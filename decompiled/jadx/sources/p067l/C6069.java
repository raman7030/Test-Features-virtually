package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0698cb;
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
public final class C6069 extends C19913 {

    /* JADX INFO: renamed from: ۡ */
    public static final C7320 f15263;

    /* JADX INFO: renamed from: ۢ */
    public static final C15521 f15264;

    /* JADX INFO: renamed from: ᩷ */
    public static final AbstractC8146 f15265;

    /* JADX INFO: renamed from: ۧ */
    public final C15365 f15267;

    /* JADX INFO: renamed from: ܳ */
    public final C7320 f15268;

    /* JADX INFO: renamed from: ܿ */
    public final C7320 f15270;

    /* JADX INFO: renamed from: ᩳ */
    public final int f15271;

    /* JADX INFO: renamed from: ᩻ */
    public final C7320 f15272;

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f15266 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f15269 = new ArrayDeque(AbstractC16192.m36873of((Object) Boolean.FALSE));

    public C6069(C15365 c15365, int i) {
        this.f15267 = c15365;
        this.f15271 = i;
        C7320.m16898(-2, i);
        this.f15270 = C7320.m16898(-4, i);
        this.f15272 = C7320.m16898(2, i);
        this.f15268 = C7320.m16898(4, i);
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13715(C2423 c2423, Object obj) {
        m13698("opens", "to", c2423.f3722, c2423.f3723);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13716(C2955 c2955, Object obj) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13717(C3626 c3626, Object obj) {
        boolean z;
        C4848<InterfaceC24132> c4848M10283;
        AbstractC14355 abstractC14355M6847 = c3626.m6847();
        C15365 c15365 = this.f15267;
        if (abstractC14355M6847 != null) {
            m13791();
            AbstractC14355 abstractC14355M6848 = c3626.m6847();
            C9800 c9800M6851 = c3626.m6851();
            if (c9800M6851 == null) {
                c4848M10283 = C4848.m10283();
            } else {
                c4848M10283 = c9800M6851.f27114;
            }
            if (!c4848M10283.isEmpty()) {
                for (InterfaceC24132 interfaceC24132 : c4848M10283) {
                    c15365.m35029();
                    m13781((InterfaceC14919) interfaceC24132);
                }
                c15365.m35029();
            }
            c15365.m35011(this.f15268);
            m13772("package");
            c15365.m35022();
            m13713(abstractC14355M6848);
            c15365.m35021();
            m13772(C0249l.f1196b);
            c15365.m35029();
            z = true;
        } else {
            z = false;
        }
        m13788();
        if (!c3626.m6849().isEmpty()) {
            if (z) {
                c15365.m35013(AbstractC24083.f76468);
            }
            for (InterfaceC12043 interfaceC12043 : c3626.m6849()) {
                m13791();
                c15365.m35013(AbstractC24083.f76467);
                m13781(interfaceC12043);
                c15365.m35029();
            }
            z = true;
        }
        m13788();
        for (InterfaceC14919 interfaceC14919 : c3626.m6850()) {
            if (interfaceC14919.mo3381() != EnumC5532.IMPORT) {
                if (z) {
                    c15365.m35013(AbstractC24083.f76468);
                }
                m13791();
                m13781(interfaceC14919);
                c15365.m35029();
                m13788();
                z = true;
            }
        }
        C5777 c5777M6848 = c3626.m6848();
        if (c5777M6848 != null) {
            if (z) {
                c15365.m35013(AbstractC24083.f76468);
            }
            m13791();
            m13787((InterfaceC22297) c5777M6848);
            c15365.m35029();
        }
        m13791();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13718(C3765 c3765, Object obj) {
        m13790(c3765);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InterfaceC14054 interfaceC14054 = c3765;
        while (true) {
            arrayList.add(interfaceC14054.mo7264());
            arrayList2.add(interfaceC14054.mo7265());
            if (interfaceC14054.mo7263() == null || interfaceC14054.mo7263().mo3381() != EnumC5532.IF) {
                break;
            }
            interfaceC14054 = (InterfaceC14054) interfaceC14054.mo7263();
        }
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < size) {
            if (z) {
                if (z2) {
                    c15365.m35022();
                } else {
                    c15365.m35029();
                }
                m13772("else");
                c15365.m35022();
            }
            m13772("if");
            c15365.m35022();
            m13772(MotionUtils.EASING_TYPE_FORMAT_START);
            m13781((InterfaceC14919) ((InterfaceC20956) ((InterfaceC21431) arrayList.get(i))).getExpression());
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
            z = true;
            m13703((InterfaceC16930) arrayList2.get(i), EnumC8751.m20224(size == 1 && interfaceC14054.mo7263() == null), EnumC4057.YES, EnumC12775.m29332(i < size + (-1) || interfaceC14054.mo7263() != null));
            z2 = ((InterfaceC16930) arrayList2.get(i)).mo3381() == EnumC5532.BLOCK;
            i++;
        }
        if (interfaceC14054.mo7263() != null) {
            if (z2) {
                c15365.m35022();
            } else {
                c15365.m35029();
            }
            m13772("else");
            m13703(interfaceC14054.mo7263(), EnumC8751.NO, EnumC4057.YES, EnumC12775.NO);
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13719(C3904 c3904, Object obj) {
        m13790(c3904);
        m13772("throw");
        this.f15267.m35022();
        m13781((InterfaceC14919) c3904.f8460);
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13720(C4436 c4436, Object obj) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13721(C4575 c4575, Object obj) {
        m13790(c4575);
        m13772("yield");
        this.f15267.m35022();
        m13781((InterfaceC14919) c4575.f10248);
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13722(C4968 c4968, Object obj) {
        m13784((InterfaceC18748) c4968, EnumC8751.NO, EnumC4057.NO, EnumC12775.NO);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13723(C5107 c5107, Object obj) {
        m13790((InterfaceC14919) c5107);
        int[] iArr = C9166.f24834;
        EnumC11353 enumC11353 = c5107.f11988;
        switch (iArr[enumC11353.m26308().ordinal()]) {
            case 1:
                m13772(ClassTransform.BOOLEAN);
                return null;
            case 2:
                m13772(ClassTransform.BYTE);
                return null;
            case 3:
                m13772(ClassTransform.SHORT);
                return null;
            case 4:
                m13772(ClassTransform.INTEGER);
                return null;
            case 5:
                m13772(ClassTransform.LONG);
                return null;
            case 6:
                m13772(ClassTransform.CHARACTER);
                return null;
            case 7:
                m13772(ClassTransform.FLOAT);
                return null;
            case 8:
                m13772(ClassTransform.DOUBLE);
                return null;
            case 9:
                m13772(ClassTransform.VOID);
                return null;
            default:
                throw new AssertionError(enumC11353.m26308());
        }
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo13724(C5777 c5777, Object obj) {
        m13787((InterfaceC22297) c5777);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13725(C6309 c6309, Object obj) {
        m13790(c6309);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13772("break");
        AbstractC12224 abstractC12224 = c6309.f16359;
        if (abstractC12224 != null) {
            c15365.m35022();
            m13782(abstractC12224);
        }
        c15365.m35021();
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13726(C6979 c6979, Object obj) {
        m13790(c6979);
        C15365 c15365 = this.f15267;
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        m13772("for");
        c15365.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        c15365.m35011(c7320);
        m13706(EnumC22163.NONE, EnumC17467.HORIZONTAL, c6979.f18157, C18189.m41402of(c6979.f18158), ":", C18189.empty());
        c15365.m35021();
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        c15365.m35021();
        m13703(c6979.f18156, EnumC8751.YES, EnumC4057.YES, EnumC12775.NO);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13727(C7650 c7650, Object obj) {
        AbstractC10002 abstractC10002;
        int i = C9166.f24833[c7650.mo3381().ordinal()];
        C15365 c15365 = this.f15267;
        AbstractC10002 abstractC10003 = this.f15268;
        AbstractC10002 abstractC10004 = f15263;
        if (i == 1) {
            m13790(c7650);
            c15365.m35011(abstractC10004);
            InterfaceC24978 interfaceC24978 = c7650.f20022;
            for (InterfaceC14919 interfaceC14919 : m13694(m13771(interfaceC24978, (List) interfaceC24978.getAnnotations()), EnumC17467.VERTICAL, C18189.empty())) {
                c15365.m35029();
                m13781(interfaceC14919);
                c15365.m35029();
            }
            c15365.m35011(abstractC10004);
            m13772("@");
            m13772("interface");
            c15365.m35019();
            m13782(c7650.f20021);
            c15365.m35021();
            c15365.m35021();
            List list = c7650.f20020;
            if (list == null) {
                c15365.m35011(abstractC10003);
                m13772(C0249l.f1196b);
                c15365.m35021();
            } else {
                m13776(list, EnumC16126.YES, EnumC4728.YES);
            }
            c15365.m35020(C0249l.f1196b);
            return null;
        }
        if (i == 2 || i == 3) {
            m13790(c7650);
            InterfaceC24978 interfaceC24979 = c7650.f20022;
            for (InterfaceC14919 interfaceC149110 : m13694(m13771(interfaceC24979, (List) interfaceC24979.getAnnotations()), EnumC17467.VERTICAL, C18189.empty())) {
                c15365.m35029();
                m13781(interfaceC149110);
                c15365.m35029();
            }
            List list2 = c7650.f20023;
            boolean z = c7650.f20025 != null;
            boolean zIsEmpty = c7650.f20024.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            EnumC5532 enumC5532Mo3381 = c7650.mo3381();
            EnumC5532 enumC5532 = EnumC5532.INTERFACE;
            m13772(enumC5532Mo3381 != enumC5532 ? Name.LABEL : "interface");
            c15365.m35022();
            m13782(c7650.f20021);
            if (!c7650.f20026.isEmpty()) {
                m13772("<");
            }
            c15365.m35011(abstractC10003);
            if (!c7650.f20026.isEmpty()) {
                List list3 = c7650.f20026;
                if (!z && zIsEmpty && zIsEmpty2) {
                    abstractC10003 = abstractC10004;
                }
                m13792(list3, abstractC10003);
            }
            if (z) {
                c15365.m35027();
                m13772("extends");
                c15365.m35022();
                m13781(c7650.f20025);
            }
            m13699(c7650.mo3381() == enumC5532 ? "extends" : "implements", c7650.f20024);
            m13699("permits", list2);
            c15365.m35021();
            List list4 = c7650.f20020;
            if (list4 == null) {
                m13772(C0249l.f1196b);
            } else {
                m13776(list4, EnumC16126.YES, EnumC4728.YES);
            }
            m13788();
            return null;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(c7650.mo3381());
            }
            m13790(c7650);
            InterfaceC24978 interfaceC249710 = c7650.f20022;
            for (InterfaceC14919 interfaceC149111 : m13694(m13771(interfaceC249710, (List) interfaceC249710.getAnnotations()), EnumC17467.VERTICAL, C18189.empty())) {
                c15365.m35029();
                m13781(interfaceC149111);
                c15365.m35029();
            }
            if (c7650.f20025 != null) {
                throw new C19114();
            }
            boolean zIsEmpty3 = c7650.f20024.isEmpty();
            m13772("record");
            c15365.m35022();
            m13782(c7650.f20021);
            if (!c7650.f20026.isEmpty()) {
                m13772("<");
            }
            c15365.m35011(abstractC10003);
            if (!c7650.f20026.isEmpty()) {
                m13792(c7650.f20026, !zIsEmpty3 ? abstractC10003 : abstractC10004);
            }
            AbstractC16192 abstractC16192 = (AbstractC16192) C7480.stream(c7650.f20020).filter(new C14530()).map(new C24367(7)).filter(new C6329(1)).collect(AbstractC16192.m36885());
            m13772(MotionUtils.EASING_TYPE_FORMAT_START);
            abstractC16192.isEmpty();
            m13783(C18189.empty(), abstractC16192);
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
            if (!zIsEmpty3) {
                c15365.m35027();
                if (c7650.f20024.m10289() <= 1) {
                    abstractC10003 = abstractC10004;
                }
                c15365.m35011(abstractC10003);
                m13772("implements");
                c15365.m35022();
                boolean z2 = false;
                for (InterfaceC14919 interfaceC149112 : c7650.f20024) {
                    if (z2) {
                        m13772(",");
                        c15365.m35019();
                    }
                    m13781(interfaceC149112);
                    z2 = true;
                }
                c15365.m35021();
            }
            c15365.m35021();
            C4848 c4848 = c7650.f20020;
            if (c4848 == null) {
                m13772(C0249l.f1196b);
            } else {
                m13776((AbstractC16192) C7480.stream(c4848).filter(new C19744(1)).collect(AbstractC16192.m36885()), EnumC16126.YES, EnumC4728.YES);
            }
            m13788();
            return null;
        }
        m13790(c7650);
        c15365.m35011(abstractC10004);
        InterfaceC24978 interfaceC249711 = c7650.f20022;
        for (InterfaceC14919 interfaceC149113 : m13694(m13771(interfaceC249711, (List) interfaceC249711.getAnnotations()), EnumC17467.VERTICAL, C18189.empty())) {
            c15365.m35029();
            m13781(interfaceC149113);
            c15365.m35029();
        }
        c15365.m35011(abstractC10003);
        m13772("enum");
        c15365.m35022();
        m13782(c7650.f20021);
        c15365.m35021();
        c15365.m35021();
        if (!c7650.f20024.isEmpty()) {
            c15365.m35011(abstractC10003);
            c15365.m35019();
            c15365.m35011(abstractC10003);
            m13772("implements");
            c15365.m35019();
            c15365.m35011(abstractC10004);
            boolean z3 = false;
            for (InterfaceC14919 interfaceC149114 : c7650.f20024) {
                if (z3) {
                    m13772(",");
                    c15365.m35027();
                }
                m13781(interfaceC149114);
                z3 = true;
            }
            c15365.m35021();
            c15365.m35021();
            c15365.m35021();
        }
        c15365.m35022();
        AbstractC10002 abstractC10005 = this.f15272;
        m13779(abstractC10005);
        ArrayList<InterfaceC3819> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC14919 interfaceC149115 : c7650.f20020) {
            if (interfaceC149115 instanceof C11281) {
                C11281 c11281 = (C11281) interfaceC149115;
                abstractC10002 = abstractC10005;
                if ((c11281.f31435.f9954 & 16384) == 16384) {
                    arrayList.add(c11281);
                }
                abstractC10005 = abstractC10002;
            } else {
                abstractC10002 = abstractC10005;
            }
            arrayList2.add(interfaceC149115);
            abstractC10005 = abstractC10002;
        }
        AbstractC10002 abstractC10006 = abstractC10005;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            c15365.m35011(abstractC10006);
            c15365.m35013(AbstractC24083.f76466);
            c15365.m35029();
            c15365.m35011(abstractC10004);
            boolean z4 = false;
            for (InterfaceC3819 interfaceC3819 : arrayList) {
                if (z4) {
                    m13772(",");
                    c15365.m35029();
                    c15365.m35013(AbstractC24083.f76467);
                }
                m13791();
                Iterator it = interfaceC3819.mo7439().f9953.iterator();
                while (it.hasNext()) {
                    m13781((InterfaceC14919) it.next());
                    c15365.m35029();
                }
                m13782(interfaceC3819.getName());
                InterfaceC10897 interfaceC10897 = (InterfaceC10897) interfaceC3819.mo7438();
                if (interfaceC10897.mo25127().isEmpty()) {
                    c15365.m35020(MotionUtils.EASING_TYPE_FORMAT_START);
                    c15365.m35020(MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    m13775(interfaceC10897.mo25127(), abstractC10003);
                }
                if (interfaceC10897.mo25126() != null) {
                    m13776(interfaceC10897.mo25126().f20020, EnumC16126.YES, EnumC4728.YES);
                }
                z4 = true;
            }
            if (((String) c15365.m35023(0).orElse("")).equals(",")) {
                m13772(",");
                c15365.m35029();
            }
            c15365.m35021();
            c15365.m35021();
            if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
                c15365.m35011(abstractC10006);
                m13772(C0249l.f1196b);
                c15365.m35029();
                m13788();
                c15365.m35021();
            }
            c15365.m35011(abstractC10004);
            m13776(arrayList2, EnumC16126.NO, EnumC4728.NO);
            c15365.m35029();
            c15365.m35013(AbstractC24083.f76466);
            m13773(C0249l.f1198d, abstractC10006);
            c15365.m35021();
        } else if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
            c15365.m35011(abstractC10006);
            c15365.m35029();
            m13772(C0249l.f1196b);
            c15365.m35029();
            m13788();
            c15365.m35021();
            c15365.m35011(abstractC10004);
            c15365.m35029();
            c15365.m35013(AbstractC24083.f76466);
            m13773(C0249l.f1198d, abstractC10006);
            c15365.m35021();
        } else {
            c15365.m35011(abstractC10004);
            c15365.m35013(AbstractC24083.f76466);
            m13772(C0249l.f1198d);
            c15365.m35021();
        }
        c15365.m35020(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13728(C7789 c7789, Object obj) {
        m13790(c7789);
        m13788();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7534(C8320 c8320, Object obj) {
        m13790((InterfaceC14919) c8320);
        m13780((AbstractC14355) c8320);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13729(C8598 c8598, Object obj) {
        EnumC19998 enumC19998Mo3383;
        m13790((InterfaceC14919) c8598);
        String strM11852 = C5398.m11852((InterfaceC21431) c8598);
        if (c8598.mo3383().m45372()) {
            m13781((InterfaceC14919) c8598.f23105);
            m13709(strM11852);
            return null;
        }
        m13709(strM11852);
        int i = C9166.f24833[c8598.mo3381().ordinal()];
        if (i == 6 || i == 7) {
            AbstractC14355 abstractC14355 = c8598.f23105;
            if (abstractC14355 instanceof InterfaceC24307) {
                enumC19998Mo3383 = abstractC14355.mo3383();
            } else if (abstractC14355 instanceof InterfaceC4191) {
                if (C5398.m11851((InterfaceC4191) abstractC14355, m45216()).startsWith("-")) {
                    enumC19998Mo3383 = EnumC19998.f60709;
                } else {
                    enumC19998Mo3383 = null;
                }
            } else {
                enumC19998Mo3383 = null;
            }
            if (enumC19998Mo3383 != null && !enumC19998Mo3383.m45372() && C5398.m11852((InterfaceC21431) c8598).startsWith(strM11852)) {
                this.f15267.m35022();
            }
        }
        m13781((InterfaceC14919) c8598.f23105);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13730(C8991 c8991, Object obj) {
        m13790(c8991);
        C15365 c15365 = this.f15267;
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        m13772("assert");
        c15365.m35022();
        if (c8991.f24357 != null) {
            c7320 = this.f15268;
        }
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c8991.f24356);
        if (c8991.f24357 != null) {
            c15365.m35019();
            m13772(":");
            c15365.m35022();
            m13781((InterfaceC14919) c8991.f24357);
        }
        c15365.m35021();
        c15365.m35021();
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13731(C9130 c9130, Object obj) {
        m13790(c9130);
        m13772(MessageHandler.Properties.IsSynchronized);
        C15365 c15365 = this.f15267;
        c15365.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        c15365.m35011(this.f15268);
        c15365.m35007();
        m13781((InterfaceC14919) ((InterfaceC20956) c9130.f24711).getExpression());
        c15365.m35021();
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        c15365.m35022();
        m13781(c9130.f24710);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7535(C9661 c9661, Object obj) {
        m13790((InterfaceC14919) c9661);
        m13772(c9661.f26610.toString());
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13732(C10332 c10332, Object obj) {
        m13790((InterfaceC14919) c10332);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c10332.f28614);
        if (m13714()) {
            c15365.m35029();
        } else {
            c15365.m35022();
        }
        m13772("?");
        c15365.m35022();
        m13781((InterfaceC14919) c10332.f28612);
        if (m13714()) {
            c15365.m35029();
        } else {
            c15365.m35022();
        }
        m13772(":");
        c15365.m35022();
        m13781((InterfaceC14919) c10332.f28613);
        c15365.m35021();
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
    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13733(C10471 c10471, Object obj) {
        InterfaceC14919 interfaceC14919;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        AbstractC14355 abstractC14355 = c10471.f28964;
        m13790(c10471);
        ?? SubList = c10471.f28961.f9953;
        List listM36872of = AbstractC16192.m36872of();
        boolean z3 = false;
        boolean z4 = (c10471.f28961.f9954 & 2251799813685248L) == 2251799813685248L;
        if (!c10471.f28962.isEmpty() && !SubList.isEmpty()) {
            int iM11850 = C5398.m11850((InterfaceC14919) c10471.f28962.get(0));
            for (int i = 0; i < SubList.m10289(); i++) {
                if (C5398.m11850((InterfaceC14919) SubList.get(i)) > iM11850) {
                    listM36872of = SubList.subList(i, SubList.m10289());
                    SubList = SubList.subList(0, i);
                    break;
                }
            }
        }
        AbstractC16192<InterfaceC24132> abstractC16192M13694 = m13694(m13771(c10471.f28961, SubList), EnumC17467.VERTICAL, C18189.empty());
        if (c10471.f28962.isEmpty() && c10471.f28966 != null) {
            listM36872of = abstractC16192M13694;
            abstractC16192M13694 = AbstractC16192.m36872of();
        }
        AbstractC14355 abstractC14356 = c10471.f28966;
        C15365 c15365 = this.f15267;
        if (abstractC14356 != null) {
            C11178 c11178M24246 = C10507.m24246(abstractC14356, EnumC21907.YES);
            interfaceC14919 = c11178M24246.f31028;
            arrayDeque = new ArrayDeque(c11178M24246.f31027);
        } else {
            for (InterfaceC24132 interfaceC24132 : abstractC16192M13694) {
                c15365.m35029();
                m13781(interfaceC24132);
                c15365.m35029();
            }
            abstractC16192M13694 = AbstractC16192.m36872of();
            interfaceC14919 = null;
            arrayDeque = null;
        }
        C7320 c7320 = this.f15268;
        c15365.m35011(c7320);
        C9331 c9331 = new C9331();
        C9331 c9332 = new C9331();
        C7320 c7321 = f15263;
        c15365.m35011(c7321);
        if (abstractC16192M13694.isEmpty()) {
            z = false;
        } else {
            EnumC24844 enumC24844 = EnumC24844.NO;
            m13778(abstractC16192M13694, enumC24844, enumC24844);
            z = true;
        }
        if (!c10471.f28962.isEmpty()) {
            if (z) {
                c15365.m35027();
            }
            m13772("<");
            m13792(c10471.f28962, c7320);
            z = true;
        }
        if (interfaceC14919 != null) {
            if (z) {
                c15365.m35022();
            } else {
                z = true;
            }
            c15365.m35011(C3296.m5744(c9332, c7320, c7321));
            c15365.m35011(c7321);
            if (!listM36872of.isEmpty()) {
                EnumC24844 enumC24845 = EnumC24844.NO;
                m13778(listM36872of, enumC24845, enumC24845);
                c15365.m35022();
            }
            m13781(interfaceC14919);
            m13712(arrayDeque);
            c15365.m35021();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            c15365.m35022();
        }
        if (!z2) {
            c15365.m35011(c7321);
        }
        String string = c10471.f28959.toString();
        if (string.equals("<init>")) {
            string = (String) c15365.m35023(0).get();
        }
        m13772(string);
        if (!z4) {
            m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        c15365.m35021();
        c15365.m35021();
        c15365.m35011(C3296.m5744(c9331, c7320, c7321));
        c15365.m35011(C3296.m5744(c9332, c7320, c7321));
        c15365.m35011(c7321);
        if (!z4) {
            if (!c10471.f28963.isEmpty() || c10471.f28967 != null) {
                m13783(C18189.ofNullable(c10471.f28967), c10471.f28963);
            }
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (arrayDeque != null) {
            m13712(arrayDeque);
        }
        if (!c10471.f28957.isEmpty()) {
            c15365.m35027();
            c15365.m35011(c7320);
            C4848<InterfaceC21431> c4848 = c10471.f28957;
            m13772("throws");
            c15365.m35027();
            for (InterfaceC21431 interfaceC21431 : c4848) {
                if (z3) {
                    m13772(",");
                    c15365.m35019();
                }
                m13781(interfaceC21431);
                z3 = true;
            }
            c15365.m35021();
        }
        if (abstractC14355 != null) {
            c15365.m35022();
            m13772("default");
            if (abstractC14355.mo3381() == EnumC5532.NEW_ARRAY) {
                c15365.m35011(this.f15270);
                c15365.m35022();
                m13781(abstractC14355);
                c15365.m35021();
            } else {
                c15365.m35011(c7321);
                c15365.m35027();
                m13781(abstractC14355);
                c15365.m35021();
            }
        }
        c15365.m35021();
        c15365.m35021();
        c15365.m35021();
        C4968 c4968 = c10471.f28958;
        C7320 c7322 = this.f15272;
        if (c4968 == null) {
            m13772(C0249l.f1196b);
        } else {
            c15365.m35022();
            c15365.m35009("{", EnumC17377.REAL, c7322, C18189.m41402of(c7322));
        }
        c15365.m35021();
        C4968 c4969 = c10471.f28958;
        if (c4969 != null) {
            if (c4969.f11316.isEmpty()) {
                c15365.m35013(AbstractC24083.f76466);
            } else {
                c15365.m35011(c7322);
                c15365.m35029();
                c15365.m35013(AbstractC24083.f76467);
                m13774(c10471.f28958.f11316);
                c15365.m35021();
                c15365.m35029();
                c15365.m35013(AbstractC24083.f76466);
                m13791();
            }
            m13773(C0249l.f1198d, c7322);
        }
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13734(C10610 c10610, Object obj) {
        m13790(c10610);
        m13772("while");
        this.f15267.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        m13781((InterfaceC14919) ((InterfaceC20956) c10610.f29370).getExpression());
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        m13703(c10610.f29369, EnumC8751.YES, EnumC4057.YES, EnumC12775.NO);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13735(C11003 c11003, Object obj) {
        m13790((InterfaceC14919) c11003);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m13697(C9268.m21399(c11003.mo3383()), c11003, arrayList, arrayList2);
        EnumC24754 enumC24754 = EnumC24754.UNIFIED;
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        int i = 0;
        m13781((InterfaceC14919) arrayList.get(0));
        int size = arrayList2.size();
        while (i < size) {
            if (m13714()) {
                c15365.m35029();
            } else {
                c15365.m35022();
            }
            c15365.m35025((String) arrayList2.get(i));
            if (m13714()) {
                c15365.m35029();
            } else {
                c15365.m35022();
            }
            i++;
            m13781((InterfaceC14919) arrayList.get(i));
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13736(C11142 c11142, Object obj) {
        C15365 c15365 = this.f15267;
        C7320 c7320 = this.f15268;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c11142.f30891);
        c15365.m35007();
        c15365.m35025("::");
        m13789(c11142.f30893, c7320);
        int[] iArr = C9166.f24832;
        EnumC12909 enumC12909 = c11142.f30886;
        int i = iArr[enumC12909.ordinal()];
        if (i == 1) {
            m13782(c11142.f30890);
        } else if (i == 2) {
            m13772("new");
        } else {
            throw new AssertionError(enumC12909);
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10750(C11281 c11281, Object obj) {
        m13790(c11281);
        m13777(AbstractC16192.m36873of((Object) c11281), EnumC22163.NONE, m13695((InterfaceC24978) c11281.f31435));
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13737(C11674 c11674, Object obj) {
        m13790((InterfaceC14919) c11674);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c11674.f32571);
        c15365.m35022();
        m13709(C5398.m11852((InterfaceC21431) c11674));
        c15365.m35019();
        m13781((InterfaceC14919) c11674.f32570);
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13738(C11813 c11813, Object obj) {
        m13790(c11813);
        m13772("return");
        if (c11813.f32975 != null) {
            this.f15267.m35022();
            m13781((InterfaceC14919) c11813.f32975);
        }
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13739(C12344 c12344, Object obj) {
        m13790(c12344);
        m13781((InterfaceC14919) c12344.f34446);
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13740(C12483 c12483, Object obj) {
        AbstractC12224 abstractC12224Mo19211;
        Cloneable cloneable = c12483.f34992;
        if (cloneable instanceof InterfaceC14724) {
            abstractC12224Mo19211 = ((InterfaceC14724) cloneable).getName();
        } else {
            abstractC12224Mo19211 = ((InterfaceC19614) cloneable).mo19211();
        }
        AbstractC8146 abstractC8146 = f15264.get((Object) abstractC12224Mo19211.toString());
        if (!abstractC8146.isEmpty() && abstractC8146.contains(c12483.f34992.toString())) {
            this.f15266.add(abstractC12224Mo19211);
        }
        m13790(c12483);
        m13772("import");
        C15365 c15365 = this.f15267;
        c15365.m35022();
        if (c12483.f34991) {
            m13772("static");
            c15365.m35022();
        }
        m13713(c12483.f34992);
        m13772(C0249l.f1196b);
        m13788();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13741(C12622 c12622, Object obj) {
        C7320 c7320;
        C7320 c7321;
        String str;
        C7320 c7322;
        C12622 c12623 = c12622;
        m13790(c12622);
        C15365 c15365 = this.f15267;
        C7320 c7323 = f15263;
        c15365.m35011(c7323);
        m13772("try");
        c15365.m35022();
        boolean zIsEmpty = c12623.f35422.isEmpty();
        C7320 c7324 = this.f15268;
        String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
        if (zIsEmpty) {
            c7320 = c7324;
            c7321 = c7323;
            str = MotionUtils.EASING_TYPE_FORMAT_START;
        } else {
            m13772(MotionUtils.EASING_TYPE_FORMAT_START);
            c15365.m35011(c12623.f35422.m10289() > 1 ? c7324 : c7323);
            boolean z = false;
            for (InterfaceC14919 interfaceC14919 : c12623.f35422) {
                if (z) {
                    c15365.m35029();
                }
                if (interfaceC14919 instanceof InterfaceC3819) {
                    InterfaceC3819 interfaceC3819 = (InterfaceC3819) interfaceC14919;
                    m13786(EnumC22163.PARAMETER, m13695((InterfaceC24978) interfaceC3819.mo7439()), C18189.m41402of(interfaceC3819.mo7439()), interfaceC3819.getType(), interfaceC3819.getName(), "=", C18189.ofNullable(interfaceC3819.mo7438()), C18189.empty(), C18189.empty(), C18189.empty());
                } else {
                    m13781(interfaceC14919);
                }
                if (c15365.m35023(0).equals(C18189.m41402of(r8))) {
                    m13772(C0249l.f1196b);
                    c15365.m35022();
                }
                z = true;
                str2 = str2;
                c7323 = c7323;
                c7324 = c7324;
            }
            c7320 = c7324;
            c7321 = c7323;
            str = str2;
            if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
                m13772(C0249l.f1196b);
                c15365.m35022();
            }
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
            c15365.m35021();
            c15365.m35022();
        }
        boolean z2 = (c12623.f35425.isEmpty() && c12623.f35424 == null) ? false : true;
        m13784(c12623.f35421, EnumC8751.m20224(!z2), EnumC4057.YES, EnumC12775.m29332(z2));
        int i = 0;
        while (i < c12623.f35425.m10289()) {
            InterfaceC11373 interfaceC11373 = (InterfaceC11373) c12623.f35425.get(i);
            EnumC12775 enumC12775M29332 = EnumC12775.m29332(i < c12623.f35425.m10289() + (-1) || c12623.f35424 != null);
            m13790(interfaceC11373);
            c15365.m35022();
            m13772("catch");
            c15365.m35022();
            m13772(str);
            C7320 c7325 = c7320;
            c15365.m35011(c7325);
            C11281 c11281Mo4906 = interfaceC11373.mo4906();
            if (c11281Mo4906.f31437.mo3381() == EnumC5532.UNION_TYPE) {
                C7320 c7326 = c7321;
                c15365.m35011(c7326);
                InterfaceC15589 interfaceC15589 = (InterfaceC15589) c11281Mo4906.f31437;
                c15365.m35011(c7326);
                m13790(c11281Mo4906);
                InterfaceC24978 interfaceC24978 = c11281Mo4906.f31435;
                m13778(m13694(m13771(interfaceC24978, (List) interfaceC24978.getAnnotations()), EnumC17467.HORIZONTAL, C18189.empty()), EnumC24844.NO, EnumC24844.YES);
                C4848 c4848Mo35440 = interfaceC15589.mo35440();
                boolean z3 = false;
                for (int i2 = 0; i2 < c4848Mo35440.m10289() - 1; i2++) {
                    if (z3) {
                        c15365.m35019();
                        m13772("|");
                        c15365.m35022();
                    } else {
                        z3 = true;
                    }
                    m13781((InterfaceC14919) c4848Mo35440.get(i2));
                }
                c15365.m35019();
                m13772("|");
                c15365.m35022();
                c7322 = c7326;
                m13786(EnumC22163.NONE, EnumC17467.HORIZONTAL, C18189.empty(), (InterfaceC14919) c4848Mo35440.get(c4848Mo35440.m10289() - 1), c11281Mo4906.f31433, "=", C18189.ofNullable(c11281Mo4906.f31436), C18189.empty(), C18189.empty(), C18189.empty());
                c15365.m35021();
                c15365.m35021();
            } else {
                c7322 = c7321;
                c15365.m35024();
                c15365.m35011(c7322);
                m13781(c11281Mo4906);
                c15365.m35021();
            }
            c15365.m35021();
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
            c15365.m35022();
            m13784(interfaceC11373.mo4907(), EnumC8751.NO, EnumC4057.YES, enumC12775M29332);
            i++;
            c12623 = c12622;
            c7321 = c7322;
            c7320 = c7325;
            str = str;
        }
        C12622 c12624 = c12623;
        if (c12624.f35424 != null) {
            c15365.m35022();
            m13772("finally");
            c15365.m35022();
            m13784(c12624.f35424, EnumC8751.NO, EnumC4057.YES, EnumC12775.NO);
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13742(C13685 c13685, Object obj) {
        m13790(c13685);
        m13772("for");
        C15365 c15365 = this.f15267;
        c15365.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        C7320 c7320 = this.f15268;
        c15365.m35011(c7320);
        int iM10289 = c13685.f38597.m10289();
        C7320 c7321 = f15263;
        boolean z = true;
        c15365.m35011((iM10289 <= 1 || ((InterfaceC16930) c13685.f38597.get(0)).mo3381() != EnumC5532.EXPRESSION_STATEMENT) ? c7321 : c7320);
        if (c13685.f38597.isEmpty()) {
            m13772(C0249l.f1196b);
        } else if (((InterfaceC16930) c13685.f38597.get(0)).mo3381() == EnumC5532.VARIABLE) {
            InterfaceC8069 interfaceC8069M15487 = C6786.m15487(c13685.f38597.iterator());
            m13777(m13692(interfaceC8069M15487, (InterfaceC14919) interfaceC8069M15487.next()), EnumC22163.NONE, EnumC17467.HORIZONTAL);
        } else {
            c15365.m35011(c7321);
            boolean z2 = false;
            for (InterfaceC16930 interfaceC16930 : c13685.f38597) {
                if (z2) {
                    m13772(",");
                    c15365.m35019();
                }
                m13781((InterfaceC14919) ((InterfaceC23442) interfaceC16930).getExpression());
                z2 = true;
            }
            m13772(C0249l.f1196b);
            c15365.m35021();
        }
        c15365.m35021();
        c15365.m35019();
        AbstractC14355 abstractC14355 = c13685.f38598;
        if (abstractC14355 != null) {
            m13781((InterfaceC14919) abstractC14355);
        }
        m13772(C0249l.f1196b);
        if (c13685.f38596.isEmpty()) {
            c15365.m35022();
        } else {
            c15365.m35019();
            if (c13685.f38596.m10289() <= 1) {
                c7320 = c7321;
            }
            c15365.m35011(c7320);
            for (InterfaceC23442 interfaceC23442 : c13685.f38596) {
                if (!z) {
                    m13772(",");
                    c15365.m35027();
                }
                m13781((InterfaceC14919) interfaceC23442.getExpression());
                z = false;
            }
            c15365.m35020(C0249l.f1196b);
            c15365.m35021();
        }
        c15365.m35021();
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        m13703(c13685.f38595, EnumC8751.YES, EnumC4057.YES, EnumC12775.NO);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13743(C13824 c13824, Object obj) {
        m13772("requires");
        C15365 c15365 = this.f15267;
        c15365.m35022();
        while (true) {
            if (c15365.m35023(0).equals(C18189.m41402of("static"))) {
                m13772("static");
                c15365.m35022();
            } else if (c15365.m35023(0).equals(C18189.m41402of("transitive"))) {
                m13772("transitive");
                c15365.m35022();
            } else {
                m13781((InterfaceC14919) c13824.f39063);
                m13772(C0249l.f1196b);
                return null;
            }
        }
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13744(C14494 c14494, Object obj) {
        m13698("provides", "with", c14494.f41389, c14494.f41388);
        return null;
    }

    @Override // p067l.C19913, p067l.C20584
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo13745(InterfaceC14919 interfaceC14919, Object obj) {
        m13781(interfaceC14919);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13746(C15025 c15025, Object obj) {
        m13698("exports", "to", c15025.f42932, c15025.f42933);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13747(C15164 c15164, Object obj) {
        m13790((InterfaceC14919) c15164);
        m13785((InterfaceC21431) c15164.f43267, (List) c15164.f43269);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9103(C15834 c15834, Object obj) {
        m13790((InterfaceC14919) c15834);
        c15834.m35951();
        EnumC15394 enumC15394 = EnumC15394.EXPRESSION;
        C15365 c15365 = this.f15267;
        boolean zEquals = c15365.m35023(0).equals(C18189.m41402of(MotionUtils.EASING_TYPE_FORMAT_START));
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        if (zEquals) {
            m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        boolean z = false;
        for (InterfaceC3819 interfaceC3819 : c15834.f45863) {
            if (z) {
                m13772(",");
                c15365.m35022();
            }
            m13777(AbstractC16192.m36873of((Object) interfaceC3819), EnumC22163.NONE, m13695((InterfaceC24978) interfaceC3819.mo7439()));
            z = true;
        }
        if (zEquals) {
            m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c15365.m35021();
        c15365.m35022();
        c15365.m35025("->");
        if (m13708(c15365.m35018(-1), c15365.m35018(0))) {
            c15365.m35011(this.f15268);
            c15365.m35029();
        } else {
            c15365.m35011(c7320);
            c15365.m35022();
        }
        if (c15834.f45864.mo3381() == EnumC5532.BLOCK) {
            m13784((InterfaceC18748) c15834.f45864, EnumC8751.YES, EnumC4057.NO, EnumC12775.NO);
        } else {
            m13781(c15834.f45864);
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13748(C15973 c15973, Object obj) {
        m13790(c15973);
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13778(c15973.f46260, EnumC24844.NO, EnumC24844.YES);
        m13782(c15973.f46261);
        if (!c15973.f46262.isEmpty()) {
            c15365.m35022();
            m13772("extends");
            C7320 c7321 = this.f15268;
            c15365.m35011(c7321);
            c15365.m35019();
            c15365.m35011(c7321);
            boolean z = false;
            for (InterfaceC14919 interfaceC14919 : c15973.f46262) {
                if (z) {
                    c15365.m35027();
                    m13772(C0233a.f1084p);
                    c15365.m35022();
                }
                m13781(interfaceC14919);
                z = true;
            }
            c15365.m35021();
            c15365.m35021();
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13749(C16366 c16366, Object obj) {
        m13790((InterfaceC14919) c16366);
        m13780((AbstractC14355) c16366);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13750(C16505 c16505, Object obj) {
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        m13781((InterfaceC14919) c16505.f48507);
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13751(C17036 c17036, Object obj) {
        m13790(c17036);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13772("continue");
        AbstractC12224 abstractC12224 = c17036.f50376;
        if (abstractC12224 != null) {
            c15365.m35022();
            m13782(abstractC12224);
        }
        m13772(C0249l.f1196b);
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13752(C17175 c17175, Object obj) {
        m13790((InterfaceC14919) c17175);
        if (((AbstractC12224) C5398.m11853((InterfaceC18943) c17175)).mo28204("log")) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Object expression = c17175;
            while (expression instanceof InterfaceC18943) {
                InterfaceC18943 interfaceC18943 = (InterfaceC18943) expression;
                arrayDeque.addFirst(interfaceC18943);
                if (f15265.contains(C5398.m11853(interfaceC18943).toString())) {
                    InterfaceC21431 interfaceC21431Mo38909 = interfaceC18943.mo38909();
                    expression = interfaceC21431Mo38909 instanceof InterfaceC19614 ? ((InterfaceC19614) interfaceC21431Mo38909).getExpression() : null;
                }
            }
            if (expression instanceof InterfaceC14724) {
                arrayDeque.addFirst(expression);
                m13702((List) AbstractC16192.copyOf((Collection) arrayDeque), false, (AbstractCollection) AbstractC16192.m36873of((Object) Integer.valueOf(arrayDeque.size() - 1)), EnumC24754.INDEPENDENT);
                return null;
            }
        }
        m13780((AbstractC14355) c17175);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13753(C17314 c17314, Object obj) {
        m13790((InterfaceC14919) c17314);
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13772("?");
        if (c17314.f51641 != null) {
            c15365.m35011(this.f15268);
            c15365.m35022();
            m13772(c17314.mo3381() == EnumC5532.EXTENDS_WILDCARD ? "extends" : "super");
            c15365.m35019();
            m13781(c17314.f51641);
            c15365.m35021();
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13754(C17707 c17707, Object obj) {
        m13790(c17707);
        C11281 c11281 = c17707.f52887;
        m13786(EnumC22163.PARAMETER, EnumC17467.HORIZONTAL, C18189.m41402of(c11281.f31435), c11281.f31437, c11281.f31433, "", C18189.empty(), C18189.empty(), C18189.empty(), C18189.empty());
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13755(C17846 c17846, Object obj) {
        m13790((InterfaceC14919) c17846);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c17846.f53242);
        c15365.m35019();
        c15365.m35011(f15263);
        m13772("instanceof");
        c15365.m35019();
        if (c17846.m40523() != null) {
            m13781(c17846.m40523());
        } else {
            m13781(c17846.getType());
        }
        c15365.m35021();
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13756(C17985 c17985, Object obj) {
        m13790((InterfaceC14919) c17985);
        if (c17985.f53721.isEmpty()) {
            m13781((InterfaceC14919) c17985.f53722);
            m13772("<");
            m13772(">");
            return null;
        }
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c17985.f53722);
        m13772("<");
        c15365.m35007();
        c15365.m35011(f15263);
        boolean z = false;
        for (InterfaceC14919 interfaceC14919 : c17985.f53721) {
            if (z) {
                m13772(",");
                c15365.m35019();
            }
            m13781(interfaceC14919);
            z = true;
        }
        c15365.m35021();
        c15365.m35021();
        m13772(">");
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13757(C18656 c18656, Object obj) {
        m13790((InterfaceC14919) c18656);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        boolean z = false;
        for (InterfaceC14919 interfaceC14919 : c18656.f55708) {
            if (z) {
                c15365.m35027();
                m13772(C0233a.f1084p);
                c15365.m35022();
            }
            m13781(interfaceC14919);
            z = true;
        }
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13758(C19049 c19049, Object obj) {
        m13790((InterfaceC14919) c19049);
        int iM10289 = c19049.f56843.m10289();
        C7320 c7320 = this.f15268;
        C7320 c7321 = f15263;
        C15365 c15365 = this.f15267;
        if (iM10289 == 1) {
            InterfaceC14919 interfaceC14919 = (InterfaceC21431) C10810.m24921((Collection) c19049.f56843);
            if (interfaceC14919.mo3381() != EnumC5532.ASSIGNMENT) {
                boolean z = interfaceC14919.mo3381() == EnumC5532.NEW_ARRAY;
                if (z) {
                    c7320 = c7321;
                }
                c15365.m35011(c7320);
                m13772("@");
                m13781(c19049.f56840);
                m13772(MotionUtils.EASING_TYPE_FORMAT_START);
                if (!z) {
                    c15365.m35007();
                }
                m13781(interfaceC14919);
                c15365.m35021();
                m13772(MotionUtils.EASING_TYPE_FORMAT_END);
                return null;
            }
        }
        c15365.m35011(c7321);
        m13772("@");
        m13781(c19049.f56840);
        if (c19049.f56843.isEmpty()) {
            if (c15365.m35023(0).equals(C18189.m41402of(MotionUtils.EASING_TYPE_FORMAT_START))) {
                m13772(MotionUtils.EASING_TYPE_FORMAT_START);
                m13772(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            c15365.m35021();
            return null;
        }
        c15365.m35011(c7320);
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        c15365.m35007();
        boolean zM24923 = C10810.m24923(c19049.f56843, new C13860());
        boolean z2 = false;
        for (InterfaceC14919 interfaceC149110 : c19049.f56843) {
            if (z2) {
                m13772(",");
                if (zM24923) {
                    c15365.m35029();
                } else {
                    c15365.m35019();
                }
            }
            if (interfaceC149110 instanceof InterfaceC12714) {
                InterfaceC12714 interfaceC12714 = (InterfaceC12714) interfaceC149110;
                boolean z3 = interfaceC12714.getExpression().mo3381() == EnumC5532.NEW_ARRAY;
                m13790(interfaceC12714);
                c15365.m35011(z3 ? c7321 : c7320);
                m13781(interfaceC12714.mo29227());
                c15365.m35022();
                m13772("=");
                if (z3) {
                    c15365.m35022();
                } else {
                    c15365.m35019();
                }
                m13781(interfaceC12714.getExpression());
                c15365.m35021();
            } else {
                m13781(interfaceC149110);
            }
            z2 = true;
        }
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        c15365.m35021();
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13759(C19188 c19188, Object obj) {
        m13790(c19188);
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13782(c19188.f57352);
        m13772(":");
        c15365.m35029();
        c15365.m35021();
        m13781(c19188.f57351);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13760(C19327 c19327, Object obj) {
        m13790((InterfaceC14919) c19327);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        m13781(c19327.f57709);
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        c15365.m35022();
        m13781((InterfaceC14919) c19327.f57710);
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13761(C19720 c19720, Object obj) {
        m13790((InterfaceC14919) c19720);
        InterfaceC14919 interfaceC14919 = c19720.f59996;
        boolean z = interfaceC14919 instanceof InterfaceC19614;
        C15365 c15365 = this.f15267;
        if (z) {
            InterfaceC19614 interfaceC19614 = (InterfaceC19614) interfaceC14919;
            m13781((InterfaceC14919) interfaceC19614.getExpression());
            m13772(".");
            C4848 c4848 = c19720.f59995;
            EnumC24844 enumC24844 = EnumC24844.NO;
            m13778(c4848, enumC24844, enumC24844);
            c15365.m35027();
            m13782(interfaceC19614.mo19211());
            return null;
        }
        if (interfaceC14919 instanceof InterfaceC9380) {
            m13711((AbstractC14355) c19720);
            return null;
        }
        C4848 c4849 = c19720.f59995;
        EnumC24844 enumC24845 = EnumC24844.NO;
        m13778(c4849, enumC24845, enumC24845);
        c15365.m35027();
        m13781(interfaceC14919);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13762(C19859 c19859, Object obj) {
        AbstractC14355 abstractC14355 = c19859.f60358;
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        if (abstractC14355 != null) {
            c15365.m35011(c7320);
            m13772("new");
            c15365.m35022();
            C11178 c11178M24246 = C10507.m24246(c19859.f60358, EnumC21907.YES);
            InterfaceC14919 interfaceC14919 = c11178M24246.f31028;
            ArrayDeque arrayDeque = new ArrayDeque(c19859.f60360);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(AbstractC16192.copyOf((Collection) c19859.f60357));
            arrayDeque2.addAll(c19859.f60361);
            arrayDeque2.addAll(c11178M24246.f31027);
            m13781(interfaceC14919);
            c15365.m35011(f15263);
            m13701(arrayDeque, (Deque) arrayDeque2);
            c15365.m35021();
            c15365.m35021();
        }
        C4848 c4848 = c19859.f60359;
        if (c4848 != null) {
            if (c4848.isEmpty()) {
                AbstractC10002 abstractC10002 = this.f15272;
                m13779(abstractC10002);
                if (c15365.m35023(0).equals(C18189.m41402of(","))) {
                    m13772(",");
                }
                m13773(C0249l.f1198d, abstractC10002);
                return null;
            }
            c15365.m35011(c7320);
            m13772("{");
            int iM10289 = c4848.m10289();
            boolean z = true;
            for (int i = 0; i < iM10289; i++) {
                InterfaceC14919 interfaceC149110 = (InterfaceC21431) c4848.get(i);
                if (m13714()) {
                    c15365.m35029();
                    z = false;
                }
                m13781(interfaceC149110);
                if (((String) c15365.m35023(0).orElseThrow()).equals(",")) {
                    if (m13714()) {
                        c15365.m35029();
                        z = false;
                    }
                    m13772(",");
                    if (i != iM10289 - 1) {
                        c15365.m35022();
                    }
                }
            }
            c15365.m35021();
            if (!((z && m13714()) ? false : z)) {
                c15365.m35029();
            }
            m13772(C0249l.f1198d);
        }
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13763(C20391 c20391, Object obj) {
        EnumC8690 enumC8690 = c20391.f63046;
        InterfaceC14919 interfaceC14919 = c20391.f63042;
        m13790(c20391);
        m13791();
        C15365 c15365 = this.f15267;
        c15365.m35029();
        C4848<InterfaceC14919> c4848 = c20391.f63044;
        boolean z = false;
        boolean z2 = c4848.m10289() == 1 && ((InterfaceC24783) C10810.m24921((Collection) c4848)).mo3381().name().equals("DEFAULT_CASE_LABEL");
        boolean zEquals = enumC8690.equals(EnumC8690.RULE);
        C7320 c7320 = f15263;
        c15365.m35011(zEquals ? this.f15268 : c7320);
        if (z2) {
            m13773("default", c7320);
        } else {
            m13773("case", c7320);
            c15365.m35011(c7320);
            c15365.m35022();
            for (InterfaceC14919 interfaceC149110 : c4848) {
                if (z) {
                    m13772(",");
                    c15365.m35019();
                }
                m13781(interfaceC149110);
                z = true;
            }
            c15365.m35021();
        }
        int i = C9166.f24831[enumC8690.ordinal()];
        if (i == 1) {
            m13772(":");
            c15365.m35011(this.f15272);
            m13774(c20391.m46045());
            c15365.m35021();
            c15365.m35021();
            return null;
        }
        if (i != 2) {
            return null;
        }
        c15365.m35022();
        m13772("-");
        m13772(">");
        if (interfaceC14919.mo3381() == EnumC5532.BLOCK) {
            c15365.m35021();
            c15365.m35022();
            m13784((InterfaceC18748) interfaceC14919, EnumC8751.YES, EnumC4057.NO, EnumC12775.NO);
        } else {
            c15365.m35019();
            m13781(interfaceC14919);
            c15365.m35021();
        }
        c15365.m35020(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9104(C20530 c20530, Object obj) {
        m13790((InterfaceC14919) c20530);
        C15365 c15365 = this.f15267;
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        AbstractC14355 abstractC14355 = c20530.f63432;
        if (abstractC14355 != null) {
            m13781((InterfaceC14919) abstractC14355);
            c15365.m35007();
            m13772(".");
        }
        m13772("new");
        c15365.m35022();
        m13789(c20530.f63431, this.f15268);
        C7650 c7650 = c20530.f63428;
        if (c7650 != null) {
            C4436 c4436 = c7650.f20022;
            m13778(m13694(m13771((InterfaceC24978) c4436, (List) c4436.getAnnotations()), EnumC17467.HORIZONTAL, C18189.empty()), EnumC24844.NO, EnumC24844.YES);
        }
        m13781((InterfaceC14919) c20530.f63429);
        m13775((List) c20530.f63430, (AbstractC10002) c7320);
        c15365.m35021();
        C7650 c7651 = c20530.f63428;
        if (c7651 != null) {
            m13776(c7651.f20020, EnumC16126.YES, EnumC4728.YES);
        }
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13764(C21732 c21732, Object obj) {
        m13790(c21732);
        m13772("do");
        m13703(c21732.f68446, EnumC8751.YES, EnumC4057.YES, EnumC12775.YES);
        EnumC5532 enumC5532Mo3381 = c21732.f68446.mo3381();
        EnumC5532 enumC5532 = EnumC5532.BLOCK;
        C15365 c15365 = this.f15267;
        if (enumC5532Mo3381 == enumC5532) {
            c15365.m35022();
        } else {
            c15365.m35019();
        }
        m13772("while");
        c15365.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        m13781((InterfaceC14919) ((InterfaceC20956) c21732.f68447).getExpression());
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13765(C22010 c22010, Object obj) {
        m13772("uses");
        this.f15267.m35022();
        m13781((InterfaceC14919) c22010.f69239);
        m13772(C0249l.f1196b);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13766(C22403 c22403, Object obj) {
        m13790((InterfaceC14919) c22403);
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781((InterfaceC14919) c22403.f70670);
        c15365.m35022();
        m13709(C5398.m11852((InterfaceC21431) c22403));
        c15365.m35022();
        m13781((InterfaceC14919) c22403.f70671);
        c15365.m35021();
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13767(C23882 c23882, Object obj) {
        m13790(c23882);
        m13785((InterfaceC21431) c23882.f75829, (List) c23882.f75828);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13768(C24552 c24552, Object obj) {
        m13790((InterfaceC14919) c24552);
        String strM11851 = C5398.m11851(c24552, m45216());
        if (!strM11851.startsWith("\"\"\"")) {
            if (strM11851.startsWith("-")) {
                m13772("-");
                strM11851 = strM11851.substring(1).trim();
            }
            m13772(strM11851);
            return null;
        }
        String strM33619 = C14695.m33619(strM11851);
        ArrayList arrayListM30062 = C13144.m30062(strM11851);
        String strM30063 = C13144.m30063((String) C7480.stream(arrayListM30062).skip(1L).collect(C24205.joining(strM33619)));
        String str = (String) C10810.m24926(arrayListM30062);
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        int length2 = str.substring(0, length).length();
        String str2 = (String) C22191.m50002(C7480.stream(C13144.m30062(strM30063))).orElseThrow();
        int length3 = str2.length();
        while (length3 > 0) {
            int iCodePointBefore2 = Character.codePointBefore(str2, length3);
            if (!Character.isWhitespace(iCodePointBefore2)) {
                break;
            }
            length3 -= Character.charCount(iCodePointBefore2);
        }
        if (length2 == str2.substring(0, length3).length()) {
            int i = this.f15271;
            C7320 c7320M16898 = C7320.m16898(Integer.MIN_VALUE / i, i);
            C15365 c15365 = this.f15267;
            c15365.getClass();
            c15365.m35014(EnumC24754.UNIFIED, "", c7320M16898);
        }
        m13772(strM11851);
        return null;
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13769(C24691 c24691, Object obj) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override // p067l.C20584, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13770(C25084 c25084, Object obj) {
        m13790((InterfaceC14919) c25084);
        m13711((AbstractC14355) c25084);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C13511 c13511 = new C13511();
        AbstractC6767 abstractC6767ListIterator = AbstractC16192.m36875of((Object) "org.jspecify.annotations.NonNull", (Object) "org.jspecify.annotations.Nullable", (Object) "org.jspecify.annotations.Nullable", (Object) "org.checkerframework.checker.nullness.qual.NonNull", (Object) "org.checkerframework.checker.nullness.qual.Nullable").listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            String str = (String) abstractC6767ListIterator.next();
            c13511.m30667(str.substring(str.lastIndexOf(46) + 1), str);
        }
        f15264 = c13511.m30666();
        f15263 = C7320.f19161;
        f15265 = AbstractC8146.m18919("at", "atConfig", "atDebug", "atFine", "atFiner", "atFinest", "atInfo", "atMostEvery", "atSevere", "atWarning", "every", "log", "logVarargs", "perUnique", "withCause", "withStackTrace");
        Pattern.compile("%|\\{[0-9]\\}");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13701(ArrayDeque arrayDeque, Deque deque) {
        while (true) {
            boolean z = false;
            while (true) {
                C15365 c15365 = this.f15267;
                if (c15365.m35023(0).isPresent()) {
                    String str = (String) c15365.m35023(0).get();
                    str.getClass();
                    switch (str) {
                        case ".":
                            if (((String) c15365.m35023(0).get()).equals(".") && ((String) c15365.m35023(1).get()).equals(".")) {
                                if (z) {
                                    c15365.m35027();
                                } else {
                                    c15365.m35024();
                                }
                                c15365.m35025("...");
                                break;
                            }
                            return;
                        case "@":
                            if (!deque.isEmpty()) {
                                List list = (List) deque.removeFirst();
                                if (!list.isEmpty()) {
                                    c15365.m35027();
                                    EnumC24844 enumC24844 = EnumC24844.NO;
                                    m13778(list, enumC24844, enumC24844);
                                    z = true;
                                }
                                break;
                            } else {
                                return;
                            }
                            break;
                        case "[":
                            if (z) {
                                c15365.m35027();
                            }
                            m13772("[");
                            if (!((String) c15365.m35023(0).get()).equals("]")) {
                                m13781((InterfaceC14919) arrayDeque.removeFirst());
                            }
                            m13772("]");
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

    /* JADX INFO: renamed from: ۧ */
    public final void m13788() {
        C15365 c15365 = this.f15267;
        if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
            while (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
                c15365.m35029();
                m13791();
                m13772(C0249l.f1196b);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13707(AbstractC16192 abstractC16192) {
        if (abstractC16192 != null) {
            AbstractC6767 abstractC6767ListIterator = abstractC16192.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                String strMo37859 = ((InterfaceC16706) abstractC6767ListIterator.next()).mo37859();
                for (int i = 0; i < strMo37859.length(); i++) {
                    char cCharAt = strMo37859.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\n') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13791() {
        if (((Boolean) this.f15269.peekLast()).booleanValue()) {
            return;
        }
        this.f15267.m35016();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13781(InterfaceC14919 interfaceC14919) {
        boolean z = interfaceC14919 instanceof InterfaceC21431;
        ArrayDeque arrayDeque = this.f15269;
        arrayDeque.addLast(Boolean.valueOf(z || ((Boolean) arrayDeque.peekLast()).booleanValue()));
        C15365 c15365 = this.f15267;
        int iM35030 = c15365.m35030();
        try {
            try {
                super.mo13745(interfaceC14919, (Object) null);
                arrayDeque.removeLast();
                c15365.m35008(iM35030);
            } catch (Throwable th) {
                arrayDeque.removeLast();
                throw th;
            }
        } catch (C2625 e) {
            throw e;
        } catch (Throwable th2) {
            int i = C13080.f36770;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            throw new C2625(c15365.m35006(stringWriter.toString()));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m13711(AbstractC14355 abstractC14355) {
        C11178 c11178M24246 = C10507.m24246(abstractC14355, EnumC21907.YES);
        C7320 c7320 = this.f15268;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        m13781(c11178M24246.f31028);
        ArrayDeque arrayDeque = new ArrayDeque(c11178M24246.f31027);
        m13712(arrayDeque);
        if (!arrayDeque.isEmpty()) {
            throw new C19114();
        }
        c15365.m35021();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13777(List list, EnumC22163 enumC22163, EnumC17467 enumC17467) {
        boolean z = false;
        if (list.size() == 1) {
            InterfaceC3819 interfaceC3819 = (InterfaceC3819) list.get(0);
            m13786(enumC22163, enumC17467, C18189.m41402of(interfaceC3819.mo7439()), interfaceC3819.getType(), interfaceC3819.getName(), "=", C18189.ofNullable(interfaceC3819.mo7438()), C18189.m41402of(C0249l.f1196b), C18189.empty(), C18189.ofNullable(m13693(false, 0, interfaceC3819.getType())));
            return;
        }
        C15365 c15365 = this.f15267;
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        C4436 c4436Mo7439 = ((InterfaceC3819) list.get(0)).mo7439();
        InterfaceC14919 type = ((InterfaceC3819) list.get(0)).getType();
        m13778(m13694(m13771((InterfaceC24978) c4436Mo7439, (List) c4436Mo7439.getAnnotations()), enumC17467, C18189.empty()), EnumC24844.NO, EnumC24844.YES);
        C7320 c7321 = this.f15268;
        c15365.m35011(c7321);
        c15365.m35011(c7320);
        C11178 c11178M24246 = C10507.m24246(type, EnumC21907.YES);
        ArrayDeque arrayDeque = new ArrayDeque(c11178M24246.f31027);
        m13781(c11178M24246.f31028);
        int size = arrayDeque.size();
        m13712(arrayDeque);
        int size2 = size - arrayDeque.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC3819 interfaceC38110 = (InterfaceC3819) it.next();
            if (z) {
                m13772(",");
            }
            ArrayDeque arrayDeque2 = new ArrayDeque(m13693(z, size2, interfaceC38110.getType()).f31027);
            c15365.m35019();
            c15365.m35011(c7320);
            m13712(arrayDeque2);
            m13782(interfaceC38110.getName());
            m13712(arrayDeque2);
            AbstractC14355 abstractC14355Mo7438 = interfaceC38110.mo7438();
            if (abstractC14355Mo7438 != null) {
                c15365.m35022();
                m13772("=");
                c15365.m35011(c7321);
                c15365.m35019();
                m13781((InterfaceC14919) abstractC14355Mo7438);
                c15365.m35021();
            }
            c15365.m35021();
            if (!z) {
                c15365.m35021();
            }
            z = true;
        }
        c15365.m35021();
        m13772(C0249l.f1196b);
        c15365.m35021();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11178 m13693(boolean z, int i, InterfaceC14919 interfaceC14919) {
        if (interfaceC14919 == null) {
            return null;
        }
        if (!z) {
            return C10507.m24246(interfaceC14919, EnumC21907.YES);
        }
        AbstractC16192 abstractC16192SubList = C10507.m24246(interfaceC14919, EnumC21907.NO).f31027;
        if (i > 0) {
            abstractC16192SubList = abstractC16192SubList.subList(0, abstractC16192SubList.size() - i);
        }
        return new C11178(null, abstractC16192SubList);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m13709(String str) {
        for (int i = 0; i < str.length(); i++) {
            m13772(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13782(InterfaceC16446 interfaceC16446) {
        m13772(interfaceC16446.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13785(InterfaceC21431 interfaceC21431, List list) {
        m13772("switch");
        C15365 c15365 = this.f15267;
        c15365.m35022();
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        m13781((InterfaceC14919) ((InterfaceC20956) interfaceC21431).getExpression());
        m13772(MotionUtils.EASING_TYPE_FORMAT_END);
        c15365.m35022();
        C7320 c7320 = this.f15272;
        m13779(c7320);
        c15365.m35013(AbstractC24083.f76466);
        c15365.m35011(c7320);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC22102 interfaceC22102 = (InterfaceC22102) it.next();
            if (z) {
                c15365.m35013(AbstractC24083.f76467);
            }
            m13781(interfaceC22102);
            z = true;
        }
        c15365.m35021();
        c15365.m35029();
        c15365.m35013(AbstractC24083.f76466);
        m13773(C0249l.f1198d, this.f15268);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13778(List list, EnumC24844 enumC24844, EnumC24844 enumC24845) {
        if (list.isEmpty()) {
            return;
        }
        boolean zM54546 = enumC24844.m54546();
        C15365 c15365 = this.f15267;
        if (zM54546) {
            c15365.m35027();
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC24132 interfaceC24132 = (InterfaceC24132) it.next();
            if (z) {
                c15365.m35027();
            }
            m13781((InterfaceC14919) interfaceC24132);
            z = true;
        }
        if (enumC24845.m54546()) {
            c15365.m35027();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13784(InterfaceC18748 interfaceC18748, EnumC8751 enumC8751, EnumC4057 enumC4057, EnumC12775 enumC12775) {
        m13790(interfaceC18748);
        boolean zMo10528 = interfaceC18748.mo10528();
        C15365 c15365 = this.f15267;
        if (zMo10528) {
            m13772("static");
            c15365.m35022();
        }
        boolean zM20226 = enumC8751.m20226();
        C7320 c7320 = this.f15272;
        if (zM20226 && interfaceC18748.mo10529().isEmpty()) {
            if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
                m13772(C0249l.f1196b);
                return;
            }
            m13779(c7320);
            c15365.m35013(AbstractC24083.f76466);
            m13773(C0249l.f1198d, c7320);
            return;
        }
        c15365.m35011(f15263);
        c15365.m35011(c7320);
        m13779(c7320);
        if (enumC4057 == EnumC4057.NO) {
            c15365.m35013(AbstractC24083.f76466);
        } else {
            c15365.m35013(AbstractC24083.f76467);
        }
        m13774(interfaceC18748.mo10529());
        c15365.m35021();
        c15365.m35029();
        c15365.m35021();
        if (enumC12775 == EnumC12775.NO) {
            c15365.m35013(AbstractC24083.f76466);
        } else {
            c15365.m35013(AbstractC24083.f76467);
        }
        m13791();
        m13773(C0249l.f1198d, c7320);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13703(InterfaceC16930 interfaceC16930, EnumC8751 enumC8751, EnumC4057 enumC4057, EnumC12775 enumC12775) {
        m13790(interfaceC16930);
        int i = C9166.f24833[interfaceC16930.mo3381().ordinal()];
        C15365 c15365 = this.f15267;
        if (i == 8) {
            c15365.m35022();
            m13784((InterfaceC18748) interfaceC16930, enumC8751, enumC4057, enumC12775);
            return;
        }
        c15365.m35011(this.f15272);
        if (m13714()) {
            c15365.m35029();
        } else {
            c15365.m35019();
        }
        m13781(interfaceC16930);
        c15365.m35021();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13774(List list) {
        EnumC17467 enumC17467;
        InterfaceC8069 interfaceC8069M15487 = C6786.m15487(list.iterator());
        m13788();
        boolean z = false;
        while (interfaceC8069M15487.hasNext()) {
            InterfaceC14919 interfaceC14919 = (InterfaceC16930) interfaceC8069M15487.next();
            C15365 c15365 = this.f15267;
            c15365.m35029();
            if (z) {
                c15365.m35013(AbstractC24083.f76467);
            }
            m13791();
            ArrayList arrayListM13692 = m13692(interfaceC8069M15487, interfaceC14919);
            if (!arrayListM13692.isEmpty()) {
                EnumC22163 enumC22163 = EnumC22163.NONE;
                C4436 c4436Mo7439 = ((InterfaceC3819) arrayListM13692.get(0)).mo7439();
                Iterator it = c4436Mo7439.f9953.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((InterfaceC24132) it.next()).mo43285().isEmpty()) {
                        i++;
                    }
                }
                if (i <= 1 && i == c4436Mo7439.f9953.m10289()) {
                    enumC17467 = EnumC17467.HORIZONTAL;
                } else {
                    enumC17467 = EnumC17467.VERTICAL;
                }
                m13777(arrayListM13692, enumC22163, enumC17467);
            } else {
                m13781(interfaceC14919);
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC16192 m13694(AbstractC10763 abstractC10763, EnumC17467 enumC17467, C18189 c18189) {
        AbstractC16192 abstractC16192M36873of;
        AbstractC16192 abstractC16192M36873of2;
        if (abstractC10763.mo24796().isEmpty()) {
            return abstractC10763.mo24798();
        }
        ArrayDeque arrayDeque = new ArrayDeque(abstractC10763.mo24796());
        C15365 c15365 = this.f15267;
        C7320 c7320 = f15263;
        c15365.m35011(c7320);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!arrayDeque.isEmpty() && !((AbstractC18809) arrayDeque.peekFirst()).mo28851().equals(EnumC19480.MODIFIER)) {
            if (z2) {
                if (!enumC17467.m39826()) {
                    abstractC16192M36873of2 = AbstractC16192.m36873of((Object) C16036.m36479(EnumC24754.UNIFIED, " ", c7320, c18189));
                } else {
                    abstractC16192M36873of2 = AbstractC16192.m36873of((Object) C16036.m36479(EnumC24754.FORCED, "", C7320.f19161, c18189));
                }
                c15365.m35010(abstractC16192M36873of2);
            }
            m13700(arrayDeque);
            z2 = true;
            z3 = true;
        }
        c15365.m35021();
        if (!enumC17467.m39826()) {
            abstractC16192M36873of = AbstractC16192.m36873of((Object) C16036.m36479(EnumC24754.UNIFIED, " ", c7320, c18189));
        } else {
            abstractC16192M36873of = AbstractC16192.m36873of((Object) C16036.m36479(EnumC24754.FORCED, "", C7320.f19161, c18189));
        }
        if (arrayDeque.isEmpty()) {
            c15365.m35010(abstractC16192M36873of);
            return abstractC10763.mo24798();
        }
        if (z3) {
            c15365.m35010(abstractC16192M36873of);
        }
        c15365.m35011(c7320);
        while (!arrayDeque.isEmpty()) {
            if (z) {
                c15365.m35022();
            }
            m13700(arrayDeque);
            z = true;
        }
        c15365.m35021();
        c15365.m35022();
        return abstractC10763.mo24798();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final C24588 m13771(InterfaceC24978 interfaceC24978, List list) {
        boolean zIsEmpty = list.isEmpty();
        int i = 1;
        C15365 c15365 = this.f15267;
        if (zIsEmpty) {
            String str = (String) c15365.m35023(0).get();
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
                        b = C0698cb.f2569k;
                    }
                    break;
                case 1794694483:
                    if (str.equals("strictfp")) {
                        b = C0698cb.f2570l;
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
                    return new C24588(AbstractC16192.m36872of(), AbstractC16192.m36872of());
            }
        }
        C23531 c23531M52316 = C23531.m52316();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC14919 interfaceC14919 = (InterfaceC24132) it.next();
            Integer numValueOf = Integer.valueOf(C5398.m11850(interfaceC14919));
            AbstractC7257 abstractC7257 = (AbstractC7257) interfaceC14919;
            AbstractC13884 abstractC13884 = ((C3626) m45216().m13114()).f7514;
            abstractC7257.getClass();
            c23531M52316.mo6046(C15444.m35182(numValueOf, Integer.valueOf(C9268.m21397(abstractC7257, abstractC13884))));
        }
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) C22191.m50004(C7480.stream(c15365.m35005(C5398.m11850(interfaceC24978), new C11849(c23531M52316))).filter(new C17050(i, c23531M52316)).map(new C7825()), C7480.stream(list).map(new C13190())).sorted().collect(C24205.toList()));
        C4123 c4123 = new C4123();
        for (int size = abstractC16192CopyOf.size() - 1; size >= 0; size--) {
            AbstractC18809 abstractC18809 = (AbstractC18809) abstractC16192CopyOf.get(size);
            if (abstractC18809.mo28851().equals(EnumC19480.ANNOTATION)) {
                Cloneable cloneableMo43286 = abstractC18809.mo28850().mo43286();
                if (!(cloneableMo43286 instanceof InterfaceC14724) ? false : this.f15266.contains(((InterfaceC14724) cloneableMo43286).getName())) {
                    c4123.m18184(abstractC18809.mo28850());
                }
            }
            return new C24588(abstractC16192CopyOf.subList(0, size + 1), c4123.m8329().mo36886());
        }
        return new C24588(abstractC16192CopyOf.subList(0, size + 1), c4123.m8329().mo36886());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13700(ArrayDeque arrayDeque) {
        AbstractC18809 abstractC18809 = (AbstractC18809) arrayDeque.removeFirst();
        int iOrdinal = abstractC18809.mo28851().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            m13781((InterfaceC14919) abstractC18809.mo28850());
        } else {
            m13772(abstractC18809.mo40687().getText());
            if (abstractC18809.mo40687().getText().equals("non")) {
                m13772(((AbstractC18809) arrayDeque.removeFirst()).mo40687().getText());
                m13772(((AbstractC18809) arrayDeque.removeFirst()).mo40687().getText());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m13697(int i, InterfaceC21431 interfaceC21431, ArrayList arrayList, ArrayList arrayList2) {
        if (interfaceC21431 instanceof InterfaceC18077) {
            InterfaceC18077 interfaceC18077 = (InterfaceC18077) interfaceC21431;
            if (C9268.m21399(((AbstractC7257) interfaceC18077).mo3383()) == i) {
                m13697(i, interfaceC18077.mo25391(), arrayList, arrayList2);
                arrayList2.add(C5398.m11852(interfaceC21431));
                m13697(i, interfaceC18077.mo25390(), arrayList, arrayList2);
                return;
            }
            arrayList.add(interfaceC21431);
            return;
        }
        arrayList.add(interfaceC21431);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m13783(p067l.C18189 r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C6069.m13783(l.ܽ۫ᩴ, java.util.List):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13787(InterfaceC22297 interfaceC22297) {
        C15365 c15365;
        AbstractC24083 abstractC24083;
        Iterator it = interfaceC22297.getAnnotations().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c15365 = this.f15267;
            if (!zHasNext) {
                break;
            }
            m13781((InterfaceC14919) it.next());
            c15365.m35029();
        }
        if (interfaceC22297.mo12958() == EnumC8885.OPEN) {
            m13772("open");
            c15365.m35022();
        }
        m13772(C0655am.f2344e);
        c15365.m35022();
        m13781((InterfaceC14919) interfaceC22297.getName());
        c15365.m35022();
        boolean zIsEmpty = interfaceC22297.mo12959().isEmpty();
        C7320 c7320 = this.f15272;
        if (zIsEmpty) {
            m13779(c7320);
            c15365.m35013(AbstractC24083.f76466);
            m13773(C0249l.f1198d, c7320);
            return;
        }
        c15365.m35011(c7320);
        m13772("{");
        c15365.m35029();
        C18189 c18189Empty = C18189.empty();
        for (InterfaceC2654 interfaceC2654 : interfaceC22297.mo12959()) {
            m13791();
            if (((Boolean) c18189Empty.map(new C6484(0, interfaceC2654)).orElse(Boolean.FALSE)).booleanValue()) {
                abstractC24083 = AbstractC24083.f76468;
            } else {
                abstractC24083 = AbstractC24083.f76466;
            }
            c15365.m35013(abstractC24083);
            c15365.m35029();
            m13781(interfaceC2654);
            c18189Empty = C18189.m41402of(interfaceC2654.mo3381());
        }
        c15365.m35021();
        c15365.m35029();
        m13772(C0249l.f1198d);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13698(String str, String str2, InterfaceC21431 interfaceC21431, List list) {
        m13772(str);
        C15365 c15365 = this.f15267;
        c15365.m35022();
        m13781((InterfaceC14919) interfaceC21431);
        if (list != null) {
            c15365.m35011(this.f15268);
            c15365.m35022();
            m13772(str2);
            c15365.m35029();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC21431 interfaceC21432 = (InterfaceC21431) it.next();
                if (z) {
                    m13772(",");
                    c15365.m35029();
                }
                m13781((InterfaceC14919) interfaceC21432);
                z = true;
            }
            m13772(C0249l.f1196b);
            c15365.m35021();
            return;
        }
        m13772(C0249l.f1196b);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m13713(InterfaceC14919 interfaceC14919) {
        ArrayDeque<InterfaceC16446> arrayDeque = new ArrayDeque();
        while (interfaceC14919 instanceof InterfaceC19614) {
            InterfaceC19614 interfaceC19614 = (InterfaceC19614) interfaceC14919;
            arrayDeque.addFirst(interfaceC19614.mo19211());
            interfaceC14919 = interfaceC19614.getExpression();
        }
        arrayDeque.addFirst(((InterfaceC14724) interfaceC14919).getName());
        boolean z = false;
        for (InterfaceC16446 interfaceC16446 : arrayDeque) {
            if (z) {
                m13772(".");
            }
            m13772(interfaceC16446.toString());
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13706(EnumC22163 enumC22163, EnumC17467 enumC17467, InterfaceC3819 interfaceC3819, C18189 c18189, String str, C18189 c181810) {
        C18189 c18189Empty;
        InterfaceC14919 interfaceC14919;
        m13790(interfaceC3819);
        if (interfaceC3819.getType() != null) {
            C11178 c11178M24246 = C10507.m24246(interfaceC3819.getType(), EnumC21907.YES);
            C18189 c18189M41402of = C18189.m41402of(c11178M24246);
            interfaceC14919 = c11178M24246.f31028;
            c18189Empty = c18189M41402of;
        } else {
            c18189Empty = C18189.empty();
            interfaceC14919 = null;
        }
        m13786(enumC22163, enumC17467, C18189.m41402of(interfaceC3819.mo7439()), interfaceC14919, interfaceC3819.getName(), str, c18189, c181810, C18189.empty(), c18189Empty);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13792(List list, AbstractC10002 abstractC10002) {
        C15365 c15365 = this.f15267;
        c15365.m35011(abstractC10002);
        c15365.m35011(f15263);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13579 interfaceC13579 = (InterfaceC13579) it.next();
            if (z) {
                m13772(",");
                c15365.m35019();
            }
            m13781(interfaceC13579);
            z = true;
        }
        m13772(">");
        c15365.m35021();
        c15365.m35021();
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
    /* JADX INFO: renamed from: ֫ */
    public final void m13780(AbstractC14355 abstractC14355) {
        InterfaceC21431 interfaceC21431;
        boolean z;
        AbstractC16192 abstractC16192M8329;
        EnumC9421 enumC9421Mo18750;
        C18189 c18189Empty;
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
        InterfaceC21431 interfaceC21432;
        boolean z6;
        Iterator it2;
        boolean zM13708;
        boolean zM13709;
        boolean z7;
        AbstractC10002 abstractC10002;
        InterfaceC18943 interfaceC18943;
        InterfaceC16446 interfaceC16446M11853;
        String str;
        AbstractC12224 abstractC12224;
        boolean z8;
        AbstractC10002 abstractC10003;
        boolean z9;
        Object obj;
        InterfaceC22743 interfaceC22743M35018;
        Object obj2;
        EnumC24754 enumC24754;
        String string;
        ArrayDeque<InterfaceC21431> arrayDeque = new ArrayDeque();
        InterfaceC21431 expression = abstractC14355;
        while (true) {
            arrayDeque.addFirst(expression);
            if (expression.mo3381() == EnumC5532.ARRAY_ACCESS) {
                expression = m13696(expression);
            }
            interfaceC21431 = null;
            switch (C9166.f24833[expression.mo3381().ordinal()]) {
                case 9:
                    expression = ((InterfaceC19614) expression).getExpression();
                    if (expression == null) {
                        interfaceC21431 = expression;
                    }
                    break;
                case 10:
                    InterfaceC21431 interfaceC21431Mo38909 = ((InterfaceC18943) expression).mo38909();
                    expression = interfaceC21431Mo38909 instanceof InterfaceC19614 ? ((InterfaceC19614) interfaceC21431Mo38909).getExpression() : null;
                    if (expression == null) {
                        interfaceC21431 = expression;
                    }
                    break;
                case 11:
                    break;
                default:
                    interfaceC21431 = (InterfaceC21431) arrayDeque.removeFirst();
                    break;
            }
        }
        ArrayList arrayList = new ArrayList(arrayDeque);
        AbstractC10002 abstractC10004 = this.f15268;
        String str2 = ".";
        AbstractC10002 abstractC10005 = f15263;
        C15365 c15365 = this.f15267;
        int i5 = 0;
        if (interfaceC21431 != null) {
            if (interfaceC21431.mo3381() == EnumC5532.NEW_CLASS && ((InterfaceC10897) interfaceC21431).mo25126() != null) {
                c15365.m35011(abstractC10005);
                m13781(m13696(interfaceC21431));
                m13772(".");
                z = false;
            } else {
                m13781(m13696(interfaceC21431));
                c15365.m35011(abstractC10004);
                z = true;
            }
            ArrayDeque arrayDeque2 = new ArrayDeque();
            InterfaceC21431 expression2 = interfaceC21431;
            while (expression2 instanceof InterfaceC15414) {
                InterfaceC15414 interfaceC15414 = (InterfaceC15414) expression2;
                arrayDeque2.addLast(interfaceC15414.getIndex());
                expression2 = interfaceC15414.getExpression();
            }
            m13710(arrayDeque2);
            if (arrayDeque.isEmpty()) {
                c15365.m35021();
                return;
            }
        } else {
            z = false;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i6 = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        for (InterfaceC21431 interfaceC21433 : arrayDeque) {
            boolean z10 = interfaceC21433.mo3381() == EnumC5532.ARRAY_ACCESS;
            InterfaceC21431 interfaceC21431M13696 = m13696(interfaceC21433);
            switch (C9166.f24833[interfaceC21431M13696.mo3381().ordinal()]) {
                case 9:
                    c4123.m18184(((InterfaceC19614) interfaceC21431M13696).mo19211().toString());
                    if (z10) {
                    }
                    break;
                case 10:
                    c4123.m18184(C5398.m11853((InterfaceC18943) interfaceC21431M13696).toString());
                    break;
                case 11:
                    c4123.m18184(((InterfaceC14724) interfaceC21431M13696).getName().toString());
                    if (z10) {
                    }
                    break;
            }
            abstractC16192M8329 = c4123.m8329();
            enumC9421Mo18750 = EnumC9421.f25719;
            c18189Empty = C18189.empty();
            for (i = 0; i < abstractC16192M8329.size() && (enumC9421Mo18750 = enumC9421Mo18750.mo18750(EnumC14115.m32052((String) abstractC16192M8329.get(i)))) != EnumC9421.f25716; i++) {
                if (enumC9421Mo18750.m21921()) {
                    c18189Empty = C18189.m41402of(Integer.valueOf(i));
                }
            }
            c18189Empty.ifPresent(new Consumer() { // from class: l.᩺֫ۖ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj3) {
                    linkedHashSet.add((Integer) obj3);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
            i3 = 0;
            i4 = -1;
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                if (((InterfaceC21431) arrayList.get(i2)).mo3381() != EnumC5532.METHOD_INVOCATION) {
                    if (i2 <= 0 || interfaceC21431 != null) {
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
            if (linkedHashSet.isEmpty() && (arrayList.get(0) instanceof InterfaceC14724)) {
                string = ((InterfaceC14724) arrayList.get(0)).getName().toString();
                if (!string.equals("this") || string.equals("super")) {
                    linkedHashSet.add(1);
                }
            }
            list = (List) C22191.m50003(C7480.stream(arrayList), new C4407(new C5143())).filter(new C15453(1)).collect(C24205.toList());
            C21230.forEach(list, new C19315(1, linkedHashSet));
            if (!linkedHashSet.isEmpty()) {
                if (list.isEmpty()) {
                    enumC24754 = EnumC24754.INDEPENDENT;
                } else {
                    enumC24754 = EnumC24754.UNIFIED;
                }
                m13702(arrayList, z, linkedHashSet, enumC24754);
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
                    interfaceC21432 = (InterfaceC21431) it.next();
                    if (z5) {
                        c15365.m35011(abstractC10004);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        it2 = it;
                        zM13708 = false;
                        zM13709 = false;
                        z7 = false;
                    } else {
                        z9 = z3;
                        it2 = it;
                        obj = interfaceC21432;
                        while (!(obj instanceof C8320)) {
                            if (obj instanceof C17175) {
                                obj2 = ((C17175) obj).f51143;
                            } else if (obj instanceof C16366) {
                                obj2 = ((C16366) obj).f48093;
                            } else {
                                throw new RuntimeException("Unexpected tree type: " + obj);
                            }
                            obj = obj2;
                            i5 = 0;
                        }
                        interfaceC22743M35018 = c15365.m35018(i5);
                        C12826.requireNonNull(interfaceC22743M35018);
                        if (((C22578) interfaceC22743M35018.mo50894()).mo37859().equals(str2)) {
                            throw new AssertionError(interfaceC22743M35018.toString());
                        }
                        InterfaceC22743 interfaceC22743M35019 = c15365.m35018(-1);
                        InterfaceC22743 interfaceC22743M350110 = c15365.m35018(1);
                        zM13709 = m13708(interfaceC22743M35019, interfaceC22743M35018);
                        zM13708 = m13708(interfaceC22743M35018, interfaceC22743M350110);
                        if (!z6 && z4 && (zM13709 || zM13708)) {
                            c15365.m35011(abstractC10004);
                            z6 = true;
                        }
                        if (z4 || z5 || !(zM13709 || zM13708)) {
                            z7 = z9;
                        } else {
                            z7 = z9;
                            z5 = true;
                        }
                    }
                    if (z) {
                        if (zM13709) {
                            c15365.m35029();
                        }
                        m13772(str2);
                        if (zM13708) {
                            c15365.m35029();
                        }
                    }
                    if (z2) {
                        abstractC10002 = abstractC10005;
                    } else {
                        abstractC10002 = this.f15270;
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList.size() >= 2 && interfaceC21432.mo3381() == EnumC5532.METHOD_INVOCATION) {
                        interfaceC18943 = (InterfaceC18943) interfaceC21432;
                        interfaceC16446M11853 = C5398.m11853(interfaceC18943);
                        str = str2;
                        if (interfaceC18943.mo38909() instanceof InterfaceC14724) {
                            abstractC12224 = (AbstractC12224) interfaceC16446M11853;
                            z8 = z4;
                            if (abstractC12224.length() > 4 && interfaceC18943.mo38908().isEmpty() && interfaceC18943.mo38910().m10289() == 1) {
                                c15365.m35011(abstractC10005);
                                c15365.m35011(abstractC10002);
                                m13772(abstractC12224.toString());
                                m13772(MotionUtils.EASING_TYPE_FORMAT_START);
                                m13781((InterfaceC14919) C10810.m24921((Collection) interfaceC18943.mo38910()));
                                c15365.m35021();
                                m13772(MotionUtils.EASING_TYPE_FORMAT_END);
                                c15365.m35021();
                            }
                            if (z6) {
                                c15365.m35021();
                            }
                            AbstractC7257 abstractC7257 = (AbstractC7257) interfaceC21432;
                            AbstractC13884 abstractC13884 = ((C3626) m45216().m13114()).f7514;
                            abstractC7257.getClass();
                            C9268.m21397(abstractC7257, abstractC13884);
                            C5398.m11850((InterfaceC14919) interfaceC21432);
                            i5 = 0;
                            z = true;
                            arrayList = arrayList2;
                            z3 = z7;
                            it = it2;
                            str2 = str;
                            z4 = z8;
                        }
                        C9331 c9331 = new C9331();
                        m13705(interfaceC21432, C18189.m41402of(c9331));
                        C3296 c3296M5744 = C3296.m5744(c9331, abstractC10004, abstractC10005);
                        if (!z2 || z) {
                            abstractC10003 = abstractC10004;
                        } else {
                            abstractC10003 = abstractC10005;
                        }
                        m13704(interfaceC21432, c3296M5744, abstractC10003);
                        if (z6) {
                            c15365.m35021();
                        }
                        AbstractC7257 abstractC7258 = (AbstractC7257) interfaceC21432;
                        AbstractC13884 abstractC13885 = ((C3626) m45216().m13114()).f7514;
                        abstractC7258.getClass();
                        C9268.m21397(abstractC7258, abstractC13885);
                        C5398.m11850((InterfaceC14919) interfaceC21432);
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
                    C9331 c9332 = new C9331();
                    m13705(interfaceC21432, C18189.m41402of(c9332));
                    C3296 c3296M5745 = C3296.m5744(c9332, abstractC10004, abstractC10005);
                    if (z2) {
                        abstractC10003 = abstractC10004;
                    } else {
                        abstractC10003 = abstractC10004;
                    }
                    m13704(interfaceC21432, c3296M5745, abstractC10003);
                    if (z6) {
                        c15365.m35021();
                    }
                    AbstractC7257 abstractC7259 = (AbstractC7257) interfaceC21432;
                    AbstractC13884 abstractC13886 = ((C3626) m45216().m13114()).f7514;
                    abstractC7259.getClass();
                    C9268.m21397(abstractC7259, abstractC13886);
                    C5398.m11850((InterfaceC14919) interfaceC21432);
                    i5 = 0;
                    z = true;
                    arrayList = arrayList2;
                    z3 = z7;
                    it = it2;
                    str2 = str;
                    z4 = z8;
                }
            }
            if (interfaceC21431 != null) {
                c15365.m35021();
            }
        }
        abstractC16192M8329 = c4123.m8329();
        enumC9421Mo18750 = EnumC9421.f25719;
        c18189Empty = C18189.empty();
        while (i < abstractC16192M8329.size()) {
            if (enumC9421Mo18750.m21921()) {
                c18189Empty = C18189.m41402of(Integer.valueOf(i));
            }
        }
        c18189Empty.ifPresent(new Consumer() { // from class: l.᩺֫ۖ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj3) {
                linkedHashSet.add((Integer) obj3);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
        i3 = 0;
        i4 = -1;
        while (i2 < arrayList.size()) {
            if (((InterfaceC21431) arrayList.get(i2)).mo3381() != EnumC5532.METHOD_INVOCATION) {
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
            string = ((InterfaceC14724) arrayList.get(0)).getName().toString();
            if (!string.equals("this")) {
                linkedHashSet.add(1);
            } else {
                linkedHashSet.add(1);
            }
        }
        list = (List) C22191.m50003(C7480.stream(arrayList), new C4407(new C5143())).filter(new C15453(1)).collect(C24205.toList());
        C21230.forEach(list, new C19315(1, linkedHashSet));
        if (!linkedHashSet.isEmpty()) {
            if (list.isEmpty()) {
                enumC24754 = EnumC24754.INDEPENDENT;
            } else {
                enumC24754 = EnumC24754.UNIFIED;
            }
            m13702(arrayList, z, linkedHashSet, enumC24754);
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
                interfaceC21432 = (InterfaceC21431) it.next();
                if (z5) {
                    c15365.m35011(abstractC10004);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z9 = z3;
                    it2 = it;
                    obj = interfaceC21432;
                    while (!(obj instanceof C8320)) {
                        if (obj instanceof C17175) {
                            obj2 = ((C17175) obj).f51143;
                        } else if (obj instanceof C16366) {
                            obj2 = ((C16366) obj).f48093;
                        } else {
                            throw new RuntimeException("Unexpected tree type: " + obj);
                        }
                        obj = obj2;
                        i5 = 0;
                    }
                    interfaceC22743M35018 = c15365.m35018(i5);
                    C12826.requireNonNull(interfaceC22743M35018);
                    if (((C22578) interfaceC22743M35018.mo50894()).mo37859().equals(str2)) {
                        throw new AssertionError(interfaceC22743M35018.toString());
                    }
                    InterfaceC22743 interfaceC22743M350111 = c15365.m35018(-1);
                    InterfaceC22743 interfaceC22743M350112 = c15365.m35018(1);
                    zM13709 = m13708(interfaceC22743M350111, interfaceC22743M35018);
                    zM13708 = m13708(interfaceC22743M35018, interfaceC22743M350112);
                    if (!z6) {
                        c15365.m35011(abstractC10004);
                        z6 = true;
                    }
                    if (z4) {
                        z7 = z9;
                    } else {
                        z7 = z9;
                    }
                } else {
                    it2 = it;
                    zM13708 = false;
                    zM13709 = false;
                    z7 = false;
                }
                if (z) {
                    if (zM13709) {
                        c15365.m35029();
                    }
                    m13772(str2);
                    if (zM13708) {
                        c15365.m35029();
                    }
                }
                if (z2) {
                    abstractC10002 = abstractC10005;
                } else {
                    abstractC10002 = this.f15270;
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList.size() >= 2) {
                    interfaceC18943 = (InterfaceC18943) interfaceC21432;
                    interfaceC16446M11853 = C5398.m11853(interfaceC18943);
                    str = str2;
                    if (interfaceC18943.mo38909() instanceof InterfaceC14724) {
                        abstractC12224 = (AbstractC12224) interfaceC16446M11853;
                        z8 = z4;
                        if (abstractC12224.length() > 4) {
                        }
                    } else {
                        z8 = z4;
                    }
                    C9331 c9333 = new C9331();
                    m13705(interfaceC21432, C18189.m41402of(c9333));
                    C3296 c3296M5746 = C3296.m5744(c9333, abstractC10004, abstractC10005);
                    if (z2) {
                        abstractC10003 = abstractC10004;
                    } else {
                        abstractC10003 = abstractC10004;
                    }
                    m13704(interfaceC21432, c3296M5746, abstractC10003);
                } else {
                    str = str2;
                    z8 = z4;
                    C9331 c9334 = new C9331();
                    m13705(interfaceC21432, C18189.m41402of(c9334));
                    C3296 c3296M5747 = C3296.m5744(c9334, abstractC10004, abstractC10005);
                    if (z2) {
                        abstractC10003 = abstractC10004;
                    } else {
                        abstractC10003 = abstractC10004;
                    }
                    m13704(interfaceC21432, c3296M5747, abstractC10003);
                }
                if (z6) {
                    c15365.m35021();
                }
                AbstractC7257 abstractC72510 = (AbstractC7257) interfaceC21432;
                AbstractC13884 abstractC13887 = ((C3626) m45216().m13114()).f7514;
                abstractC72510.getClass();
                C9268.m21397(abstractC72510, abstractC13887);
                C5398.m11850((InterfaceC14919) interfaceC21432);
                i5 = 0;
                z = true;
                arrayList = arrayList3;
                z3 = z7;
                it = it2;
                str2 = str;
                z4 = z8;
            }
        }
        if (interfaceC21431 != null) {
            c15365.m35021();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13702(List list, boolean z, AbstractCollection abstractCollection, EnumC24754 enumC24754) {
        C7320 c7320;
        C15365 c15365;
        boolean z2;
        if (!abstractCollection.isEmpty()) {
            ((Integer) C10810.m24926(abstractCollection)).intValue();
            list.size();
        }
        int i = 0;
        while (true) {
            int size = abstractCollection.size();
            c7320 = f15263;
            c15365 = this.f15267;
            if (i >= size) {
                break;
            }
            c15365.m35011(c7320);
            i++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(AbstractC24891.copyOf((Collection) abstractCollection));
        C9331 c9331 = new C9331();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < list.size()) {
            InterfaceC21431 interfaceC21431 = (InterfaceC21431) list.get(i2);
            C7320 c7321 = this.f15268;
            if (z3) {
                c15365.m35011(c7321);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 0 && m13714()) {
                if (!z2) {
                    c15365.m35011(c7321);
                    z2 = true;
                }
                c15365.m35029();
                z3 = true;
            }
            if (z) {
                m13772(".");
            } else if (z) {
                EnumC24754 enumC24755 = (arrayDeque.isEmpty() || i2 > ((Integer) arrayDeque.peekFirst()).intValue()) ? EnumC24754.UNIFIED : enumC24754;
                C18189 c18189M41402of = C18189.m41402of(c9331);
                c15365.getClass();
                c15365.m35012(C16036.m36479(enumC24755, "", c7320, c18189M41402of));
                m13772(".");
            }
            C9331 c9332 = new C9331();
            m13705(interfaceC21431, C18189.m41402of(c9332));
            if (!arrayDeque.isEmpty() && i2 == ((Integer) arrayDeque.peekFirst()).intValue()) {
                c15365.m35021();
                arrayDeque.removeFirst();
            }
            m13704(interfaceC21431, C3296.m5744(c9332, c7321, c7320), c7321);
            if (z2) {
                c15365.m35021();
            }
            i2++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13705(InterfaceC21431 interfaceC21431, C18189 c18189) {
        InterfaceC21431 interfaceC21431M13696 = m13696(interfaceC21431);
        switch (C9166.f24833[interfaceC21431M13696.mo3381().ordinal()]) {
            case 9:
                m13782(((InterfaceC19614) interfaceC21431M13696).mo19211());
                break;
            case 10:
                InterfaceC18943 interfaceC18943 = (InterfaceC18943) interfaceC21431M13696;
                if (!interfaceC18943.mo38908().isEmpty()) {
                    C7320 c7320 = this.f15268;
                    C15365 c15365 = this.f15267;
                    c15365.m35011(c7320);
                    C4848 c4848Mo38908 = interfaceC18943.mo38908();
                    C7320 c7321 = f15263;
                    m13789(c4848Mo38908, c7321);
                    c15365.m35012(C16036.m36479(EnumC24754.UNIFIED, "", c7321, c18189));
                    c15365.m35021();
                }
                m13782(C5398.m11853(interfaceC18943));
                break;
            case 11:
                m13782(((InterfaceC14724) interfaceC21431M13696).getName());
                break;
            default:
                m13781((InterfaceC14919) interfaceC21431M13696);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC21431 m13696(InterfaceC21431 interfaceC21431) {
        while (interfaceC21431 instanceof InterfaceC15414) {
            interfaceC21431 = ((InterfaceC15414) interfaceC21431).getExpression();
        }
        return interfaceC21431;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m13710(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        C7320 c7320 = f15263;
        C15365 c15365 = this.f15267;
        c15365.m35011(c7320);
        do {
            m13772("[");
            c15365.m35024();
            m13781((InterfaceC14919) arrayDeque.removeLast());
            m13772("]");
        } while (!arrayDeque.isEmpty());
        c15365.m35021();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13704(InterfaceC21431 interfaceC21431, C3296 c3296, AbstractC10002 abstractC10002) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC21431 expression = interfaceC21431;
        while (expression instanceof InterfaceC15414) {
            InterfaceC15414 interfaceC15414 = (InterfaceC15414) expression;
            arrayDeque.addLast(interfaceC15414.getIndex());
            expression = interfaceC15414.getExpression();
        }
        InterfaceC21431 interfaceC21431M13696 = m13696(interfaceC21431);
        if (C9166.f24833[interfaceC21431M13696.mo3381().ordinal()] == 10) {
            C15365 c15365 = this.f15267;
            c15365.m35011(c3296);
            m13775((List) ((InterfaceC18943) interfaceC21431M13696).mo38910(), abstractC10002);
            c15365.m35021();
        }
        m13710(arrayDeque);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13789(List list, AbstractC10002 abstractC10002) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m13772("<");
        C15365 c15365 = this.f15267;
        c15365.m35011(abstractC10002);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC14919 interfaceC14919 = (InterfaceC14919) it.next();
            if (z) {
                m13772(",");
                c15365.m35027();
            }
            m13781(interfaceC14919);
            z = true;
        }
        c15365.m35021();
        m13772(">");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13775(List list, AbstractC10002 abstractC10002) {
        m13772(MotionUtils.EASING_TYPE_FORMAT_START);
        boolean zIsEmpty = list.isEmpty();
        C15365 c15365 = this.f15267;
        boolean z = false;
        if (!zIsEmpty) {
            Iterator it = list.iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                InterfaceC21431 interfaceC21431 = (InterfaceC21431) it.next();
                InterfaceC22743 interfaceC22743M35018 = c15365.m35018(i);
                C12826.requireNonNull(interfaceC22743M35018);
                InterfaceC22743 interfaceC22743M35019 = c15365.m35018(i != 0 ? 0 : -1);
                C12826.requireNonNull(interfaceC22743M35019);
                InterfaceC22743 interfaceC22743M350110 = c15365.m35018(i == 0 ? -2 : -1);
                if (i != 0) {
                    if ((interfaceC22743M350110 != null && m13707(interfaceC22743M350110.mo50896())) || m13707(interfaceC22743M35019.mo50895())) {
                        if (!z) {
                            c15365.m35011(abstractC10002);
                            z = true;
                        }
                        c15365.m35029();
                    }
                    m13772(",");
                }
                if (m13707(interfaceC22743M35019.mo50896()) || m13707(interfaceC22743M35018.mo50895())) {
                    if (!z) {
                        c15365.m35011(abstractC10002);
                        z = true;
                    }
                    c15365.m35029();
                } else if (i != 0) {
                    c15365.m35022();
                }
                m13781((InterfaceC14919) interfaceC21431);
                i = 1;
            }
        }
        if (z) {
            c15365.m35021();
        }
        if (!list.isEmpty() && m13714()) {
            c15365.m35029();
        }
        m13773(MotionUtils.EASING_TYPE_FORMAT_END, abstractC10002);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m13712(ArrayDeque arrayDeque) {
        m13701(new ArrayDeque(), (Deque) arrayDeque);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13776(List list, EnumC16126 enumC16126, EnumC4728 enumC4728) {
        boolean z;
        boolean zIsEmpty = list.isEmpty();
        C7320 c7320 = f15263;
        C7320 c7321 = this.f15272;
        C15365 c15365 = this.f15267;
        if (zIsEmpty) {
            if (enumC16126.m36716()) {
                c15365.m35022();
                m13779(c7321);
                c15365.m35013(AbstractC24083.f76466);
                c15365.m35011(c7320);
                if (c15365.m35023(0).equals(C18189.m41402of(C0249l.f1196b))) {
                    c15365.m35011(c7321);
                    m13788();
                    c15365.m35021();
                    c15365.m35029();
                }
                m13773(C0249l.f1198d, c7321);
                c15365.m35021();
                return;
            }
            return;
        }
        if (enumC16126.m36716()) {
            c15365.m35022();
            m13779(c7321);
            c15365.m35011(c7320);
        }
        c15365.m35011(c7321);
        boolean zM10020 = enumC4728.m10020();
        InterfaceC8069 interfaceC8069M15487 = C6786.m15487(list.iterator());
        boolean z2 = false;
        while (interfaceC8069M15487.hasNext()) {
            InterfaceC14919 interfaceC14919 = (InterfaceC14919) interfaceC8069M15487.next();
            m13788();
            c15365.m35029();
            if (interfaceC14919.mo3381() == EnumC5532.VARIABLE) {
                InterfaceC22743 interfaceC22743 = (InterfaceC22743) c15365.m35017().mo47972().mo13880(Integer.valueOf(C9268.m21421((AbstractC7257) interfaceC14919)));
                if (interfaceC22743 != null) {
                    AbstractC6767 abstractC6767ListIterator = interfaceC22743.mo50895().listIterator(0);
                    while (true) {
                        if (abstractC6767ListIterator.hasNext()) {
                            if (((InterfaceC16706) abstractC6767ListIterator.next()).getText().startsWith("/**")) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (zM10020) {
                c15365.m35013(AbstractC24083.f76467);
            } else if (!zM10020 && (z || z2)) {
                c15365.m35013(AbstractC24083.f76468);
            }
            m13791();
            if (interfaceC14919.mo3381() == EnumC5532.VARIABLE) {
                m13777(m13692(interfaceC8069M15487, interfaceC14919), EnumC22163.FIELD, m13695((InterfaceC24978) ((InterfaceC3819) interfaceC14919).mo7439()));
            } else {
                m13781(interfaceC14919);
            }
            zM10020 = false;
            z2 = z;
        }
        m13788();
        c15365.m35029();
        c15365.m35021();
        c15365.m35029();
        m13791();
        if (enumC16126.m36716()) {
            c15365.m35013(AbstractC24083.f76467);
            m13773(C0249l.f1198d, c7321);
            c15365.m35021();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13699(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        C15365 c15365 = this.f15267;
        c15365.m35027();
        c15365.m35011(list.size() > 1 ? this.f15268 : f15263);
        m13772(str);
        c15365.m35022();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC14919 interfaceC14919 = (InterfaceC14919) it.next();
            if (z) {
                m13772(",");
                c15365.m35019();
            }
            m13781(interfaceC14919);
            z = true;
        }
        c15365.m35021();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m13692(InterfaceC8069 interfaceC8069, InterfaceC14919 interfaceC14919) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC14919.mo3381() == EnumC5532.VARIABLE) {
            int iM11850 = C5398.m11850(interfaceC14919);
            arrayList.add((InterfaceC3819) interfaceC14919);
            while (interfaceC8069.hasNext() && ((InterfaceC14919) interfaceC8069.peek()).mo3381() == EnumC5532.VARIABLE && C5398.m11850((InterfaceC14919) interfaceC8069.peek()) == iM11850) {
                arrayList.add((InterfaceC3819) interfaceC8069.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17467 m13695(InterfaceC24978 interfaceC24978) {
        Iterator it = interfaceC24978.getAnnotations().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC24132) it.next()).mo43285().isEmpty()) {
                return EnumC17467.VERTICAL;
            }
        }
        return EnumC17467.HORIZONTAL;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13772(String str) {
        this.f15267.m35009(str, EnumC17377.REAL, f15263, C18189.empty());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13773(String str, AbstractC10002 abstractC10002) {
        this.f15267.m35009(str, EnumC17377.REAL, abstractC10002, C18189.empty());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13779(AbstractC10002 abstractC10002) {
        this.f15267.m35009("{", EnumC17377.REAL, f15263, C18189.m41402of(abstractC10002));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13790(InterfaceC14919 interfaceC14919) {
        AbstractC7257 abstractC7257 = (AbstractC7257) interfaceC14919;
        abstractC7257.getClass();
        this.f15267.m35028(C9268.m21421(abstractC7257));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13786(EnumC22163 enumC22163, EnumC17467 enumC17467, C18189 c18189, InterfaceC14919 interfaceC14919, InterfaceC16446 interfaceC16446, String str, C18189 c181810, C18189 c181811, C18189 c181812, C18189 c181813) {
        C9331 c9331 = new C9331();
        C9331 c9332 = new C9331();
        boolean z = true;
        boolean z2 = enumC22163 == EnumC22163.FIELD;
        C15365 c15365 = this.f15267;
        if (z2) {
            c15365.m35013(AbstractC24083.m53350(c9332));
        }
        ArrayDeque arrayDeque = new ArrayDeque(c181813.isPresent() ? ((C11178) c181813.get()).f31027 : AbstractC16192.m36872of());
        AbstractC10763 abstractC10763 = (AbstractC10763) c18189.map(new Function() { // from class: l.ܰ֫ۖ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC24978 interfaceC24978 = (InterfaceC24978) obj;
                return this.f43383.m13771(interfaceC24978, (List) interfaceC24978.getAnnotations());
            }
        }).orElse(new C24588(AbstractC16192.m36872of(), AbstractC16192.m36872of()));
        EnumC22163 enumC22164 = EnumC22163.PARAMETER;
        C7320 c7320 = f15263;
        C7320 c7321 = this.f15268;
        c15365.m35011((enumC22163 == enumC22164 && abstractC10763.m24797()) ? c7321 : c7320);
        AbstractC16192 abstractC16192M13694 = m13694(abstractC10763, enumC17467, C18189.m41402of(c9332));
        boolean z3 = ((String) c15365.m35023(0).get()).equals("var") && (!interfaceC16446.mo28204("var") || ((String) c15365.m35023(1).get()).equals("var"));
        if (interfaceC14919 == null && !z3) {
            z = false;
        }
        c15365.m35011(c7320);
        c15365.m35011(c7320);
        c15365.m35011(c7320);
        m13778(abstractC16192M13694, EnumC24844.NO, EnumC24844.YES);
        if (c181813.isPresent() && ((C11178) c181813.get()).f31028 != null) {
            m13781(((C11178) c181813.get()).f31028);
            arrayDeque.size();
            c15365.m35011(c7321);
            m13712(arrayDeque);
            c15365.m35021();
            arrayDeque.size();
        } else if (z3) {
            m13772("var");
        } else {
            m13781(interfaceC14919);
        }
        c15365.m35021();
        if (z) {
            c15365.m35022();
        }
        c15365.m35011(C3296.m5744(c9331, c7321, c7320));
        if (c181812.isPresent()) {
            m13781((InterfaceC14919) c181812.get());
        } else {
            m13782(interfaceC16446);
        }
        c15365.m35025("");
        m13712(arrayDeque);
        c15365.m35021();
        c15365.m35021();
        if (c181810.isPresent()) {
            c15365.m35022();
            m13772(str);
            if (((InterfaceC21431) c181810.get()).mo3381() == EnumC5532.NEW_ARRAY && ((InterfaceC11568) c181810.get()).getType() == null) {
                c15365.m35022();
                ((InterfaceC21431) c181810.get()).mo3380(this, null);
            } else {
                c15365.m35011(C3296.m5744(c9331, c7321, c7320));
                c15365.m35022();
                m13781((InterfaceC14919) c181810.get());
                c15365.m35021();
            }
        }
        if (c181811.isPresent() && c15365.m35023(0).equals(c181811)) {
            c15365.m35020((String) c181811.get());
        }
        c15365.m35021();
        c15365.m35021();
        if (z2) {
            c15365.m35013(AbstractC24083.m53350(c9332));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m13714() {
        C15365 c15365 = this.f15267;
        return m13708(c15365.m35018(-1), c15365.m35018(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13708(InterfaceC22743 interfaceC22743, InterfaceC22743 interfaceC22744) {
        if (interfaceC22743 == null || !m13707(interfaceC22743.mo50896())) {
            return interfaceC22744 != null && m13707(interfaceC22744.mo50895());
        }
        return true;
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f15267, "builder");
        return c10888M40057.toString();
    }
}
