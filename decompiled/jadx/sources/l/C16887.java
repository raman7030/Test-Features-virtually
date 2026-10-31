package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16887 extends C18382 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12323 f51824;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23168 f51825;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22364 f51827;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f51828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51830;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC10892 f51831;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f51832;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f51834;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51835;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6319 f51836;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51837;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f51839;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f51840;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6136 f51841;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11781 f51842;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51843;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51844;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f51823 = new C4314();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String[] f51822 = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2609 f51833 = C2609.m8239();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14896 f51838 = new C14896(65520);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14896 f51829 = new C14896(131056);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12240 f51826 = new C12240(this);

    public C16887(C2903 c2903) {
        c2903.m8841(f51823, this);
        this.f51827 = C22364.m50099(c2903);
        this.f51841 = C6136.m17057(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f51842 = c11781M28823;
        this.f51825 = C23168.m51341(c2903);
        this.f51831 = EnumC10892.m27201(c2903);
        EnumC16280.m38301(c2903);
        this.f51836 = C6319.m17456(c2903);
        this.f51834 = C15240.m36054(c2903);
        this.f51832 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f51824 = C13359.m32330(c2903).f39972;
        this.f51844 = c11781M28823.m28832(EnumC0121.f1141);
        this.f51837 = c11781M28823.m28832(EnumC0121.f1191);
        this.f51840 = c11781M28823.m28831("debug.stackmap");
        EnumC0121 enumC0121 = EnumC0121.f1202;
        this.f51843 = c11781M28823.m28836(enumC0121) || c11781M28823.m28829(enumC0121, "source");
        String strM28824 = c11781M28823.m28824("debug.dumpmodifiers");
        if (strM28824 != null) {
            this.f51839 = strM28824.indexOf(99) != -1;
            this.f51835 = strM28824.indexOf(IShizukuService.Stub.TRANSACTION_attachUserService) != -1;
            this.f51845 = strM28824.indexOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) != -1;
            this.f51830 = strM28824.indexOf(109) != -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16887 m39694(C2903 c2903) {
        C16887 c16887 = (C16887) c2903.m8838(f51823);
        return c16887 == null ? new C16887(c2903) : c16887;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m39700(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j & 4095;
        int i = 0;
        while (j2 != 0) {
            if ((1 & j2) != 0) {
                sb.append(" ");
                sb.append(f51822[i]);
            }
            j2 >>= 1;
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39709(int i, int i2) {
        byte[] bArr = this.f51838.f45448;
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39715(AbstractC10370 abstractC10370) {
        int iM31613 = C13028.m31613(this.f51824.f36883, abstractC10370);
        C14896 c14896 = this.f51838;
        c14896.m35351(iM31613);
        c14896.m35352(0);
        return c14896.f45449;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39708(int i) {
        C14896 c14896 = this.f51838;
        int i2 = c14896.f45449 - i;
        byte[] bArr = c14896.f45448;
        bArr[i - 4] = (byte) ((i2 >> 24) & 255);
        bArr[i - 3] = (byte) ((i2 >> 16) & 255);
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39701() {
        C14896 c14896 = this.f51838;
        c14896.m35351(0);
        return c14896.f45449;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39714(long j) {
        if ((j & 131072) == 0) {
            return 0;
        }
        m39708(m39715(this.f51841.f18800));
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39706(AbstractC5698 abstractC5698, boolean z) {
        int iM39714 = !z ? m39714(abstractC5698.mo16084()) : 0;
        long jMo16084 = abstractC5698.mo16084();
        if ((2147487744L & jMo16084) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && (jMo16084 & 536870912) == 0) {
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            C6319 c6319 = this.f51836;
            boolean zM17550 = c6319.m17550(abstractC4308, abstractC5698.mo16091(c6319));
            C12323 c12323 = this.f51824;
            if (zM17550) {
                C3151 c3151 = c12323.f36882;
                c3151.getClass();
                for (C2609 c2609Mo12930 = abstractC5698.f17560.mo12930(); c2609Mo12930.m8249(); c2609Mo12930 = c2609Mo12930.f8241) {
                    if (((AbstractC4308) c2609Mo12930.f8240).m12913(EnumC9454.TYPEVAR)) {
                        int iM39715 = m39715(this.f51841.f18827);
                        this.f51838.m35351(c12323.m29895(abstractC5698));
                        m39708(iM39715);
                        iM39714++;
                        break;
                    }
                }
            } else {
                int iM39716 = m39715(this.f51841.f18827);
                this.f51838.m35351(c12323.m29895(abstractC5698));
                m39708(iM39716);
                iM39714++;
                break;
            }
        }
        return iM39714 + m39703(abstractC5698.mo16068()) + m39704(abstractC5698.mo16081(), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39695(C2609 c2609, EnumC23440 enumC23440) {
        int iM8245 = c2609.m8245();
        C14896 c14896 = this.f51838;
        c14896.m35348(iM8245);
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C12048 c12048 = (C12048) it.next();
            C18837 c18837 = new C18837();
            for (C16384 c16384 : c12048.mo16068()) {
                C6319 c6319 = this.f51836;
                c6319.getClass();
                if (c6319.m17528(c16384.f26338.f13890) == enumC23440) {
                    c18837.m43511(c16384);
                }
            }
            c14896.m35351(c18837.m43514());
            Iterator it2 = c18837.iterator();
            while (it2.hasNext()) {
                m39713((C16384) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39703(C2609 c2609) {
        int i = 0;
        if (c2609.isEmpty()) {
            return 0;
        }
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16384 = (C16384) it.next();
            int[] iArr = C12945.f38835;
            C6319 c6319 = this.f51836;
            c6319.getClass();
            int i2 = iArr[c6319.m17528(c16384.f26338.f13890).ordinal()];
            if (i2 == 2) {
                c18838.m43511(c16384);
            } else if (i2 == 3) {
                c18837.m43511(c16384);
            }
        }
        int iM43514 = c18837.m43514();
        C14896 c14896 = this.f51838;
        C6136 c6136 = this.f51841;
        if (iM43514 != 0) {
            int iM39715 = m39715(c6136.f18905);
            c14896.m35351(c18837.m43514());
            Iterator it2 = c18837.iterator();
            while (it2.hasNext()) {
                m39713((C16384) it2.next());
            }
            m39708(iM39715);
            i = 1;
        }
        if (c18838.m43514() == 0) {
            return i;
        }
        int iM39716 = m39715(c6136.f18874);
        c14896.m35351(c18838.m43514());
        Iterator it3 = c18838.iterator();
        while (it3.hasNext()) {
            m39713((C16384) it3.next());
        }
        m39708(iM39716);
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39704(C2609 c2609, boolean z) {
        int i = 0;
        if (c2609.isEmpty()) {
            return 0;
        }
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            if (c6507.m38582() && !c6507.m38584()) {
                this.f51827.m50107(EnumC21659.ERROR).println("ClassWriter: Position UNKNOWN in type annotation: " + c6507);
            } else if (c6507.f50415.f30045.m24192() == z) {
                C9953 c9953 = c6507.f50415;
                if (!c9953.f30045.m24192() || c9953.f30055) {
                    int[] iArr = C12945.f38835;
                    C6319 c6319 = this.f51836;
                    c6319.getClass();
                    int i2 = iArr[c6319.m17528(c6507.f26338.f13890).ordinal()];
                    if (i2 == 2) {
                        c18838.m43511(c6507);
                    } else if (i2 == 3) {
                        c18837.m43511(c6507);
                    }
                }
            }
        }
        int iM43514 = c18837.m43514();
        C14896 c14896 = this.f51838;
        C6136 c6136 = this.f51841;
        if (iM43514 != 0) {
            int iM39715 = m39715(c6136.f18890);
            c14896.m35351(c18837.m43514());
            Iterator it2 = c18837.iterator();
            while (it2.hasNext()) {
                m39712((C6507) it2.next());
            }
            m39708(iM39715);
            i = 1;
        }
        if (c18838.m43514() == 0) {
            return i;
        }
        int iM39716 = m39715(c6136.f18854);
        c14896.m35351(c18838.m43514());
        Iterator it3 = c18838.iterator();
        while (it3.hasNext()) {
            m39712((C6507) it3.next());
        }
        m39708(iM39716);
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39713(C16384 c16384) {
        AbstractC4308 abstractC4308 = c16384.f26338;
        C12323 c12323 = this.f51824;
        int iM29893 = c12323.m29893(abstractC4308);
        C14896 c14896 = this.f51838;
        c14896.m35351(iM29893);
        C2609<C23069> c2609 = c16384.f50417;
        c14896.m35351(c2609.m8245());
        for (C23069 c23069 : c2609) {
            c14896.m35351(C13028.m31613(c12323.f36883, ((C3581) c23069.f74207).f17562));
            ((AbstractC8624) c23069.f74208).mo5382(this.f51826);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39712(C6507 c6507) {
        C9953 c9953 = c6507.f50415;
        EnumC9372 enumC9372 = c9953.f30045;
        int i = c9953.f30048;
        int i2 = c9953.f30046;
        int iM24193 = enumC9372.m24193();
        C14896 c14896 = this.f51838;
        c14896.m35348(iM24193);
        switch (C12945.f38837[c9953.f30045.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c14896.m35351(c9953.f30056);
                break;
            case 5:
            case 6:
                c14896.m35351(c9953.f30047.length);
                int i3 = 0;
                while (true) {
                    int[] iArr = c9953.f30047;
                    if (i3 < iArr.length) {
                        c14896.m35351(iArr[i3]);
                        c14896.m35351(c9953.f30057[i3]);
                        c14896.m35351(c9953.f30051[i3]);
                        i3++;
                    }
                    break;
                }
                break;
            case 7:
                c14896.m35351(c9953.m25104());
                break;
            case 8:
            case 21:
            case 22:
                break;
            case 9:
            case 10:
                c14896.m35348(i);
                break;
            case 11:
            case 12:
                c14896.m35348(i);
                c14896.m35348(c9953.f30044);
                break;
            case 13:
                c14896.m35351(i2);
                break;
            case 14:
                c14896.m35351(i2);
                break;
            case 15:
                c14896.m35348(i);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                c14896.m35351(c9953.f30056);
                c14896.m35348(i2);
                break;
            case 23:
                throw new AssertionError("jvm.ClassWriter: UNKNOWN target type should never occur!");
            default:
                throw new AssertionError("jvm.ClassWriter: Unknown target type for position: " + c9953);
        }
        c14896.m35348(c9953.f30054.m8245());
        C2609<C12774> c2609 = c9953.f30054;
        C18837 c18837 = new C18837();
        for (C12774 c12774 : c2609) {
            c18837.m43511(Integer.valueOf(c12774.f38382.f36094));
            c18837.m43511(Integer.valueOf(c12774.f38381));
        }
        Iterator it = c18837.m43517().iterator();
        while (it.hasNext()) {
            c14896.m35348((byte) ((Integer) it.next()).intValue());
        }
        m39713((C16384) c6507);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39697(final C16887 c16887, C14163 c14163, Set set) {
        C14896 c14896 = c16887.f51838;
        C12323 c12323 = c16887.f51824;
        c12323.getClass();
        c14896.m35351(c12323.m29889(c14163.f17560));
        c14896.m35351(set.size());
        C19846.forEach(set, new Consumer() { // from class: l.ۗۜ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C16887 c16888 = this.f9627;
                C14896 c14897 = c16888.f51838;
                C12323 c12324 = c16888.f51824;
                c12324.getClass();
                c14897.m35351(c12324.m29889(((C14163) obj).f17560));
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39716() {
        int iM29889;
        int iM39715 = m39715(this.f51841.f18784);
        C12323 c12323 = this.f51824;
        int size = c12323.f36879.size();
        C14896 c14896 = this.f51838;
        c14896.m35351(size);
        for (C14163 c14163 : c12323.f36879) {
            c14163.m33813(this.f51836);
            char cM39702 = (char) m39702(c14163.f17563);
            if ((cM39702 & 512) != 0) {
                cM39702 = (char) (cM39702 | 1024);
            }
            char c = (char) (cM39702 & (-2049));
            if (this.f51845) {
                PrintWriter printWriterM50107 = this.f51827.m50107(EnumC21659.ERROR);
                printWriterM50107.println("INNERCLASS  " + ((Object) c14163.f17562));
                printWriterM50107.println("---" + m39700((long) c));
            }
            c12323.getClass();
            c14896.m35351(c12323.m29889(c14163.f17560));
            int iM31613 = 0;
            if (c14163.f17561.f17559 != EnumC1296.f4582 || c14163.f17562.isEmpty()) {
                iM29889 = 0;
            } else {
                C14163 c14164 = (C14163) c14163.f17561;
                c12323.getClass();
                iM29889 = c12323.m29889(c14164.f17560);
            }
            c14896.m35351(iM29889);
            if (!c14163.f17562.isEmpty()) {
                iM31613 = C13028.m31613(c12323.f36883, c14163.f17562);
            }
            c14896.m35351(iM31613);
            c14896.m35351(c);
        }
        m39708(iM39715);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39696(AbstractC5698 abstractC5698, C18837 c18837) {
        if (abstractC5698.f17559 != EnumC1296.f4582) {
            return;
        }
        C14163 c14163 = (C14163) abstractC5698;
        if (c14163.f17561.f17559 != EnumC1296.f4579) {
            c18837.m43511(c14163);
        }
        c14163.mo16101();
        if (c14163.f42762 != null) {
            AbstractC14016 abstractC14016Mo16064 = abstractC5698.mo16064();
            abstractC14016Mo16064.getClass();
            Iterator it = abstractC14016Mo16064.mo20475((Predicate) null, EnumC1317.RECURSIVE).iterator();
            while (it.hasNext()) {
                m39696((AbstractC5698) it.next(), c18837);
            }
        }
        C2609 c2609 = c14163.f42769;
        if (c2609 != null) {
            Iterator it2 = c2609.iterator();
            while (it2.hasNext()) {
                m39696((AbstractC5698) it2.next(), c18837);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39711(AbstractC4308 abstractC4308) {
        boolean z = this.f51840;
        C14896 c14896 = this.f51838;
        if (abstractC4308 == null) {
            if (z) {
                System.out.print(b.f);
            }
            c14896.m35348(0);
            return;
        }
        switch (C12945.f38839[abstractC4308.mo3258().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                if (z) {
                    System.out.print(ClassTransform.INTEGER);
                }
                c14896.m35348(1);
                return;
            case 5:
                if (z) {
                    System.out.print(ClassTransform.LONG);
                }
                c14896.m35348(4);
                return;
            case 6:
                if (z) {
                    System.out.print(ClassTransform.FLOAT);
                }
                c14896.m35348(2);
                return;
            case 7:
                if (z) {
                    System.out.print(ClassTransform.DOUBLE);
                }
                c14896.m35348(3);
                return;
            case 9:
                if (z) {
                    System.out.print("null");
                }
                c14896.m35348(5);
                return;
            case 10:
            case 11:
            case 12:
                C6319 c6319 = this.f51836;
                if (z) {
                    System.out.print("object(" + c6319.m17519(abstractC4308).f13890 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c14896.m35348(7);
                c14896.m35351(this.f51824.m29889(c6319.m17519(abstractC4308)));
                return;
            case 13:
                if (z) {
                    System.out.print("uninit_this");
                }
                c14896.m35348(6);
                return;
            case 14:
                int i = ((C16535) abstractC4308).f50813;
                c14896.m35348(8);
                if (z) {
                    System.out.print("uninit_object@" + i);
                }
                c14896.m35351(i);
                return;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39710(OutputStream outputStream, C14163 c14163) throws IOException {
        int i;
        int iM29889;
        C14163 c14164;
        int i2;
        int i3;
        EnumC10892 enumC10892;
        int i4;
        int i5;
        int i6;
        C3581 c3581;
        C13028 c13028;
        C22364 c22364;
        C6136 c6136;
        int i7;
        C6319 c6319;
        C6319 c63110;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        C3581 c3582;
        int i10;
        int i11;
        C3581 c3583;
        EnumC19711 enumC19711;
        C6136 c6137;
        C3581 c3584;
        String str;
        C15240 c15240;
        C11327 c11327;
        int i12;
        int i13;
        C22364 c22365;
        String str2;
        int i14;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16777216) == 0);
        C14896 c14896 = this.f51838;
        c14896.f45449 = 0;
        C14896 c14897 = this.f51829;
        c14897.f45449 = 0;
        AbstractC4308 abstractC4308 = c14163.f17560;
        C6319 c63111 = this.f51836;
        AbstractC4308 abstractC4308M17562 = c63111.m17562(abstractC4308);
        C2609 c2609M17510 = c63111.m17510(c14163.f17560);
        C2609 c2609Mo12938 = c14163.f17560.mo12938();
        EnumC1296 enumC1296 = c14163.f17561.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4568;
        if (enumC1296 == enumC1297) {
            i = 32768;
        } else {
            c14163.mo16101();
            int iM39702 = m39702(c14163.f17563 & (-8796093022209L));
            if ((iM39702 & 4) != 0) {
                iM39702 |= 1;
            }
            int i15 = iM39702 & 30225;
            i = (iM39702 & 512) == 0 ? i15 | 32 : i15;
        }
        boolean z3 = this.f51839;
        String str3 = "---";
        C22364 c22366 = this.f51827;
        if (z3) {
            PrintWriter printWriterM50107 = c22366.m50107(EnumC21659.ERROR);
            printWriterM50107.println();
            printWriterM50107.println("CLASSFILE  " + ((Object) c14163.f42767));
            printWriterM50107.println("---" + m39700((long) i));
        }
        c14896.m35351(i);
        AbstractC5698 abstractC5698 = c14163.f17561;
        EnumC1296 enumC1298 = abstractC5698.f17559;
        C6136 c6138 = this.f51841;
        C12323 c12323 = this.f51824;
        if (enumC1298 == enumC1297) {
            C14163 c14165 = new C14163(0L, c6138.f18843, ((C0052) abstractC5698).f918);
            c12323.getClass();
            c14896.m35351(c12323.m29889(c14165.f17560));
        } else {
            c12323.getClass();
            c14896.m35351(c12323.m29889(c14163.f17560));
        }
        if (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
            C14163 c14166 = (C14163) abstractC4308M17562.f13890;
            c12323.getClass();
            iM29889 = c12323.m29889(c14166.f17560);
        } else {
            iM29889 = 0;
        }
        c14896.m35351(iM29889);
        c14896.m35351(c2609M17510.m8245());
        for (C2609 c2609 = c2609M17510; c2609.m8249(); c2609 = c2609.f8241) {
            C14163 c14167 = (C14163) ((AbstractC4308) c2609.f8240).f13890;
            c12323.getClass();
            c14896.m35351(c12323.m29889(c14167.f17560));
        }
        c14163.mo16101();
        int i16 = 0;
        int i17 = 0;
        for (AbstractC5698 abstractC5699 : c14163.f42762.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            int i18 = C12945.f38836[abstractC5699.f17559.ordinal()];
            C2609 c26010 = c2609M17510;
            if (i18 == 1) {
                i16++;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    C12171.m29636();
                    throw null;
                }
                c12323.m29892((C14163) abstractC5699);
            } else if ((abstractC5699.mo16084() & 137438953472L) == 0) {
                i17++;
            }
            c2609M17510 = c26010;
        }
        C2609 c26011 = c2609M17510;
        C2609 c26012 = c14163.f42769;
        if (c26012 != null) {
            Iterator it = c26012.iterator();
            while (it.hasNext()) {
                c12323.m29892((C14163) it.next());
            }
        }
        c14896.m35351(i16);
        c14163.mo16101();
        AbstractC14016 abstractC14016 = c14163.f42762;
        C2609 c2609M8239 = C2609.m8239();
        for (AbstractC5698 abstractC56910 : abstractC14016.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC56910.f17559 == EnumC1296.f4567) {
                c2609M8239 = c2609M8239.m8246((C12048) abstractC56910);
            }
        }
        while (c2609M8239.m8249()) {
            C12048 c12048 = (C12048) c2609M8239.f8240;
            c14896.m35351(m39702(c12048.f17563));
            if (this.f51835) {
                c22365 = c22366;
                PrintWriter printWriterM50108 = c22365.m50107(EnumC21659.ERROR);
                printWriterM50108.println("FIELD  " + ((Object) c12048.f17562));
                str2 = str3;
                printWriterM50108.println(str2 + m39700(c12048.f17563));
            } else {
                c22365 = c22366;
                str2 = str3;
            }
            c14896.m35351(C13028.m31613(c12323.f36883, c12048.f17562));
            c14896.m35351(c12323.m29890((AbstractC5698) c12048));
            int iM39701 = m39701();
            if (c12048.m29425() != null) {
                int iM39715 = m39715(c6138.f18792);
                c14896.m35351(c12323.m29888(c12048.m29425()));
                m39708(iM39715);
                i14 = 1;
            } else {
                i14 = 0;
            }
            m39709(iM39701, i14 + m39706((AbstractC5698) c12048, false) + m39705(c12048));
            c2609M8239 = c2609M8239.f8241;
            c14897 = c14897;
            abstractC4308M17562 = abstractC4308M17562;
            c22366 = c22365;
            str3 = str2;
        }
        C22364 c22367 = c22366;
        String str4 = str3;
        C14896 c14898 = c14897;
        AbstractC4308 abstractC4309 = abstractC4308M17562;
        c14896.m35351(i17);
        c14163.mo16101();
        AbstractC14016 abstractC14017 = c14163.f42762;
        C2609 c2609M82310 = C2609.m8239();
        for (AbstractC5698 abstractC56911 : abstractC14017.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC56911.f17559 == EnumC1296.f4571 && (abstractC56911.mo16084() & 137438953472L) == 0) {
                c2609M82310 = c2609M82310.m8246((C3581) abstractC56911);
            }
        }
        while (true) {
            boolean zM8249 = c2609M82310.m8249();
            boolean z4 = this.f51837;
            EnumC10892 enumC10893 = this.f51831;
            if (!zM8249) {
                C6136 c6139 = c6138;
                C3581 c3581Mo10964 = null;
                int iM39703 = m39701();
                boolean z5 = (c2609Mo12938.m8245() == 0 && abstractC4309.mo12934().m8245() == 0) ? false : true;
                for (C2609 c26013 = c26011; !z5 && c26013.m8249(); c26013 = c26013.f8241) {
                    z5 = ((AbstractC4308) c26013.f8240).mo12934().m8245() != 0;
                }
                if (z5) {
                    int iM39716 = m39715(c6139.f18827);
                    c14164 = c14163;
                    c14896.m35351(c12323.m29895(c14164));
                    m39708(iM39716);
                    i2 = 1;
                } else {
                    c14164 = c14163;
                    i2 = 0;
                }
                if (c14164.f42770 != null && this.f51843) {
                    int iM39717 = m39715(c6139.f18862);
                    InterfaceC18278 interfaceC18278 = c14164.f42770;
                    int i19 = AbstractC12465.f37474;
                    String schemeSpecificPart = interfaceC18278.toUri().getSchemeSpecificPart();
                    c14896.m35351(C13028.m31613(c12323.f36883, c6139.f18880.m30652(schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1))));
                    m39708(iM39717);
                    i2++;
                }
                if (z4) {
                    AbstractC10370 abstractC10370 = c6139.f18793;
                    AbstractC12486 abstractC12486 = c6139.f18880;
                    int iM39718 = m39715(abstractC10370);
                    try {
                        c14896.m35351(C13028.m31613(c12323.f36883, abstractC12486.m30652(Long.toString(c14164.f42770.mo20798()))));
                        m39708(iM39718);
                        int iM39719 = m39715(c6139.f18861);
                        c14896.m35351(C13028.m31613(c12323.f36883, abstractC12486.m30652(Long.toString(System.currentTimeMillis()))));
                        m39708(iM39719);
                        i2 += 2;
                    } catch (SecurityException e) {
                        throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
                    }
                }
                c14163.mo16101();
                int iM39704 = m39703(c14163.mo16068()) + i2 + m39714(c14164.f17563) + m39704(c14163.mo16081(), false);
                AbstractC10370 abstractC10371 = c6139.f18877;
                EnumC1296 enumC1299 = c14164.f17561.f17559;
                EnumC1296 enumC12910 = EnumC1296.f4571;
                if (enumC1299 == enumC12910 || c14164.f17562 == c6139.f18867) {
                    int iM397110 = m39715(abstractC10371);
                    C14163 c14163M16071 = c14164.f17561.m16071();
                    AbstractC5698 abstractC56912 = c14164.f17561;
                    if (abstractC56912.f17560 != null && abstractC56912.f17559 == enumC12910) {
                        c3581Mo10964 = ((C3581) abstractC56912).mo10964();
                    }
                    c12323.getClass();
                    c14896.m35351(c12323.m29889(c14163M16071.f17560));
                    c14896.m35351(c3581Mo10964 == null ? 0 : c12323.m29894(c3581Mo10964));
                    m39708(iM397110);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int iM39714 = iM39704 + i3;
                AbstractC5698 abstractC56913 = c14164.f17561;
                if (abstractC56913.f17559 == EnumC1296.f4568) {
                    C0052 c0052 = (C0052) abstractC56913;
                    int iM397111 = m39715(c6139.f18844);
                    C13028 c13029 = c12323.f36883;
                    c14896.m35351(C13028.m31613(c13029, c0052));
                    c14896.m35351(EnumC18398.m42829(c0052.f916));
                    AbstractC10370 abstractC10372 = c0052.f912;
                    c14896.m35351(abstractC10372 != null ? C13028.m31613(c13029, abstractC10372) : 0);
                    C18837<C9764> c18837 = new C18837();
                    for (C9764 c9764 : c0052.f929) {
                        if (!c9764.f29540.contains(EnumC9058.EXTRA)) {
                            c18837.m43511(c9764);
                        }
                    }
                    c14896.m35351(c18837.size());
                    for (C9764 c9765 : c18837) {
                        c14896.m35351(C13028.m31613(c13029, c9765.f29541));
                        c14896.m35351(EnumC9058.m23386(c9765.f29540));
                        AbstractC10370 abstractC10373 = c9765.f29541.f912;
                        c14896.m35351(abstractC10373 != null ? C13028.m31613(c13029, abstractC10373) : 0);
                    }
                    C2609<C17524> c26014 = c0052.f921;
                    c14896.m35351(c26014.m8245());
                    for (C17524 c17524 : c26014) {
                        C7814 c7814 = c17524.f53523;
                        C2609 c26015 = c17524.f53522;
                        c14896.m35351(C13028.m31613(c13029, c7814));
                        c14896.m35351(EnumC14701.m34992(c17524.f53521));
                        if (c26015 == null) {
                            c14896.m35351(0);
                        } else {
                            c14896.m35351(c26015.m8245());
                            Iterator it2 = c26015.iterator();
                            while (it2.hasNext()) {
                                c14896.m35351(C13028.m31613(c13029, (C0052) it2.next()));
                            }
                        }
                    }
                    C2609<C23874> c26016 = c0052.f919;
                    c14896.m35351(c26016.m8245());
                    for (C23874 c23874 : c26016) {
                        C7814 c7815 = c23874.f77199;
                        C2609 c26017 = c23874.f77198;
                        c14896.m35351(C13028.m31613(c13029, c7815));
                        c14896.m35351(EnumC6941.m18749(c23874.f77197));
                        if (c26017 == null) {
                            c14896.m35351(0);
                        } else {
                            c14896.m35351(c26017.m8245());
                            Iterator it3 = c26017.iterator();
                            while (it3.hasNext()) {
                                c14896.m35351(C13028.m31613(c13029, (C0052) it3.next()));
                            }
                        }
                    }
                    C2609 c26018 = c0052.f917;
                    c14896.m35351(c26018.m8245());
                    Iterator it4 = c26018.iterator();
                    while (it4.hasNext()) {
                        c14896.m35351(c12323.m29889(((C16112) it4.next()).f49647.f17560));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C21053 c21053 : c0052.f925) {
                        ((Set) C13843.computeIfAbsent(linkedHashMap, c21053.f67912, new C18865(4))).addAll(c21053.f67911);
                    }
                    c14896.m35351(linkedHashMap.size());
                    C13843.forEach(linkedHashMap, new BiConsumer() { // from class: l.ۙۜ۠
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            C16887.m39697(this.f14258, (C14163) obj, (Set) obj2);
                        }

                        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return C17873.$default$andThen(this, biConsumer);
                        }
                    });
                    m39708(iM397111);
                    iM39714 = iM39714 + 1 + m39714(c14164.f17561.mo16084() & (-131073));
                }
                int iM39705 = iM39714 + m39705((AbstractC5698) c14164);
                c14898.m35352(-889275714);
                C23168 c23168 = this.f51825;
                if (c23168.m51347() && c23168.m51348(c14164.f42770)) {
                    c14898.m35351(65535);
                    enumC10892 = enumC10893;
                } else {
                    enumC10892 = enumC10893;
                    c14898.m35351(enumC10892.f32757);
                }
                c14898.m35351(enumC10892.f32756);
                if (c14164.f17561.f17559 != EnumC1296.f4568 && enumC10892.m27209()) {
                    C18837 c18838 = new C18837();
                    m39696(c14164, c18838);
                    LinkedHashSet<C14163> linkedHashSet = new LinkedHashSet(c18838);
                    if (c14164.f17561.f17559 != EnumC1296.f4579 || linkedHashSet.isEmpty()) {
                        i5 = 0;
                    } else {
                        int iM397112 = m39715(c6139.f18841);
                        c14896.m35351(linkedHashSet.size());
                        for (C14163 c14168 : linkedHashSet) {
                            c12323.getClass();
                            c14896.m35351(c12323.m29889(c14168.f17560));
                        }
                        m39708(iM397112);
                        i5 = 1;
                    }
                    int i20 = iM39705 + i5;
                    if (c14164.f17561.f17559 != EnumC1296.f4579) {
                        int iM397113 = m39715(c6139.f18812);
                        C14163 c14163Mo955 = c14163.mo955();
                        c12323.getClass();
                        c14896.m35351(c12323.m29889(c14163Mo955.f17560));
                        m39708(iM397113);
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    iM39705 = i20 + i6;
                }
                if (c14163.m33810()) {
                    int iM397114 = m39715(c6139.f18866);
                    c14163.mo16064();
                    c14896.m35351(c14163.m33811().m8245());
                    for (AbstractC5698 abstractC56914 : c14163.m33811()) {
                        c14896.m35351(C13028.m31613(c12323.f36883, abstractC56914.f17562));
                        c14896.m35351(c12323.m29890(abstractC56914));
                        m39709(m39701(), m39706(abstractC56914, true));
                    }
                    i4 = 1;
                    m39708(iM397114);
                    iM39705++;
                } else {
                    i4 = 1;
                }
                if (enumC10892.m27212()) {
                    if (c14164.f42765.m8249()) {
                        int iM397115 = m39715(c6139.f18819);
                        c14896.m35351(c14164.f42765.m8245());
                        Iterator it5 = c14164.f42765.iterator();
                        while (it5.hasNext()) {
                            C14163 c14169 = (C14163) ((AbstractC5698) it5.next());
                            c12323.getClass();
                            c14896.m35351(c12323.m29889(c14169.f17560));
                        }
                        m39708(iM397115);
                    } else {
                        i4 = 0;
                    }
                    iM39705 += i4;
                }
                LinkedHashMap linkedHashMap2 = c12323.f36878;
                C13028 c130210 = c12323.f36883;
                LinkedHashSet linkedHashSet2 = c12323.f36879;
                if (!linkedHashMap2.isEmpty()) {
                    int iM397116 = m39715(c6139.f18869);
                    c14896.m35351(c12323.f36878.size());
                    for (C19380 c19380 : c12323.f36878.keySet()) {
                        c14896.m35351(c12323.m29891(c19380.f62729));
                        InterfaceC8090[] interfaceC8090Arr = c19380.f62732;
                        c14896.m35351(interfaceC8090Arr.length);
                        for (InterfaceC8090 interfaceC8090 : interfaceC8090Arr) {
                            c14896.m35351(c12323.m29891(interfaceC8090));
                        }
                    }
                    m39708(iM397116);
                    iM39705++;
                }
                if (!linkedHashSet2.isEmpty()) {
                    m39716();
                    iM39705++;
                }
                m39709(iM39703, iM39705);
                outputStream.write(c14898.f45448, 0, c14898.f45449);
                if (c130210.f39001 != null) {
                    throw new C11244(c130210.f39001);
                }
                int i21 = c130210.f38998;
                if (i21 > 65535) {
                    throw new C10124();
                }
                outputStream.write(i21 >> 8);
                outputStream.write(i21);
                C14896 c14899 = c130210.f39003;
                outputStream.write(c14899.f45448, 0, c14899.f45449);
                linkedHashSet2.clear();
                c12323.f36878.clear();
                c130210.m31614();
                outputStream.write(c14896.f45448, 0, c14896.f45449);
                return;
            }
            C3581 c3585 = (C3581) c2609M82310.f8240;
            c14896.m35351(m39702(c3585.f17563));
            if (this.f51830) {
                PrintWriter printWriterM50109 = c22367.m50107(EnumC21659.ERROR);
                printWriterM50109.println("METHOD  " + ((Object) c3585.f17562));
                printWriterM50109.println(str4 + m39700(c3585.f17563));
            }
            AbstractC10370 abstractC10374 = c3585.f17562;
            C13028 c130211 = c12323.f36883;
            c14896.m35351(C13028.m31613(c130211, abstractC10374));
            c14896.m35351(c12323.m29890((AbstractC5698) c3585));
            int iM39706 = m39701();
            if (c3585.f11368 != null) {
                int iM397117 = m39715(c6138.f18826);
                C1365 c1365 = c3585.f11368;
                int i22 = c1365.f4969;
                EnumC19711 enumC19712 = c1365.f4966;
                C3581 c3586 = c1365.f4962;
                c14896.m35351(i22);
                c14896.m35351(c1365.f4961);
                c14896.m35352(c1365.f4987);
                c14896.m35349(0, c1365.f4987, c1365.f4985);
                c14896.m35351(c1365.f4977.m43514());
                C2609 c2609M43517 = c1365.f4977.m43517();
                while (c2609M43517.m8249()) {
                    int i23 = 0;
                    while (true) {
                        char[] cArr = (char[]) c2609M43517.f8240;
                        i13 = iM397117;
                        if (i23 < cArr.length) {
                            c14896.m35351(cArr[i23]);
                            i23++;
                            iM397117 = i13;
                        }
                    }
                    c2609M43517 = c2609M43517.f8241;
                    iM397117 = i13;
                }
                int i24 = iM397117;
                int iM39707 = m39701();
                if (c1365.f4967.m8249()) {
                    int iM397118 = m39715(c6138.f18857);
                    c14896.m35351(c1365.f4967.m8245());
                    C2609 c2609M8250 = c1365.f4967.m8250();
                    while (c2609M8250.m8249()) {
                        int i25 = 0;
                        C3581 c3587 = c3585;
                        while (true) {
                            char[] cArr2 = (char[]) c2609M8250.f8240;
                            i12 = iM39707;
                            if (i25 < cArr2.length) {
                                c14896.m35351(cArr2[i25]);
                                i25++;
                                iM39707 = i12;
                            }
                        }
                        c2609M8250 = c2609M8250.f8241;
                        c3585 = c3587;
                        iM39707 = i12;
                    }
                    c3582 = c3585;
                    i10 = iM39707;
                    m39708(iM397118);
                    i11 = 1;
                } else {
                    c3582 = c3585;
                    i10 = iM39707;
                    i11 = 0;
                }
                if (z4 && (c11327 = c1365.f4986) != null) {
                    int iM397119 = m39715(c6138.f18830);
                    m39709(m39701(), c11327.m27978(c14896, c1365.f4988, c22367));
                    m39708(iM397119);
                    i11++;
                }
                if (!c1365.f4964 || c1365.f4972 <= 0) {
                    c3583 = c3586;
                    enumC19711 = enumC19712;
                    c22364 = c22367;
                    c6137 = c6138;
                } else {
                    int iM397120 = m39715(c6138.f18893);
                    int size = c1365.f4972;
                    for (int i26 = 0; i26 < c1365.f4972; i26++) {
                        size += c1365.f4981[i26].f49838.size() - 1;
                    }
                    c14896.m35351(size);
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = c1365.f4972;
                        c15240 = this.f51834;
                        if (i27 >= i29) {
                            break;
                        }
                        C16181 c16181 = c1365.f4981[i27];
                        C22364 c22368 = c22367;
                        List list = c16181.f49838;
                        EnumC19711 enumC19713 = enumC19712;
                        C12048 c12049 = c16181.f49840;
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = it6;
                            C9127 c9127 = (C9127) it6.next();
                            C3581 c3588 = c3586;
                            char c = c9127.f27648;
                            C6136 c61310 = c6138;
                            C12171.m29642(c >= 0 && c <= c1365.f4987);
                            c14896.m35351(c);
                            char c2 = c9127.f27647;
                            C12171.m29642(c2 > 0 && c + c2 <= c1365.f4987);
                            c14896.m35351(c9127.f27647);
                            c14896.m35351(C13028.m31613(c130211, c12049.f17562));
                            c14896.m35351(c12323.m29890((AbstractC5698) c12049));
                            c14896.m35351(c16181.f49839);
                            AbstractC4308 abstractC43010 = c12049.f17560;
                            if (!c63111.m17550(abstractC43010, c63111.m17519(abstractC43010))) {
                                c15240.getClass();
                                if (C15240.m36092(abstractC43010)) {
                                    i28++;
                                }
                            }
                            c3586 = c3588;
                            it6 = it7;
                            c6138 = c61310;
                        }
                        i27++;
                        c22367 = c22368;
                        enumC19712 = enumC19713;
                    }
                    c3583 = c3586;
                    enumC19711 = enumC19712;
                    c22364 = c22367;
                    c6137 = c6138;
                    m39708(iM397120);
                    int i30 = i11 + 1;
                    if (i28 > 0) {
                        C6136 c61311 = c6137;
                        int iM397121 = m39715(c61311.f18897);
                        c14896.m35351(i28);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < c1365.f4972) {
                            C16181 c16182 = c1365.f4981[i31];
                            C12048 c120410 = c16182.f49840;
                            AbstractC4308 abstractC43011 = c120410.f17560;
                            C6136 c61312 = c61311;
                            if (!c63111.m17550(abstractC43011, c63111.m17519(abstractC43011))) {
                                c15240.getClass();
                                if (C15240.m36092(abstractC43011)) {
                                    for (Iterator it8 = c16182.f49838.iterator(); it8.hasNext(); it8 = it8) {
                                        C9127 c9128 = (C9127) it8.next();
                                        c14896.m35351(c9128.f27648);
                                        c14896.m35351(c9128.f27647);
                                        c14896.m35351(C13028.m31613(c130211, c120410.f17562));
                                        c14896.m35351(c12323.m29895(c120410));
                                        c14896.m35351(c16182.f49839);
                                        i32++;
                                    }
                                }
                            }
                            i31++;
                            c61311 = c61312;
                        }
                        c6137 = c61311;
                        C12171.m29642(i32 == i28);
                        m39708(iM397121);
                        i11 += 2;
                    } else {
                        i11 = i30;
                    }
                }
                if (c1365.f4979 > 0) {
                    boolean z6 = this.f51840;
                    if (z6) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Stack map for ");
                        c3584 = c3583;
                        sb.append(c3584);
                        printStream.println(sb.toString());
                    } else {
                        c3584 = c3583;
                    }
                    EnumC19711 enumC19714 = enumC19711;
                    c6136 = c6137;
                    int iM397122 = m39715(enumC19714.mo12632(c6136));
                    int i33 = c1365.f4979;
                    if (z6) {
                        System.out.println(" nframes = " + i33);
                    }
                    c14896.m35351(i33);
                    int i34 = C12945.f38838[enumC19714.ordinal()];
                    String str5 = ":";
                    String str6 = EnumC0121.f1143;
                    if (i34 == 1) {
                        c13028 = c130211;
                        int i35 = 0;
                        while (i35 < i33) {
                            if (z6) {
                                System.out.print(str6 + i35 + str5);
                            }
                            C0659 c0659 = c1365.f4980[i35];
                            if (z6) {
                                System.out.print(" pc=" + c0659.f2554);
                            }
                            c14896.m35351(c0659.f2554);
                            int iM4791 = 0;
                            int i36 = 0;
                            while (true) {
                                AbstractC4308[] abstractC4308Arr = c0659.f2553;
                                str = str6;
                                if (iM4791 >= abstractC4308Arr.length) {
                                    break;
                                }
                                i36++;
                                iM4791 += C1365.m4791(abstractC4308Arr[iM4791]);
                                str6 = str;
                            }
                            if (z6) {
                                System.out.print(" nlocals=" + i36);
                            }
                            c14896.m35351(i36);
                            int iM4792 = 0;
                            while (iM4792 < c0659.f2553.length) {
                                if (z6) {
                                    System.out.print(" local[" + iM4792 + "]=");
                                }
                                m39711(c0659.f2553[iM4792]);
                                iM4792 += C1365.m4791(c0659.f2553[iM4792]);
                                c1365 = c1365;
                            }
                            C1365 c1366 = c1365;
                            int iM4793 = 0;
                            int i37 = 0;
                            while (true) {
                                AbstractC4308[] abstractC4308Arr2 = c0659.f2555;
                                if (iM4793 >= abstractC4308Arr2.length) {
                                    break;
                                }
                                i37++;
                                iM4793 += C1365.m4791(abstractC4308Arr2[iM4793]);
                            }
                            if (z6) {
                                System.out.print(" nstack=" + i37);
                            }
                            c14896.m35351(i37);
                            for (int iM4794 = 0; iM4794 < c0659.f2555.length; iM4794 += C1365.m4791(c0659.f2555[iM4794])) {
                                if (z6) {
                                    System.out.print(" stack[" + iM4794 + "]=");
                                }
                                m39711(c0659.f2555[iM4794]);
                            }
                            if (z6) {
                                System.out.println();
                            }
                            i35++;
                            i33 = i33;
                            str5 = str5;
                            str6 = str;
                            c1365 = c1366;
                        }
                    } else {
                        if (i34 != 2) {
                            throw new AssertionError("Unexpected stackmap format value");
                        }
                        C12171.m29644(c1365.f4980);
                        int i38 = 0;
                        while (i38 < i33) {
                            if (z6) {
                                System.out.print(EnumC0121.f1143 + i38 + ":");
                            }
                            c1365.f4976[i38].mo6812(this);
                            if (z6) {
                                System.out.println();
                            }
                            i38++;
                            c130211 = c130211;
                        }
                        c13028 = c130211;
                    }
                    m39708(iM397122);
                    i11++;
                } else {
                    c13028 = c130211;
                    c3584 = c3583;
                    c6136 = c6137;
                }
                m39709(i10, i11 + m39704(c3584.mo16081(), true));
                c3581 = c3582;
                c3581.f11368 = null;
                m39708(i24);
                i7 = 1;
            } else {
                c3581 = c3585;
                c13028 = c130211;
                c22364 = c22367;
                c6136 = c6138;
                i7 = 0;
            }
            C2609 c2609Mo12930 = c3581.mo16091(c63111).mo12930();
            if (c2609Mo12930.m8249()) {
                int iM397123 = m39715(c6136.f18780);
                c14896.m35351(c2609Mo12930.m8245());
                while (c2609Mo12930.m8249()) {
                    c14896.m35351(c12323.m29889((AbstractC4308) c2609Mo12930.f8240));
                    c2609Mo12930 = c2609Mo12930.f8241;
                }
                m39708(iM397123);
                i7++;
            }
            if (c3581.f11370 != null) {
                int iM397124 = m39715(c6136.f18865);
                c3581.f11370.mo5382(this.f51826);
                m39708(iM397124);
                i7++;
            }
            if (!enumC10893.m27207() || ((!this.f51842.m28832(EnumC0121.f1190) && (!c3581.m16075() || (c3581.f17563 & 2305843009213693952L) == 0)) || (c3581.f17563 & 562949953421312L) == 562949953421312L)) {
                c6319 = c63111;
            } else {
                int iM8245 = c3581.m16096(c63111).mo12945().f32059.m8245();
                if (c3581.f11367 == null || iM8245 == 0) {
                    c6319 = c63111;
                    i9 = 0;
                } else {
                    int iM397125 = m39715(c6136.f18847);
                    c14896.m35348(iM8245);
                    for (C12048 c120411 : c3581.f11369) {
                        int i39 = (36880 & ((int) c120411.f17563)) | (((int) c3581.f17563) & 4096);
                        c14896.m35351(C13028.m31613(c13028, c120411.f17562));
                        c14896.m35351(i39);
                    }
                    C13028 c130212 = c13028;
                    for (C12048 c120412 : c3581.f11367) {
                        int i40 = (36880 & ((int) c120412.f17563)) | (((int) c3581.f17563) & 4096);
                        c14896.m35351(C13028.m31613(c130212, c120412.f17562));
                        c14896.m35351(i40);
                    }
                    int i41 = 36880;
                    for (C12048 c120413 : c3581.f11366) {
                        int i42 = (((int) c3581.f17563) & 4096) | (((int) c120413.f17563) & i41);
                        c14896.m35351(C13028.m31613(c130212, c120413.f17562));
                        c14896.m35351(i42);
                        c63111 = c63111;
                        i41 = 36880;
                    }
                    c6319 = c63111;
                    m39708(iM397125);
                    i9 = 1;
                }
                i7 += i9;
            }
            int iM39708 = i7 + m39706((AbstractC5698) c3581, false);
            if ((c3581.f17563 & 562949953421312L) == 562949953421312L) {
                c63110 = c6319;
            } else {
                C2609 c26019 = c3581.f11367;
                if (c26019 != null) {
                    Iterator it9 = c26019.iterator();
                    z = false;
                    z2 = false;
                    while (it9.hasNext()) {
                        Iterator it10 = ((C12048) it9.next()).mo16068().iterator();
                        while (it10.hasNext()) {
                            C6319 c63112 = c6319;
                            int i43 = C12945.f38835[c63112.m17528(((C16384) it10.next()).f26338.f13890).ordinal()];
                            if (i43 == 2) {
                                z2 = true;
                            } else if (i43 == 3) {
                                z = true;
                            }
                            c6319 = c63112;
                        }
                    }
                    c63110 = c6319;
                } else {
                    c63110 = c6319;
                    z = false;
                    z2 = false;
                }
                if (z) {
                    int iM397126 = m39715(c6136.f18816);
                    m39695(c26019, EnumC23440.RUNTIME);
                    m39708(iM397126);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (z2) {
                    int iM397127 = m39715(c6136.f18870);
                    m39695(c26019, EnumC23440.CLASS);
                    m39708(iM397127);
                    i8++;
                }
                iM39708 += i8;
            }
            m39709(iM39706, iM39708 + m39705(c3581));
            c63111 = c63110;
            str4 = str4;
            c2609Mo12938 = c2609Mo12938;
            c22367 = c22364;
            c6138 = c6136;
            c2609M82310 = c2609M82310.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m39707(C14163 c14163) throws IOException {
        InterfaceC2050 interfaceC2050Mo1714;
        C22364 c22364 = this.f51827;
        EnumC1296 enumC1296 = c14163.f17561.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4568;
        String string = (enumC1296 == enumC1297 ? c14163.f17562 : c14163.f42771).toString();
        boolean z = this.f51828;
        InterfaceC11223 interfaceC11223 = this.f51832;
        if (z) {
            AbstractC5698 abstractC5698 = c14163.f17561;
            interfaceC2050Mo1714 = interfaceC11223.mo1714(EnumC21101.CLASS_OUTPUT, (abstractC5698.f17559 == enumC1297 ? (C0052) abstractC5698 : c14163.m16089().f24147).f17562.toString());
        } else {
            interfaceC2050Mo1714 = EnumC21101.CLASS_OUTPUT;
        }
        InterfaceC18278 interfaceC18278Mo1708 = interfaceC11223.mo1708(interfaceC2050Mo1714, string, EnumC16866.CLASS, c14163.f42770);
        OutputStream outputStreamMo20797 = interfaceC18278Mo1708.mo20797();
        try {
            try {
                m39710(outputStreamMo20797, c14163);
                if (this.f51844) {
                    c22364.m50123("wrote.file", interfaceC18278Mo1708.getName());
                }
                outputStreamMo20797.close();
                return interfaceC18278Mo1708;
            } catch (C16196 e) {
                AbstractC4308 abstractC4308M38127 = e.m38127();
                C11576 c11576 = C11886.f35440;
                c22364.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, abstractC4308M38127)));
                if (outputStreamMo20797 == null) {
                    return interfaceC18278Mo1708;
                }
                outputStreamMo20797.close();
                interfaceC18278Mo1708.delete();
                return null;
            }
        } catch (Throwable th) {
            if (outputStreamMo20797 != null) {
                outputStreamMo20797.close();
                interfaceC18278Mo1708.delete();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39705(AbstractC5698 abstractC5698) {
        Iterator it = this.f51833.iterator();
        int iApplyAsInt = 0;
        while (it.hasNext()) {
            iApplyAsInt += ((ToIntFunction) it.next()).applyAsInt(abstractC5698);
        }
        return iApplyAsInt;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39702(long j) {
        int i = (int) j;
        if (this.f51831.m27210()) {
            i &= -2049;
        }
        if ((2147483648L & j) != 0) {
            i |= 64;
        }
        if ((17179869184L & j) != 0) {
            i |= 128;
        }
        return (j & 8796093022208L) != 0 ? i & (-1025) : i;
    }
}
